import java.util.Scanner;
public class KopiSenja23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cabang, pelanggan, item, totalPelangganSemua = 0, totalItemSemua = 0;
        
        System.out.print("Jumlah cabang kafe: ");
        cabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            pelanggan = sc.nextInt();

            int totalItemCabang = 0; 

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                item = sc.nextInt();
                totalItemCabang += item; 
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelangganSemua += pelanggan;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("\nTotal seluruh cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("Item terjual: " + totalItemSemua + " item");
    }
}
