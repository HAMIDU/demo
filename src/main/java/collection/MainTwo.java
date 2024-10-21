package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MainTwo {

    public static void main(String[] args){
        Set<Integer> ints = new TreeSet<Integer>();
        ints.add(1);
        ints.add(111);
        ints.add(1111);
        ints.add(11);
        ints.stream().sorted().forEach(y-> System.out.println(y));
        System.out.println(ints);
        Hashtable<String,Integer>stringIntegerHashtable = new Hashtable<>();
       /* try {
            FileReader fileReader  = new FileReader("db.properties");
            Properties properties = new Properties();
            properties.load(fileReader);
            System.out.println(properties.getProperty("server.servlet.application-display-name"));
        } catch (  IOException e ) {
            e.printStackTrace();
        }*/
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList =new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(10);
        copyOnWriteArrayList.add(10);
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",11);
        map.put("c",111);
        map.put("d",1111);

     }
}
