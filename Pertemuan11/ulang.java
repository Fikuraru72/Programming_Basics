public class ulang {
    
    static void TampilHinggaKe (int i){
        for(int j = 0 ; j <= i ; ++j){
            System.out.println(j);
        }
    }

    static int jumlah (int bil1, int bil2){
        return (bil1+bil2);
    }

    static void tampilJumlah (int bil1, int bil2){
        TampilHinggaKe(jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        tampilJumlah(temp, 5);
    }
 
}
