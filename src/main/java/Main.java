import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    private BlockingQueue<Runnable> eventQueue = new ArrayBlockingQueue<Runnable>(5);
    public static Main inst = new Main();

    private Main() {

    }

    public synchronized void putInRunLoop(Runnable runnable) {
        eventQueue.add(runnable);
    }

    private void mainLoop() {
        System.out.println("running");
        while (true) {
            try {
                eventQueue.take().run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setTimeout(final Runnable runnable, int timeout) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer has been called in thread: " + Thread.currentThread().getId());
                Main.inst.putInRunLoop(runnable);
            }
        }, timeout);
    }

    public static void main(String[] args) {
//        System.out.println("main thread id is: " + Thread.currentThread().getId());
//        Main.inst.setTimeout(new Runnable() {
//            public void run() {
//                System.out.println("timeout1 has been executed in thread: " + Thread.currentThread().getId());
//            }
//        }, 1000);
//
//        Main.inst.setTimeout(new Runnable() {
//            public void run() {
//                System.out.println("timeout2 has been executed in thread: " + Thread.currentThread().getId());
//            }
//        }, 1000);
//
//        Main.inst.mainLoop();
//    }
        Reactor reactor = null;
        try {
            reactor = new Reactor();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new Handler(reactor.selector);
        } catch (IOException e) {
            e.printStackTrace();
        }
        reactor.run();
    }
}