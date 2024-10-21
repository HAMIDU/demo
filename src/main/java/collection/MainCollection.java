package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollection {

    static ArrayList<String> arrayList = new ArrayList<>();
    static Integer p=10;
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0f),
            new Employee(2, "Bill Gates", 200000.0f),
            new Employee(3, "Mark Zuckerberg", 300000.0f)
    };

    public static void main(String[] args) {
        arrayList.add("Hamid");
        arrayList.add("Hamid2");
        arrayList.add("Hamid3");
        method1(arrayList);
       var iterator=arrayList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
       method2(p);
        System.out.println(p);
        User user= new User();
        user.setId(1);
        user.setName("hamid");
        method3(user);
        System.out.println(user.getId());
        System.out.println(user.getName());

        /////////////////////////////////
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        Stream.of(arrayOfEmps);
        empList.stream();

        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();
        empList.stream().forEach(e -> e.setAvg(10.0f));
        System.out.println(empList.size());

 }

    public static void method1(ArrayList<String > p){
          p.remove("Hamid3");

    }
    public static void method2( Integer p1){
        p1=100;
    }
    private static void method3(User user){
        user.setId(10);
        user.setName("amir");

    }

}

