package core.basesyntax.multy;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomar {
    public static void main(String[] args) throws InterruptedException {
        MySecondThread myThread = new MySecondThread();
        myThread.start();
        System.out.println("thread main");
    }
}

class MySecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}
