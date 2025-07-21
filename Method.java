public class Method {
	//Static method
		public static void staticMethod() {
			System.out.println("This is a static method");
		}
			//Non static method
			public void nonStaticMethod() {
				System.out.println("This is a non-static method");
				
			}
		
		public static void main(String[] args) {
			// Calling static method
			Method.staticMethod();
			
			//Calling non static method
			Method obj = new Method();
			obj.nonStaticMethod();
			

		}

}

