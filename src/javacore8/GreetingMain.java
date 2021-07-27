package javacore8;

public class GreetingMain {

	public static void main(String[] args) {
		GreetingI greeting1=new GreetingImpl();
		GreetingI greeting2=()->System.out.println("Lambda Implementation of Interface");
		GreetingI greetinganonymous = new GreetingI() {
			
			@Override
			public void function() {
				System.out.println("anonymous implementation of interface");
				
			}
		}; 
		
		greeting1.function();
		greeting2.function();
		greetinganonymous.function();

	}

}
