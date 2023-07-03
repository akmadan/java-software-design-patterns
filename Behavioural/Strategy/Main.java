package Behavioural.Strategy;



// Main.java - Usage Example
public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 1 };

        SortingContext context = new SortingContext();

        SortingStrategy bubbleSort = new BubbleSortStrategy();
        context.setSortingStrategy(bubbleSort);
        context.performSort(array);

        SortingStrategy quickSort = new QuickSortStrategy();
        context.setSortingStrategy(quickSort);
        context.performSort(array);
    }
}
