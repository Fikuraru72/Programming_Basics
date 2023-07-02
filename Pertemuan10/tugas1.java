public class tugas1 {
    public static void main(String[] args) {
        
        char karakter [] = {'A', 'b', 'i', 'y', 'y', 'u', 'F','i','q','l','a','l'};
        char nama [][] = new char [8][5];
        int simpan = 0 ;

        for(int i = 0 ; i < nama.length; i ++){
            for (int j = 0 ; j < nama[0].length;j++){
                if(simpan >= karakter.length){
                    simpan = 0;
                }
                nama[i][j] = karakter[simpan];
                System.out.print(nama[i][j] +" ");
                simpan+=1;
            }
            System.out.println("");
        }
       
        


    }
}
