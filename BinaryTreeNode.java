package com.company;

public class BinaryTreeNode <type extends Comparable<type>>{
    type value;
    BinaryTreeNode right;
    BinaryTreeNode left;

    public BinaryTreeNode(type value){
        this.value = value;
        this.right=null;
        this.left=null;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public type getValue() {
        return value;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public void setValue(type value) {
        this.value = value;
    }

    public int compareTo(BinaryTreeNode<type> other) {
        int bigger = this.value.compareTo(other.value);
        if(bigger < 0){
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

