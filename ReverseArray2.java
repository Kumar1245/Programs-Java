public class ReverseArray2 {
    static void swapInArray2(int [] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversearray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapInArray2(arr,i,j);
            i++;
            j--;


        }
    }
    static void printarray(int [] arr){
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        reversearray(arr);
        printarray(arr);

    }
}
