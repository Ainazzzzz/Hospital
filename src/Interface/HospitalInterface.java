package Interface;

import Model.Hospital;

public interface HospitalInterface {
    void addHospital(Hospital hospital);
    void updateHospital(String hospitalName, Hospital hospital);
    void deleteHospital(String hospitalName);
    Hospital getHospitalByName(String hospitalName);
    Hospital[] getAllHospitals();
    Hospital getHospitalWithMostDoctors();
    Hospital getHospitalWithMostPatients();
    Hospital getDoctorAndHospitalByPatientName(String patientName);
    Hospital getDoctorAndHospitalByDoctorId(int doctorId);
    Hospital getBusiestHospital();

}
