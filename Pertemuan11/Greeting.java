public class Greeting {
    
    static void beriSalam () {
        System.out.println("Hallo Selamat Pagi");
    }

    static void beriUcapan (String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        beriSalam();
        beriUcapan("Selamat datang di progam Java");
    }

}
