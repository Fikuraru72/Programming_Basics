import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Niai : ");
        int nilai = sc.nextInt();
        tambah(nilai, 1,0);
    }

    static int tambah (int a,int b,int hasil){
        if(b==a){
            hasil+=b;
            System.out.print(b+"="+hasil);
            return b;
        } else{
            System.out.print(b+"+");
            return tambah(a, b+1,hasil+b);
        }
    }
}
