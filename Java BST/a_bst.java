



class node{
    int data;
    node left;
    node right;

   node(int data){
    this.left=null;
    this.right=null;
    this.data=data;
   }
}

class BST{
    node root;

    public node createNode(int data){
        node newnode=new node(data);
        return newnode;
    }

    public void addNode(int data){
        if(root==null){
            root=createNode(data);
        }
        else{
            node currentNode=root;
            node prevNode=root;
            while(currentNode!=null){
                if(data>=currentNode.data){
                    prevNode=currentNode;
                    currentNode=currentNode.right;
                }else{
                    prevNode=currentNode;
                    currentNode=currentNode.left;
                }
            }
            currentNode=createNode(data);
            if(data>prevNode.data){
                prevNode.right=currentNode;
            }
            else{
                prevNode.left=currentNode;
            }
        }
    }
   
    public void Inorder(node root){
     
        if(root != null){
            Inorder(root.left);
            System.out.print(root.data + " => ");
            Inorder(root.right);
        }
    
    }

}


public class a_bst {
    public static void main(String[] args) {
        BST tree=new BST();
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(20);
        tree.addNode(60);
        tree.addNode(55);
        tree.addNode(58);
        tree.addNode(40);
        tree.addNode(35);
        tree.addNode(45);
        tree.addNode(10);
        tree.addNode(15);
        tree.addNode(80);
        tree.addNode(70);
        tree.addNode(77);
        tree.addNode(90);

        System.out.println("\n\n");
        tree.Inorder(tree.root);
        System.out.println("\n\n");
    }
}
