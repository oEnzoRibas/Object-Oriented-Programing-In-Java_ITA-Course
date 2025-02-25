package ITA_POO_JAVA.Module5.Stack.Project;

import java.util.Arrays;

public class Stack {
    private int top = 0;
    private Object[] elements;

    public Stack(int size){
        this.elements = new Object[size];

    }

    public void push(Object element){
        elements[top] = element;
        top++;
    }

    public Object pull(){
        top--;
        return elements[top];
    }

    public Object top(){
        return elements[top-1];
    }

    public int size(){
        return top;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Object[] getElements() {
        Object[] returnArray = Arrays.copyOf(elements,size());
        return returnArray;
    }
}
