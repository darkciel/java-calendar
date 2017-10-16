package honux.calendar;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		int a = 0,b = 0;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println("두수를 입력해주세요");
		
		s1 = scanner.next();
		s2 = scanner.next();
		
		//출력: 화면에 두수의 합을 출력한다.
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(s1+"+"+s2+"="+(a+b));
		//System.out.println("두수의 합은"+(a+b)+"입니다");
		System.out.printf("%d와 %d의 합은 %d 입니다",a,b,(a+b));
		scanner.close(); //메모리누수 방지
	}
}
