    import java.io.File;
import java.util.Scanner;

public class wordTree {

     private BSTNode root;

     //Constructor 
     public wordTree()
     {
         root = null;
     }
    
     // returns true if the root is null
     public boolean isEmpty()
     {
         return root == null;
     }
     
     //sets the root and increments the counter for root
     public void setRoot(String infoUpper){
        String info= infoUpper.toLowerCase();
         root = new BSTNode(info);
           root.count=1;
     }
     
     //deletes a node from this list and reinserts its children
     public void delete(String info)
     {      
     BSTNode temp=search(info);
     BSTNode p=findParent(info);
     System.out.print(temp.info);
     System.out.print(p.info);
     if(0==info.compareTo(p.left.info))
     {//System.out.println("left parent");
       if(p.left.count==1)
       {p.left=null;
       insertInorder(temp.left); 
       insertInorder(temp.right);}
       else{p.left.count--;}
     }
      else
    {//System.out.print("right parent");
         if(p.right.count==1)   
         {  p.left=null;
       insertInorder(temp.left); 
       insertInorder(temp.right);}
      else{p.right.count--;}
     }
     }
     

     //finds the parent of a certain node
      public BSTNode findParent(String info)
     {
       return findParent(root,info);
    
     }
     
   
     
    
     //finds the parent of a certain node
     public BSTNode findParent(BSTNode p, String info)
     {
       if(p!=null)
       {
       if((p.left!=null && 0==info.compareTo(p.left.info)) || (p.right!=null && 0==info.compareTo(p.right.info)))
       {return p;}
       else
       {if(p.left!=null && 0 >=info.compareTo(p.info))
         {return findParent(p.left,info);}
       else
       {return findParent(p.right,info);}
       }
       }
       else
       {return null;}
     }
 
     
     
     
     
     //finds a certain node and returns it 
     public BSTNode search(String info)
     {
     //  System.out.println("ROOT: " + root.info);
       return search(root,info);
    
     }
     
   
     
       
     //finds a certain node and returns it 
     public BSTNode search(BSTNode r, String info)
     {
  
       if(r!=null)
       {     //System.out.println("R: " + r.info + " looking for " + info);
       if(0==info.compareTo(r.info) )
         { System.out.println("node with " +  info + " found");
         return(r);
         }
       else
       { if(r.left!=null && 0 >=info.compareTo(r.info))
         {
         return(search(r.left, info));}
       else
       {if(r.right!=null)
         {return(search(r.right, info));}
       else
       { return null;}
       }
       }
       }
       else
       {//System.out.println("Max is fat");
         return null;}
     }
       
     //gets the root 
     public BSTNode getRoot(){
   
       return root;
     }
 
     //inserts the string into the list as a node
     public void insert(String infoUpper)
     { 
      String info= infoUpper.toLowerCase();
       if(root==null)
       {BSTNode temp = new BSTNode(info);
        root=temp;
     root.count++;}
     else 
        insert(root, info);
     }

     
     //inserts the string into the list as a node
     private void insert(BSTNode node, String infoUpper)
     {
       String info= infoUpper.toLowerCase();
       
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
              node.left.count++;}
       }
       else 
       {if(node.right!=null)
         {insert(node.right, info);}
           else 
             {node.right= new BSTNode(info);
              node.right.count++;}
          
     }
       }
     
     }
     
    //prints the list in order 
     public void inorder()
     {
         inorder(root);
     }
  
         //prints the list in order 
     private void inorder(BSTNode r)
     {
       if(r!=null)
       {inorder(r.left);
         System.out.println(r.info + "  " + r.count);
         inorder(r.right);
     }
     }
          private void insertInorder(BSTNode r)
     {
       if(r!=null)
       {insertInorder(r.left);
        insert(r.info);
         insertInorder(r.right);
     }
     }


 
//Main
    public static void main(String[] args) {
      
         wordTree bstInstance = new wordTree();  

        
        
         try {
            System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);
            File file = new File(input.nextLine());
            

            input = new Scanner(file);

             String line = input.nextLine();
            String s = line;
 String[] arr = s.split(" ");    

 for ( String ss : arr) {

       bstInstance.insert(ss);
      //System.out.println(ss);
  }
 input.close();

        } catch (Exception ex) {
           //ex.printStackTrace();
        }
      
     

     System.out.println(bstInstance.search("makes"));
     System.out.println(bstInstance.search("makes").info);
     System.out.println("---------------------------------");
        bstInstance.inorder();
        System.out.println("---------------------------------");
        bstInstance.delete("a");
        System.out.println();
        bstInstance.delete("repeats");
        bstInstance.delete("repeats");
        System.out.println();
        bstInstance.inorder();
    }
    
}
