package mvc_furama.model;

public class Villa extends Resort {
    private String standard;
    private int acreageSwim;
    private int floor;

    public Villa() {
    }
    public Villa(int id,String name,int acreage,int price,int people,String type,String standard,int acreageSwim,int floor) {
        super(id, name, acreage, price, people, type);
        this.standard = standard;
        this.acreageSwim = acreageSwim;
        this.floor = floor;
    }
    public String getStandard() {
        return standard;
    }
    public void setStandard(String standard) {
        this.standard = standard;
    }
    public int getAcreageSwim() {
        return acreageSwim;
    }
    public void setAcreageSwim(int acreageSwim) {
        this.acreageSwim = acreageSwim;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }


}
