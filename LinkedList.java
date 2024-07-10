import org.w3c.dom.Node;

class LinkedList{
/**
 * Node
 */
private Node head;
public class Node {
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null; 
        }
    }
    //addfirst
    public void addfirst(String data){
        Node newNode= new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
        
    }
    //addlast
    public void addlast(String data){
        Node newnode= new Node(data);
        if (head==null) {
            head=newnode;
            return;
        }
        Node cn = head;
        while (cn.next!=null) {
            cn=cn.next;
        }
        cn.next=newnode;
    }
    
    //delete first
    public void deletefirst(){
        head= head.next;
        return;
    }
    //deletelast
    public void deletelast(){
        if (head==null) {
            System.out.println("list is empty");
        }
        if (head.next==null) {
            head=null;
            return;
        }
        Node slast= head;
        Node last= head.next;
        while (last.next!=null) {
            last=last.next;
            slast= slast.next;
            
        }
        slast.next=null;
        
    }

    //print
    public void printlist(){
        Node cn= head;
        while (cn!=null) {
            System.out.print(cn.data+" --> ");
            cn=cn.next;
        }
        System.out.println("Null");
    }




    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.addfirst("a");
        list.printlist();//--------------1  a-->null
        list.addlast("b");
        list.printlist();//----------------2   a-->b-->null
        list.addfirst("c");
        list.addfirst("j");
        list.printlist();//----------------3   jcab null
        list.deletefirst();
        list.printlist();//--------------4   cab null
        list.deletelast();
        list.printlist();//------------5     ca null
    }
}