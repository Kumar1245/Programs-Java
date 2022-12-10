import java.util.Scanner;

public class FintMax {
    static int findMaxelement(int[] arr) {
        int Mx = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Mx) {
                Mx = arr[i];
            }
        }
        return Mx;

    }
    static int  SecondMax(int [] arr){
        int mx=findMaxelement(arr);
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }


        }
        int SecondMax=findMaxelement(arr);
        return SecondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemnts:"+n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Maximum element of the array:" + findMaxelement(arr));
        System.out.println(" Second Maximum element of the array:" + SecondMax(arr));


    }
}

