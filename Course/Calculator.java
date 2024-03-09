
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator{
	public static void main(String[] args) {
		perform obj = new perform();
	}
}

class perform extends JFrame implements ActionListener{
	JFrame frame;
	JTextField entry;
	JButton clear, del, log, ln, sqrt, expon, sin, tan, cos, pow, sec, cot, cosec, remain;
	JButton one,two, three, four, five, six, percent,seven, eight, nine, zero, dot, add, subt,divide,multi,equal;
	JRadioButton dec, bin, octal, hexa;
	JButton sinh, cosh,tanh, fact, square,cube,hA,hB,hC,hD,hE,hF;
	String s1;
	String s2,binRes,octRes,hexRes,Sqtn,Srmd;
	double num1,num2,result;
	int operator,Inum1,Inum2,result1,quotient,remainder;


	 perform(){
		frame = new JFrame("Calculator");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  		int height = screenSize.height;
  		int width = screenSize.width;

  		frame.setSize(width/2, height/2);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(280,480);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setEnabled(true);
		entry = new JTextField();
		clear = new JButton("CLEAR");
		del = new JButton("<-");
		log = new JButton("log");
		ln = new JButton("ln");
		sqrt = new JButton("√");
		expon = new JButton("e^x");
		sin = new JButton("sin");
		tan = new JButton("tan");
		cos = new JButton("cos");
		pow = new JButton("x^y");
		sec = new JButton("sec");
		cot = new JButton("cot");
		cosec = new JButton("csc");
		remain = new JButton("rm");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		dot = new JButton(".");
		add = new JButton("+");
		subt = new JButton("-");
		divide = new JButton("/");
		multi = new JButton("*");
		equal = new JButton("=");
		sinh =  new JButton("sinh");
		cosh = new JButton("cosh");
		tanh = new JButton("tanh");
		fact = new JButton("x!");
		percent = new JButton("%");
		square = new JButton("x^2");
		cube = new JButton("x^3");
		dec = new JRadioButton("dec");
		bin =new JRadioButton("Bin");
		octal = new JRadioButton("Octal");
		hexa = new JRadioButton("Hexa");
		hA=new JButton("A");
		hB=new JButton("B");
		hC=new JButton("C");
		hD=new JButton("D");
		hE=new JButton("E");
		hF=new JButton("F");

		s1="";
		s2="";
		num1=0;
		num2=0;
		result=0;
		operator=0;
		Inum1=0;
		Inum2=0;

		ButtonGroup bg = new ButtonGroup();
		bg.add(dec);
		bg.add(bin);
		bg.add(octal);
		bg.add(hexa);

		//now we will be adding the buttons here***********//////////////////////////////

		frame.add(entry);
		frame.add(clear);
		frame.add(del);
		frame.add(log);
		frame.add(ln);
		frame.add(sqrt);
		frame.add(expon);
		frame.add(sin);
		frame.add(tan);
		frame.add(cos);
		frame.add(cot);
		frame.add(sec);
		frame.add(cosec);
		frame.add(remain);
		frame.add(pow);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(zero);
		frame.add(dot);
		frame.add(subt);
		frame.add(divide);
		frame.add(multi);
		frame.add(equal);
		frame.add(dec);
		frame.add(bin);
		frame.add(octal);
		frame.add(hexa);
		frame.add(sinh);
		frame.add(cosh);
		frame.add(tanh);
		frame.add(fact);
		frame.add(percent);
		frame.add(square);
		frame.add(cube);
		frame.add(add);
		frame.add(hA);
		frame.add(hB);
		frame.add(hC);
		frame.add(hD);
		frame.add(hE);
		frame.add(hF);
		
		
		
		dec.setSelected(true);
		entry.setEditable(false);
		
		


		/////////////now we will set the coordinates of every element herer\\\\\\\\\\\\\\\\\\\\\\\\\
		

		entry.setBounds(35,15,160,35);
		del.setBounds(195,15,50,34);
		clear.setBounds(90,60,110,30);
		dec.setBounds(24,90,50,30);
		bin.setBounds(74,90,50,30);
		octal.setBounds(123,90,70,30);
		hexa.setBounds(189,90,70,30);
		log.setBounds(20,120,60,30);
		ln.setBounds(80,120,60,30);
		sqrt.setBounds(140,120,60,30);
		expon.setBounds(200,120,60,30);
		pow.setBounds(20,150,60,30);
		sin.setBounds(80,150,60,30);
		cos.setBounds(140,150,60,30);
		tan.setBounds(200,150,60,30);
		cot.setBounds(20,180,60,30);
		cosec.setBounds(80,180,60,30);
		sec.setBounds(140,180,60,30);
		remain.setBounds(200,180,60,30);
		seven.setBounds(80,250,45,30);
		eight.setBounds(125,250,45,30);
		nine.setBounds(170,250,45,30);
		divide.setBounds(215,250,45,30);
		four.setBounds(80,280,45,30);
		five.setBounds(125,280,45,30);
		six.setBounds(170,280,45,30);
		multi.setBounds(215,280,45,30);
		one.setBounds(80,310,45,30);
		two.setBounds(125,310,45,30);
		three.setBounds(170,310,45,30);
		subt.setBounds(215,310,45,30);
		dot.setBounds(80,340,45,30);
		zero.setBounds(125,340,45,30);
		equal.setBounds(170,340,45,30);
		add.setBounds(215,340,45,30);
		sinh.setBounds(20,210,80,30);
		cosh.setBounds(100,210,80,30);
		tanh.setBounds(180,210,80,30);
		fact.setBounds(20,250,60,30);
		cube.setBounds(20,280,60,30);
		square.setBounds(20,310,60,30);
		percent.setBounds(20,340,60,30);
		hA.setBounds(20,370,80,30);
		hB.setBounds(100,370,80,30);
		hC.setBounds(180,370,80,30);
		hD.setBounds(20,400,80,30);
		hE.setBounds(100,400,80,30);
		hF.setBounds(180,400,80,30);

		// adding action listeners here\\\\\\\

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		dot.addActionListener(this);
		divide.addActionListener(this);
		multi.addActionListener(this);
		add.addActionListener(this);
		subt.addActionListener(this);
		pow.addActionListener(this);
		remain.addActionListener(this);
		percent.addActionListener(this);
		dec.addActionListener(this);
		bin.addActionListener(this);
		octal.addActionListener(this);
		hexa.addActionListener(this);
		equal.addActionListener(this);
		del.addActionListener(this);
		clear.addActionListener(this);
		log.addActionListener(this);
		ln.addActionListener(this);
		sqrt.addActionListener(this);
		expon.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		cot.addActionListener(this);
		sec.addActionListener(this);
		cosec.addActionListener(this);
		sinh.addActionListener(this);
		cosh.addActionListener(this);
		tanh.addActionListener(this);
		square.addActionListener(this);
		cube.addActionListener(this);
		fact.addActionListener(this);
		hA.addActionListener(this);
		hB.addActionListener(this);
		hC.addActionListener(this);
		hD.addActionListener(this);
		hE.addActionListener(this);
		hF.addActionListener(this);

		hA.setEnabled(false);
		hB.setEnabled(false);
		hC.setEnabled(false);
		hD.setEnabled(false);
		hE.setEnabled(false);
		hF.setEnabled(false);



	}

	//performing action listeners here\\

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource()==clear){
			  	entry.setText("");
			  }

			  if(ae.getSource()==del){
			  	String s = entry.getText();
			  	entry.setText("");
			  	for(int i=0;i<s.length()-1;i++){
			  		entry.setText(entry.getText()+ (s.charAt(i)));
			  	}
			  }
////////////////////Decimal number system\\\\\\\\\\\\\\\\\\\

		if(dec.isSelected()){

			hA.setEnabled(false);
			hB.setEnabled(false);
			hC.setEnabled(false);
			hD.setEnabled(false);
			hE.setEnabled(false);
			hF.setEnabled(false);
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			zero.setEnabled(true);
			dot.setEnabled(true);
			equal.setEnabled(true);
			percent.setEnabled(true);
			square.setEnabled(true);
			cube.setEnabled(true);
			fact.setEnabled(true);
			divide.setEnabled(true);
			multi.setEnabled(true);
			subt.setEnabled(true);
			add.setEnabled(true);
			log.setEnabled(true);
			ln.setEnabled(true);
			sqrt.setEnabled(true);
			expon.setEnabled(true);
			pow.setEnabled(true);
			sin.setEnabled(true);
			cos.setEnabled(true);
			tan.setEnabled(true);
			cot.setEnabled(true);
			cosec.setEnabled(true);
			sec.setEnabled(true);
			remain.setEnabled(true);
			sinh.setEnabled(true);
			cosh.setEnabled(true);
			tanh.setEnabled(true);

			

			

			if(ae.getSource()==one)
				entry.setText(entry.getText().concat("1"));
			if(ae.getSource()==two)
				entry.setText(entry.getText().concat("2"));
			if(ae.getSource()==three)
				entry.setText(entry.getText().concat("3"));
			if(ae.getSource()==four)
				entry.setText(entry.getText().concat("4"));
			if(ae.getSource()==five)
				entry.setText(entry.getText().concat("5"));
			if(ae.getSource()==six)
				entry.setText(entry.getText().concat("6"));
			if(ae.getSource()==seven)
				entry.setText(entry.getText().concat("7"));
			if(ae.getSource()==eight)
				entry.setText(entry.getText().concat("8"));
			if(ae.getSource()==nine)
				entry.setText(entry.getText().concat("9"));
			if(ae.getSource()==zero)
				entry.setText(entry.getText().concat("0"));
			if(ae.getSource()==dot)
				entry.setText(entry.getText().concat("."));

			if(ae.getSource()==divide){
				s1=entry.getText();
				operator=1;
				entry.setText("");
			} else 
			if(ae.getSource()==add){
				s1=entry.getText();
				operator=2;
				entry.setText("");
			} else 
			if(ae.getSource()==subt){
				if(entry.getText().length()==0){
					entry.setText("-");
				} else
				{
					s1=entry.getText();
				operator=3;
				entry.setText("");
				}
			} else 
			if(ae.getSource()==multi){
				s1=entry.getText();
				operator=4;
				entry.setText("");
			} else
			if(ae.getSource()==percent){
				s1=entry.getText();
				operator=5;
				entry.setText("");
			} else
			if(ae.getSource()==remain){
				s1=entry.getText();
				operator=6;
				entry.setText("");
			} else
			if(ae.getSource()==pow){
				s1=entry.getText();
				operator=7;
				entry.setText("");
			}

			//equality result assigning \\

			if(ae.getSource()==equal){
				
				s2=entry.getText();
				num1 = Double.parseDouble(s1);
				num2 = Double.parseDouble(s2);
				
				switch(operator){
					case 1: 
					result=num1/num2;
					break;
					case 2: 
					result=num1+num2;
					break;
					case 3: 
					result=num1-num2;
					break;
					case 4: 
					result=num1*num2;
					break;
					case 5:
					result=(num1/num2)*100;
					break;
					case 6: 
					result=num1%num2;
					break;
					case 7: 
					result= Math.pow(num1,num2);
					break;
				default: result=0;
				} 
				
				if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			} 

			  
			  if(ae.getSource()==log){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	entry.setText(""+Math.log10(num1));
			  }

			  if(ae.getSource()==ln){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	entry.setText(""+Math.log(num1));
			  }

			  if(ae.getSource()==sqrt){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.sqrt(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }

			  if(ae.getSource()==expon){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result = Math.exp(num1);
			  	entry.setText(""+result);
			  }

			  if(ae.getSource()==sin){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.sin(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==cos){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.cos(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==tan){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.tan(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }

			  if(ae.getSource()==cot){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result=Math.cos(num1)/Math.sin(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==cosec){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result=1/Math.sin(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==sec){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result=1/Math.cos(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }

			  if(ae.getSource()==sinh){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.sinh(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==cosh){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.cosh(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==tanh){
			  	num1=Double.parseDouble(entry.getText());
			  	entry.setText("");
			  	result= Math.tanh(num1);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }

			  if(ae.getSource()==cube){
			  	num1=Double.parseDouble(entry.getText());
			  	result=Math.pow(num1,3);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			   if(ae.getSource()==square){
			  	num1=Double.parseDouble(entry.getText());
			  	result=Math.pow(num1,2);
			  	if(result-(int)result==0){
					entry.setText(""+(int)result);
				}
				else 
					entry.setText(""+result);
			  }
			  if(ae.getSource()==fact){
			  	Inum1=Integer.parseInt(entry.getText());
			  	entry.setText("");
			  	int result2=1;
			  	for(int i=Inum1;i>=1;i--){
			  		result2=result2*i;
			  	}
			  	entry.setText(result2+"");
			  }

		}
////////////////////Binary number system\\\\\\\\\\\\\\\\\\
		if(bin.isSelected()){
			
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			dot.setEnabled(false);
			percent.setEnabled(false);
			fact.setEnabled(false);
			log.setEnabled(false);
			ln.setEnabled(false);
			sqrt.setEnabled(false);
			expon.setEnabled(false);
			pow.setEnabled(false);
			sin.setEnabled(false);
			cos.setEnabled(false);
			tan.setEnabled(false);
			cot.setEnabled(false);
			cosec.setEnabled(false);
			sec.setEnabled(false);
			remain.setEnabled(false);
			sinh.setEnabled(false);
			cosh.setEnabled(false);
			tanh.setEnabled(false);
			cube.setEnabled(true);
			divide.setEnabled(true);
			multi.setEnabled(true);
			subt.setEnabled(true);
			add.setEnabled(true);
			equal.setEnabled(true);
			zero.setEnabled(true);
			one.setEnabled(true);
			square.setEnabled(true);
			hA.setEnabled(false);
			hB.setEnabled(false);
			hC.setEnabled(false);
			hD.setEnabled(false);
			hE.setEnabled(false);
			hF.setEnabled(false);

			if(ae.getSource()==one)
				entry.setText(entry.getText().concat("1"));
			if(ae.getSource()==zero)
				entry.setText(entry.getText().concat("0"));

			if(ae.getSource()==divide){
				Inum1=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				operator=1;
			} else
			if(ae.getSource()==multi){
				Inum1=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				operator=2;
			} else
			if(ae.getSource()==add){
				Inum1=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				operator=3;
			} else
			if(ae.getSource()==subt){
				Inum1=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				operator=4;
			}

			if(ae.getSource()==equal){
				Inum2=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				
				if(operator==1){
					if(Inum2!=0){
						quotient=Inum1/Inum2;
					    Sqtn=Integer.toBinaryString(quotient);
			    		remainder=Inum1%Inum2;
			    		Srmd = Integer.toBinaryString(remainder);
				    	entry.setText("qtnt= "+Sqtn+" rmndr= "+Srmd);
					}else 
					    entry.setText("Infinity");
				} else
				switch(operator){
				
				case 2:
					result1=Inum1*Inum2;
					binRes=Integer.toBinaryString(result1);
					entry.setText(""+binRes);
					break;
				case 3:
					result1=Inum1+Inum2;
					binRes=Integer.toBinaryString(result1);
					entry.setText(""+binRes);
					break;
				case 4:
					result1=Inum1-Inum2;
					binRes=Integer.toBinaryString(result1);
					entry.setText(binRes);
					break;
				}
			}
			if(ae.getSource()==square){
				Inum1=Integer.parseInt(entry.getText(),2);
				result1=Inum1*Inum1;
				binRes=Integer.toBinaryString(result1);
				entry.setText(""+binRes);
			}
			if(ae.getSource()==cube){
				Inum1=Integer.parseInt(entry.getText(),2);
				entry.setText("");
				result1=Inum1*Inum1*Inum1;
				binRes=Integer.toBinaryString(result1);
				entry.setText(binRes);
			}

		}
///////////////Octal number system\\\\\\\\\\\\\\\\\\
		if(octal.isSelected()){
			
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(false);
			nine.setEnabled(false);
			zero.setEnabled(true);
			dot.setEnabled(false);
			equal.setEnabled(true);
			percent.setEnabled(false);
			square.setEnabled(false);
			cube.setEnabled(false);
			fact.setEnabled(false);
			divide.setEnabled(true);
			multi.setEnabled(true);
			subt.setEnabled(true);
			add.setEnabled(true);
			log.setEnabled(false);
			ln.setEnabled(false);
			sqrt.setEnabled(false);
			expon.setEnabled(false);
			pow.setEnabled(false);
			sin.setEnabled(false);
			cos.setEnabled(false);
			tan.setEnabled(false);
			cot.setEnabled(false);
			cosec.setEnabled(false);
			sec.setEnabled(false);
			remain.setEnabled(false);
			sinh.setEnabled(false);
			cosh.setEnabled(false);
			tanh.setEnabled(false);
			hA.setEnabled(false);
			hB.setEnabled(false);
			hC.setEnabled(false);
			hD.setEnabled(false);
			hE.setEnabled(false);
			hF.setEnabled(false);

			if(ae.getSource()==one)
				entry.setText(entry.getText().concat("1"));
			if(ae.getSource()==two)
				entry.setText(entry.getText().concat("2"));
			if(ae.getSource()==three)
				entry.setText(entry.getText().concat("3"));
			if(ae.getSource()==four)
				entry.setText(entry.getText().concat("4"));
			if(ae.getSource()==five)
				entry.setText(entry.getText().concat("5"));
			if(ae.getSource()==six)
				entry.setText(entry.getText().concat("6"));
			if(ae.getSource()==seven)
				entry.setText(entry.getText().concat("7"));
			if(ae.getSource()==zero)
				entry.setText(entry.getText().concat("0"));

			if(ae.getSource()==divide){
				Inum1=Integer.parseInt(entry.getText(),8);
				entry.setText("");
				operator=1;
			}
			if(ae.getSource()==multi){
				Inum1=Integer.parseInt(entry.getText(),8);
				entry.setText("");
				operator=2;
			}
			if(ae.getSource()==add){
				Inum1=Integer.parseInt(entry.getText(),8);
				entry.setText("");
				operator=3;
			}
			if(ae.getSource()==subt){
				Inum1=Integer.parseInt(entry.getText(),8);
				entry.setText("");
				operator=4;
			}

			if(ae.getSource()==equal){
				Inum2=Integer.parseInt(entry.getText(),8);
				entry.setText("");

				if(operator==1){
					if(Inum2!=0){
						quotient=Inum1/Inum2;
						Sqtn=Integer.toOctalString(quotient);
						remainder=Inum1%Inum2;
						Srmd=Integer.toOctalString(remainder);
						entry.setText("qtnt= "+Sqtn+" rmndr= "+Srmd);
					}else 
					entry.setText("Infinity");

				}
				else 
				{
					switch(operator){
					case 2:
						result1=Inum1*Inum2;
						break;
					case 3:
						result1=Inum1+Inum2;
						break;
					case 4:
						result1=Inum1-Inum2;
						break;
					}
					octRes=Integer.toOctalString(result1);
					entry.setText(""+octRes);
				}
			}
		}
//////////////Hexadecimal number system\\\\\\\\\\\\\\\\\
		if(hexa.isSelected()){
			
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			zero.setEnabled(true);
			dot.setEnabled(false);
			equal.setEnabled(true);
			percent.setEnabled(false);
			square.setEnabled(false);
			cube.setEnabled(false);
			fact.setEnabled(false);
			divide.setEnabled(true);
			multi.setEnabled(true);
			subt.setEnabled(true);
			add.setEnabled(true);
			log.setEnabled(false);
			ln.setEnabled(false);
			sqrt.setEnabled(false);
			expon.setEnabled(false);
			pow.setEnabled(false);
			sin.setEnabled(false);
			cos.setEnabled(false);
			tan.setEnabled(false);
			cot.setEnabled(false);
			cosec.setEnabled(false);
			sec.setEnabled(false);
			remain.setEnabled(false);
			sinh.setEnabled(false);
			cosh.setEnabled(false);
			tanh.setEnabled(false);
			hA.setEnabled(true);
			hB.setEnabled(true);
			hC.setEnabled(true);
			hD.setEnabled(true);
			hE.setEnabled(true);
			hF.setEnabled(true);


			if(ae.getSource()==one)
				entry.setText(entry.getText().concat("1"));
			if(ae.getSource()==two)
				entry.setText(entry.getText().concat("2"));
			if(ae.getSource()==three)
				entry.setText(entry.getText().concat("3"));
			if(ae.getSource()==four)
				entry.setText(entry.getText().concat("4"));
			if(ae.getSource()==five)
				entry.setText(entry.getText().concat("5"));
			if(ae.getSource()==six)
				entry.setText(entry.getText().concat("6"));
			if(ae.getSource()==seven)
				entry.setText(entry.getText().concat("7"));
			if(ae.getSource()==zero)
				entry.setText(entry.getText().concat("0"));
			if(ae.getSource()==eight)
				entry.setText(entry.getText().concat("8"));
			if(ae.getSource()==nine)
				entry.setText(entry.getText().concat("9"));
			if(ae.getSource()==hA)
				entry.setText(entry.getText().concat("A"));
			if(ae.getSource()==hB)
				entry.setText(entry.getText().concat("B"));
			if(ae.getSource()==hC)
				entry.setText(entry.getText().concat("C"));
			if(ae.getSource()==hD)
				entry.setText(entry.getText().concat("D"));
			if(ae.getSource()==hE)
				entry.setText(entry.getText().concat("E"));
			if(ae.getSource()==hF)
				entry.setText(entry.getText().concat("F"));

			if(ae.getSource()==divide){
				Inum1=Integer.parseInt(entry.getText(),16);
				entry.setText("");
				operator=1;
			} else
			if(ae.getSource()==multi){
				Inum1=Integer.parseInt(entry.getText(),16);
				entry.setText("");
				operator=2;
			} else
			if(ae.getSource()==add){
				Inum1=Integer.parseInt(entry.getText(),16);
				entry.setText("");
				operator=3;
			} else
			if(ae.getSource()==subt){
				Inum1=Integer.parseInt(entry.getText(),16);
				entry.setText("");
				operator=4;
			}
			if(ae.getSource()==equal){
				Inum2=Integer.parseInt(entry.getText(),16);
				entry.setText("");
			if(operator==1){
				if(Inum2!=0){
					entry.setText("");
				quotient=Inum1/Inum2;
				Sqtn=Integer.toHexString(quotient);
				remainder=Inum1%Inum2;
				Srmd=Integer.toHexString(remainder);
				entry.setText("qtnt= "+Sqtn.toUpperCase()+" rmndr= "+Srmd.toUpperCase());
			} else
				entry.setText("Infinity");
			} else
			 switch(operator){
			 case 2: 
			 	result1=Inum1*Inum2;
			 	hexRes=Integer.toHexString(result1);
			 	entry.setText(hexRes.toUpperCase());
			 	break;
			 case 3: 
			 	result1=Inum1+Inum2;
			 	hexRes=Integer.toHexString(result1);
			 	entry.setText(hexRes.toUpperCase());
			 	break;
			 case 4: 
			 	result1=Inum1-Inum2;
			 	hexRes=Integer.toHexString(result1);
			 	entry.setText(hexRes.toUpperCase());
			 	break;
			 }
			}
			
		}


	}
	
}