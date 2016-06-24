/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : 박승주
 * @file : avg.java
 * @story :
 */

public class Avg3 {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점, 평균 ***점,
	 * 학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A 80점 이상이면
	 * B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 출력되게 해주세요
	 * [단]switch-case 문으로 해결하세요.
	 */
	public static void main(String[] args) {
		// ---------------변수 선언부,준비,초기화(init)--------------
		String name = "", qwe = "";
		int total = 0, avg = 0, kor = 0, eng = 0, math = 0,avg2 = 0;
		Scanner scanner = new Scanner(System.in);
		// ===============연산부 (알고리즘)---------------------------
		System.out.println("name?");
		name = scanner.next();
		System.out.println("국,영,수??");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		total = kor + eng + math;
		avg = total/3;
		avg2 = total/3/10;
		switch (avg2) {
		case 9 : 
			qwe="A";
			break;
		case 8 : 
			qwe="B";
			break;
			
		case 7 : 
			qwe="C";
			break;
				
		case 6 : 
			qwe="D";
			break;
					
		case 5 : 
			qwe="E";
			break;
		
		default:
			qwe="F";
			break;
		}
		System.out.println("name :총점 "+total+", 평균 "+avg+",학점"+qwe);
		
		}
		
		
		
		
	}

