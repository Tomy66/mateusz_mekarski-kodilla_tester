import java.util.Scanner;

public class Switch {


    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        Color color = Color.valueOf(getLetter().toUpperCase());
        return color;
    }
// Potrzebuje wskazówki, co jest nie tak?
    public static void main(String[] args) {
        Color myColors = color;
        switch (myColors) {
            case Y:
                System.out.println("Yellow");
                break;
            case R:
                System.out.println("Red");
                break;
            case B:
                System.out.println("Blue");
                break;
            case W:
                System.out.println("White");
                break;
        }
    }

}
