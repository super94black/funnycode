package org.redrock.share.threadshare;

/**
 * @Author zhang
 * @Date 2017/10/28 1:29
 * @Content
 */
public class CurrentThread {
    public static void main(String[] args) {
        CT1 ct1 = new CT1();
        ct1.setName("A");
        ct1.start();
    }
}
class CT1 extends Thread{
    public CT1(){
        System.out.println("构造方法 " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("run " + Thread.currentThread().getName());
    }
}

class IsAlive{
    public static void main(String[] args) throws InterruptedException {
        IA ia = new IA();
        System.out.println("begin = " + ia.isAlive());
        ia.start();
        Thread.sleep(1000);
        System.out.println("end = " + ia.isAlive());
    }
}
class IA extends Thread{
    @Override
    public void run() {
        System.out.println("run = " + isAlive());
    }
}
