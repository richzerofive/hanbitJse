/**
 * 
 */
package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@date   : 2016. 6. 17.
 *@author : 박승주
 *@file   : WhatTimeIsItNow.java
 *@story  : 
*/
public class WhatTimeIsItNow {
	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		String now =new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		System.out.println(now);
		String[] arr = new String[3];
		arr = now.split("-");
		String year = arr[0];
		for (String string : arr) {
			System.out.println(string);
		}
		}
	}

