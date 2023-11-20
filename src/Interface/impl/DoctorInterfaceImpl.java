package Interface.impl;

import Interface.DoctorInterface;
import Model.Doctor;
import Model.Hospital;

import java.util.Arrays;


public class DoctorInterfaceImpl implements DoctorInterface {
    private DataBase dataBase;

    public DoctorInterfaceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void addDoctor(Doctor doctor, int hospitalId) {
        Doctor[] doctors ;
        for (Hospital hospital : dataBase.getHospitals()) {
            if(hospital.getId() == hospitalId){
            doctors = Arrays.copyOf(hospital.getDoctors(),
                    hospital.getDoctors().length+1);
            doctors[doctors.length-1] = doctor;
            hospital.setDoctors(doctors);
                System.out.println("Doctor added successfully");
            }

        }
    }

    @Override
    public void updateDoctor(String doctorName, Doctor doctor) {
        for (Hospital h : dataBase.getHospitals()) {
            for (Doctor d: h.getDoctors()) {
                if(d.getName().equals(doctorName)){
                    d.setName(doctor.getName());
                    d.setGender(doctor.getGender());
                    d.setDateOfBirth(doctor.getDateOfBirth());
                    d.setPatients(doctor.getPatients());
                }

            }

        }
        System.out.println("Doctor with name" + doctorName +
                " is successfully updated!!!");

    }

    @Override
    public void deleteDoctor(String doctorName) {
    Doctor[] doctors;
    int counter=0;
        for (Hospital h: dataBase.getHospitals()) {
            for (Doctor d: h.getDoctors()) {
                if(d.getName().equals(doctorName)) {
                    doctors = new Doctor[h.getDoctors().length - 1];
                    for (int i = 0; i < h.getDoctors().length; i++) {
                        if (!h.getDoctors()[i].getName().equals(doctorName)) {
                            doctors[counter] = h.getDoctors()[i];
                            counter++;
                        }

                    }
                    h.setDoctors(doctors);
                    System.out.println("Successfully deleted!!!");
                    break;
                }

            }

        }
    }

    @Override
    public Doctor getDoctorByName(String doctorName) {
        for (Hospital h : dataBase.getHospitals()) {
            for (Doctor d: h.getDoctors()) {
                if(d.getName().equals(doctorName)){
                    return d;
                }

            }

        }
   return null; }

    @Override
    public Doctor[] getAllDoctorsByHospitalId(int hospitalId) {
        for (Hospital hospital : dataBase.getHospitals()) {
            if(hospital.getId()==hospitalId){
                return hospital.getDoctors();
            }

        }
   return null; }

    @Override
    public Doctor[] getAllDoctors() {
        Doctor[] doctors = new Doctor[1000];
        int counter=0;
        for (Hospital h:
             dataBase.getHospitals()) {
            for (Doctor d: h.getDoctors()) {
                doctors[counter]=d;
                counter++;
            }
        }
        doctors=Arrays.copyOf(doctors,counter);
  return doctors;  }

    @Override
    public Doctor getOldestDoctor() {
        Doctor oldestDoctor = null;

        for (Hospital h : dataBase.getHospitals()) {
            for (Doctor d : h.getDoctors()) {
                if (oldestDoctor == null || d.getDateOfBirth().isBefore(oldestDoctor.getDateOfBirth())) {
                    oldestDoctor = d;
                }
            }
        }

        return oldestDoctor;
    }

    @Override
    public Doctor getYoungestDoctor() {
        return null;
    }

    @Override
    public double getAverageAgeOfPatientsOfDoctor(int doctorId) {
        return 0;
    }

    @Override
    public double getAverageAgeOfDoctorsOfHospital(int hospitalId) {
        return 0;
    }
}
