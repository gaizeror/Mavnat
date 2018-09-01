package com.company;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args)
    {
        PriorityQueueLinkedList<Integer> ql = new PriorityQueueLinkedList<Integer>();
        PriorityQueueBinTree<Integer> queueBinTree = new PriorityQueueBinTree<Integer>();

        for (int i = 0; i < 50; i++) {
            int to_insert = (int) (Math.random() * 999 + 1);
            System.out.print(to_insert + ",");
            ql.enqueue(to_insert);
            queueBinTree.enqueue(to_insert);

        }
        System.out.println("Priority queue over linked list:");
        while (!ql.isEmpty()){
            System.out.print(ql.dequeue() + " , ");
        }



        ///////////////////////////////////

        System.out.println("\nPriority queue over Binary Tree:");
        while (!queueBinTree.isEmpty())
        {
            System.out.print(queueBinTree.dequeue() + " , ");
        }
    }



}
