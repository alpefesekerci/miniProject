package studentManageApp;

import java.util.Scanner;

public class Main {
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
        }






    }
}
