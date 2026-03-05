package studentManageApp;

import java.util.Scanner;

public class Main {

    public static double ortalamaHesapla(int[] ogrenciNotlari) {
        double toplam = 0;
        for (int not : ogrenciNotlari) {
            toplam += not;}
        return toplam / ogrenciNotlari.length;}

    public static int enYuksekNotuBul(int[] ogrenciNotlari){
        int enYuksek = ogrenciNotlari[0];
        for (int not : ogrenciNotlari){
            if (not > enYuksek){
                enYuksek = not;
            }
        }
        return enYuksek;}

    public static void gecenleriListele(String[] isimler, int[] notlar){
        System.out.println("\n---GEÇEN ÖĞRENCİLER---");
        boolean gecenVarMi = false;
        for (int i = 0; i < notlar.length; i++){
            if (notlar[i] >= 50){
                System.out.println(isimler[i] + "-> NOT " + notlar[i]);
                gecenVarMi = true;
            }
        }
        if (!gecenVarMi){
            System.out.println("Bu Dersi Geçen Öğrenci Yok.");
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç Öğrenci Gireceksiniz? ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[ogrenciSayisi];
        int[] notlar = new int[ogrenciSayisi];

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
                    System.out.println("Ortalama Hesaplanıyor...");
                    double ortalama = ortalamaHesapla(notlar);
                    System.out.println("Sınıfın Ortalaması: " + ortalama);
                    break;
                case 2 :
                    System.out.println("En Yüksek Not Aranıyor...");
                    int max = enYuksekNotuBul(notlar);
                    System.out.println("Sınıftaki En Yüksek Not: " + max);
                    break;
                case 3 :
                    gecenleriListele(isimler,notlar);
                    System.out.println("Geçenler Listeleniyor...");
                    break;
                case 0 :
                    System.out.println("Programdan Çıkılıyor!");
                    devamEt = false;
                    break;
                default:
                    System.out.println("Geçersiz İşlem! Lütfen Geçerli Bir Seçim Yapınız.");
            }
            if (devamEt){
                System.out.println("\nAna Menüye Dönmek İçin ENTER tuşuna basınız...");
                scanner.nextLine();
            }
        }
    }
}

