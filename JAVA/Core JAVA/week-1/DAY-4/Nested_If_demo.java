public class Nested_If_demo {
    int number1 = 3;
    public void nested() {
        if (number1 > 0) {
            if (number1 == 0)               //false condition
                System.out.print("first");
        } else {
            System.out.println("second");
            System.out.println("Third");
        }
    }

    public static void main(String[] args) {
        Nested_If_demo nested_if_demo = new Nested_If_demo();
        nested_if_demo.nested();
    }

}
