public class Deamon_Thread extends Thread{
    public static void main(String[] args) {
        Deamon_Thread t1 = new Deamon_Thread();
        Deamon_Thread t2 = new Deamon_Thread();
        Deamon_Thread t3 = new Deamon_Thread();


        //to set a thread as Deamon Thread....
        t1.setDaemon(true);
        //t2.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());

        System.out.println(t1.isDaemon() + " " + t2.isDaemon() + " " + t3.isDaemon());


    }
}

/*
What is Daemon Thread?
Daemon thread is a low priority thread which runs intermittently in the background doing the garbage collection operation for the java runtime system. It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
If there are no user threads running then the Daemon thread automatically ends.

means if only Daemon Threads are there and no user thread then automatically End the programmmmmm....
and Not use Thread class object is a thread
*/