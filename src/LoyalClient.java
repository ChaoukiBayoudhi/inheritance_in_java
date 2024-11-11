import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class LoyalClient extends Client {


    private DiscountValue discountPercentage=DiscountValue.TEN;

    //public LoyalClient(int id, String name, LocalDate birthday, String address, String email, String phoneNumber, int nbPoints, DiscountValue discountPercentage) {
      //  super(id, name, birthday, address, email, phoneNumber, nbPoints);
       // this.discountPercentage = discountPercentage;
    //}

    void printId(){
        System.out.println("id = "+id);//direct access because the id is protected
    }
    void printName(){
        //System.out.println("name = "+name);//name is private so no direct access
        System.out.println("name = "+getName());//name is private so no direct access
    }
    //redefinition of showDetails
    @Override
    void showDetails(){
        //call the showDetails method of the super class
        super.showDetails();
        System.out.println("discountPercentage = "+discountPercentage);
    }


}
