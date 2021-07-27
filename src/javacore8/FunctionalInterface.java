package javacore8;

import java.util.function.*;
public class FunctionalInterface {

	static String Y = "Y";
	static String N = "N";
	public static void main(String[] args) {
		
		/*
		 * Function<Integer,String> func = (t)->{ if(t>0) return Y; else return N; };
		 */
		
		Function<Integer,String> func = (t)-> (t>0) ? Y : N;
        System.out.println(func.apply(200));
        System.out.println(Utils.lambda1.apply(0));
        
       
        
	}

}
