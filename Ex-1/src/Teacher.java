public class Teacher implements Comparable<Teacher> {
    private int salary;
    private int id;
    private String name;
    private int age;
    private String address;
  
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " " + name + " " + age + " " + address + " " + salary;
    }

    @Override
    public int compareTo(Teacher o) {
        // TODO Auto-generated method stub
        return this.getName().compareTo(o.getName());
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher(int salary, int id, String name, int age, String address) {
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    
}
