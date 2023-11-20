package Interface;

import Model.Doctor;

public interface DoctorInterface {

    void addDoctor(Doctor doctor,int hospitalId);
    void updateDoctor(String doctorName, Doctor doctor);
    void deleteDoctor(String doctorName);
    Doctor getDoctorByName(String doctorName);
    Doctor[] getAllDoctorsByHospitalId(int hospitalId);
    Doctor[] getAllDoctors();
    Doctor getOldestDoctor();
    Doctor getYoungestDoctor();
    double getAverageAgeOfPatientsOfDoctor(int doctorId);
    double getAverageAgeOfDoctorsOfHospital(int hospitalId);


}
