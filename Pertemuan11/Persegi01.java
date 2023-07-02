public class Persegi01 {

    static int luasPersegi(int sisi){
        int luas = sisi*sisi;
        System.out.println(luas);
        return luas;
    }
    public static void main(String[] args) {
        int luasan = luasPersegi(5);
        System.out.println("Luas Persegi Dengan Sisi 5 = "+luasan);
    }

}
