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
public class ArrAssign {
	public static void main(String[] args) {
		/**
		 * 전교생이 5명인 학생의 이름과 나이를 입력받고, 이것을 출력하세요
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int[] age = new int[5];
		String[] name = new String[5];

		{
			for (; i < age.length; i++) {
				System.out.println("이름,나이입력");
				name[i] = scanner.next();
				age[i] = scanner.nextInt();
				
				
			}
			for (i = 0; i < name.length; i++) {
				
				System.out.printf("이름:%s\t나이:%d\t",name[i],age[i]);
			}
			
		}
	}
}
