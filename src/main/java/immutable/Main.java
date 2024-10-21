package immutable;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        ThreadClass threadClass = new ThreadClass();
        Thread t1 = new Thread(threadClass, "t1");
        Thread t2 = new Thread(threadClass, "t2");
        t1.start();
        t2.start();
        System.out.println("start ");

        student.printStatus(student);

        System.out.println(threadClass.getCounter());
        System.out.println(threadClass.getCounting());
        System.out.println(threadClass.getCount());

    }
}
