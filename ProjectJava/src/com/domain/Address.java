package com.domain;

public class Address implements Comparable<Address>{
    private String name =null;
    private String street = null;
    private String city = null;
    private String state = null;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String returnString ="";
        returnString= returnString.concat("Name: ").concat(this.name).concat(" ::: ")
                                  .concat("Street: ").concat(this.street).concat(" ::: ")
                                  .concat("City:  ").concat(this.city).concat(" ::: ")
                                  .concat("State:  ").concat(this.state);

       return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Address){
            Address otherAddress = (Address) obj;
            if(this.name!=null && otherAddress.getName()!=null &&
                    this.name.equals(otherAddress.getName())){
                if(this.street!=null && otherAddress.getStreet()!=null &&
                        this.street.equals(otherAddress.getStreet())){
                    if(this.city!=null && otherAddress.getCity()!=null &&
                            this.city.equals(otherAddress.getCity())){
                        if(this.state!=null && otherAddress.getState()!=null &&
                                this.state.equals(otherAddress.getState())){
                            isEqual=true;
                        }
                    }
                }
            }
        }else{
            isEqual = false;
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        int hasCode = 37;
        if(this.name!=null)
        hasCode = hasCode + (this.name.hashCode() * 3);
        if(this.street!=null)
        hasCode = hasCode + (this.street.hashCode() * 13);
        if(this.city!=null)
        hasCode = hasCode + (this.city.hashCode() * 7);
        if(this.state!=null)
        hasCode = hasCode + (this.state.hashCode() * 37);

        return hasCode;
    }

    @Override
    public int compareTo(Address otherAddress) {
        int BEFORE = -1;
        int AFTER = 1;
        int EQUAL = 0;
        int returnInt = -1;
        if(this.name!=null){
            returnInt = this.name.compareTo(otherAddress.getName());
        }
        return  returnInt;
    }
}