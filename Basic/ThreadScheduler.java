import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduler {
    public static void main(String[] args) {
        //create ScheduledExecutorService for multiple Thread

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        Runnable task1 = new Runnable(){
            public void run(){
                
                for(int i=1;i<=10;i++){
                    System.out.println("4" + "*" + i + "=" + 4*i);
                }
            }
        };
        Runnable task2 = new Runnable(){
            public void run(){
                for(int i=1;i<=10;i++){
                    System.out.println("5" + "*" + i + "=" + 5*i);
                }
            }
        };

        scheduler.scheduleAtFixedRate(task1,0,2,TimeUnit.SECONDS);
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.err.println(e);
        }
        scheduler.scheduleAtFixedRate(task2,0,2,TimeUnit.SECONDS);
        try{
            Thread.sleep(20000);
        }catch(Exception e){
            System.err.println(e);
        }
        scheduler.shutdown();
    }
}

// for open the java console use command ----> jconsloe