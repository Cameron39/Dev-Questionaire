import java.util.Stack;

/*
 * Stack extends Vector
 * Vector extends List
 * This means we inherit all the functions of List & Vector
 */

public class myStack<T> extends Stack<T> {

    public myStack() {} 

    @Override
    /*
     * Removes the object at the top of the Stack 
     * Returns removed object
     * If the Stack is empty, return null (as opposed to erroring out)
     */
    public T pop() {
        if (this.isempty()){return null;}

        T popObj;
        int theLen = size();

        popObj = peek();
        removeElementAt(theLen-1);
        
        return popObj;
    }
    /*
    * Check if the Stack is empty
    * Return true if it is empty, else false
    */
    public Boolean isempty() {
        if (this.elementCount == 0) {return true;}
        return false;
    }
}
