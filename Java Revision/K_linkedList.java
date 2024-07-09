class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }

}

class customLinkedList{
    node head;
    node currentNode;

    public void add(int data){
        if(head==null){
            head=new node(data);
            currentNode=head;
        }
        else{
            node newnode=new node(data);
            currentNode.next=newnode;
            currentNode=newnode;
        }
    }

    public void view(){
        node travelNode=head;

        while(travelNode!=null){
            System.out.print(travelNode.data +" => ") ;
            travelNode=travelNode.next;
        }
    }

}



public class K_linkedList {
    // so this is just for a temporary practice. I dont think we have to make a custom linked list for whatever reason

   public static void main(String[] args) {
    customLinkedList list=new customLinkedList();
    list.add(5);
    list.add(10);
    list.add(15);

    list.view();
   }


}
