import java.util.Scanner;
public class bilanganBulat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int bil1,bil2;

        System.out.print("Masukan Bilangan 1 :  ");
        bil1 = sc.nextInt();
        System.out.print("Masukan Bilangan 2 :  ");
        bil2 = sc.nextInt();

        if (bil1 > bil2){
            System.out.print("Bilangan Yang Besar Adalah " + bil1);
        }
        else if (bil1 < bil2){
            System.out.print("Bilangan Yang Besar Adalah " + bil2);
        }
        else {
            System.out.print("Kedua Bilangan Sama Besarnya");
        } 
    }
}