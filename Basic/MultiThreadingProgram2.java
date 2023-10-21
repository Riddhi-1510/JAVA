class CustomeThread extends Thread{
    private int num;

    CustomeThread(String name,int num){
        super(name);
        this.num = num;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +  " : " + num + " * " + i + " = " + num*i);
        }

        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}

public class MultiThreadingProgram2 {
    public static void main(String[] args) {
        CustomeThread t1 = new CustomeThread("Thread-1", 4);
        t1.start();
        CustomeThread t2 = new CustomeThread("Thread-2", 10);

        // t2.start();

        //solution for this problem using join to solve this problem

        try{
            t1.join(1000);
        }catch(Exception e){
            System.err.println(e);
        }
        t2.start();
    }
}
