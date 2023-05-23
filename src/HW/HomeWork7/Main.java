package HW.HomeWork7;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient = new Patient(456);
        therapist.planHelp(patient);
    }
}
