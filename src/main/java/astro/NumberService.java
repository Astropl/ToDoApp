package astro;

public class NumberService {
    int numbers[] = {10, 2, 3, 85,
            23, 491, 27, 412,
            42, 41, 22, 25};

    public int getCountNumbers() {
        int countNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            countNumbers++;

        }
        return countNumbers;
    }

    public int sumNumbers() {
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }
        return sumNumbers;
    }

    public int sortNumbers() {
        int afterSortingTable[] = new int[numbers.length];
        int temp[] = new int[numbers.length];
        int numbersSort = 0;

        for (int i = 0; i <numbers.length-1; i++) {
            if (numbers[i] > numbers[i +1]) {
                temp[i] = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp[i];
            }
            System.out.println( numbers[i]);
        }



        return numbersSort;

    }


}
