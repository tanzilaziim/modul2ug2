import java.util.Scanner;

public class OperasiTitik {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        do{
            System.out.println();
            System.out.println("\tMENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 0 :
                    titik1.keluarMenu();
                    break;
                case 1 :
                    System.out.print("Masukkan koordinat x: ");
                    int x1 = input.nextInt();
                    System.out.print("Masukkan koordinat y: ");
                    int y1 = input.nextInt();
                    titik1.inisialisasiTitik(x1,y1);
                    System.out.println("\tTitik berhasil diinisialisasi");
                    break;
                case 2 :
                    System.out.print("Titik: ");
                    titik1.tampilTitik();
                    break;
                case 3 :
                    System.out.print("Masukkan nilai skalar: ");
                    int skalar = input.nextInt();
                    titik1.perkalianSkalar(skalar);
                    System.out.println("\tHasil perkalian titik dengan skalar");
                    System.out.print("Titik: ");
                    titik1.tampilTitik();
                    break;
                case 4 :
                    titik1.pencerminanSumbuX();
                    System.out.println("\tHasil pencerminan titik terhadap sumbu X");
                    System.out.print("Titik: ");
                    titik1.tampilTitik();
                    break;
                case 5 :
                    titik1.pencerminanSumbuY();
                    System.out.println("\tHasil pencerminan titik terhadap sumbu Y");
                    System.out.print("Titik: ");
                    titik1.tampilTitik();
                    break;
                case 6 :
                    System.out.println("\tBuat titik kedua");
                    System.out.print("Masukkan koordinat x: ");
                    int x2 = input.nextInt();
                    System.out.print("Masukkan koordinat y: ");
                    int y2 = input.nextInt();
                    titik2.inisialisasiTitik(x2,y2);
                    System.out.print("Titik A: ");
                    titik1.tampilTitik();
                    System.out.print("Titik B: ");
                    titik2.tampilTitik();
                    System.out.println();
                    System.out.println("Jarak antara dua titik: " + titik1.jarak(titik2));
                    break;
                default :
                    System.out.println("Tidak ada pilihan,");
                    System.out.println("Silahkan coba lagi");
            }
        }while(pilihan != 0);
    }
}
