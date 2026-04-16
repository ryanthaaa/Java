package first;
import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        String nama;
        int umur;
        int angkatan;
        String prodi;
        String statusUmur;
        String statusMhs;

        Scanner input = new Scanner(System.in);

        System.out.println("<======== INPUT DATA MHS =======>");
        System.out.print("Siapa nama Anda?          : ");
        nama = input.nextLine();
        System.out.print("Berapa umur Anda?         : ");
        umur = input.nextInt();    
        System.out.print("Angkatan ke-berapa Anda?  : ");
        angkatan = input.nextInt();
        input.nextLine();
        System.out.print("Apa prodi Anda?           : ");
        prodi = input.nextLine();

        if (umur >= 18) {
            statusUmur = "Dewasa";
        }else {
            statusUmur = "Muda";
        }
        if (umur > 22 && angkatan > 2025) {
            statusMhs = "In Danger";
        } else if (umur < 22 && angkatan <= 2025) {
            statusMhs = "Aman";
        } else {
            statusMhs = "Tidak Terkateogri";
        }
        
        System.out.println();
        System.out.println("<======== MAHASISWA =======>");
        System.out.println("Nama Mahasiswa          : " + nama);
        System.out.println("Umur Mahasiswa          : " + umur);
        System.out.println("Angkatan Mahasiswa      : " + angkatan);
        System.out.println("Prodi Mahasiswa         : " + prodi);
        System.out.println("Status Umur Mahasiswa   : " + statusUmur);
        System.out.println("Status Kuliah Mahasiswa : " + statusMhs);
        input.close();
    }
}