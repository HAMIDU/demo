package immutable;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestFive {
    static CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList();
    static ArrayList<Integer> integers = new ArrayList<>();
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread thread = new Thread(threadExample);
        thread.start();
        Thread thread2 = new Thread(threadExample);
        thread2.start();

    }

    public static class ThreadExample implements Runnable {

        public void run() {


            copyOnWriteArrayList.add(10);
            copyOnWriteArrayList.add(20);


            integers.add(30);
            integers.add(40);
            integers.add(integers.get(1)*2);

            System.out.println(copyOnWriteArrayList.stream().toList());
            System.out.println(integers.stream().toList());
        }
    }
}
