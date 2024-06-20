import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class specialSortClassTest {
    @Test
    public void testColorToInt() { 
        specialSortClass testObject = new specialSortClass();

        assertTrue("specialSort.ColorToInt: red Failure", testObject.colorToInt("red") == 0);
        assertTrue("specialSort.ColorToInt: white Failure", testObject.colorToInt("white") == 1);
        assertTrue("specialSort.ColorToInt: blue Failure", testObject.colorToInt("blue") == 2);
        assertTrue("specialSort.ColorToInt: green Failure", testObject.colorToInt("green") == 3);
        assertTrue("specialSort.ColorToInt: Red Failure", testObject.colorToInt("Red") == 3);
    }

    @Test
    public void testSpecialSort() {
        specialSortClass testSort = new specialSortClass();

        ArrayList<MyObject> colorList = new ArrayList<MyObject>();
        colorList.add(new MyObject("white"));
        colorList.add(new MyObject("blue"));
        colorList.add(new MyObject("white"));
        colorList.add(new MyObject("red"));
        colorList.add(new MyObject("white"));
        colorList.add(new MyObject("red"));
        colorList.add(new MyObject("blue"));
        colorList.add(new MyObject("white"));
        colorList.add(new MyObject("blue"));

        ArrayList<MyObject> exptList = new ArrayList<MyObject>();
        exptList.add(new MyObject("red"));
        exptList.add(new MyObject("red"));        
        exptList.add(new MyObject("white"));
        exptList.add(new MyObject("white"));
        exptList.add(new MyObject("white"));
        exptList.add(new MyObject("white"));
        exptList.add(new MyObject("blue"));
        exptList.add(new MyObject("blue"));
        exptList.add(new MyObject("blue"));

        testSort.specialSort(colorList);

        ArrayList<String> colorArray = new ArrayList<>(testSort.myObjectToArray(colorList));
        ArrayList<String> exptArray = new ArrayList<>(testSort.myObjectToArray(exptList));

        assertTrue("SpecialSort: sort Failure", colorList.size() == exptList.size() && exptArray.containsAll(colorArray) && colorArray.containsAll(exptArray));

    }
}
