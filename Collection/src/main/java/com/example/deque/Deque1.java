package com.example.deque;

import java.util.*;

/**
 * Created by Loon on 2014/4/23.
 * 双向队列
 * @link http://www.stanford.edu/group/coursework/docsTech/jgl/api/com.objectspace.jgl.examples.DequeExamples.html
 */
public class Deque1 {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.addLast("bat");
        deque.add("cat");
        deque.addFirst("ape");
        System.out.println(deque);
        System.out.println();

        System.out.println("Enumerate the Deque");
        Enumeration<String> e = Collections.enumeration(deque);
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
        System.out.println();

        System.out.println("Iterate through the Deque");
        for (Iterator<String> iter = deque.descendingIterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
        System.out.println();


        System.out.println("Demonstrate access");
        System.out.println("deque.getFirst() = " + deque.getFirst());
        System.out.println("find if element exists in deque " + deque.contains("ape"));
        System.out.println("find  element  in deque " + deque.contains("ape1"));
        System.out.println("deque.element() = " + deque.element());
        System.out.println("deque.getLast() = " + deque.getLast());
        System.out.println();

        System.out.println("Demonstrate modification");
        deque.push("fox");
        System.out.println(deque);

        deque.removeFirst();
        System.out.println("After popFront() = " + deque);

        deque.removeLast();
        System.out.println("After popBack() = " + deque);
    }
}
