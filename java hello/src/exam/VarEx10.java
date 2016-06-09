/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 8.
 *@author : 박승주
 *@file   : VarEx10.java
 *@story  : 
*/
public class VarEx10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = 0 , b = 0 , c = 0 ;
	System.out.println("실수 하나를 입력");
		a = scanner.nextDouble();
	System.out.println("두번째 실수를 입력");
		b = scanner.nextDouble();
		c = a%b ; 
	System.out.println("a%b="+c);
	}


}
