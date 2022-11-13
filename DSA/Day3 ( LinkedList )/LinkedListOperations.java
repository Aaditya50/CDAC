public class LinkedListOperations {
	
	public static class Node {
        int data = 0;
        Node next = null;
        
        Node(){}
        Node (int data) {   
            this.data = data;
        }
        Node (int data, Node next) {  
            this.data = data;
            this.next = next;
        }
    }



    public static Node head = null; 
    public static Node tail = null;


    public static void addStart(int data) {
        Node newNode = new Node(data);   
        if ( head == null ) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addLast(int data){
        Node node = new Node(data);
        Node curr = head;
        if(head == null) {
            head = node;
            return;
        }  
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next = node;
        
    }

    public static void addAtindex(int data,int k){
        Node node = new Node(data);
        if(k==0) addStart(data);
        Node curr = head;
        k--;
        while(k!=0){
            curr = curr.next;
            k--;
        }
        Node dummy = curr.next;
        curr.next = node;
        node.next = dummy;

    }

    public static void addAtindexbyfor(int data,int k){
        Node node = new Node(data);
        if(k==0){
            addStart(data);
            return;
        }
        Node curr = head;
        
        for(int i=k-1;i>0;i--){
            curr=curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }
    public static void display(){
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.data+" ");
        }
        System.out.println();
    }

    public static void minmax(){
        Node curr = head;
        int min=head.data;
        int max=head.data;
        if(head == null) return;
        while(curr != null){
            if(min>curr.data){ 
                min=curr.data ;
            }
            if(max<curr.data){
                max = curr.data;
            }
            curr = curr.next;
            
        }
        System.out.println("Minimum:== "+min+" ");
        System.out.println("Maximum:== "+max+" ");
    }

    public static void deleteAtFirst(){
        if(head == null) return;
        //Node curr = head;
        System.out.println("Deleted Node At first = "+head.data);
        head = head.next;
    }

    public static void deleteAtLast(){
        if(head == null) return;
        Node curr = head;
        Node dummy = head.next;
        while(dummy.next != null){
            dummy = dummy.next;
            curr = curr.next;
        }
        System.out.println("Deleted Node from last is := "+curr.next.data);
        curr.next = null;

    }

    public static void deleteAtIndex(int k){
        if(head == null) return;
        Node curr = head;
        Node dummy = head.next;
        int m=k;
        k--;
        while(k != 0){
            dummy = dummy.next;
            curr = curr.next;
            k--;
        }
        System.out.println("Deleted Node At index "+ m +" is := "+curr.next.data);
        curr.next = dummy.next;


    }

    public static void main(String[] args) {
        addStart(10);
        addStart(20);
        addStart(30);
        addStart(40);
        addStart(50);
        addLast(60);
        addAtindex(70,3);
        
        // addAtindexbyfor(80,2);

        // minmax();
        // deleteAtFirst();
        // deleteAtLast(); 
        // deleteAtIndex(2);
        display();
        
        
    }
}




/*


Pending:


// linkedlist flow 

Done 
 Node data next head


class product{
    int productid;
    String name;
}

@override

class Node{
    int data=0;
    Node next=null;

    Node(){}

    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.next = next;
        this.data = data;
    }
}


addlast(10);
addlast(20);

123456789 
null 



Node curr = new Node();
System.out.println(curr.data);
curr.data = data ;


Node curr2 = new Node(20);
823783456 

curr.next = curr2;



temp = {data = 10 next = 823783456} , 
{data = 20 next = 98234673245},
{data = 30 next = null}



Node temp = head;
while(temp.next !=null){
    temp = temp.next;
}
temp.next = new node(10)





Node head=null;
(head==null) head.data = data;



Node head;



























*/