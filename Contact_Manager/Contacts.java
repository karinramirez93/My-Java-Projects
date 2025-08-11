public class Contacts{
    //atributes
    String name;
    String lastName;
    int phoneNumber;
    String email;

    public Contacts(){
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }//end constructor

    //getter/setter for name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
   
    //getter/setter for lastName
    public String  getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    //getter/setter for PhoneNumber
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    //getter/setter for Email
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "name " + this.name + this.lastName + 
               " PhoneNumber: " + this.phoneNumber + 
               " Email: " + this.email;
    }


}//end class

