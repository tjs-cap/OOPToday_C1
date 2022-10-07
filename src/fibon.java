public class fibon {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        arr[0] = 1;
        arr[1] = 1;

//        for (int i = 0; i < 10 ; i++) {
//            System.out.print(", "+total);
//            temp = total;  //1, 1, 2, 3,
//            total = fibonacci(num1, total);  //1, 2, 3, 5,
//            num1 = temp; //1 , 1, 2, 3
//        }
    }

    public static int fibonacci(int num1, int num2)
    {
        return num1 + num2;
    }
}
