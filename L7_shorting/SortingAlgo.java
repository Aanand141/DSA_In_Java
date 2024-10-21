import java.util.*;

class DisplaySortedArray {
    public static void bubbleSort(int array[], int size) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int array[], int size) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int array[], int size) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class SortingAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("*****MENU*****");
        System.out.println("Enter 1 for Bubble Sort, 2 for Selection Sort, 3 for Insertion Sort: ");
        int menu = sc.nextInt();
        if (menu < 1 || menu > 3) {
            System.out.println("Please enter a valid option:");
        } else {
            switch (menu) {
                case 1:
                    System.out.print("Sorted array is: ");
                    DisplaySortedArray.bubbleSort(array, size);
                    break;
                case 2:
                    System.out.print("Sorted array is: ");
                    DisplaySortedArray.selectionSort(array, size);
                    break;
                case 3:
                    System.out.print("Sorted array is: ");
                    DisplaySortedArray.insertionSort(array, size);
                    break;
                default:
                    System.out.println("Please enter a valid option:");
            }
        }
        sc.close();
    }
}
