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

Metode ```displayKeranjang``` menampilkan semua produk yang telah ditambahkan ke keranjang belanja beserta detailnya, seperti nama produk, harga, kuantitas, dan total harga.












