package numbers;

import java.util.SplittableRandom;

public class NumbersFeature {


    public static void main(String[] args) {
        splitabble();
    }



    public static void splitabble() {
        SplittableRandom random = new SplittableRandom();
        int randomNumber = random.nextInt();

        System.out.println(randomNumber);
    }
}
