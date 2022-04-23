/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Doctor;
import java.util.ArrayList;

public class DoctorDirectory {
    private ArrayList<Doctor> DoctorDirectory;

    public DoctorDirectory() {
        DoctorDirectory = new ArrayList();
    }
    
    public ArrayList<Doctor> getDoctorDirectory() {
        return DoctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }
    
    public Doctor newDoctor(String userName,String name, String address, String email, String phoneNumber,String speciality) {
        Doctor doctor = new Doctor(userName,name, email, phoneNumber,address, speciality);
        DoctorDirectory.add(doctor);
        return doctor;
    }
    
    public void removeDoctor(Doctor doctor) {
        DoctorDirectory.remove(doctor);
    }
    
//        public Person getPerson(String name){
//        for(Person person: PersonDirectory){
//            if(person.getName().equalsIgnoreCase(name)){
//                return person;
//            }
//        }
//        return null;
 //   }
    public Doctor getDoctor(String name){
        for(Doctor doctor: DoctorDirectory){
           if(doctor.getName().equalsIgnoreCase(name)){
                return doctor;
          }   
           }
        return null;
    }
}
