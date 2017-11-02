package org.redrock.share.threadshare;

/**
 * @Author zhang
 * @Date 2017/10/28 0:54
 * @Content
 */
public class Priority {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        thread3.setName("A");
        thread3.setPriority(10);
        thread3.start();
        Thread31 thread31 = new Thread31();
        thread31.setName("B");
        thread31.setPriority(3);
        thread31.start();

        //验证优先级继承
        System.out.println("main 优先级" + Thread.currentThread().getPriority());
        System.out.println("thread3优先级 "  + thread3.getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main 优先级" + Thread.currentThread().getPriority());
        System.out.println("thread3优先级 "  + thread3.getPriority());
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000;i++){
                System.out.print(Thread.currentThread().getName());
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread31 extends Thread{
    @Override
    public void run() {
        try {
            for (int j = 0; j < 1000;j++){
                System.out.print(Thread.currentThread().getName());
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//优先级继承验证
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("mythread1 优先级是" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("mythread2优先级是" + this.getPriority());
    }
}
class PriorityMain{
    public static void main(String[] args) {
        System.out.println("main start 优先级" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(4);
        System.out.println("main end 优先级" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        System.out.println(thread1.getPriority());
    }
}