import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class LoyalClient extends Client {


    private DiscountValue discountPercentage=DiscountValue.TEN;

    public LoyalClient(int id, String name, LocalDate birthday, String address, String email, String phoneNumber, int nbPoints, DiscountValue discountPercentage) {
        super(id, name, birthday, address, email, phoneNumber, nbPoints);
        this.discountPercentage = discountPercentage;
    }

    void showDetails(){
        super.showDetails(); //call the showDetails method in super class
        System.out.println("discount percentage: "+discountPercentage);
    }
}
