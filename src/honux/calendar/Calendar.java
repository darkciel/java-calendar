package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
 	public int getMaxDaysOfMonth(int month) {
 		
		return MAX_DAYS[month-1];
	}
 	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
 	}

	public static void main(String[] args) {


		
		//숫자를 입력받아 해장하는 달의 최대 일수를 출력하기
		int month=0;
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
//		
		System.out.println("달을 입력하세요.");
		month= scanner.nextInt();
//		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month,cal.getMaxDaysOfMonth(month));
		
//		if(a==1) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==2) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,28);
//		}else if(a==3) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==4) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,30);
//		}else if(a==5) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==6) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,30);
//		}else if(a==7) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==8) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==9) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,30);
//		}else if(a==10) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else if(a==11) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,30);
//		}else if(a==12) {
//			System.out.printf("%d월은 %d일까지 있습니다.",a,31);
//		}else {
//		    System.out.println("숫자를 잘못입력하셨습니다. 다시 입력하여 주십시오.");
//		    a= scanner.nextInt();
//		}
		cal.printSampleCalendar();
		scanner.close();
	}

}
