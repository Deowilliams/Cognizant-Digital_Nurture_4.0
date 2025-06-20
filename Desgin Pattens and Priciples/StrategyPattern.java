// Exercise 8: Strategy Pattern
interface SortingStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortingStrategy {
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
    }
}

class QuickSort implements SortingStrategy {
    public void sort(int[] arr) {
        System.out.println("Sorting using Quick Sort");
    }
}

class Sorter {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] arr) {
        strategy.sort(arr);
    }
}

class StrategyTest {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        sorter.setStrategy(new BubbleSort());
        sorter.sortArray(new int[]{5, 3, 2});

        sorter.setStrategy(new QuickSort());
        sorter.sortArray(new int[]{9, 7, 1});
    }
}