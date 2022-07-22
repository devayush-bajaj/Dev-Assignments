public class StarPattern {
    public static void main(String[] args) {

            int j = 5;
            for (int i = 0; i < 5; i++) {
                j=5;
                j=j-i;
                while (j > 0) {
                    System.out.print(" ");
                    j--;
                }
                System.out.print("*****\n");
            }
    }
}
