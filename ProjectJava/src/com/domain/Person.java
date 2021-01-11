package com.domain;

public class Person implements Comparable<Person> {

    private String firstName=null;
    private String lastName=null;
    private String occupation=null;
    private String city=null;
    private String age=null;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String toString(){

        String returnString= "";
        returnString = returnString.concat("firstName : ").concat(this.firstName).concat("  :::  ")
                                   .concat("lastName : ").concat(this.lastName).concat("  :::  ")
                                   .concat("occupation : ").concat(this.occupation).concat("  :::  ")
                                   .concat("city : ").concat(this.city).concat("  :::  ")
                                   .concat("age : ").concat(this.age)  ;
        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Person){
            Person otherPerson = (Person) obj;
            if(this.firstName!=null  && otherPerson.getFirstName()!=null &&
                    this.firstName.equals(otherPerson.getFirstName())){
                if(this.lastName!=null && otherPerson.getLastName()!=null &&
                        this.lastName.equals(otherPerson.getLastName())){
                    if(this.occupation!=null && otherPerson.getOccupation()!=null &&
                           this.occupation.equals(otherPerson.getOccupation())){
                        if(this.city!=null && otherPerson.getCity()!=null &&
                                this.city.equals(otherPerson.getCity())){
                            if(this.age!=null && otherPerson.getAge()!=null&&
                                   this.age.equals(otherPerson.getAge())){
                                          isEqual = true;
                            }
                        }
                    }
                }
            }
        }else {
            isEqual = false;
        }
        return isEqual;
    }


    @Override
    public int hashCode() {
        int hashCode = 1;
        if(this.firstName!=null)
            hashCode = hashCode + (this.firstName.hashCode()*3);
        if(this.lastName!=null)
            hashCode = hashCode + (this.lastName.hashCode()*5);
        if(this.occupation !=null)
            hashCode = hashCode +(this.occupation.hashCode()*7);
        if(this.city!=null)
            hashCode = hashCode +(this.city.hashCode()*11);
        if(this.age!=null)
            hashCode = hashCode + (this.age.hashCode()*13);
        return hashCode;
    }

    //  Siva Reddy
    //  Siva naidu
    //  Madhavi Vinjamuri
//   ----------  first name
//                          Madhavi    siva
//    ---- last name
//                          Siva   Ma
    /**
     * This method implements comparable.
     * It is used for sorting
     */
    @Override
    public int compareTo(Person otherPerson) {
        int BEFORE = -1;
        int AFTER = 1;
        int EQUAL = 0;
        int returnInt = -1;
        if(this.firstName!=null){
            if(this.firstName.compareTo(otherPerson.getFirstName())!=0){
                returnInt = this.firstName.compareTo(otherPerson.getFirstName());
            }else{
                returnInt = this.lastName.compareTo(otherPerson.getLastName());
            }
        }
        return  returnInt;
    }
}



