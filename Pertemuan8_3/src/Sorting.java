public class Sorting {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}



//      Salespeople sorted by total sales (descending) and name:
//      Smith, Jane: 40 sales
//      Clark, Emily: 40 sales
//      Doe, James: 30 sales
//      Doe, John: 30 sales
//      Jones, Adam: 30 sales
//      Doe, Karen: 20 sales




