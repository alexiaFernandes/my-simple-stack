package deqo.afer.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by frl1412a on 24/10/2017.
 */
public class MySimpleStackTest {
    private SimpleStack stack;
    Item newItem ;
    @Before
    public void setUp() throws Exception {
        stack = new MySimpleStack();
        newItem = new Item(1);
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(stack.isEmpty(),is(Boolean.TRUE));
    }

    @Test
    public void isNotEmpty() throws Exception {
        this.stack.push(newItem);
        assertThat(stack.isEmpty(),is(Boolean.FALSE));
    }

    @Test
    public void getSizeStack() throws Exception {
        assertThat(this.stack.getSize(), is(0));
        this.stack.push(new Item(1));
        this.stack.push(new Item(2));
        this.stack.push(new Item(3));
        assertThat(this.stack.getSize(), is(3));
    }

    @Test
    public void push() throws Exception {
        this.stack.push(newItem);
        assertThat(stack.peek(),sameInstance(newItem));
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() throws Exception {
        this.stack.peek();
    }

    @Test
    public void peekNotEmpty(){
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);
        this.stack.push(item1);
        this.stack.push(item2);
        this.stack.push(item3);
        assertThat(this.stack.peek(), sameInstance(item3));
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() throws Exception {
        this.stack.pop();
    }

    @Test
    public void popNotEmpty() throws Exception {
        //Given
        this.stack.push(newItem);
        //when
        Item popItem = stack.pop();
        //then
        assertThat(popItem, sameInstance(newItem));
        //and
        assertThat(this.stack.isEmpty(),is(true));
    }
}