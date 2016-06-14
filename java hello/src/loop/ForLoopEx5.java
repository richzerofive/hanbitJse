/**
 * 
 */
package loop;

/**
 * @date : 2016. 6. 13.
 * @author : 박승주
 * @file : ForLoopEx4.java
 * @story : 3의배수를 제외한 1부터 10까지 급수는? (단,공차는 1..!사용금지)
 */
public class ForLoopEx5 {
	public static void main(String[] args) {
		int i = 0, tsum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 3 != 0) {
				tsum += i;
			}
		}
		System.out.print(tsum);
	}
}