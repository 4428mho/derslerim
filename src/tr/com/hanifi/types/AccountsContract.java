package tr.com.hanifi.types;

public class AccountsContract {
    private int id;
    private  int yetkiId;
    private int personelId;
    private  int sifre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYetkiId() {
        return yetkiId;
    }

    public void setYetkiId(int yetkiId) {
        this.yetkiId = yetkiId;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "AccountsContract{" +
                "id=" + id +
                ", yetkiId=" + yetkiId +
                ", personelId=" + personelId +
                ", sifre=" + sifre +
                '}';
    }
}
