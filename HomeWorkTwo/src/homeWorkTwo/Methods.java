package homeWorkTwo;

import java.util.Scanner;

public class Methods {
	
	public static void sayibulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		System.out.print("Aranacak deðeri giriniz: ");
		Scanner aranacakSayi = new Scanner(System.in);
		int aranacak = aranacakSayi.nextInt();
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Tebrikler!");
		} else {
			System.out.println("Tekrar Deneyin!");
		}

	}
	//overloading
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla(int... sayilar) {
		int topla=0;
		for (int i : sayilar) {
			topla+=i;	
		}
		System.out.println(topla);
		return topla;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
