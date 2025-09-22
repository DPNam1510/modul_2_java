package mvc_furama.model;

public abstract class Resort {
    private int id;
    private String name;
    private int acreage;
    private int price;
    private int people;
    private String type;

    public Resort() {
    }

    public Resort(int id, String name, int acreage, int price, int people, String type) {
        this.id = id;
        this.name = name;
        this.acreage = acreage;
        this.price = price;
        this.people = people;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "Resort[ Id:" + id
                + ", name:" + name
                + ", acreage:" + acreage
                + ", price:" + price
                + ", people:" + people
                + ", type:" + type
                + "]";
    }

}
