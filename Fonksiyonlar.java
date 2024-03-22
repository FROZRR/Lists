package mert;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void menu() {
		System.out.println("1-Veri Girişi\n2-Listeleme\n3-Çeşit İle Arama\n4-Toplam Fiyat\n5-Ürün Adı İle Arama\n6-En Düşük Miktarlı Ürün Bilgisi\n7-Düzeltme\n8-Silme\n9-Çıkış");
		
	}

	public static void Kayitgiris(Scanner giris, List<String> urunadi, List<String> uruncesidi, List<Float> miktar,
			List<Integer> birimfiyat) {
		System.out.println("Ürün Adı Giriniz: ");
		urunadi.add(giris.next());
		System.out.println("Birim Fiyatı Giriniz: ");
		birimfiyat.add(giris.nextInt());
		System.out.println("Ürün Çeşidi Giriniz: ");
		uruncesidi.add(giris.next());
		System.out.println("Miktar Giriniz: ");
		miktar.add(giris.nextFloat());
		
	}

	public static void Listeleme(List<String> urunadi, List<String> uruncesidi, List<Float> miktar,
			List<Integer> birimfiyat) {
		for (int i = 0; i < urunadi.size(); i++) {
			System.out.println("Ürün Adı: "+urunadi.get(i));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(i));
			System.out.println("Birim Fİyatı: "+birimfiyat.get(i));
			System.out.println("Miktarı: "+miktar.get(i));
			System.out.println("----------------------------------");
			
		}
		
	}

	public static void Cesitarama(String cesitara, List<String> urunadi, List<String> uruncesidi, List<Float> miktar,
			List<Integer> birimfiyat) {
		for (int i = 0; i < urunadi.size(); i++) {
			System.out.println("Ürün Adı: "+urunadi.get(i));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(i));
			System.out.println("Birim Fİyatı: "+birimfiyat.get(i));
			System.out.println("Miktarı: "+miktar.get(i));
			System.out.println("----------------------------------");
			
		}
		
	}

	public static float ToplamFiyat(List<String> urunadi, List<String> uruncesidi, List<Float> miktar,
			List<Integer> birimfiyat) {
		float toplam = 0;
		for (int i = 0; i < miktar.size(); i++) {
			toplam+=birimfiyat.get(i)*miktar.get(i);
			
		}
		return 0;
	}

	public static void Urunadiile(List<String> urunadi) {
		System.out.println("Ürün Adı Giriniz: ");
		
		
	}

	public static void Endusuk(List<String> urunadi, List<String> uruncesidi, List<Float> miktar,
			List<Integer> birimfiyat) {
		float enk = miktar.get(0);
		for (int i = 0; i < urunadi.size(); i++) {
			if(miktar.get(i)==enk);
			System.out.println("Ürün Adı: "+urunadi.get(i));
			System.out.println("Ürün Çeşidi: "+uruncesidi.get(i));
			System.out.println("Birim Fİyatı: "+birimfiyat.get(i));
			System.out.println("Miktarı: "+miktar.get(i));
			System.out.println("----------------------------------");
			
		}
		
	}

}
