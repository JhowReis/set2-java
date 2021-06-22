package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.CodeEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<CodeEntry> set = new HashSet<>();

		System.out.print("How many students for course A:  ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.print("code " + i + ": ");
			int code = sc.nextInt();
			set.add(new CodeEntry(code));
			if (i == a) {
				System.out.print("How many students for course B:  ");
				int b = sc.nextInt();
				for (i = 1; i <= b; i++) {
					System.out.print("code " + i + ": ");
					code = sc.nextInt();
					set.add(new CodeEntry(code));
					if (i == b) {
						System.out.print("How many students for course C:  ");
						int c = sc.nextInt();
						for (i = 1; i <= c; i++) {
							System.out.print("code " + i + ": ");
							code = sc.nextInt();
							set.add(new CodeEntry(code));
							if (i == c) {
								System.out.println("Total students" + set.size());
							}
						}

					}

				}

			}

		}
		

		sc.close();
	}
}
