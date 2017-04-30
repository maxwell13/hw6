/**
 *
 * @author zumrut
 */
public class wordTree {

     private BSTNode root;
    
 
     public wordTree()
     {
         root = null;
     }

     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void setRoot(String info){
         root = new BSTNode(info);
     }
     
     public BSTNode getRoot(){
         return root;
     }
 
     public void insert(String info)
     {
        insert(root, info);
     }

     private void insert(BSTNode node, String info)
     {
    
       if(0 ==info.compareTo(node.info) )
       {
         node.count++;
         return;
       }
       else
     {
       if(0 >=info.compareTo(node.info) )
       {if(node.left!=null)
         {insert(node.left, info);}
           else 
             {node.left= new BSTNode(info);
              node.count++;}
       }
       else 
       {if(node.right!=null)
         {insert(node.right, info);}
           else 
             {node.right= new BSTNode(info);
              node.count++;}
          
     }
       }
     
     }
     

     public void inorder()
     {
         inorder(root);
     }
  
     private void inorder(BSTNode r)
     {
       if(r!=null)
       {inorder(r.left);
         System.out.println(r.info + "  " + r.count);
         inorder(r.right);
     }
     }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        wordTree bstInstance = new wordTree();  
        bstInstance.setRoot("");
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root data " + bstInstance.getRoot().getData());
        bstInstance.insert("this");
        bstInstance.insert("sentence");
        bstInstance.insert("repeats");
        bstInstance.insert("words");
        bstInstance.insert("because");
        bstInstance.insert("a");
        bstInstance.insert("sentence");                     
        bstInstance.insert("that");                      
        bstInstance.insert("repeats");
        bstInstance.insert("words");    
        bstInstance.insert("makes");      
        bstInstance.insert("a");                     
        bstInstance.insert("good");
        bstInstance.insert("example");      
        bstInstance.insert("sentence");                    
        System.out.println("Traversing tree in order");
        bstInstance.inorder();
        System.out.println();
    }
    
}
