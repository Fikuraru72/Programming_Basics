import java.util.Scanner;
public class percobaan3 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukan Saldo Anda : ");
    int a = sc.nextInt();
    System.out.print("Masukan Lama Invest Anda : ");
    int b = sc.nextInt();

    System.out.printf("Jumlah Mendabung %s selama %s adalah ",a,b);
    System.out.printf("%f",hitunglaba(a, b));
    }

    static double hitunglaba (double saldo,int tahun){
        if (tahun == 0){
            return (1);
        }else{
            return (1.11*hitunglaba(saldo, tahun-1));
        }
    }

}
