public class Person2 {
    private String nama;
    private String jenisKelamin;
    private int umur;

    public Person2(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Person2 antot = new Person2("Antot", "Laki-laki", 18);
        Person2 riko = new Person2("Riko", "Laki-laki", 18);

        System.out.println("Informasi Awal:");
        antot.displayInfo();
        System.out.println();
        riko.displayInfo();
    }
}
