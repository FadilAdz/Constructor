# Constructor
## Praktikum Pertemuan Ke 7 Pemrograman Orientasi Objek.

<img src=https://raw.githubusercontent.com/bablubambal/All_logo_and_pictures/1ac69ce5fbc389725f16f989fa53c62d6e1b4883/programming%20languages/java.svg width="120px">

![img](P7/assets/studikasus.png) <br> <br>
![img](P7/assets/soal.png) 

<br> <br>


### File <b>main.java</b>

``` java
package AlfaMantul;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Membuat beberapa produk
        elektronik laptop = new elektronik("Laptop", 8000000, 8, 2);
        pakaian kaos = new pakaian("Kaos", 110000, 7, "M", "Hitam");
        makanan kacang = new makanan("Kacang Pilus", 5000, 28, new Date());

        // Membuat keranjang belanja
        keranjangBelanja keranjang = new keranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(tv, 1);
        keranjang.tambahProduk(kaos, 2);
        keranjang.tambahProduk(roti, 5);

        // Menampilkan isi keranjang
        keranjang.displayKeranjang();
    }
}
```
<br>

<b>Penjelasan</b> <br>
1. Deklarasi Paket dan Impor

``` java
package AlfaMantul;
import java.util.Date;
```

```Package AlfaMantul``` mengelompokkan semua kelas terkait dalam proyek ini agar terorganisir dan mudah diakses. Kelas Date dari pustaka Java diimpor untuk menangani tanggal kadaluarsa pada produk makanan. <br> <br> <br>


2. Kelas ```main```

``` java
public class main {
    public static void main(String[] args) {
        // Kode di sini
    }
}
```

Kelas ```main``` adalah titik awal program dan berisi metode ```main```, yang dijalankan pertama kali saat program dimulai. <br> <br> <br>


3. Membuat Objek Produk <br>

Di sini, tiga objek produk dari berbagai jenis dibuat: elektronik, pakaian, dan makanan. Setiap produk memiliki properti yang relevan seperti harga, stok, dan atribut khusus untuk setiap jenis produk.

``` java
elektronik laptop = new elektronik("Laptop", 8000000, 8, 2);
pakaian kaos = new pakaian("Kaos", 110000, 7, "M", "Hitam");
makanan kacang = new makanan("Kacang Pilus", 5000, 28, new Date());
```

```laptop``` : Objek ```elektronik``` dengan nama "Laptop", harga 8.000.000, stok 8 unit, dan garansi 2 tahun. <br> 
```kaos``` : Objek ```pakaian``` dengan nama "Kaos", harga 110.000, stok 7 unit, ukuran "M", dan warna "Hitam". <br> 
```kacang``` : Objek ```makanan``` dengan nama "Kacang Pilus", harga 5.000, stok 28 unit, dan tanggal kedaluwarsa yang diatur pada tanggal saat program dijalankan.
<br> <br> <br>


4. Membuat Objek keranjangBelanja

``` java
keranjangBelanja keranjang = new keranjangBelanja();
```

Objek ```keranjang``` dari kelas ```keranjangBelanja``` dibuat untuk menyimpan produk yang dipilih pengguna. ```keranjangBelanja``` bertindak sebagai penyimpanan sementara untuk produk yang akan dibeli. <br> <br> <br> 


5. Menambahkan Produk ke Keranjang

``` java
keranjang.tambahProduk(laptop, 1);
keranjang.tambahProduk(kaos, 2);
keranjang.tambahProduk(kacang, 5);
```

Metode ```tambahProduk``` pada objek ```keranjang``` menambahkan produk beserta kuantitasnya ke keranjang belanja. Di sini :

```laptop``` ditambahkan dengan kuantitas 1 unit. <br>
```kaos``` ditambahkan dengan kuantitas 2 unit. <br>
```kacang``` ditambahkan dengan kuantitas 5 unit. <br> <br> <br>


6. Menampilkan Isi Keranjang

``` java
keranjang.displayKeranjang();
```

Metode ```displayKeranjang``` menampilkan semua produk yang telah ditambahkan ke keranjang belanja beserta detailnya, seperti nama produk, harga, kuantitas, dan total harga. <br> <br> <br> <br>


### File <b>Produk.java</b>

``` java
package AlfaMantul;
public class Produk {
    private String namaProduk;
    private int harga;
    private int jumlahStok;

    public Produk(String namaProduk, int harga, int jumlahStok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    // Setter NamaProduk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Setter Harga
    public int getHarga() {
        return harga;
    }

    // Setter JumlahStok
    public int getJumlahStok() {
        return jumlahStok;
    }


    public void kurangiStok(int jumlah) {
        this.jumlahStok -= jumlah;
    }

    public void displayInfo(){
        System.out.println("Toko Alfa Mantul");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Produk : " + harga);
        System.out.println("Jumlah Stok : " + jumlahStok);
    }
}
```


### File <b>elektronik.java</b>

``` java
package AlfaMantul;
public class elektronik extends Produk {
    private int garansi;

    public elektronik (String namaProduk, int harga, int jumlahStok, int garansi) {
        super(namaProduk, harga, jumlahStok);
        this.garansi = garansi;
    }

    // Setter dan Getter Garansi
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Garansi : " + this.garansi + " tahun");

    }
}
```


### File <b>pakaian.java</b>

``` java
package AlfaMantul;

public class pakaian extends Produk {
    private String ukuran;
    private String warna;

    public pakaian (String namaProduk, int harga,int jumlahStok, String ukuran, String warna) {
        super(namaProduk, harga, jumlahStok);
        this.ukuran = ukuran;
        this.warna = warna;
    }

    // Setter Ukuran
    public String getUkuran() {
        return ukuran;
    }

    // Setter Warna
    public String getWarna() {
        return warna;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ukuran : " + this.ukuran);
        System.out.println("Warna : " + this.warna);
    }

}
```


### File <b>makanan.java</b>

``` java
package AlfaMantul;

import java.util.Date;

public class makanan extends Produk {
    private Date exp;

    public makanan(String namaProduk,int harga,int jumlahStok, Date exp) {
        super(namaProduk, harga, jumlahStok);
        this.exp = exp;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tanggal Exp : " + this.exp);
    }

}
```


### File <b>keranjangBelanja.java</b>

``` java
package AlfaMantul;
import java.util.ArrayList;

public class keranjangBelanja {
    private ArrayList<Produk> keranjang;

    public keranjangBelanja() {
        keranjang = new ArrayList<>();
    }

    public void tambahProduk(Produk p, int jumlah) {
        if (p.getJumlahStok() >= jumlah) {
            p.kurangiStok(jumlah);
            keranjang.add(p);
            System.out.println("Produk " + p.getNamaProduk() + " ditambahkan sebanyak " + jumlah);
        } else {
            System.out.println("Stok tidak mencukupi untuk produk " + p.getNamaProduk());
        }
    }

    public int hitungTotalBelanja() {
        int total = 0;
        for (Produk item : keranjang) {
            total += item.getHarga();
        }
        return total;
    }

    public void displayKeranjang() {
        System.out.println("Isi Keranjang Belanja :");
        for (Produk item : keranjang) {
            System.out.println("- " + item.getNamaProduk() + " = Rp" + item.getHarga());
        }
        System.out.println("Total Belanja : Rp" + hitungTotalBelanja());
    }
}
```























