package DAY_3;

class Execution {

   int Balance = 10000, interest = 500, New_Balance=0;
   //----------------Arithmetic---------------------------
      void Addition(){
          New_Balance = Balance + interest;
      System.out.println("Balance after Addition of interest value " + New_Balance);
      }
      void Subtraction(){
         New_Balance = Balance - interest;
         System.out.println("Balance after Subtraction of interest value " + New_Balance);
      }
      void  Multiplication(){
         New_Balance = Balance * interest;         //LOTTERY
         System.out.println("Balance after Multiplication of interest value " + New_Balance);
      }
      void Division(){
         New_Balance = Balance / interest;
         System.out.println("Balance after Division of interest value " + New_Balance);
      }
      //--------------------logical ----------------------------------------

      void less_than(){
         for(int i = 1; i < 5; i++ ){
            System.out.println("Less than operator: " + i);
         }

      }
      void more_than(){
         for(int i = 5; i > 1; i-- ){
            System.out.println("More than operator: " + i);
         }
      }
   void equal(){
      int i = 20;
      if (i == 20){
         System.out.println("Equal to Operator: " + i);
      }
   }
   //-------------------------increment decrement-------------------------------
    void IncDec(){

      int number1 = 12, number2 = 12;
      int increment, decrement;

      System.out.println("Increment and Decrement Operators:- ");
      // original value
      System.out.println("Value of number 1: " + number1);

      // increment operator
      increment = ++number1;
      System.out.println("After increment: " + increment);

      System.out.println("Value of b: " + number2);

      // decrement operator
      decrement = --number2;
      System.out.println("After decrement: " + decrement);

   }
   //-------------------------Ternary Op-------------------------------
    void Ternary(){
      int februaryDays = 29;
      String result;

      System.out.println("Ternary operator:- ");
      System.out.println("No of days in February:" + februaryDays );
      // ternary operator
      result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
      System.out.println(result);
   }

   }

public class TypesOfOperators {
   public static void main(String[] args) {
      Execution execution= new Execution();
      execution.Addition();
      execution.Subtraction();
      execution.Multiplication();
      execution.Division();
      execution.less_than();
      execution.more_than();
      execution.equal();
      execution.IncDec();
      execution.Ternary();
   }
}
