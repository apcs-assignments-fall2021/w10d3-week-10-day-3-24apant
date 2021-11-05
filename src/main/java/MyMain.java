import java.util.ArrayList;
import java.util.Collections;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        // REPLACE WITH YOUR CODE
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A'){
                count ++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        // REPLACE WITH YOUR CODE
        ArrayList<String> newArr = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            newArr.add(list.get(i) + "!");

        }
        return newArr;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // REPLACE WITH YOUR CODE
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i) == list2.get(j)){
                    return true;
                }
            }

        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        // REPLACE WITH YOUR CODE
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 1 || list.get(i) % 2 == -1){
                count ++;
            }

        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        // REPLACE WITH YOUR CODE
        ArrayList<Integer> intArr = new ArrayList<>(0);
        for (int i = 0; i < arr.length; i++) {
            intArr.add(arr[i]);

        }
        return intArr;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // REPLACE WITH YOUR CODE
        while(list2.size() != 0){
            list1.add(list2.get(0));
            list2.remove(0);
        }
        //
        Collections.sort(list1);
        return list1;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
