public class swap {
    static void swap(int a,int b){
        System.out.println("Original value before swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Original value after swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);


    }
    // sum and difference mrthd
    //swap without temp method
    static void swapsumdiff(int a ,int b){
        System.out.println("Original value before swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Original value after swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);


    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int [] arr={1,2,3,4,5};
        swap(a,b);
        swapsumdiff(a,b);

    }

}
