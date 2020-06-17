public class LeapYear {
    private static boolean leap (int Year) {
        return ((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0);

    }

    public static void main(String[] args) {
        int Year = 2020;
        if (leap(Year)){
            System.out.println("Podany rok jest przestepny.");
        }
        else {
            System.out.println("Podany rok nie jest przestepny.");
        }
    }



}