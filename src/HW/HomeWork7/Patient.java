package HW.HomeWork7;

public class Patient {
    private int plan;
    private Hospital hospital;

    public Patient(int plan) {
        this.plan = plan;
    }

    public int getPlan() {
        return plan;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
