import java.util.Scanner;
public class Percobaan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Maasukan Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukan Lebar : ");
        l = sc.nextInt();
        System.out.println("Masukan Tinggi : ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Adalah " +L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume Balok Adalah " +vol);
    }

    static int hitungLuas (int a, int b){
        int luas = a*b;
        return luas;
    }

    static int hitungVolume (int a, int b,int c){
        int volume =a*b*c;
        return volume;
    }


}
