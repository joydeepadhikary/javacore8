package javacore8;

public class GreetingMain {
	
	public void takeGreetingI(GreetingI greetingI) {
		greetingI.function();
	}

	public static void main(String[] args) {
		GreetingMain greetingMain = new GreetingMain();
		GreetingI greeting1=new GreetingImpl();//Here Interface Instance is a refrence to a Object of Implementing Class.
		
		GreetingI greetinganonymous = new GreetingI() {
			
			@Override
			public void function() {
				System.out.println("anonymous implementation of interface");
				
			}
		}; //Here Interface Instance is reference to a anonymous Object
		
		
		GreetingI greeting2=()->System.out.println("Lambda Implementation of Interface"); //But here, Interface is reference to a functionality only as functional interface instance.
		
		greetingMain.takeGreetingI(()->System.out.println("Passing Lamda as Argument to method"));
		
		greeting1.function();
		greeting2.function();
		greetinganonymous.function();

	}

	
}
