import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        char menu='y';
        do {
            int number = rd.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (number>answer) {
                    System.out.println("Maaf nomor yang anda masukan terlalu kecil ");
                    System.out.println("Nomor randomnya adalah "+number);
                    success=true;

                } else if (number<answer) {
                    System.out.println("Maaf nomor yang anda masukan terlalu besar ");
                    System.out.println("Nomor randomnya adalah "+number);
                    success=true;

                } else if (number==answer) {
                    System.out.println("Selamat Tebakan Anda Benar");
                    System.out.println("Nomor randomnya adalah "+number);
                    success=true;

                } 
            } while (!success);
            System.out.print("Apakah anda ingin mengulang pertanyaan (Y/y)");
            menu = sc.next().charAt(0);
        } while (menu=='y' || menu=='y');
    }
}
