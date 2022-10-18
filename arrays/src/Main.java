public class Main {
    public static void main(String[] args) {
    SortedArray sortedArray = new SortedArray();

    int[] numbersArray = sortedArray.getIntegers(6);

    int[] sortedNumbersArray = sortedArray.sortIntegers(numbersArray);

    sortedArray.printArray(sortedNumbersArray);
  }
}

