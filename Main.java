import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
     User John = new User ("John",1954, 2, 18 ) ;
     John.displayInfo();
     User Banana = new User();
     Banana.displayInfo();
     Admin nicolas = new Admin("nicolas",1964,1,7);
     nicolas.displayInfo();
     nicolas.displayInfo(true) ;
     nicolas.displayInfo(false);

        System.out.print("Name: ");
        String Namee = sin.readLine();
        System.out.print("Year of birth: ");
        int Yearr = Integer.parseInt(sin.readLine());
        System.out.print("Month of birth: ");
        int month = Integer.parseInt(sin.readLine());
        System.out.print("Day of birth: ");
        int dayy = Integer.parseInt(sin.readLine());
        User inputt = new User(Namee, Yearr,month, dayy);
        inputt.displayInfo();
    }
}