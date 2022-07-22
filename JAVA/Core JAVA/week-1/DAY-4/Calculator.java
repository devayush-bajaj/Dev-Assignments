public class Calculator {
    static String operation = "Addition";
    public static void main(String[] args) {
        switch (operation){
            case "Addition":
                System.out.println("Addition");
            case "Subtraction":
                System.out.println("Subtraction");
            case "Division":
                System.out.println("Division");
            case "Multiplication":
                System.out.println("Multiplication");

            default:
                System.out.println("Addition");
        }
    }
}
