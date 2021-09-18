package com.Homeworks;

import java.util.Scanner;

class AsalKontrolu {
	// deneme
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, n = 2;
		
		System.out.println("Lütfen bir sayı giriniz:");
		x = scan.nextInt();
		while (true) {
			if (Math.floorMod(x, n) == 0) {
				if (x == n) {
					System.out.println("Sayı asaldır.");
					break;
				} else {
					System.out.println("Sayı asal değildir.");
					break;
				}
				
			} else {
				n++;
			}
		}
	}
}
