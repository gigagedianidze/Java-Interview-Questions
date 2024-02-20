package GenerateRandomNumbersAndStrings;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main (String[] args){
        Random rand=new Random();

        int rand_int=rand.nextInt(1000);
        System.out.println(rand_int);

        double rand_dbl=rand.nextDouble();
        System.out.println(rand_dbl);

        //You will need Apache library!
        //String randNum=RandomStringUtils.randomNumeric(15);
        //System.out.println(randNum);
        //String randStr=RandomStringUtils.randomAlphabetic(15);
        //System.out.println(randStr);


    }
}
