package com.company;

public class Main {

    public static void main(String[] args)
    {
        PriorityQueueLinkedList<Integer> ql = new PriorityQueueLinkedList();
        PriorityQueueBinTree<Integer> queueBinTree = new PriorityQueueBinTree();
        System.out.println("Inserting random numbers:");
        for (int i = 0; i < 50; i++) {
            int to_insert = (int) (Math.random() * 9 + 1);
            System.out.print(to_insert + ",");
            ql.enqueue(to_insert);
            queueBinTree.enqueue(to_insert);

        }
        System.out.println("\nPriority queue over linked list:");
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
