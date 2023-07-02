import java.util.Scanner;
public class AngkaKelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas,nim;

        System.out.print("Masukan angka akhir NIM + 2 : ");
        nim = sc.nextInt();
        System.out.print("Masukan Batas Angka : ");
        batas = sc.nextInt();

        for(int i = 1; i <= batas; i++){
            if (i % nim == 0 ) {
                continue;
            } else {
                System.out.print(" "+i);
            }
        }


    }
}
