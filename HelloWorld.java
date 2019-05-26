 import java.util.Scanner;
 import java.lang.Integer;


 class HelloWorld {

 	public static void main (String[] args){
 		
 		// for everytime following codition is met
 		for(int i = 1; i <= 100; i++)
 		{
 			//execute following code

 			if(i % 3 == 0 && i % 5 == 0){
 				System.out.println("FizzBuzz");
 			}else if(i % 3 == 0){
 				System.out.println("Fizz");
 			}else if(i % 5 == 0){
 				System.out.println("Buzz");
 			}else{
 				System.out.println(i);
 			}
 		}
 	}

}