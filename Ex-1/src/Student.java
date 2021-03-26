public class Student  implements Comparable<Student>{
    private int gpa;
    private int id;
    private String name;
    private int age;
    private String address;
  

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " " + name + " " + age + " " + address + " " + gpa;
    }

    

    @Override
    public int compareTo(Student o) {
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

    public Student(int gpa, int id, String name, int age, String address) {
        this.gpa = gpa;
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
}
