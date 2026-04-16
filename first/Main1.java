package first;

public class Main1 {
    public static void main(String[] args) {
        System.out.println();

        Pasien psn1 = new Pasien("A0150001", "Mayday", "Demam", 26);
        
        System.out.println("No RM       : " + psn1.noRm);
        System.out.println("Nama        : " + psn1.nama);
        System.out.println("Diagnosa    : " + psn1.diagnosa);
        System.out.println("Umur        : " + psn1.umur);
        
    }

}