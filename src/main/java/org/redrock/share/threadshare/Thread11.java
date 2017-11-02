package org.redrock.share.threadshare;

/**
 * @Author zhang
 * @Date 2017/10/28 0:31
 * @Content
 */
public class Thread11 extends Thread{
    private int count = 5;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行  :  " + count--);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

/**
 * 从上面可以看出，不同的线程之间count是不同的，
 * 这对于卖票系统来说就会有很大的问题，当然，这里可以用同步来作。
 * 这里我们用Runnable来做下看看
 */
class Main11{
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        t1.setName("A");
        t1.start();
        Thread11 t2 = new Thread11();
        t2.setName("B");
        t2.start();
    }
}

class Thread22 implements Runnable{
    private int count=15;
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行  count= " + count--);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
class Main22 {
    public static void main(String[] args) {
        //这里要注意每个线程都是用同一个实例化对象，如果不是同一个，效果就和上面的一样了！
        Thread22 my = new Thread22();
        new Thread(my, "C").start();
        //同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
        new Thread(my, "D").start();
        new Thread(my, "E").start();
    }
}

