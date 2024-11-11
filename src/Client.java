import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Client {
    protected int id; //the id is directly accessible in the subclass
    private String name;
    private LocalDate birthday;
    private String address;
    private String email;
    private String phoneNumber;
    private int nbPoints;

    void showDetails(){
        System.out.println("id: " + id);
        System.out.println("name: "+name);
        System.out.println("birthday: "+birthday);
        System.out.println("address: "+address);
        System.out.println("email: "+email);
        System.out.println("phoneNumber: "+phoneNumber);
        System.out.println("nbPoints: "+nbPoints);
    }
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("id ? ");
        id=sc.nextInt();
        System.out.println("name ? ");
        name=sc.nextLine();
        name=sc.nextLine();
        System.out.println("email ? ");
        name=sc.next();
        System.out.println("nb Points ? ");
        nbPoints=sc.nextInt();
        // read the LocalDate from the keyboard
        DateTimeFormatter pattern =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("birthdate (yyyy-MM-dd) ?  ");
        birthday=LocalDate.parse(sc.next(),pattern);
    }
}
