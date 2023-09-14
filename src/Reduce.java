public class Reduce {

    public static void main(String[] args) {

        int i = 100;
        while (i > 0) {

            // Determine if i is divisible by 2.
            boolean isEven = i % 2 == 0;

            if (isEven){
                i = i / 2;
                System.out.println(i);
            } else {
                i -= 1;
                System.out.println(i);
            }
        }
    }
}
