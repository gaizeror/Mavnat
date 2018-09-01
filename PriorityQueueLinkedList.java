package com.company;

public class PriorityQueueLinkedList <type extends Comparable<type>> {
    private LinkedList queue;

    public PriorityQueueLinkedList(){
        this.queue = new LinkedList();
    }
    public type dequeue(){
        return (type) this.queue.delete();
    }
    public void enqueue(type value){
        Node<type> to_insert = new Node(value);
        if (this.queue.getHead() == null)
        {
            this.queue.insert(value);
        }
        else{
            Node iterator = locateNode(to_insert);
            this.queue.insert(iterator, value);
        }
    }
    private Node locateNode(Node to_insert){ // Find after which node to insert the object
        Node iterator = this.queue.getHead();
        while(iterator.getNext_Node() != null && iterator.getNext_Node().get_bigger(to_insert) == 0 && iterator.getNext_Node() != this.queue.getHead())
        {
            iterator = iterator.getNext_Node();
        }
        return iterator;
    }
    public String toString()
    {
        Node it = this.queue.getHead();
        String output = "";
        while(it != this.queue.getLast()){
            output += it.getItem().toString();
            it = it.getNext_Node();
        }
        return output;
    }
    public boolean isEmpty(){
        if(this.queue.getHead() == null){
            return true;
        }
        return false;
    }
}
