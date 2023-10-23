import javafx.scene.control.Tab;

class Table{//Synchronized method.....
    synchronized static void printTable(int n){
        for(int i=0;i<10;i++){
            System.out.println(n + " * "+ i+" = " + n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.err.println(e);
            }
        }
    }
}
class MyThread4 extends Thread{
   
    public void run(){
        Table.printTable(1);
    }
}
class MyThread3 extends Thread{
   
    public void run(){
        Table.printTable(10);
    }
}
class MyThread2 extends Thread{
   
    public void run(){
        Table.printTable(100);
    }
}

class MyThread1 extends Thread{
   
    public void run(){
        Table.printTable(1000);
    }
}
public class SyncronizationStaticSync {
    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

/*
Syncronization in Java is the capability to control the access of multiple threads to any shared resource.
it is done using the keyword "synchronized" in java.

1. synchronized method
2. synchronized block
3. static synchronization

 */