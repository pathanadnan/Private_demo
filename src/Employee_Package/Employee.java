package Employee_Package;

public class Employee {

    int id;
    String name;
    String city;
    String desc;
    int sal;


    public Employee(int id, String name, String city, String desc, int sal) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.desc = desc;
        this.sal = sal;
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                ", sal=" + sal +
                '}';
    }
}
