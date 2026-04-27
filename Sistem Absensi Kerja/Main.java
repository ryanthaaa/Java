import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Karyawan karyawan1 = new Karyawan();
        karyawan1.tambahKaryawan("Mayday de Noir", "mayday", "mayday123");

        System.out.println("<========== Sistem Absensi Kerja ==========>");
        System.out.println("Masukan Username : " );
        String inputUser = input.nextLine();

        System.out.println("Masukan Password : ");
        String inputPass = input.nextLine();

       if (karyawan1.getAkun().loginLog(inputUser, inputPass)) {
            System.out.println();
            System.out.println("Login Berhasil!!");
            
            System.out.println();

            System.out.println("Halo " + karyawan1.getNama() + ", Silahkan lakukan Absensi :");
            System.out.println("1. Hadir");
            System.out.println("2. Izin");
            System.out.println("3. Cuti");
            System.out.println("Silahkan dipilih : ");
            int pilih = input.nextInt();

            Absensi absen;

            if ( pilih == 1 ) { 
                absen = new Hadir(); 
                absen.tampilStatus();
            } else if ( pilih == 2 ) { 
                absen = new Izin(); 
                absen.tampilStatus();
            } else if ( pilih == 3 ) { 
                absen = new Cuti(); 
                absen.tampilStatus();
            } else { 
                System.out.println("Pilihan tidak Valid!!!"); 
            }

       } else {
            System.out.println("Username atau Password Salah!!");

       }

       input.close();

    }
}
