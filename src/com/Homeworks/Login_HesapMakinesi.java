package com.homeworks;

import java.util.Scanner;

public class Login_HesapMakinesi {
	
	public static void main(String[] args) {
		int n = 4;
		String dbMail = "root@root.com";
		String dbPassword = "root";
		String maskString = "";
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\nMail adresiniz:");
			String mail = scan.nextLine().trim();
			System.out.println("\nŞifreniz :");
			String password = scan.nextLine().trim();
			
			for (int i = 0; i < password.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Mask password: " + maskString);
			
			if (dbMail.equalsIgnoreCase(mail) && dbPassword.equals(password)) {
				System.out.println("Admin sayfasına yönlendiriliyosunuz...");
				System.out.println("Hesap makinesine hoşgeldiniz. Toplama için 1, Çıkarma için 2 ,bla bla");
				while (true) {
					Scanner scan2 = new Scanner(System.in);
					int islem = scan2.nextInt();
					switch (islem) {
						
						case 1:
							System.out.println("Toplamak istediğiniz sayıları giriniz, 1. sayı:");
							Scanner scan3 = new Scanner(System.in);
							int sayi1 = scan3.nextInt();
							System.out.println("2. sayıyı giriniz:");
							Scanner scan4 = new Scanner(System.in);
							int sayi2 = scan4.nextInt();
							System.out.println("Toplam:" + (sayi1 + sayi2));
							break;
						case 2:
							System.out.println("Çıkarmak istediğiniz sayıları giriniz, 1. sayı:");
							Scanner scan5 = new Scanner(System.in);
							int sayi3 = scan5.nextInt();
							System.out.println("2. sayıyı giriniz:");
							Scanner scan6 = new Scanner(System.in);
							int sayi4 = scan6.nextInt();
							System.out.println("Fark:" + (sayi3 - sayi4));
							break;
						case 3:
							System.out.println("Çarpmak istediğiniz sayıları giriniz, 1. sayı:");
							Scanner scan7 = new Scanner(System.in);
							int sayi5 = scan7.nextInt();
							System.out.println("2. sayıyı giriniz:");
							Scanner scan8 = new Scanner(System.in);
							int sayi6 = scan8.nextInt();
							System.out.println("Çarpım:" + (sayi5 * sayi6));
							break;
						case 4:
							System.out.println("Bölmek istediğiniz sayıları giriniz, 1. sayı:");
							Scanner scan9 = new Scanner(System.in);
							double sayi7 = scan9.nextDouble();
							System.out.println("2. sayıyı giriniz:");
							Scanner scan10 = new Scanner(System.in);
							double sayi8 = scan10.nextDouble();
							System.out.println("Bölüm:" + (sayi7 / sayi8));
							break;
						case 5:
							System.out.println("Üs hesabı yapmak istediğiniz sayıları giriniz, Taban sayı:");
							Scanner scan11 = new Scanner(System.in);
							int sayi9 = scan11.nextInt();
							System.out.println("Kuvvet sayısını giriniz:");
							Scanner scan12 = new Scanner(System.in);
							int sayi10 = scan12.nextInt();
							System.out.println("Sonuç:" + (Math.pow(sayi9, sayi10)));
							break;
						case 0:
							System.exit(0);
							
						default:
							System.out.println("Lütfen belirtilen aralıkta sayı giriniz.");
							
					}
					
					break;
				}
			} else if (n > 1) {
				System.out.println((n - 1) + "adet hakkınız kalmıştır.");
				n--;
			} else {
				System.out.println("Müşteri hizmeteleriini arayızı 444000444");
				break;
			}
		}
	}
	
}
