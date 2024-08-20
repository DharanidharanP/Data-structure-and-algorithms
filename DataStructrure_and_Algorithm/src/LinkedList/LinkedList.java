package LinkedList;

public class LinkedList {
	  Node head;
	public void insert(int data) {
		System.out.println("data..="+data);
		Node node = new Node();
		node.data = data;
		node.next = null;
		System.out.println(" current  head.... = "+head);
		if (head == null) {
			System.out.println(" head is null below it will assign  .....");
			System.out.println(" current node... = "+node );
			head = node;
			System.out.println(" after current node assign to head.... = "+head);
		} else {
			System.out.println(" head...= "+head);
			Node n = head;
			System.out.println(" after head assign to  n...... = "+n);
			System.out.println(" For checking current n.next ="+n.next);
			while (n.next != null) {
				System.out.println(" while iterate");
				n = n.next;
			}
			  System.out.println(" @@@@@@ current node...... = "+node);
		      n.next = node;
		      System.out.println("  $$$$$ here n is assing by current node ....... ="+n.next);
		      
		}
	}
     public void insertAtStart(int data ) {
    	 
    	Node node = new Node();
 		node.data = data;
 		node.next=head;
 		head=node;
     }
     public void insertAtInbetween(int index,int data ) {
    	 
     	Node node = new Node();
  		node.data = data;
  		node.next=null;
  		Node n=head;
  		for(int i=0;i<index-1;i++) {
  			n=n.next;
  		}
  		node.next=n.next;
  		n.next=node;
  				
      }
	public void show() {
       Node node=head;
        System.out.println(" finally show method node "+node.toString() );
       while (node.next != null) {
    	   System.out.println(node.data);
    	   node = node .next;
		}
       System.out.println(node.data);
	}
}
