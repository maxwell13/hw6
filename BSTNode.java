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

    public BSTNode(String n)
    {
        left = null;
        right = null;
        info = n;
    }

    public void setLeft(BSTNode n)
    {
        left = n;
    }

    public void setRight(BSTNode n)
    {
        right = n;
    }

    public BSTNode getLeft()
    {
        return left;
    }

    public BSTNode getRight()
    {
        return right;
    }

    public void setData(String d)
    {
        info = d;
    }

    public String getData()
    {
        return info;
    }     

}