import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai = sc.nextInt();
        prima(nilai, 1,0);
    }

    static int prima (int a,int b,int c){
        if (a%b == 0){
            c+=1;
        }

        if (b == a){
            if (c == 2 ){
                System.out.printf("Bilangan %s teramsuk Bilangan Prima, dibagi dengan %s bilangan",a,c);
                return c;
            } else {
                System.out.printf("Bilangan %s Bukan Bilangan Prima, dibagi dengan %s bilangan",a,c);
                return c;
            }
        } else {
            return prima(a, b+1, c);
        }
    }
}
