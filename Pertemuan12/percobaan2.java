import java.util.Scanner;
public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        int a = sc.nextInt();
        System.out.print("Masukan Pangkat : ");
        int b = sc.nextInt();

        System.out.println(hitungPangkat(a, b));
    }

    static int hitungPangkat(int x, int y){
        if (y == 0){
            System.out.print("1 = ");
            return(1);
        }else {
            System.out.print(x+" X ");
            return(x *hitungPangkat(x, y-1));
        }
    } 
}
