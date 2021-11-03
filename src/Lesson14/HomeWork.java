package Lesson14;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class HomeWork {
    public static void main(String[] args) {

        TreeSet<String> treeSet0 = new TreeSet<String>(); // Simple TreeSet
        treeSet0.add("red");
        treeSet0.add("green");
        treeSet0.add("black");
        treeSet0.add("yellow");
        treeSet0.add("blue");
        System.out.println("TreeSet: " + treeSet0);
        System.out.println();

        for (String treeSetElement : treeSet0) { // Iterator for elements in Tree set.
            System.out.println(treeSetElement);
        }
        System.out.println();

        TreeSet<String> treeSet1 = new TreeSet<String>();
        treeSet1.add("Apple");
        treeSet1.add("Orange");
        treeSet1.add("Banana");
        System.out.println("Tree set1: " + treeSet1);
        System.out.println();

        treeSet0.addAll(treeSet1);
        System.out.println("Combined Treesets 0 & 1: " + treeSet0);
        System.out.println();

       Iterator iterator = treeSet0.descendingIterator(); // Iterator that provides values in descending order, from last to first.
        System.out.println("Elements in reverse order: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        Object firstElement = treeSet0.first(); // Find first and last element
        Object lastElement =treeSet0.last();
        System.out.println("First and last elements: " + firstElement + ", " + lastElement);
        System.out.println();

        PriorityQueue<String> queue = new PriorityQueue<String>(); // Ne ponyal kak rabotaet, but very interesting
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        System.out.println(queue);
        System.out.println();

        for (String queueIterator : queue){ // Iterate through priority queue
            System.out.println(queueIterator);
        }
        System.out.println();

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("1");
        queue1.add("2");
        queue1.add("45");
        queue1.add("3");
        queue1.add("27");
        System.out.println("New queue: " + queue1);

        queue.addAll(queue1);
        System.out.println("Queue with added new queue: " + queue);

        queue.removeAll(queue);
        System.out.println("Removed everything from the queue: " + queue);
    }

}
