/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GlobalEcoSystem.Person;

import java.util.ArrayList;


public class PersonDirectory  {
    private ArrayList<Person> PersonDirectory;

    public PersonDirectory() {
       PersonDirectory = new ArrayList();
    }
     
    

    public ArrayList<Person> getPersonDirectory() {
        return PersonDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> PersonDirectory) {
        this.PersonDirectory = PersonDirectory;
    }
     //String userName,String dob, String name, String email, String mobile, String address, String password, String age, String gender
     public Person addPerson(String userName,String gender, String name, String email, String mobile, String address,String age){
       Person person = new Person(userName,gender, name, email, mobile, address, age);
        PersonDirectory.add(person);
        return person;
    }
    
    public void removePerson(Person person){
       PersonDirectory.remove(person);
    }
    
        public Person getPerson(String name){
        for(Person person: PersonDirectory){
            if(person.getName().equalsIgnoreCase(name)){
                return person;
            }
        }
        return null;
    }
     
     
    
}
