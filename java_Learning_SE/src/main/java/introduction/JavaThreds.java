package introduction;

import com.sun.source.tree.SynchronizedTree;

public class JavaThreds extends Thread {

    @Override
    public void run() {
        disply();

    }

    synchronized   static void disply() {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
