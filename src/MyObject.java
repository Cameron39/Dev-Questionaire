import java.util.ArrayList;
import java.util.List;

// assuming objects are homogenous
// assuming no need to worry about case
// cannot just sort based off the color propery ascending or descending due to requirements

class Main {
    public static void main(String[] args) {

        specialSortClass specialSort = new specialSortClass();
        //ArrayList<MyObject> sortedColorList = new ArrayList<MyObject>();
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

        specialSort.specialSort(colorList);

        System.out.println("\n");
        for (MyObject myO : colorList) {
            System.out.println(myO.getColor());
        }
    }

}

class specialSortClass {

    public void specialSort(ArrayList<MyObject> customList) {
        customList.sort((o1, o2) -> colorToInt(o1.getColor()).compareTo(colorToInt(o2.getColor())));
        // return customList;
    }

    // function with select case
    // 0 --> red, 1--> white, 2--> blue
    Integer colorToInt(String myColors) {
        switch (myColors) {
            case "red": {
                return 0;
            }
            case "white": {
                return 1;
            }
            case "blue": {
                return 2;
            }
            default: {
                return 3;
            }
        }
    }

    //Could override functionality for the MyObject type as an alternative way
    //Created for testing purposes
    protected List<String> myObjectToArray(ArrayList<MyObject> theInput) {
        List<String> normalArray = new ArrayList<String>();

        for (MyObject myO : theInput) {
            normalArray.add(myO.getColor());
        }
        return normalArray;
    }
}

interface IColorable {
    public String Color();
}

class MyObject implements IColorable {
    private String USAColor = new String();

    public MyObject() {
    }

    public MyObject(String newColor) {
        USAColor = newColor;
    }

    public void setColor(String newColor) {
        USAColor = newColor;
    }

    public String getColor() { // kinda redundent
        return USAColor;
    }

    public String Color() {
        return USAColor;
    }
}

