/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;


/**
 *@date   : 2016. 6. 10.
 *@author : 박승주
 *@file   : oddeven.java
 *@story  : 
*/
public class oddeven {
		/**
		 * 개발자님, 홀짝 게임하나 만들어 주세요.
		 * 사용자가 홀인지 짝인지 맞추면
		 * WIN 틀리면 LOSE 가 출력되면 됩니다.
		 * @param args
		 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num= random.nextInt(10)+1;
		
		
		System.out.println("짝이고 생각하면 0을 홀이라고 생각하면 1을 입력하세요");
		int usernum = scanner.nextInt();
		 
		 switch (num%2) {
		case 1:
			System.out.println("Win");
			break;

		default:System.out.println("lose");
			break;
		}
	}}
	
