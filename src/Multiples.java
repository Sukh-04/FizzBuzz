public class Multiples {

    public static void main(String[] args) {

        int multiples = 0;
        for (int i = 3; i < 1000; i++) {

            // Similar to FizzBuzz, determine if i is divisible by 3 or 5.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                multiples++;

            }
        }

        System.out.println(multiples);

    }
}

