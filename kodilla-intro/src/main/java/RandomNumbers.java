import java.util.Random;

public class RandomNumbers {
    int max;
    int min= 30;

    public static void main(String[] args) {
       RandomNumbers  randomNumbers = new RandomNumbers();
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public RandomNumbers() {
        Random random = new Random();
        int number = 0;
        while (number < 5000) {
            int value= random.nextInt(31);
            if ( value > max){
                max=value;
            }
            if ( value < min){
                min=value;
            }
            number= number + value;
        }


    }
}
