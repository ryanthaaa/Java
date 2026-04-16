public class Buku {
    public String judul, penulis;
    public int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public void tampilInfo() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis Buku : " + penulis);
        System.out.println("Tahun Terbit : " + tahun);
    }
}
