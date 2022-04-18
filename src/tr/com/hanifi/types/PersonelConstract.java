package tr.com.hanifi.types;

public class PersonelConstract {
    private int id;
    private String adiSoyadı;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdiSoyadı() {
        return adiSoyadı;
    }

    public void setAdiSoyadı(String adiSoyadı) {
        this.adiSoyadı = adiSoyadı;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "PersonelConstract{" +
                "id=" + id +
                ", adiSoyadı='" + adiSoyadı + '\'' +
                ", email='" + email +
                '}';
    }
}
