/**
 * 
 */
package loop;


/**
 *@date   : 2016. 6. 13.
 *@author : 박승주
 *@file   : ForLoopEx3.java
 *@story  : 
*/
public class ForLoopEx3 {
	public static void main(String[] args) {
		int i=0 , oddsum=0, evensum=0;
		for (i = 0;  i <= 10; i++) {
			
			if (i%2==0) {
				evensum+=i;
			} else {
				oddsum+=i;
			}
		}	System.out.printf("%s%d%s%d","짝수는",evensum,"홀수는",oddsum);
	}	
}	