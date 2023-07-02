public class Araydua1TIB01 {
    public static void main(String[] args) {

    String pengunjung [][] = new String [4][2];
    
    pengunjung [0][0] = "Amin"; pengunjung [0][1] = "Bena";
    pengunjung [1][0] = "candra" ; pengunjung [1][1] = "Dela";
    pengunjung [2][0] ="Eka"; pengunjung [2] [1] ="Farhan";
    pengunjung [3][0] = "gise"; pengunjung [3][1] = "Hana";

    for(int i = 0 ; i < pengunjung.length; i++){
        for(int j = 0 ; j < pengunjung[0].length; j++){
            if(i % 2 == 0){
                System.out.printf("%s \t", pengunjung[i][j]);
            } else {
                pengunjung[i][j]=null;
                System.out.printf("%s \t", pengunjung[i][j]);
            }
        }
        System.out.println(" ");
    }         

    // System.out.printf("%s \t %s \n", pengunjung[0][0], pengunjung[0][1]);
    // System.out.printf("%s \t %s \n", pengunjung[1][0], pengunjung[1][1]);
    // System.out.printf("%s \t %s \n", pengunjung[2][0], pengunjung[2][1]);
    // System.out.printf("%s \t %s \n", pengunjung[3][0], pengunjung[3][1]);

    }
}