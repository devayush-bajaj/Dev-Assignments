import java.util.Scanner;
public class GreatestNumber {
    public void greatest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input 1 : ");
        int userInput_1 = sc.nextInt();
        System.out.println("Enter Input 2 : ");
        int userInput_2 = sc.nextInt();
        if(userInput_1 > userInput_2){
            System.out.println("Input 1 is greater : " + userInput_1);
        }
        else
            System.out.println("Input 2 is greater : "+ userInput_1 );
    }
    public static void main(String[] args) {
        GreatestNumber greatestNumber = new GreatestNumber();
        greatestNumber.greatest();
    }
}


/*      OUTPUT
Enter Input 1 :
12
Enter Input 2 :
43
Input 2 is greater : 12

 */
