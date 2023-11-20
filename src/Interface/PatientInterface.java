package Interface;

import Model.Doctor;
import Model.Patient;

public interface PatientInterface {

     void addPatient(Patient patient,int doctorId);
     void updatePatient(String patientName, Patient patient);
     void deletePatient(String patientName);
     Patient getPatientByDoctorId(int doctorId, String patientName);
     Patient[] getAllPatientsByDoctorId(int doctorId);
     Patient[] getAllPatientsByHospitalId(int hospitalId);
     Doctor getDoctorWithMostPatients();
     int getAgeDifferenceWithDoctor(String patientName, int doctorId);


}
