package tr.com.hanifi.types;

import java.util.Date;

public class UrunlerConstract {
    private int id;
    private String adi;
    private int kategoriId;
    private Date tarih;
    private float fiyat;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "UrunlerConstract{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", kategoriId=" + kategoriId +
                ", tarih=" + tarih +
                ", fiyat=" + fiyat +
                '}';
    }
}
