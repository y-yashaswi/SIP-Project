public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	int subtract(int a , int b) {
		return a-b;
	}
	int multiply(int a,int b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}
		 
    
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Add:" + calc.add(30,40));
	    System.out.println("Subtract:" + calc.subtract(40,20));
        System.out.println("Multiply :" + calc.multiply(2, 5));
	    System.out.println("Divide:" + calc.divide(2.0, 18.0));
	}

}

