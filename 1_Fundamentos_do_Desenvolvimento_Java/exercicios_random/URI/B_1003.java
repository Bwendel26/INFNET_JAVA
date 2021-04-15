import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class B_1003 { //substituir por Main o nome da class.
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(new Locale("us", "EN"));
        Scanner entry = new Scanner(System.in);
        
        int num1 = entry.nextInt();
        int num2 = entry.nextInt();

        System.out.println("SOMA = " + (num1 + num2));
        
        entry.close();
    }
}