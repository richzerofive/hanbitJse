/**
 * 
 */
package Controller;

/**
 *@date   : 2016. 6. 14.
 *@author : 박승주
 *@file   : Mn1.java
 *@story  : 
*/
public class Mn1 {
	public String execute(int[] score){

		int max=0,min=100;
		for (int i = 0; i < score.length; i++) {
			if (i > i - 1)
				max = i;
			else if (i < i - 1)
				min = i;
		}
		
		return "최고점="+max+"최하점="+min;
	}
}
