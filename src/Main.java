public class Main {

    public static double calculateOddNumberMean(int[] array) {
        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            return 0; //nolze gayofa avicilet tavidan
        }
        return (double) sum / count;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 9, 12, 15};
        double oddNumberMean = calculateOddNumberMean(numbers);
        System.out.println("Arithmetic mean of odd numbers: " + oddNumberMean);
    }
}