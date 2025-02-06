import java.util.*;

class Student{

    private String name;
    private int age;
    private String department;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class StreamApis{
    public static void main(String[] args){

        Student st1=new Student("Avishek",23,"EE");
        Student st2=new Student("Amiya",25,"ECE");
        List<Student> studentList=new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);

        studentList.stream().forEach(st-> System.out.println(st.getName()+" "+st.getDepartment()+" "+st.getAge()));

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);

        map.entrySet().stream().forEach(e-> System.out.println(e));
        map.entrySet().stream().forEach(System.out::println);

        int arr[]={1,2,5,6,7};
        Integer ans=Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(ans);
    }
}
