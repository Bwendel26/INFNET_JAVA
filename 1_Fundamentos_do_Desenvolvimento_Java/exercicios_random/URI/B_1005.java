import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class B_1005 { //substituir por Main o nome da class.
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(new Locale("us", "EN"));
        Scanner entry = new Scanner(System.in);
        
        double num1 = entry.nextDouble();
        double num2 = entry.nextDouble();
        
        System.out.printf("MEDIA = %.5f\n", (num1 + num2) / 2);

        entry.close();
    }
}