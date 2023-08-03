class TimePass{
    int a;
    static int b ;

};

public class Static_Ex {
    public static void main(String[] args) {
        
        TimePass t1 = new TimePass();
        t1.a = 10;
        t1.b = 300;
        System.out.println("a is : " + t1.a);
        System.out.println("B is : " + t1.b);

        TimePass t2 = new TimePass();
        System.out.println("a is : " + t2.a);
        System.out.println("B is : " + t2.b);
    }
}
