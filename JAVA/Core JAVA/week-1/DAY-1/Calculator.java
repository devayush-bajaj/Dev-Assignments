class Calculation{
	int num1,num2, result;
	void addition(){				// calculator logics
		result = num1 + num2;
		System.out.println("Your Answer is " + result);
	}
	void Multiply(){
		result = num1 * num2;
		System.out.println("Your Answer is " + result);
	}
	void division(){
		result = num1 / num2;
		System.out.println("Your Answer is " + result);
	} 
	void subtraction(){
		result = num1 - num2;
		System.out.println("Your Answer is " + result);
	} 

}

	public class Calculator{
	

		public static void main (String [] args){
		Calculation Calculation = new Calculation();
		Calculation.addition();
		Calculation.subtraction();
		Calculation.Multiply();
		Calculation.division();

	}	
	
}