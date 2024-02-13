package CountSumOfDigitsInANumber;

public class CountSumOfDigitsInANumber {
    public static void main(String[] args){

        int num = 2549;
        int sum = 0;

        while (num>0)
        {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println("Sum of the digits in number is " + sum );
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 15c8cf7 (Updated up to 11)
