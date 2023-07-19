package test;

import impl.ArrayImpl;
import impl.LinkedListImpl;
import list.Queue;
import list.Stack;

import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) {
        Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());

        arrayQueue.enQueue("aaa");
        arrayQueue.enQueue("bbb");
        arrayQueue.enQueue("ccc");
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());

        Stack<String> stackLinkedList = new Stack<String>(new LinkedListImpl<String>());
    }
}
