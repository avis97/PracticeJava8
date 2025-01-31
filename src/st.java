import java.util.ArrayList;
import java.util.List;

class First{
    public String name;
    public int age;
    public String num;

    First(String name,int age,String num){
        this.name=name;
        this.age=age;
        this.num=num;
    }

}


public class st {
    public static void main(String[] args){
        First f1=new First("Avi",27,"8676");
        First f2=new First("Amiya",26,"86768");

        List<First> list=new ArrayList();
        list.add(f1);
        list.add(f2);

        list.stream().forEach(f-> System.out.println(f));
    }
}
