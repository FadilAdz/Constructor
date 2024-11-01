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
