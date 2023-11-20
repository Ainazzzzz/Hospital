package Interface.impl;

import Interface.PatientInterface;
import Model.Doctor;
import Model.Patient;

public class PatientInterfaceImpl implements PatientInterface {
    @Override
    public void addPatient(Patient patient, int doctorId) {

    }

    @Override
    public void updatePatient(String patientName, Patient patient) {

    }

    @Override
    public void deletePatient(String patientName) {

    }

    @Override
    public Patient getPatientByDoctorId(int doctorId, String patientName) {
        return null;
    }

    @Override
    public Patient[] getAllPatientsByDoctorId(int doctorId) {
        return new Patient[0];
    }

    @Override
    public Patient[] getAllPatientsByHospitalId(int hospitalId) {
        return new Patient[0];
    }

    @Override
    public Doctor getDoctorWithMostPatients() {
        return null;
    }

    @Override
    public int getAgeDifferenceWithDoctor(String patientName, int doctorId) {
        return 0;
    }
}
