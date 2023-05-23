package HW.HomeWork7;

public class Therapist extends Hospital {
    @Override
    void help() {
        super.help();
        System.out.println("простуду");
    }

    void planHelp (Patient a) {
        if (a.getPlan() == 1) {
            a.setHospital(new Surgeon());
        } else if (a.getPlan() == 2) {
            a.setHospital(new Dentist());
        } else {
            a.setHospital(new Therapist());
        }
        a.getHospital().help();
    }
}
