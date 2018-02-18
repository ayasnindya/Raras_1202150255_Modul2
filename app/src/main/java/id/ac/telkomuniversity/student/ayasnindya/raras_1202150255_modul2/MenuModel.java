package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

/**
 * Created by Hewlett Packard unyu on 17 Feb 2018.
 */

class MenuModel {
    private String nama;
    private int harga;
    private int gambar;
    private String komposisi;

    public MenuModel(String nama, int harga, int gambar, String komposisi) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.komposisi = komposisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getKomposisi() {
        return komposisi;
    }

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }
}
