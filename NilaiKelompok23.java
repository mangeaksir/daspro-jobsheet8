import java.util.Scanner;
public class NilaiKelompok23 {
    public static void main(String[] args) {
        int i=1, j, nilai, kelompokTertinggi;
        float totalNilai, rataNilai, rataTertinggi;
    
        Scanner sc = new Scanner(System.in);
        
        while (i<=6) {
            System.out.println("Kelompok " + i);
            
            totalNilai = 0;
            for(j=1; j<=5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai=totalNilai/5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++;
        }
    }
}