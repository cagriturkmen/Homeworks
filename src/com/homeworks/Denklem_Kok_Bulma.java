package com.homeworks;

import java.util.Scanner;

public class Denklem_Kok_Bulma {
	public static void Fonksiyon() {
		
		Scanner scan = new Scanner(System.in);
		int a, b, c, x;
		System.out.println("ax^2+bx+c denkelemi için a sayısını gir:");
		a = scan.nextInt();
		System.out.println("ax^2+bx+c denkelemi için b sayısını gir:");
		b = scan.nextInt();
		System.out.println("ax^2+bx+c denkelemi için c sayısını gir:");
		c = scan.nextInt();
		System.out.println("ax^2+bx+c denkelemi için x sayısını gir:");
		x = scan.nextInt();
		System.out.println("Denklemin sonucu: " + ((a * Math.pow(x, 2)) + (b * x) + c));
		double diskriminant = (Math.pow(b, 2)) - (4 * a * c);
		System.out.println("Denklemin diskriminantı: " + (diskriminant));
		
		if (diskriminant > 0) {
			double x1, x2;
			x1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
			x2 = (-b - Math.sqrt(diskriminant)) / 2 * a;
			System.out.println("Denklemin 1.kökü: " + x1 + " Denklemin 2. kökü:" + x2);
		} else if (diskriminant == 0) {
			double x1 = -b / (2 * a), x2 = -b / (2 * a);
			System.out.println("Denklemin 1.kökü: " + x1 + " Denklemin 2. kökü:" + x2);
		} else
			System.out.println("Denklemin reel kökü bulunmamaktadır!");
		
	}
	
	public static void main(String[] args) {
		// Method_0003_Hesap_Makinesi Fonksiyon = new Method_0003_Hesap_Makinesi();
		Fonksiyon();
	}
}
