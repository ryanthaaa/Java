public class Absensi {
    protected String jenis;

    public void tampilStatus() {
        System.out.println("Status Absensi : " + jenis);
    }
}

class Hadir extends Absensi {
    public Hadir() { this.jenis = "Hadir"; }
}

class Izin extends Absensi {
    public Izin() { this.jenis = "Izin"; }
}

class Cuti extends Absensi {
    public Cuti() { this.jenis = "Cuti"; }
}