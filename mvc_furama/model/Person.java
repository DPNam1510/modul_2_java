package mvc_furama.model;

public abstract class Person {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String idCard;
    private String phone;
    private String email;

    public Person() {

    }

    public Person(String id, String name, String date, String gender, String idCard, String phone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "Person [ id=" + id
                + ", name=" + name
                + ", date=" + date
                + ", gender=" + gender
                + ", idCard=" + idCard
                + ", phone=" + phone
                + ", email=" + email
                + "]";
    }

}
