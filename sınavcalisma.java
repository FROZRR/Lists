package mert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sınavcalisma {

	public static void main(String[] args) {
		List<String> urunadi = new ArrayList<String>();
		List<String> uruncesidi = new ArrayList<String>();
		List<Float> miktar = new ArrayList<Float>();
		List<Integer> birimfiyat = new ArrayList<Integer>();
		Scanner giris = new Scanner(System.in);
		for(;;) {
			Fonksiyonlar.menu();
			byte menudeger = giris.nextByte();
			switch (menudeger) {
			case 1:
				Fonksiyonlar.Kayitgiris(giris , urunadi , uruncesidi , miktar , birimfiyat);
				break;
			case 2:
				Fonksiyonlar.Listeleme(urunadi , uruncesidi , miktar , birimfiyat);
				break;
			case 3:
				System.out.println("Aranacak Çeşidi Giriniz: ");
				String cesitara = giris.next();
				Fonksiyonlar.Cesitarama(cesitara , urunadi , uruncesidi , miktar , birimfiyat);
				break;
			case 4:
				float toplamfiyat = Fonksiyonlar.ToplamFiyat(urunadi , uruncesidi , miktar , birimfiyat);
				System.out.println("Depodaki Toplam Fiyat: "+toplamfiyat);
				break;
			case 5:
				System.out.println("Ürün Adı Giriniz: ");
				String urunadıgir = giris.next();
				Fonksiyonlar.Urunadiile(urunadi);
				break;
			case 6:
				Fonksiyonlar.Endusuk(urunadi , uruncesidi , miktar , birimfiyat);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("Sistemden çıkılıyor.......");
				break;
				default:
					System.out.println("Yanlış Tuşlama Yaptınız!!!!");
					break;
			}
			
		}

	}

}
