import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/*
 * Assumptions:
 *  - Only strings are used provided for duplicates
 *  - Not worring about string or array size
 *  - Assuming the built in Java functions work as intended
 */

public class findDuplicates {
    public static void main(String[] args) {
        // Expected Output: “balloon”, “dog”, and “elephant”.
        List<String> theStrings = Arrays.asList("apple", "dog", "balloon", "banana", "cat", "dog", "dog", "celery",
                "elephant", "elephant", "balloon");
        List<String> noDups = new ArrayList<>(getMyDuplicates(theStrings));
        for (String i : noDups)
            System.out.println(i);
            //
    }

    static List<String> getMyDuplicates(List<String> theInput) {
        /*  
        * This function will iterate through theInput String List
        * All unique items are added to a Set (tempSet)
        * If the values are found in tempSet, they are added to the dupSet 
        *    IF not already there.
        * Using Set container for the 'contains' functionality 
        */

        Set<String> tempSet = new HashSet<>();
        Set<String> dupSet = new HashSet<>();

        for (String i : theInput) {
            if (!tempSet.contains(i) && !dupSet.contains(i)) {
                tempSet.add(i);
            } else if (tempSet.contains(i) && !dupSet.contains(i)) {
                dupSet.add(i);
            } else {
                continue;
                // Default should be to do nothing
            }
        }
        List<String> justDupl = new ArrayList<>(dupSet);
        return justDupl;
    }
}