import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackList = new Stack<>();

        // Pushing new items to the Stack
        stackList.push("Mohamed");
        stackList.push("Ahmed");
        stackList.push("Abdelrahman");
        stackList.push("Ali");


        // Popping items from the Stack
        String cardAtTop = stackList.pop(); 
        System.out.println("Stack.pop() => " + cardAtTop);
  

        // Get the item at the top of the stack without removing it
        cardAtTop = stackList.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackList);

    }
}
