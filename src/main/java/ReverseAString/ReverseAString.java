package ReverseAString;

public class ReverseAString {
    public static void main(String[] args) {
        String str="ABCD";
        String rev="";

        System.out.println("Before string revers  " + str);

        int len=str.length();

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        System.out.println("Revers string is " + rev);

    }
}
