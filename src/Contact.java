public class Contact {
     private int age;
     private PhoneNumber phoneNumber;
     private String name;
     private String email;


    public Contact(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Contact(String name, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(int age, String name, PhoneNumber phoneNumber, String email) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
/*
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }*/

