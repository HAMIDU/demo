package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class TestString {
    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));

        List l =new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(100);
        l.add(1);
        l.add(0,111);
        l.add(2,121);
        l.set(2,1001);
//        Collections.sort(l);
//        Collections.reverse(l);
        Collections.shuffle(l);
        Iterator iterator= l.iterator();
        while (iterator.hasNext())
        {

            System.out.println(iterator.next());
        }

        l.forEach(System.out::println);
//        System.out.println(l);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(300);
        sortedSet.add(200);
        sortedSet.add(600);
        sortedSet.add(200);
        sortedSet.add(100);
        System.out.println(sortedSet);


        System.out.println("----------------------------------");
        /*
         * JDK 11 New Method in Collection interface
         * default <T> T[] toArray(IntFunction<T[]> generator) {
         * return toArray(generator.apply(0)); }
         */

        List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("Android");

        String[] strArray = strList.toArray(size -> new String[size]);
        System.out.println(Arrays.toString(strArray));

        strArray = strList.toArray(size -> new String[size + 5]);
        System.out.println(Arrays.toString(strArray));

        strArray = strList.toArray(size -> new String[size * 3]);
        System.out.println(Arrays.toString(strArray));
        System.out.println("*********************************");
// 1. List, Set, Map copyOf(Collection) method
        List<String> actors = new ArrayList<>();

        actors.add("Jack Nicholson");
        actors.add("Marlon Brando");

        System.out.println(actors);
        // prints [Jack Nicholson, Marlon Brando]

        // New API added - Creates an UnModifiable List from a List.
        List<String> copyOfActors = List.copyOf(actors);

        System.out.println(copyOfActors);
        // prints [Jack Nicholson, Marlon Brando]

        // copyOfActors.add("Robert De Niro"); Will generate
        // UnsupportedOperationException

        actors.add("Robert De Niro");

        System.out.println(actors);
        // prints [Jack Nicholson, Marlon Brando, Robert De Niro]

        System.out.println(copyOfActors);
        // prints [Jack Nicholson, Marlon Brando]

        // 2. Collectors class toUnmodifiableList, toUnmodifiableSet, and
        // toUnmodifiableMap methods
        List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(collect);

        Set<String> vowelsSet = new HashSet<>();
        // add example
        vowelsSet.add("a");
        vowelsSet.add("e");
        vowelsSet.add("i");
        vowelsSet.add("o");
        vowelsSet.add("u");Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");

        System.out.println("map before putIfAbsent = "+map);
        String value = map.putIfAbsent("1", "4");
        System.out.println("map after putIfAbsent = "+map);
        System.out.println("putIfAbsent returns: "+value);

        System.out.println("map before putIfAbsent = "+map);
        value = map.putIfAbsent("3", "3");
        System.out.println("map after putIfAbsent = "+map);
        System.out.println("putIfAbsent returns: "+value);
        System.out.println(vowelsSet);
        //convert set to stream
        vowelsSet.stream().forEach(System.out::println);

        System.out.println("qqqqqqqqqqqqqqqqqqqqqqq");
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "1");
        map1.put("2", null);
        map1.put(null, "100");

        System.out.println("map before putIfAbsent = "+map1);
        String value1 = map1.putIfAbsent("1", "4");
        System.out.println("map after putIfAbsent = "+map1);
        System.out.println("putIfAbsent returns: "+value1);

        System.out.println("map before putIfAbsent = "+map1);
        value1 = map1.putIfAbsent("3", "3");
        System.out.println("map after putIfAbsent = "+map1);
        System.out.println("putIfAbsent returns: "+value1);
    }
}
