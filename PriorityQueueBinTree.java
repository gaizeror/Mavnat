package com.company;

public class PriorityQueueBinTree<type extends Comparable<type>> {
    private BinaryTree<type> tree;

    public PriorityQueueBinTree()
    {
        this.tree = new BinaryTree<type>();
    }
    public void enqueue(type value){
        BinaryTreeNode tmp = new BinaryTreeNode(value);
        if(this.tree.getHead() == null){
            this.tree.setHead(tmp);
        }
        else{
            BinaryTreeNode iterator = this.tree.getHead();
            enqueue(iterator, tmp);
        }

    }
    private void enqueue(BinaryTreeNode iterator, BinaryTreeNode to_insert)
    {
        if(iterator.compareTo(to_insert) != 2){ //smaller or equals
            if (iterator.getLeft() == null){
                iterator.setLeft(to_insert);
            }
            else if(iterator.getLeft().compareTo(to_insert) == 0) // smaller than left node
            {
                enqueue(iterator.getLeft(), to_insert);
            }
            else //equals or bigger than left node
            {
                to_insert.setLeft(iterator.getLeft());
                iterator.setLeft(to_insert);
            }
        }
        else
        {
            if (iterator.getRight() == null){
                iterator.setRight(to_insert);
            }
            else{
                if(iterator.getRight().compareTo(to_insert) == 0) //between 2 nodes
                {
                    to_insert.setRight(iterator.getRight());
                    iterator.setRight(to_insert);
                }
                else
                {
                    enqueue(iterator.getRight(), to_insert);
                }
            }
        }
    }

    public type dequeue()
    {
        if (this.isEmpty()) // If empty
        {
            return null;
        }
        else if(this.tree.getHead().getLeft() == null && this.tree.getHead().getRight() == null) // if single node tree
        {
            BinaryTreeNode to_return = this.tree.getHead();
            this.tree.setHead(null);
            return (type) to_return.getValue();
        }

        BinaryTreeNode iterator = this.tree.getHead();
        return (type) dequeue(iterator).getValue();
    }
    private BinaryTreeNode dequeue(BinaryTreeNode iterator)
    {
        if (iterator.getLeft() == null && iterator.getRight() == null) { //If no children
            return iterator;
        }

        else if (iterator.getRight() != null ) // if not the largest
        {
            if (iterator.getRight().getRight() != null) { // if child not the largest
                return dequeue(iterator.getRight());
            }
            else // if child the largest
            {
                BinaryTreeNode to_return = iterator.getRight();
                iterator.setRight(null);
                return to_return;
            }
        }
        else // if the largerst
        {
            BinaryTreeNode to_return = this.tree.getHead();
            this.tree.setHead(this.tree.getHead().getLeft());
            to_return.setLeft(null);
            return to_return;
        }

    }
    public boolean isEmpty()
    {
        return this.tree.isEmpty();
    }

}
