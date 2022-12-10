public class reverseArray {
    static int [] ReverseArray(int [] arr){
        int  n=arr.length;
        int [] ans =new int[n];
        int j=0,i=n-1;//for(int i=n-1;i>=0;i--){
          //  ans[j++]=arr[i];

       // }
        //alternative method in the reverse of array with while loop
        while(i>=0){
            ans[j++]=arr[i--];

        }

        return ans;

    }
    static void printarray(int [] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
       int [] ans= ReverseArray(arr);
        printarray(ans);

    }
}