package java1;

import java.util.Scanner;
public class NSC {
	public static void PrintNum(int n) {
		if(n>9) {
			System.out.print((char)(n+87));
		}
		else {
			System.out.print(n);
		}
		
	}
	public static void Convert(int n, int k) {
		if(n < k) {
			PrintNum(n);
		}
		else {
			Convert(n/k,k);
			PrintNum(n%k);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		System.out.print("b ");Convert(N,2);System.out.println();
		System.out.print("o ");Convert(N,8);System.out.println();
		System.out.print("h ");Convert(N,16);System.out.println();
	}
	
}
