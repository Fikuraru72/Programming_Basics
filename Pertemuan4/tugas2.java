public class tugas2 {
    
    public static void main(String[] args) {
        int kecepatan = 60;
        int menit = 60;
        int waktu   = 90;
        int jarak ;

        System.out.println("Kecepatan = " + kecepatan);
        System.out.println("Jam (menit) = " + menit);
        System.out.println("Waktu Tempuh = " + waktu);
        System.out.println("Jarak : Kecepatan X Waktu");
        System.out.println(String.format("Jarak : %s x %s ", kecepatan, waktu ));
        jarak = kecepatan * waktu  ;
        System.out.println("Jarak = " +jarak);
    }

}
