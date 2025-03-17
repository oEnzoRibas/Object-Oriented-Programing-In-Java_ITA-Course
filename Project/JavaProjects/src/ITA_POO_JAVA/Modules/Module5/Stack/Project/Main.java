package ITA_POO_JAVA.Modules.Module5.Stack.Project;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("Enzo");
        stack.push("Cleber");
        stack.push("Joao");
        stack.push("Santana");
        stack.push("Natanael");
        stack.push("Josué");
        stack.push("Elias");

        System.out.println(stack.top()+" "+stack.size());

        Object[] elements = stack.getElements();

        elements[6] = "ENZO";


        System.out.println(stack.top()+" "+stack.size());


    }
}
