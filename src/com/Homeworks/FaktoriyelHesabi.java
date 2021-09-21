package com.homeworks;

import java.util.Scanner;

public class FaktoriyelHesabi {
	
	public static void main(String[] args) {
		
		int sayi, faktoriyel = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz:");
		sayi = scan.nextInt();
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println(faktoriyel);
	}
	
}
