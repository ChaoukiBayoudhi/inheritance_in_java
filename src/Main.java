import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client(1,"Mohamed", LocalDate.of(2002,12,14),"7 street of flowers","mohamd@gmail.com","+21622455666",0);
        LoyalClient lc1=new LoyalClient(2,"Ahmed", LocalDate.of(2002,12,14),"7 street of flowers","ahmed@gmail.com","+21622455666",0,DiscountValue.TEN);
        System.out.println("The Client Information : ");
        c1.showDetails();
        System.out.println("The Loyal Client Information : ");
        lc1.showDetails();
    }
}