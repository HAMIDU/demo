package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExam {
    public static void main(String args[])
    {

        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());

        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        number.stream().forEach(e-> e.intValue());
        System.out.println(even);
        System.out.println(number);


        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee(1,"b",2.3f));
        employees.add(new Employee(2,"y",2.3f));
        employees.add(new Employee(3,"a",2.3f));
        var employers  =employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        System.out.println(employers.get(0).getName());

        Integer latestEmpId = employees.stream()
                .mapToInt(Employee::getId)
                .max()
                .orElseThrow(NoSuchElementException::new);
        System.out.println(latestEmpId);
        //IntStream i=IntStream.of(1, 2, 3);
        IntStream i=IntStream.range(10, 20)                ;
        System.out.println(i.max());

        Float sumSal = employees.stream()
                .map(Employee::getAvg)
                .reduce(0.0f, Float::sum);
        System.out.println(sumSal);
    }
}
