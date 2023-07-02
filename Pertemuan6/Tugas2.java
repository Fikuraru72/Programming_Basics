import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double persegi, segitiga, kubus, tabung;
        double alas, tinggi, sisi, jariJari;
        int hitung = 99, nilai;
        String  menu;

        for (nilai = 1; nilai <= hitung; nilai++){
             System.out.println("--------------------------------------------------------------");
        System.out.println("          Mesin Hitung (Pilih Menu Dibawah Ini 1/2)           ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Menu 1 (Menghitung Luas)");
        System.out.println("Menu 2 (Menghitung Volume)");
        System.out.print("Masukan Pilihan Anda : ");
        menu =sc.nextLine();

        //Pemilihan Menu1
        if (menu.equals("1")) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("    Menu 1 Menghitung Luas : (Pililah menu dibawah ini a/b)   ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("a. Menghitung Luas Persegi");
            System.out.println("b. Menghitung Luas Segitiga");
            System.out.print("Masukan Pilihan Anda : ");
            menu = sc.nextLine();

            //Pemilihan Luas Pesergi
            if (menu.equalsIgnoreCase("a")) {
                
                System.out.println("--------------------------------------------------------------");
                System.out.println("                    Menghitung Luas Pesergi :                 ");
                System.out.println("--------------------------------------------------------------");
                System.out.print("Masukan Panjang Persegi : ");
                sisi = sc.nextDouble();
                persegi = sisi * sisi ;
                System.out.println("Luas Persegi Adalah : "+persegi);

            //pemilihan Luas Segitiga
            } else if (menu.equalsIgnoreCase("b")){

                System.out.println("--------------------------------------------------------------");
                System.out.println("                   Menghitung Luas Segitiga :                 ");
                System.out.println("--------------------------------------------------------------");
                System.out.print("Masukan Alas Segitiga : ");
                alas = sc.nextDouble();
                System.out.print("Masukan Tinggi Segitiga : ");
                tinggi = sc.nextDouble();
                segitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga Adalah : "+segitiga);

            } else {
                System.out.println("Inpu Yang Anda MAsukan Tidak Valid");
            }

        //Pemilihan Menu 2
        } else if (menu.equals("2")) {

            System.out.println("--------------------------------------------------------------");
            System.out.println("   Menu 2 Menghitung Volume : (Pililah menu dibawah ini a/b)  ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("a. Menghitung Volume Kubus");
            System.out.println("b. Menghitung Volume Tabung");
            System.out.print("Masukan Pilihan Anda : ");
            menu = sc.nextLine();

            //Pemilihan Volume Kubus
            if (menu.equalsIgnoreCase("a")) {
                
                System.out.println("--------------------------------------------------------------");
                System.out.println("                    Menghitung Volume Kubus :                 ");
                System.out.println("--------------------------------------------------------------");
                System.out.print("Masukan Sisi Kubus : ");
                sisi = sc.nextDouble();
                kubus = sisi * sisi * sisi;
                System.out.println("Volume Kubus Adalah : "+kubus);

            //Pemilihan Volume Tabung
            } else if (menu.equalsIgnoreCase("b")){

                System.out.println("--------------------------------------------------------------");
                System.out.println("                   Menghitung Volume Tabung :                 ");
                System.out.println("--------------------------------------------------------------");
                System.out.print("Masukan Jari-Jari Tabung : ");
                jariJari = sc.nextDouble();
                System.out.print("Masukan Tinggi Tabung : ");
                tinggi = sc.nextDouble();
                tabung =  3.14 * jariJari *jariJari * tinggi;
                System.out.println("Luas Segitiga Adalah : "+tabung);

            } else {
                System.out.println("Inpu Yang Anda MAsukan Tidak Valid");
            }

            
        } else {
            System.out.println("Inpu Yang Anda MAsukan Tidak Valid");
        }

        System.out.println("Melanjutkan Pilihan (y/n)");
        String pilihan = sc.next();
        if (pilihan.equalsIgnoreCase("y")) {
            continue;
        } else if (pilihan.equalsIgnoreCase("n")) {
            break;
        } else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("          Terimkasih Telah Menggunakan Mesin Hitung           ");
            System.out.println("--------------------------------------------------------------");
        }
            
       
        }
       

    }
}
