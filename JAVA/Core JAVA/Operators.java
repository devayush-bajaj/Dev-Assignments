package DAY_2;
class Execution {

   int Balance = 10000, interest = 500, New_Balance=0;
   double rate_of_interest = 5.5;
   //----------------Arithmetic---------------------------
      int Addition(){
          New_Balance = Balance + interest;
          return New_Balance;
      }
      int Subtraction(){
         New_Balance = Balance - interest;
         return New_Balance;
      }
      int Multipication(){
         New_Balance = Balance * interest;         //LOTTERY
         return New_Balance;
      }
      int Division(){
         New_Balance = Balance / interest;
         return New_Balance;
      }
      //--------------------logical ----------------------------------------

      int less_than(){
         for(int i = 10; i < 20; i++ ){
            System.out.println("Less than operator answer: " + i);
         }
         return New_Balance;
      }
      int more_than(){
         for(int i = 0; i >= 20; i++ ){
            System.out.println("More than operator answer: " + i);
         }
         return New_Balance;
      }
   int equal(){
      for(int i = 10; i == 20; i++ ){
         System.out.println("Equal to Operator answer: " + i);
      }
      return New_Balance;
   }
   //-------------------------intcriment decrement-------------------------------
   public void IncDec(){

      int number1 = 12, number2 = 12;
      int increment, decrement;

      System.out.println("This is Increment and Decrement Operators");
      // original value
      System.out.println("Value of a: " + number1);

      // increment operator
      increment = ++number1;
      System.out.println("After increment: " + increment);

      System.out.println("Value of b: " + number2);

      // decrement operator
      decrement = --number2;
      System.out.println("After decrement: " + decrement);

   }
   //-------------------------Ternary Op-------------------------------
   public void Ternary(){
      int februaryDays = 29;
      String result;

      System.out.println("This is Ternary operator:");
      System.out.println("No of days in February:" + februaryDays );
      // ternary operator
      result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
      System.out.println(result);
   }

   }

public class Operators {
   public static void main(String[] args) {
      Execution execution= new Execution();
      execution.Addition();
      execution.Subtraction();
      execution.Multipication();
      execution.Division();
      execution.less_than();
      execution.more_than();
      execution.equal();
      execution.IncDec();
   }
}
