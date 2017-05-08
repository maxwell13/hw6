public class BSTNode {
    BSTNode left, right;
    String info;
    int count;
 

    public BSTNode()
    {
        left = null;
        right = null;
        info = null;
    }

    //takes in a string and makes it a node 
    public BSTNode(String n)
    {
        left = null;
        right = null;
        info = n;
    }

    //sets the value of the left node
    public void setLeft(BSTNode n)
    {
        left = n;
    }

    //sets the value of the left node
    public void setRight(BSTNode n)
    {
        right = n;
    }

    //gets the value of the left node 
    public BSTNode getLeft()
    {
        return left;
    }

    //gets the value of the right node 
    public BSTNode getRight()
    {
        return right;
    }

    // sets the value of the nod
    public void setData(String d)
    {
        info = d;
    }

    public String getData()
    {
        return info;
    }     

}