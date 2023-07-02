import java.util.Scanner;
public class DoWhileCuti1B01 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int cuti = 5;
    char konfirmasi;

    do {
        System.out.println("Apakah Anda Menggunakan Jata Cuti 1 Hari (y/n) : ");
        konfirmasi = sc.next().charAt(0);
        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            cuti--;
            System.out.printf("sisa %d hari \n", cuti);
            if (cuti == 2) {
                System.out.println("STOP! Jatah Cuti Tinggal 2 hari");
                break;
            }  
        } else {
            System.out.println("Pernyataan Yang Anda Masukan Tidak Sesuai :)");
            break;
        }
    } while (cuti > 0);
    }
}
