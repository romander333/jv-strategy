package core.basesyntax.multy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        NameList list = new NameList();
        list.add("First");

        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(list.removeFirst());
            }
        }
        MyThread thread = new MyThread();
        thread.setName("one");
        thread.start();
        new MyThread().start();

    }

    static class NameList {
        private List<String> list = Collections.synchronizedList(new ArrayList<>());
        public  synchronized void add(String name) {
            list.add(name);
        }

        public synchronized String removeFirst() {
            if (list.size() > 0) {
                if (Thread.currentThread().getName().equals("one")) {
                    Thread.yield();
                }
                return list.remove(0);
            }
            return null;
        }
    }

}






