package packages;

public class Security {
    private void privateMethod(){
        System.out.println("This Method is Private...");
    }

    public void publicMethod(){
        System.out.println("This Method is Public...");
    }

    protected void protectedMethod(){
        System.out.println("This Method is Protected...");
    }

    //getPrivateMethod...
    public void getPrivateMethod(){
        privateMethod();
    }
}

/*
7. Security:
   - Use access modifiers (public, private, protected) to control access to data and methods, maintaining the security of user accounts.

 */