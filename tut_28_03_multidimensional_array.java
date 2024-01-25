public class tut_28_03_multidimensional_array {
    public static void main(String[] args) {
        String [][][] data= new String[2][2][4];
        data[0][0]=new String[] {"Ali","Haroon","Wajahat","Musadiq"};
        data[0][1]=new String[]{"Zayam","Hamda","Mahreeb","4h"};
        data[1][0]=new String[]{"Abdullah","Umair","Zubi","4th"};
        data[1][1]=new String[]{"Hassan","Hamza","Ahmad","4th"};
       /* 
        data[0][0][0]="ALi";
        data[0][0][1]="Haroon";
        data[0][0][2]="Wajahat";
        data[0][0][3]="Musadiq";
        data[0][1][2]="Zayyam";
        data[0][1][2]="Hmdan";
        data[0][1][2]="Mahreeb";
        data[0][1][3]="4th";
        data[1][0][0]="Abdullah";
        data[1][0][1]="Umair";
        data[1][0][2]="Zubi";
        data[1][0][3]="4th";
        data[1][1][0]="Hassan";
        data[1][1][1]="Hamza";
        data[1][1][2]="Ahmad";
        data[1][1][3]="4th"; 
        */
        for(int i=0;i<data.length;i++){
            for( int j=0; j<=i;j++){
                for(int k=0; k<data[i][j].length;k++){
                    System.out.print(k+1+" ");
                    System.out.print(data[i][j][k]);
                    System.out.print(" ");


                }
            System.out.println("  ");
            }
        }
    }
}
