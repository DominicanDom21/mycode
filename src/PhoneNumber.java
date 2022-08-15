public class PhoneNumber {
    private int areaCode;
    private String phoneNumber;


public PhoneNumber(String phoneNumber){
 if(phoneNumber.length() > 10){
   this.areaCode = Integer.parseInt(phoneNumber.substring(0,phoneNumber.length()-10));
   this.phoneNumber = phoneNumber.substring(phoneNumber.length()-10);
 }
}

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public PhoneNumber(int areaCode, String phoneNumber) {
    this.phoneNumber = phoneNumber;
    this.areaCode = areaCode;
}
}
