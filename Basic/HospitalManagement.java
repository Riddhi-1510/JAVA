import packages.hospital;

public class HospitalManagement {
    public static void main(String[] args) {
        hospital cityHospital = new hospital();
        cityHospital.doctor("Rina shah","Neurologist");
        cityHospital.patient(10);
        cityHospital.appointment("10:30 AM");

    }
}

/*
Scenario 3: Hospital Management System
Develop a package called "hospital" that contains classes like "Doctor," "Patient," and "Appointment" that handle various aspects of managing a hospital. Place these classes in the "hospital" package to provide organization and separation from other modules.

 */