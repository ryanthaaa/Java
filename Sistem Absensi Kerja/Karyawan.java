public class Karyawan {
    private String nama;
    private Login akun;

    public String getNama() { return nama; }
    public Login getAkun() { return akun; }

    public void tambahKaryawan(String nama, String username, String password) {
        this.nama = nama;
        this.akun = new Login();
        this.akun.setUsername(username);
        this.akun.setPassword(password);

    }

    public void hapusKaryawan() {
        // Fungsi hapus karyawan
    }

    public void updateKaryawan() {
        // Fungsi update karyawan
    }

}
