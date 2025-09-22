package mvc_furama.model;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String date, String gender, String idCard,
                    String phone, String email,String type, String address) {
        super(id, name, date, gender, idCard, phone, email);
        this.type = type;
        this.address = address;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Customer ["+super.toString()
                +", type=" + type
                +", address=" + address;
    }
    @Override
    public String getInfoToCSV(){
        return this.getId()+","
                + this.getName()+","
                + this.getDate()+","
                + this.getGender()+","
                + this.getIdCard()+","
                + this.getPhone()+","
                + this.getEmail()+","
                + this.getType()+","
                + this.getAddress();
    }

}
