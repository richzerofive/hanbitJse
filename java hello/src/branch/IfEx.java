/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 8.
 *@author : 박승주
 *@file   : IfEx.java
 *@story  : Branch
*/
public class IfEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int input=scanner.nextInt();
	if (input==10) {
		System.out.println("입력된 정수값"+input+"은 10입니다");
	} else {
System.out.println("입력된 정수값"+input+"이 10이 아닙니다");
	}
}
}
