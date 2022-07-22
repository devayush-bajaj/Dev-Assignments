import java.util.Scanner;

public class GreatestAndYoungest {
    int person_1, person_2,person_3;
    public void greatestAndYoungest() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age of 1st person : ");
        person_1 = scan.nextInt();
        System.out.println("Enter age of 2nd person : ");
        person_2 = scan.nextInt();
        System.out.println("Enter age of 3rd person : ");
        person_3 = scan.nextInt();
    }
        public void greatest(){
            if (person_1 > person_2 && person_1 > person_3) {
                System.out.println("Person 1 is greater ");
            }
            else if (person_2 > person_3 && person_2 > person_1) {
                        System.out.println("Person 2 is greater ");
            }
            else if (person_3 > person_1 && person_3 > person_2) {
                System.out.println("Person 3 is greater ");
            }
    }
            public void youngest(){
            if (person_1 < person_2 && person_1 < person_3) {
                System.out.println("Person 1 is youngest ");
            }
            else if (person_2 < person_3 && person_2 < person_1) {
                        System.out.println("Person 2 is youngest ");
            }
            else if (person_3 < person_1 && person_3 < person_2) {
                System.out.println("Person 3 is youngest ");
            }
        }

    public static void main(String[] args) {
        GreatestAndYoungest greatestAndYoungest = new GreatestAndYoungest();
        greatestAndYoungest.greatestAndYoungest();
        greatestAndYoungest.greatest();
        greatestAndYoungest.youngest();
    }
    }


    /*          OUTPUT
Enter age of 1st person :
44
Enter age of 2nd person :
34
Enter age of 3rd person :
43
Person 1 is greater
Person 2 is youngest
    */

