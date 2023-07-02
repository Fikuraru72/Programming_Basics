import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai = ");
        int a = sc.nextInt();
        for(int b = 0 ; b < a;b++){
            if (a<5) {
                System.out.println("Maaf Jumlah yang anda masukan terlalu sedikit ");
            } else {
                for(int c = a; c > b; c--){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}
