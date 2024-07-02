import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SortingTest {
    public static int[] generateOrderedArray(int size) {
        return IntStream.range(0, size).toArray();
    }

    public static int[] generateReversedArray(int size) {
        return IntStream.iterate(size - 1, i -> i - 1).limit(size).toArray();
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        return random.ints(size, 0, size * 2).distinct().toArray();
    }

    public static int[] generateRandomRepeatedArray(int size) {
        Random random = new Random();
        return random.ints(size, 0, size).toArray();
    }

    public static long measureTime(Runnable sortingAlgorithm) {
        long startTime = System.nanoTime();
        sortingAlgorithm.run();
        long endTime = System.nanoTime();
        return endTime - startTime;

    }

    public static void main(String[] args) {
        int[] sizes = {128, 256, 512, 1024, 2048, 4096, 65536};

        for (int size : sizes) {
            try {
                System.out.println("Processing array size: " + size);
                runTests(size);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void runTests(int size) throws IOException {
        int[] orderedArray = generateOrderedArray(size);
        int[] reversedArray = generateReversedArray(size);
        int[] randomArray = generateRandomArray(size);
        int[] randomRepeatedArray = generateRandomRepeatedArray(size);

        testSortingAlgorithm("Bubble Sort", SortingAlgorithms::bubbleSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Insertion Sort", SortingAlgorithms::insertionSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Selection Sort", SortingAlgorithms::selectionSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Heap Sort", SortingAlgorithms::heapSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Shell Sort", SortingAlgorithms::shellSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Merge Sort", SortingAlgorithms::mergeSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
        testSortingAlgorithm("Quick Sort", SortingAlgorithms::quickSort, size, orderedArray, reversedArray, randomArray, randomRepeatedArray);
    }

    public static void testSortingAlgorithm(String algorithmName, SortingFunction sortFunction, int size, int[]... arrays) throws IOException {
        String[] scenarios = {
            "Array ordenado em ordem crescente, sem valores repetidos;",
            "Array ordenado em ordem decrescente, sem valores repetidos;",
            "Array aleatória sem valores repetidos",
            "Array aleatória com valores repetidos"
        };

        String fileName = "results_" + algorithmName.replace(" ", "_") + "_" + size + ".csv";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("Scenario,Execution Time (ns)\n");

            System.out.println(algorithmName);
            for (int i = 0; i < arrays.length; i++) {
                int[] array = arrays[i];
                long[] times = new long[10];
                for (int j = 0; j < 10; j++) {
                    int[] arrayCopy = Arrays.copyOf(array, array.length);
                    times[j] = measureTime(() -> sortFunction.sort(arrayCopy));
                }

                double meanTime = Arrays.stream(times).average().orElse(0.0);
                writer.append(scenarios[i]).append(",").append(Double.toString(meanTime)).append("\n");
            }
        }
    }

    @FunctionalInterface
    public interface SortingFunction {
        void sort(int[] array);
    }
}
