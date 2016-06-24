/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 15.
 * @author : 박승주
 * @file : Mn2.java
 * @story :
 */
public class Mn2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int maxi = 0, mini = 0;
		System.out.println("학생수");
		int count = s.nextInt();
		int[] score = new int[count];
		System.out.println("점수");
		for (int i = 0; i < score.length; i++) {
			score[i] = s.nextInt();
			if (score[i] > maxi) {
				maxi = score[i];
			}
			if (score[i] < mini)
				mini = score[i];
		}
		System.out.println("최고점=" + maxi + "최소점=" + mini);
	}
}
