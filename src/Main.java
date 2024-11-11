import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static int menu(){
        System.out.println("Select a choice :");
        System.out.println("1- Client");
        System.out.println("2- Loyal Client");
        System.out.println("3- Exit");

        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
        }while(choice<0 || choice>3);
        return choice;
    }
    public static void main(String[] args) {
        /*Client c1=new Client(1,"Mohamed", LocalDate.of(2002,12,14),"7 street of flowers","mohamd@gmail.com","+21622455666",0);
        //using constructor defined explicitly
        //LoyalClient lc1=new LoyalClient(2,"Ahmed", LocalDate.of(2002,12,14),"7 street of flowers","ahmed@gmail.com","+21622455666",0,DiscountValue.TEN);
        //using SuperBuilder Lombok annotation
        LoyalClient lc1=LoyalClient.builder()
                                .id(2)
                                .name("Ahmed")
                                .birthday(LocalDate.of(2002,12,14))
                                .address("7 street of flowers")
                                .email("ahmed@gmail.com")
                                .phoneNumber("+21622455666")
                                .nbPoints(0)
                                .discountPercentage(DiscountValue.TWENTY)
                                .build();
        System.out.println("The Client Information : ");
        c1.showDetails();
        System.out.println("The Loyal Client Information : ");
        lc1.showDetails();*/

        //class Object methods :
        //String toString() : returns as default the reference of the object
        //boolean equals(Object obj) : returns true if obj is equal to this or false if not
        //int hashCode() : returns a random value as a hash code.
        //Class getClass() : returns the class of the object


        int choice;
        Client c=new Client();
        //Object c=null;
        do{
            choice=menu();
            switch(choice){
                    case 1:
                        c=new Client(1,"Mohamed", LocalDate.of(2002,12,14),"7 street of flowers","mohamd@gmail.com","+21622455666",0);

                        break;
                    case 2:
                        c=LoyalClient.builder()
                            .id(2)
                            .name("Ahmed")
                            .birthday(LocalDate.of(2002,12,14))
                            .address("7 street of flowers")
                            .email("ahmed@gmail.com")
                            .phoneNumber("+21622455666")
                            .nbPoints(0)
                            .discountPercentage(DiscountValue.TWENTY)
                            .build();

            }
            c.showDetails();

            //test of toString()
            System.out.println(c);
            //test getClass() method
            System.out.println(c.getClass());
        }while(choice!=3);

    }
}