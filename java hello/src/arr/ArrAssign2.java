/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 박승주
 * @file : ArrAssign.java
 * @story :
 */
public class ArrAssign2 {
	public static void main(String[] args) {
		/**
		 * 전교생이 5명인 학생의 이름과 나이를 입력받고, 이것을 출력하세요
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0, count=0;
		
		
		
		System.out.println("학생 수가 몇명입니까?");
		count = scanner.nextInt();
		int[] age = new int[count];
		String[] name = new String[count];
		int[] number = new int[count];
		
		System.out.println("?명 이름,나이 입력");
		for (; i < age.length; i++) {
			number[i] = i+1;
			name[i] = scanner.next();
			age[i] = scanner.nextInt();
		}
		
		System.out.println("===============\n");
		System.out.println("학번|이름|나이\n");
		System.out.println("===============\n");

		
		for (i = 0; i < name.length; i++) {
			System.out.printf("%d\t%s\t%d\t \n", number[i], name[i], age[i]);
		}
	}
}
