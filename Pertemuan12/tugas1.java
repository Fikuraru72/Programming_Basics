import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MAsukan Nilai : ");
        int nilai = sc.nextInt();
        rekursif(nilai);
        iteratif(nilai);
    }

    static int rekursif (int a){
        if (a == 0){
            System.out.println(a);
            return(0);
        } else{
            System.out.print(a+" ");
            return rekursif(a-1);
        }
    }

    static void iteratif (int a){
        for(int x = a ; x>=0;x--){
            System.out.print(x+" ");
        }
    }
}