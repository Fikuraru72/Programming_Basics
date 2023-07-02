public class Percobaan5 {
    
    static void tampil (String str, int ...a){
        System.out.println("String : " +str);
        System.out.println("Jumlah Argumen/Prameter : "+a.length);

        for (int i : a){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        tampil("Daspro", 100,200);
        tampil("Tekonologi Informasi", 1,2,3,4,5);
        tampil("Polinema");
    }


}
