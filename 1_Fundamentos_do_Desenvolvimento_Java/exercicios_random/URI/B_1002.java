import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class B_1002 { //substituir por Main o nome da class.
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(new Locale("us", "EN"));
        Scanner entry = new Scanner(System.in);
        double radius = entry.nextDouble();
        
        double area = 3.14159 * Math.pow(radius, 2);
        
        System.out.printf("A=%.4f\n", area);
        
        entry.close();
    }
}