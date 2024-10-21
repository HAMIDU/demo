package immutable;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadClass implements Runnable {
    AtomicInteger counter = new AtomicInteger(0);
    volatile Integer counting = 0;
    Integer count = 0;

    @Override
    public void run() {
        counter.set(counter.get() + 1);
        counting = counting + 1;
        count = counting + 1;
    }

    public AtomicInteger getCounter() {
        return counter;
    }

    public Integer getCounting() {
        return counting;
    }

    public Integer getCount() {
        return count;
    }
}
