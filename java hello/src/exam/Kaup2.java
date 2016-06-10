/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 10.
 *@author : 박승주
 *@file   : Kaup2.java
 *@story  : 
*/
public class Kaup2 {
		/**
		 * 개발자님 BMI 지수가 너무 길어요.
		 * 소수점 이하 2자리에서 끊어주세요.
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String name="",result="",ans="";
			double bmi=0.0,height=0.0,weight=0.0, d=0.0;
			//----------op-----------
			System.out.println("이름?");
			name =scanner.next();
			System.out.println("키?");
			height=scanner.nextDouble();
			System.out.println("몸무게?");
			weight=scanner.nextDouble();
			//-------수식---------
			height = height * 0.01;
			bmi = weight / height / height;
			
			if (bmi < 18.5) {
				
			} else if(18.5 <= bmi && bmi < 23){
				ans = "저체중";
			} else if(23 <= bmi && bmi < 25){
				ans = "정상체중";
			}
			  else if(25 <= bmi && bmi < 30){
				ans = "비만1단계";
}
			  else if(30 <= bmi && bmi < 40){
				ans = "비만2단계";
}
			  else if(bmi >= 40){
				ans = "비만3단계";
}
			Double.parseDouble(String.format("%.2f", bmi));				
			System.out.println(name+"은 BMI지수는 "+Double.parseDouble(String.format("%.2f", bmi))+"이고,"
					+" "+result+"이다");
		}
}
