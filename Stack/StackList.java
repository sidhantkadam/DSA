package Stack;

import java.util.ArrayList;
import java.util.List;

public class StackList<T>
{
    private List<T> stackList = new ArrayList<>();

    public void push(T value)
    {
        stackList.add(value);
    }

    public T pop()
    {
        if(stackList.isEmpty())
        {
            return null;
        }
        return stackList.removeLast();
    }

    public static void main(String[] args)
    {
        StackList stack = new StackList();
        stack.push(78);
        stack.push('A');
        stack.push("String");
        stack.pop();
        System.out.println(stack.stackList.toString());
    }
}
