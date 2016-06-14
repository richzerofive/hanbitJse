/**
 * 
 */
package loop;


/**
 * @date : 2016. 6. 13.
 * @author : 박승주
 * @file : ForLoopEx3.java
 * @story : 3의배수를 제외한 1부터 10까지 수열?
 */
public class ForLoopEx4 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i < 10; i++) {
			if (i % 3 != 0) {
				System.out.println(i);
			}

		}
	}
}