package test_1;

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("1번째 자연수");
		a = sc.nextInt();
		System.out.println("2번째 자연수");
		b = sc.nextInt();
		
		
		System.out.printf("%d + %d = %d", a, b, a+b);
		System.out.println();
		System.out.printf("%d - %d = %d", a, b, a-b);
		System.out.println();
		System.out.printf("%d * %d = %d", a, b, a*b);
		System.out.println();
		System.out.printf("%d / %d = %d", a, b, a/b);
		System.out.println();
		System.out.printf("%d 나누기 %d의 나머지 = %f", a, b, (float)a%b);
		System.out.println();
	}

}
