package packages;

public class hospital {
    public void doctor(String name,String splist){
        System.out.println("Doctor Name is : " + name);
        System.out.println("Doctor is specialist in : " + splist);
    }

    public void patient(int p){
        System.out.println("Current Total Number of Patient : " + p);
    }

    public void appointment(String time){
        System.out.println("Next Appointment is : " + time);
    }
}

//"Doctor," "Patient," and "Appointment"