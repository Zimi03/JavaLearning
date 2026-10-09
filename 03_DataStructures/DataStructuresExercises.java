import java.util.*;

public class DataStructuresExercises {
    public static void main(String[] args){
        System.out.println("Exercise 1 - working on 1 dimentional arrays");
        int[] a = {1, 5, 8, 2, 3 ,9, 0, 7};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        int arraySize = a.length;
        for(int num : a){
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.printf("mean: %.3f, max: %d, min: %d%n", (sum/arraySize), max, min);

        for (int i = 0; i < arraySize/2; i++){
            int swap = a[i];
            a[i] = a[arraySize - 1 - i];
            a[arraySize - 1 - i] = swap;
        }
        System.out.println("reversed a: " + Arrays.toString(a));

        int[] b = a;
        b[0] = 99;
        System.out.printf("a: %s, b: %s%n", Arrays.toString(a), Arrays.toString(b)); // changing number in b, changes number in a. int[] b = a, doesn't create new object but is creating reference to the same object
        int[] c = Arrays.copyOf(a, a.length);
        c[0] = 21;
        System.out.printf("a: %s, c: %s%n", Arrays.toString(a), Arrays.toString(c)); // Arrays.copyOf creates a new independent object.

        int[] x = new int[3];
        boolean[] y = new boolean[3];
        String[] z = new String[3];
        System.out.printf("int: %s, boolean: %s, String: %s%n", Arrays.toString(x), Arrays.toString(y), Arrays.toString(z));

        System.out.println("Exercise 2 - 2D arrays");
        int rows = 6;
        int[][] pascal = new int[rows][];
        for (int i = 0; i < rows; i++){
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++){
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            for(int value: pascal[i]){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Exercise 3 - Hashes");
        String sentence = "to be or not to be that is the question to be";
        String[] words = sentence.split(" ");
        Map<String, Integer> countWords = new HashMap<>();
        Set<String> unique = new HashSet<>();
        for(String word : words){
            countWords.merge(word, 1, Integer::sum);
            unique.add(word);
        }
        System.out.println(countWords);
        System.out.println(unique);
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String word: words){
            hashMap.merge(word, 1, Integer::sum);
            linkedMap.merge(word, 1, Integer::sum);
            treeMap.merge(word, 1, Integer::sum);
        }
        System.out.println(hashMap); //order not guaranteed
        System.out.println(linkedMap); //order according to order in words
        System.out.println(treeMap); //sorted by keys

        System.out.println("Exercise 4 - collections");
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
//        for(Integer n: nums){ //Iterator will throw an ConcurrentModificationException because it is not tracking changes in ArrayList
//            if(n % 2 == 0){
//                nums.remove(n);
//            }
//        }
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);
        List<Integer> l = new ArrayList<>(List.of(10,20,30,1));
        System.out.println(l);
        l.remove(1); //removing value at index: 1
        System.out.println(l);
        l.remove(Integer.valueOf(1));//removing value 1 in list
        System.out.println(l);
//        System.out.println(Arrays.asList(1,2,3).add(4)); //throws an error returns table of constant size
//        System.out.println(List.of(1,2,3).add(4)); //throws an error (List.of is immutable)
        int[] x_1 = {1, 2};
        int[] y_1 = {1, 2};
        System.out.println(x_1 == y_1); //returns comparison of references to the array
        System.out.println(x_1.equals(y_1)); //this is basic object comparison method which does not work on arrays
        System.out.println(Arrays.equals(x_1, y_1)); //method written to compare values in arrays
    }
}