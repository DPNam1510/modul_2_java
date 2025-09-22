package mvc_furama.model;

public class Employee extends Person {

    private String skill;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, String date, String gender, String idCard, String phone
            , String email, String skill, String position, int salary) {
        super(id, name, date, gender, idCard, phone, email);
        this.skill = skill;
        this.position = position;
        this.salary = salary;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
                + this.getSkill()+","
                + this.getPosition()+","
                + this.getSalary();
    }
    @Override

    public String toString() {
        return "Employee [ " + super.toString()
                + ", skill:" + skill
                + ", position:" + position
                + ", salary:" + salary
                + "]";
    }


}
