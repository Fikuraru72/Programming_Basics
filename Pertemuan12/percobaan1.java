public class percobaan1 {

    public static void main(String[] args) {
        
        System.out.println(faktorialrekursif(5));
        System.out.println(faktorialInteratif(5));
    }

    static int faktorialrekursif (int n){
        if (n == 0){
            return (1);
        } else {
            return (n * faktorialrekursif(n-1));
        }
    }

    static int faktorialInteratif (int n){
        int faktor = 1;
        for(int a = n; a  >= 1 ; a--){
            faktor = faktor*a;

        }
        return faktor;
    }
    
}