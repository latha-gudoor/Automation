/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/


package Vikas_Assignment_Programs;

import java.util.Scanner;

public class NumberPatterns {

	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	*/
	public static void pattern1(int rows){
		System.out.println("Pattern 1 : ");
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){  
				System.out.print(j+" ");  
			}
		System.out.print("\n");
	}
		}
	
	/*
5 4 3 2 1 

4 3 2 1 

3 2 1 

2 1 

1 
*/
	
	public static void pattern2(int rows){
		System.out.println("\nPattern 2 : ");
		for(int i=rows;i>=1;i--){ 
			for(int j=i;j>=1;j--){
			System.out.print(j+" ");
		}
		System.out.print("\n");
	}
}
	/* 
	  1 2 3 4 5
	  1 2 3 4
      1 2 3
      1 2
      1 */
	
	public static void pattern3(int rows){
		System.out.println("\nPattern 3 : ");
		for(int i=rows;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");  
			}
		System.out.print("\n");
		}
		
	}
	/* 
	 1
    12
   123
  1234
 12345


	 */
	
	public static void pattern4(int rows){	
		System.out.println("\nPattern 4: ");
		for (int i=1;i<=rows;i++) { 
			for (int j=rows;j>=i;j--) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++){
					System.out.print(k);
				}
			
				System.out.println();

		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		NumberPatterns.pattern1(rows);
		NumberPatterns.pattern2(rows);
		NumberPatterns.pattern3(rows);
		NumberPatterns.pattern4(rows);
		}

}
