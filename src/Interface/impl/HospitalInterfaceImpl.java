package Interface.impl;

import Interface.HospitalInterface;
import Model.Hospital;

public class HospitalInterfaceImpl implements HospitalInterface {
    @Override
    public void addHospital(Hospital hospital) {

    }

    @Override
    public void updateHospital(String hospitalName, Hospital hospital) {

    }

    @Override
    public void deleteHospital(String hospitalName) {

    }

    @Override
    public Hospital getHospitalByName(String hospitalName) {
        return null;
    }

    @Override
    public Hospital[] getAllHospitals() {
        return new Hospital[0];
    }

    @Override
    public Hospital getHospitalWithMostDoctors() {
        return null;
    }

    @Override
    public Hospital getHospitalWithMostPatients() {
        return null;
    }

    @Override
    public Hospital getDoctorAndHospitalByPatientName(String patientName) {
        return null;
    }

    @Override
    public Hospital getDoctorAndHospitalByDoctorId(int doctorId) {
        return null;
    }

    @Override
    public Hospital getBusiestHospital() {
        return null;
    }
}
