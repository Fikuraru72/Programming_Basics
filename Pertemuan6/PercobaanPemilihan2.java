import java.util.Scanner;
public class PercobaanPemilihan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan Kategori : ");
        kategori = sc.nextLine();
        System.out.print("Masukan Besarnya Penghasilan : ");
        penghasilan = sc.nextInt();

            //Pemilihan 1
            if (kategori.equalsIgnoreCase("Pekerja")) {
                //Pemilihan 1.1
                if (penghasilan <= 0) {
                    System.out.println("penghasilan yang dimasukkan tidak valid");
                } else {
                    if (penghasilan <= 2000000) {
                        pajak = 0.1;
                    } else if (penghasilan <= 3000000) {
                        pajak = 0.15;
                    } else {
                        pajak = 0.2;
                    }
                    gajiBersih = (int) (penghasilan - (penghasilan*pajak));
                    System.out.println("Gajih bersih yang anda terima : " +gajiBersih);
                }

        } else if (kategori.equalsIgnoreCase("Pembisnis")) {
                //pemi;ihan 1.2
                if (penghasilan <= 0) {
                    System.out.println("penghasilan yang dimasukkan tidak valid");
                } else {
                    if (penghasilan <= 2500000) {
                        pajak = 0.15;
                    } else if (penghasilan <= 3500000) {
                        pajak = 0.2;
                    } else {
                        pajak = 0.25;
                    }
                    gajiBersih = (int) (penghasilan - (penghasilan*pajak));
                    System.out.println("Gajih bersih yang anda terima : " +gajiBersih);
                }

        } else {
            System.out.println("Kategori Yang Anda Masukan Salah");
        }


    }
}
