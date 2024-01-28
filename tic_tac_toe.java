import java.util.Scanner;

public class tic_tac_toe {
    static void chart(String table [][]){
        int length= table.length;
        for(int i=0; i<length;i++){
            for( String element:table[i]){
                System.out.print(element+"|");
            }
            System.err.println("");
        }
    }
    static int[] user_turn(int turn){
        Scanner input= new Scanner(System.in);
        if (turn%2 !=0) {
            System.out.println("Player X turn");
            System.out.print("Enter Row Number : ");
            int row=input.nextInt();
            System.out.print("Enter Colum Number : ");
            int colum=input.nextInt();
            turn=turn+1;
            int [] result ={0,0,0};
            result[0]=row;
            result[1]=colum;
            result[2]=turn;
            return result;
            
        }
        else{
            System.out.println("Player O turn");
            System.out.print("Enter Row Number : ");
            int row=input.nextInt();
            System.out.print("Enter Colum Number : ");
            int colum=input.nextInt();
            turn=turn+1;
            int [] result ={0,0,0};
            result[0]=row;
            result[1]=colum;
            result[2]=turn;
            return result;

        }
    }
    public static void main(String[] args) {
        String [][] table ={{" "," "," "},{" "," "," "},{" "," "," "}};
        int turn=1;
        chart(table);
        int [] entry=user_turn(turn);
        table[entry[0]][entry[1]]="";
        System.out.println(entry[1]);
        System.out.println(entry[2]);
    }
}
