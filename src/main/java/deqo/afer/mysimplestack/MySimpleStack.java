package deqo.afer.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by frl1412a on 24/10/2017.
 */
public class MySimpleStack implements SimpleStack {

    private List<Item> items = new ArrayList<Item>();


    public MySimpleStack() {
    }

    public boolean isEmpty() {
        return (items.isEmpty());
    }

    public int getSize() {
        return this.items.size();
    }

    public void push(Item item) {
        this.items.add(0, item);
    }

    public Item peek() throws EmptyStackException {
        if (this.items.isEmpty()){
            throw new EmptyStackException();
        }
        return this.items.get(0);
    }

    public Item pop() throws EmptyStackException {
        if (this.items.isEmpty()){
            throw new EmptyStackException();
        }
        Item toReturn = peek();
        this.items.remove(0);
        return toReturn;
    }
}
