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

        System.out.println("\nVeri Girişi Tamamlandı!");






    }
}
