package com.company;

public class LinkedList <type extends Comparable<type>> {
    private Node head;
    private Node last;

    public LinkedList() {
        this.head = null;
        this.last = null;
    }

    public Node getHead() {
        return head;
    }

    public void setLast(Node last) {
        this.last = last;

    }

    public Node getLast() {
        return last;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(type to_insert_value) {
        Node to_insert = new Node(to_insert_value);
        if (this.head == null) {
            this.head = to_insert;
            this.last = to_insert;
        }
        else{
            this.head.setPrevious_Node(to_insert);
            to_insert.setNext_Node(this.head);
            this.head = to_insert;
        }
    }

    public void insert(Node index, type to_insert_raw)
    {
        Node to_insert = new Node(to_insert_raw);
        if(index == this.getHead() && this.getHead().get_bigger(to_insert) == 2)
        {
            this.getHead().setPrevious_Node(to_insert);
            to_insert.setNext_Node(this.getHead());
            this.setHead(to_insert);
            this.getLast().setNext_Node(this.getHead());
            this.getHead().setPrevious_Node(this.getLast());
         }
        else if(index != this.getLast()){
            to_insert.setNext_Node(index.getNext_Node());
            to_insert.setPrevious_Node(index);
            index.setNext_Node(to_insert);
            to_insert.getNext_Node().setPrevious_Node(to_insert);
        }

        else{
            this.getLast().setNext_Node(to_insert);
            to_insert.setPrevious_Node(this.getLast());
            this.setLast(to_insert);
            this.getLast().setNext_Node(this.getHead());
            this.getHead().setPrevious_Node(this.getLast());
        }
    }
    public type delete(){
        if(this.getHead() == null)
        {
            return null;
        }
        else {
            type to_return = (type) this.getHead().getItem();
            if (this.getHead() == this.getLast()) {
                this.setHead(null);
                this.setLast(null);
            }
            else {
                this.setHead(this.getHead().getNext_Node());
                if (this.getHead().getNext_Node() == this.getHead().getPrevious_Node())
                {

                    this.getHead().setPrevious_Node(null);
                    this.getHead().setNext_Node(null);
                }
                else{
                    this.getHead().setPrevious_Node(this.getLast());
                    this.getLast().setNext_Node(this.getHead());
                }
            }
            return to_return;
        }
    }
}
