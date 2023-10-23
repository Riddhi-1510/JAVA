public class DeadLockSolution {
    public static void main(String[] args) {
        final String resource1 = "Kitkat";
        final String resource2 = "Ferrero Rocher";

        Thread t1 = new Thread("Riddhi"){
            public void run(){
                synchronized(resource1){
                    System.out.println(Thread.currentThread().getName() + " : Locked "+ resource1);

                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        System.err.println(e);
                    }

                    synchronized(resource2){
                        System.out.println(Thread.currentThread().getName() + " : Locked " + resource2);
                    }
                }
            }
        };



        Thread t2 = new Thread("Dishant"){
            public void run(){
                synchronized(resource1){
                    System.out.println(Thread.currentThread().getName() + " : Locked "+ resource1);

                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        System.err.println(e);
                    }

                    synchronized(resource2){
                        System.out.println(Thread.currentThread().getName() + " : Locked " + resource2);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}