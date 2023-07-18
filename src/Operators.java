
public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators................
		
				// declare variables
				
				int a = 5;
				int b = 2 ;
				int c = a + b;
				
				 // addition operator
				System.out.println(c);
				
				 // subtraction operator
				System.out.println(a-b);
				
				// multiplication operator
				System.out.println(a*b);
				
				// division operator
				System.out.println(a/b);
				
				// modulo operator
				System.out.println(a%b);
				
				
				
				//Assignment Operators .................

				System.out.println("\n Assignment Operators......" );
				
				//Create Variables
				
				int p = 4;
				int var;
				
				// assign value using
				var = p;
				System.out.println("var using =: " +var);
				
				// assign value using =+
				var += p;
				System.out.println("var using +=: " + var);
				
				// assign value using =-
						var -= p;
						System.out.println("var using -=: " + var);
						
				// assign value using =*
						var *= p;
						System.out.println("var using *=: " + var);
						
				// assign value using =/
						var /= p;
						System.out.println("var using /=: " + var);
						
				
						
						System.out.println("\n  ! Relational Operators !");
				//Relational Operators .................	
						
						//variables create
						int m = 5 , n = 6;
						
						// value of a and b
					    System.out.println("M is " + m + " and N is " + n);
					    
					 // == operator
					    System.out.println(m==n);  //false
					    
					 // != operator
					    System.out.println(m != n);  // true

					    // > operator
					    System.out.println(m > n);  // false

					    // < operator
					    System.out.println(m < n);  // true

					    // >= operator
					    System.out.println(m >= n);  // false

					    // <= operator
					    System.out.println(m <= n);  // true
					    
					    
					    
					    System.out.println("\n  ! Logical Operators !");
					    
					    // Logical Operators.........................
					    
					    
					    // && operator [sob gula true hole - trun otherwise false return korbe
					    
					    int e = 4 , f = 4 , g = 6;
					    System.out.println((e==f)&&(e<g));    // true
					    System.out.println((e==f)&&(e>g));    // false
					    
					    
					    // || - locical or operator [ Jei kono ekta trule hole 1 / duita hole o 1 return korbe]
					    
					    System.out.println((5 < 3) || (8 > 5));  // true
					    System.out.println((5 > 3) || (8 < 5));  // true
					    System.out.println((5 < 3) || (8 < 5));  // false
					    
					    
					 // ! operator  {logical not}[result true hole (not) false kore dey & false hole true kore dey.
					    System.out.println(!(5 == 3));  // true
					    System.out.println(!(5 > 3));  // false

					    
					    
					    
					    
					    System.out.println("\n  ! Increment and Decrement Operators !");
					    // Increment and Decrement Operators ....................
					    
					 // declare variables
					    int s = 12, t = 12;
					    int result1, result2;

					    // original value
					    System.out.println("Value of s: " + s);

					    // increment operator
					    result1 = ++s;
					    System.out.println("After increment: " + result1);

					    System.out.println("Value of b: " + t);

					    // decrement operator
					    result2 = --t;
					    System.out.println("After decrement: " + result2);
					    
					    
					    
					    
					    
					    System.out.println("\n  ! Bitwise Operators!");
					    // Bitwise operators ....................
					    
					    
					    
					    
					    
					    
					    
					    
					    System.out.println("\n  ! Other operators !");
					    // Other operators ....................
					    
					    String str = "Programiz";
					    boolean result;

					    // checks if str is an instance of
					    // the String class
					    result = str instanceof String;
					    System.out.println("Is str an object of String? " + result);
					    
					    
					    
					    
					   // issue................
					    
//					    System.out.println("\n  ! Ternary Operator !");
//					    //Ternary Operator ....................
//					   
//					    int februaryDays = 29;
//					    String result;
//
//					    // ternary operator
//					    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
//					    System.out.println(result);


	}

}
