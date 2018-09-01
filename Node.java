package com.company;


public class Node <type extends Comparable<type>> {
    private type item;
    private Node next_Node;
    private Node previous_Node;

    public Node(){
        this.item = null;
        this.next_Node = null;
        this.previous_Node = null;
    }
    public Node(type recived_item){
        this.item = recived_item;
    }
    public type getItem(){
        return this.item;
    }
    public void setItem(type to_set){
        this.item = to_set;
    }
    protected Node getNext_Node(){
        return this.next_Node;
    }
    protected void setNext_Node(Node next_Node)
    {
        this.next_Node = next_Node;
    }

    public Node getPrevious_Node() {
        return previous_Node;
    }

    public void setPrevious_Node(Node previous_Node) {
        this.previous_Node = previous_Node;
    }
    public int get_bigger(Node<type> secondNode){
        int bigger = this.item.compareTo(secondNode.item);
        if (bigger < 0){
            return 2;
        }
        else if (bigger == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
