//6.3
package hust.soict.dsai.lab01;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scan.close();
	}
}
