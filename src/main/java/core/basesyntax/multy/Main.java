package core.basesyntax.multy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource.i = 5;
        MyThread myThread = new MyThread();
        myThread.setName("One");
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(Resource.i);
    }
}
class MyThread extends Thread {
    Resource resource;

    @Override
    public void run() {
        Resource.changeStaticI();
        new Resource().changeI();
    }
}

class Resource {
    static int i;

    public synchronized static void changeStaticI() {
        synchronized (Resource.class) {

            int i = Resource.i;
            if (Thread.currentThread().getName().equals("One")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }


    public synchronized void changeI() {
        synchronized (this) {
            int i = Resource.i;
            if (Thread.currentThread().getName().equals("One")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }
}



