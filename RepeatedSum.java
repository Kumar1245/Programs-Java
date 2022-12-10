import java.util.Scanner;

public class RepeatedSum {
    static int repeatedsum(int[] arr) {
        int ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==7){
                    ans++;
                }

            }
        }
        return ans;


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Size of the array:"+n+"element");

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reapeted sum of the array"+repeatedsum(arr));

    }
}
