package studentManageApp;

import java.util.Scanner;

public class Main {

    public static double ortalamaHesapla(int[] ogrenciNotlari) {
        double toplam = 0;
        for (int not : ogrenciNotlari) {
            toplam += not;}
        return toplam / ogrenciNotlari.length;}
    



    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç Öğrenci Gireceksiniz? ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();

        String isimler[] = new String[ogrenciSayisi];
        int notlar[] = new int[ogrenciSayisi];

        for (int i = 0; i < ogrenciSayisi; i++){
            System.out.println((i+1) + ". öğrencinin adını giriniz: ");
            isimler[i] = scanner.nextLine();

            System.out.println((i+1) + ". öğrencinin notunu giriniz: ");
            notlar[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nVeri Girişi Tamamlandı");

        boolean devamEt = true;

        while (devamEt){

            System.out.println("\n--- İŞLEM MENÜSÜ ---");
            System.out.println("1 - Sınıf Ortalamasını Hesapla");
            System.out.println("2 - En Yüksek Notu Göster");
            System.out.println("3 - Geçen Öğrencileri Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){

                case 1 :
                    double ortalama = ortalamaHesapla(notlar);
                    System.out.println("Ortalama Hesaplanıyor...");
                    break;
                case 2 :
                    System.out.println("En Yüksek Not Aranıyor...");
                    break;
                case 3 :
                    System.out.println("Geçenler Listeleniyor...");
                    break;
                case 0 :
                    System.out.println("Programdan Çıkılıyor!");
                    devamEt = false;
                    break;
                default:
                    System.out.println("Geçersiz İşlem! Lütfen Geçerli Bir Seçim Yapınız.");
            }
        }
    }
}

