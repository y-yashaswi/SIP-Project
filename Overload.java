public class Overload {
	//two parameters
		int sum(int a , int b) {
			return a+b;
		}
		//three parameters
		int sum(int a,int b,int c) {
			return a+b+c;
		}
		public static void main(String[] args) {
			Overload obj = new Overload();
			System.out.println("Sum of a + b;" + obj.sum(50,20, 0));
			System.out.println("Sum od a + b + c:" + obj.sum(2, 10,8));
		}

}

