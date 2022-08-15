import java.util.concurrent.Callable;

public class main {

    public static void main(String args[]){
        Contact contactUno = new Contact(12, "Nicky",new PhoneNumber(540,"2462578"),"nickythatGirz@pop.com");
        Contact contactDos = new Contact(12,"nicky");

        System.out.println(contactUno);
        System.out.println(contactDos);

    }
}
