package com.company;

public class BinaryTree<type extends Comparable<type>> {
    private BinaryTreeNode head;

    public BinaryTree(){
        this.head = null;
    }

    public void setHead(BinaryTreeNode head) {
        this.head = head;
    }

    public BinaryTreeNode getHead() {
        return head;
    }
    public boolean isEmpty()
    {
        if (this.getHead() == null)
            return true;
        return false;
    }

}
