package collection;

public class Employee {
    Integer id;
    String name;
    Float avg;

    public Employee(int i, String name, float v) {
this.id = i;
this.name=name;
this.avg=v;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }
}
