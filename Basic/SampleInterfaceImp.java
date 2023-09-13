interface Sample{
    int x=2;//default final and static
    void add();//abstract method
}
interface Sample1 extends Sample{
    int y=33;
    void sub();
}

public class SampleInterfaceImp implements Sample1{

    public void add(){
        System.out.println("Method of Sample:"+x);
    }
    public void sub(){
        System.out.println("Method of Sample1:"+y);
    }
    
    public static void main(String[]args){
            SampleInterfaceImp obj = new SampleInterfaceImp();
            obj.add();
            obj.sub();
    }
}