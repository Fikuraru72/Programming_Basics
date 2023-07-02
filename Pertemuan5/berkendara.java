import java.util.Scanner;
public class berkendara {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.print("Berapakah Usia Anda : ");
        umur = sc.nextInt();

        if (umur >=17) {
            System.out.print("Anda Diperbolehkan Berkendara");
        } 
        else {
            System.out.println("Anda Dilarang Berkendara");
        }
    }
}
