
interface Account{
    void whichAccount();
}
class SavingAccount implements Account{
    SavingAccount(){
        System.out.println("This Account is Saving........");
    }
    public void whichAccount(){
        System.out.println("Customer selected Saving Account");
    }
}
class CurrentAccout implements Account{
    CurrentAccout(){
        System.out.println("This Account is CurrentAccount.....");
    }
    public void whichAccount(){
        System.out.println("Custormer selected Current Account");
    }
}

public class SampleBank {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.whichAccount();
        CurrentAccout c = new CurrentAccout();
        c.whichAccount();
    }
}
