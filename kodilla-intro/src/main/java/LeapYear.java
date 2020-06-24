public class LeapYear {
    private static boolean leap (int Year) {
        return ((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0);

    }

    public static void checkYear (int year) {
        if (leap(year)){
            System.out.println("Podany rok jest przestepny.");
        }
        else {
            System.out.println("Podany rok nie jest przestepny.");
        }
    }
    public static void main(String[] args) {
        int year = 2020;
        checkYear(2020);
        checkYear(2015);
        checkYear(2022);

    }



}