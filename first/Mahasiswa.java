package first;
import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        System.out.println();

        String nama;
        int umur;
        int angkatan;
        String prodi;

        Scanner input = new Scanner(System.in);
        System.out.print("Siapa nama Anda? : ");
        nama = input.nextLine();

        System.out.print("Berapa umur Anda? : ");
        umur = input.nextInt();
        
        System.out.print("Angkatan ke-berapa Anda? ");
        angkatan = input.nextInt();

        System.out.print("Siapa nama Anda? : ");
        prodi = input.nextLine();


        if (umur >= 18) {
            System.out.println("Dewasa");
        }else {
            System.out.println("Muda");
        }

        
        input.close();
    }
}

