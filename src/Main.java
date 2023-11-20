import Interface.DoctorInterface;
import Interface.impl.DataBase;
import Interface.impl.DoctorInterfaceImpl;
import Model.Doctor;
import Model.Hospital;
import Model.Patient;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Aksana","Female", LocalDate.of(1999, 12, 12));
        Patient patient1 = new Patient("Aisana","Female", LocalDate.of(1999, 12, 12));

        Doctor doctor = new Doctor("Adyl","Male",
                LocalDate.of(1999, 12, 12),
                new Patient[]{patient,patient1});

        Doctor doctor1 = new Doctor("Abdy","Male",
                LocalDate.of(1999, 12, 12),
                new Patient[]{new Patient("Akyl","Male",
                        LocalDate.of(1999, 12, 12)),
                new Patient("Aijan","Female",
                        LocalDate.of(1999, 12, 12))});


        Hospital hospital = new Hospital("Ahunbaeva","Isa Ahunbaeva 125",
                new Doctor[]{doctor,doctor1,new Doctor("Mahabat","Female",
                        LocalDate.of(1996,1,3),new Patient[]{}),new Doctor("Saikal",
                        "Female",LocalDate.of(2008,9,7),new Patient[]{})});

        DataBase dataBase = new DataBase(new Hospital[]{hospital});

        DoctorInterface doctorInterface = new DoctorInterfaceImpl(dataBase);
        doctorInterface.addDoctor(new Doctor("Ainazik","Female",
                LocalDate.of(1999, 12, 12),
                new Patient[]{new Patient("Nuraida","Female",
                        LocalDate.of(1887,11,11))}),1);
        System.out.println(Arrays.toString(doctorInterface.getAllDoctorsByHospitalId(1)));
        doctorInterface.deleteDoctor("Abdy");
        System.out.println(Arrays.toString(doctorInterface.getAllDoctorsByHospitalId(1)));

        System.out.println(Arrays.toString(doctorInterface.getAllDoctors()));




    }

}