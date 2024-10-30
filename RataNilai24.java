import java.util.Scanner;

public class RataNilai24 {
    public static void main(Sring[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;

        for (i=1;<=5;i++) {
            totalNilai=0;
            System.out.println("Input nilai ");
        for (j=1;j<=5;i++) {

        }

        totalNilai=0;
        for (j=1;j<=5;j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilaiMhs=sc.nextInt;
            totalNilai+=nilaiMhs;

            i=1;
            while (i<=5) {
                totalNilai=0;
                for (j=1;j<=5;j++) {
                    System.out.print("Nilai ke-" +j + " = ");
                    nilaiMhs=sc.nextInt();
                    totalNilai+=nilaiMhs;
                }
                rataNilai=totalNilai/5;
                i++;
            }
            System.out.println("Rata-rata nilai mahasiswa ke-" + i +  ": " + rataNilai + "\n");
        }
    }
}