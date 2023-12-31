import java.util.Scanner;

public class ArrayDua3TiB01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int data[][] = new int[4][4];
        int jam[] = { 3, 6, 9, 12 };
        int min[] = { 100, 100, 100, 100 };
        int max[] = {0,0,0,0};
        double total[] = { 0, 0, 0, 0 };
        double rata[] = { 0, 0, 0, 0 };

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Jam %s \n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukan Suhu : ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }

                        if (max[j] < data[i][j]){
                            max[j] = data[i][j];
                        }

                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("Masukan kelembapan : ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }

                        if (max[j] < data[i][j]){
                            max[j] = data[i][j];
                        }

                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("Masukan Kecepatan Angin : ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }

                        if (max[j] < data[i][j]){
                            max[j] = data[i][j];
                        }

                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("Masukan Index UV : ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }

                        if (max[j] < data[i][j]){
                            max[j] = data[i][j];
                        }

                        total[j] += data[i][j];
                        break;
                }
                rata[j] = total[j] / data[0].length;
            }
        }

        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------");
        System.out.println("Kecepatan Angin Tiap Jam");
        for(int i = 0 ; i < data.length; i++){
            System.out.printf("Kecepatan Angin Jam %s \t: %s \n", jam[i], data[i][2]);
        }

        System.out.println("--------------------");
        System.out.printf("Rata-rata suhu : %.2f \n", rata[0]);
        System.out.printf("Persentase Kelembapan Terendah : %s \n", min[1]);
        System.out.printf("Maksimum Indexs UV : %s", max[3]);

    }
}
