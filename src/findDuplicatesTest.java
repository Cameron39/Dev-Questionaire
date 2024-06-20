import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

public class findDuplicatesTest {
    @Test
    public void testGetMyDuplicates() {
        List<String> resultList = new ArrayList<>();

        //Test use case example provided
        List<String> testList1 = Arrays.asList("apple", "dog", "balloon", "banana", "cat", "dog", "dog", "celery",
        "elephant", "elephant", "balloon");
        List<String> exptList1 = Arrays.asList("balloon","dog","elephant");
        resultList = findDuplicates.getMyDuplicates(testList1);
        assertTrue("GetMyDuplicates: Example Use Case Failure", exptList1.size() == resultList.size() && exptList1.containsAll(resultList) && resultList.containsAll(exptList1));

        //Test no duplicates
        List<String> testList2 = Arrays.asList("apple", "dog", "balloon", "banana", "cat", "celery","elephant");
        List<String> exptList2 = new ArrayList<>();
        resultList = findDuplicates.getMyDuplicates(testList2);
        assertTrue("GetMyDuplicates: No Duplicates Failure",exptList2.size() == resultList.size());

        //Test case sensitivity
        List<String> testList3 = Arrays.asList("Y","y","y","Z","Z","Z","HaH","Hah","HAH","HAH");
        List<String> exptList3 = Arrays.asList("y","Z","HAH");
        resultList = findDuplicates.getMyDuplicates(testList3);
        assertTrue("GetMyDuplicates: Case sensitivity Failure", exptList3.size() == resultList.size() && exptList3.containsAll(resultList) && resultList.containsAll(exptList3));
    }
}
