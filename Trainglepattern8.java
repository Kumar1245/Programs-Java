import java.util.Scanner;

public class Trainglepattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++){
                if((i+k)/2!=0&&(i+k)/3!=0)
                    System.out.print(i);
                else{
                    System.out.print("");
                }


            }
            System.out.println();
        }
    }
}
