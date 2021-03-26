import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student(4, 1, "BBB", 21, "HN"));
        listStudent.add(new Student(7, 5, "AAA", 24, "HN"));
        listStudent.add(new Student(8, 4, "CCC", 25, "HN"));
        listStudent.add(new Student(3, 3, "DDD", 22, "HN"));
        listStudent.add(new Student(1, 6, "EEE", 21, "HN"));


        System.out.println("Danh sách sinh viên đã nhập: ");
        printArray(listStudent);

        List<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(new Teacher(1000000, 3, "AAA", 21, "HN"));
        listTeacher.add(new Teacher(1400000, 3, "BBB", 21, "HN"));
        listTeacher.add(new Teacher(1200000, 3, "CCC", 21, "HN"));
        listTeacher.add(new Teacher(1500000, 3, "DDD", 21, "HN"));
        listTeacher.add(new Teacher(900000, 3, "EEE", 21, "HN"));


        System.out.println("Danh sách giảng viên đã nhập: ");
        printArray(listTeacher);

        Collections.sort(listStudent,new Comparator<Student>(){


            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
            
        });System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên");
        printArray(listStudent);
        

        Collections.sort(listTeacher,new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }

        });
        System.out.println("Danh sách giảng viên sau khi sắp xếp theo tên: ");
        printArray(listTeacher);
            
        Collections.sort(listStudent,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getGpa() > (o2.getGpa()) ? 1:-1;
            }     
        });
        System.out.println("Danh sach sinh vien sap xep theo GPA: ");
        printArray(listStudent);
        System.out.println("Sinh vien co GPA cao nhat la: ");
        Student max2 = listStudent.get(listStudent.size() - 1);
        System.out.println(max2);
        
        Collections.sort(listTeacher, new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getSalary() > (o2.getSalary()) ? 1 : -1;            }
            
        });
        System.out.println("Danh sach giao vien sap xep theo luong la: ");
        printArray(listTeacher);
        System.out.println("Giang vien co luong cao nhat la: ");
        Teacher max = listTeacher.get(listTeacher.size() - 1);
        System.out.println(max);
        
    }
    
    
    public static void printArray(List<?> list) {
        for (Object person : list) {
            System.out.println(person);
        }
    }
}
