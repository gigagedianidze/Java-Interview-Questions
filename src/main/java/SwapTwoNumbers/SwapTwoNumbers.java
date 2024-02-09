package SwapTwoNumbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before Swapping values are " +a+ " " +b);

        int x=a;
        a=b;
        b=x;

        System.out.println("After swapping values are " +a+ " " +b);

    }
}
