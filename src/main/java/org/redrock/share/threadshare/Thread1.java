package org.redrock.share.threadshare;

/**
 * @Author zhang
 * @Date 2017/10/28 0:06
 * @Content
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread1.currentThread().getName() + "运行" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 从程序运行的结果可以发现，多线程程序是乱序执行。因此，只有乱序执行的代码才有必要设计为多线程
 Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
 实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。
 */
class Main{
    public static void main(String[] args) {
        Thread1 one = new Thread1();
        one.setName("A");
        one.start();
        one.start();//start方法重复调用的话，会出现java.lang.IllegalThreadStateException异常。
        Thread1 two = new Thread1();
        two.setName("B");
        two.start();
    }
}

class Run1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main2 {

    public static void main(String[] args) {
        Run1 a = new Run1();
        Thread a1 = new Thread(a);
        a1.setName("A");
        a1.start();
        Run1 b = new Run1();
        Thread b1 = new Thread(b);
        b1.setName("B");
        b1.start();
    }

}
