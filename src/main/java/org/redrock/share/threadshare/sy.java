package org.redrock.share.threadshare;

/**
 * @Author zhang
 * @Date 2017/10/28 10:39
 * @Content
 */
public class sy {
    public static void main(String[] args) {
        Service service = new Service();
//        Service service1 = new Service();
        Thread_1 t1 = new Thread_1(service);
        t1.setName("a");
        t1.start();
        Thread_2 t2 = new Thread_2(service);
        t2.setName("B");
        t2.start();
    }
}

class Thread_2 extends Thread{
    private Service service;
    public Thread_2(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.test2();
    }
}

class Thread_1 extends Thread{
    private Service service;
    public Thread_1(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.test();
    }
}

class Service{
    private String name;

    synchronized public void test(){
        System.out.println(Thread.currentThread().getName() + "test" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2(){
        System.out.println(Thread.currentThread().getName() + "test2");
        Service2 service2 = new Service2();
        Service2 s = new Service2();
        synchronized (service2){
        }
    }
}

class Service2{
    synchronized public void ser(){

    }
    public void t(){
        synchronized (this){

        }
    }
}