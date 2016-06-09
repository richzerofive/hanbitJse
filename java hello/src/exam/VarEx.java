/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 8.
 *@author : 박승주
 *@file   : VarEx.java
 *@story  : 
*/
public class VarEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int a = 0, b = 0, c = 0;
		System.out.println("정수하나를 입력");
			a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a + b;
		System.out.println("a+b=" + c);
	
	
	}
}
