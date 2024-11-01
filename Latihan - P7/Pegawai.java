// File: Pegawai.java
public class Pegawai {
    protected String nama;
    protected double gajiPokok;
    
    // Konstruktor default
    public Pegawai() {
        this.nama = "";
        this.gajiPokok = 0.0;
    }
    
    // Konstruktor dengan nama
    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 0.0;
    }
    
    // Konstruktor dengan nama dan gaji pokok
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}