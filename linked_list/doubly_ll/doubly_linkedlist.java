package linked_list.doubly_ll;

public class doubly_linkedlist {
    Node head;
	Node tail;
	//insert last
	public void insertlast(int value) {
		Node node=new Node(value);
		if(tail==null) {
			head=node;
			tail=node;
		}else {
		tail.next=node;
		node.prev=tail;
		
		tail=node;
		}
	
	}
	//insert at particular index
	public void atindex(int index,int value) {
		Node node=new Node( value);
		Node prev=head;
		for(int i=1;i<index-1;i++) {
			prev=prev.next;
		}
		node.next=prev.next;
		node.prev=prev;
		prev.next=node;
		
		
		
	}
    	//deletion
	public void delatindex(int index) {
		if(index==0) {
			if(head!=null) {
				head=head.next;
				if(head!=null) {
				head.prev=null;
				}
			}
			return ;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
		
	}
	
	
	//display
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
		System.out.println("END");

	}
	//display reverse
	public void displayreverse() {
		Node last=tail;
		while(last!=null) {
			System.out.println(last.value);
			last=last.prev;
		}
		
	}
	
	
	
	 public class Node{
		 int value;
		 Node prev;
		 Node next;
		public Node(int value) {
			this.value = value;
		}
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_ll_practice list= new doubly_ll_practice();
		list.insertlast(78);
		list.insertlast(178);
		list.insertlast(278);
		list.insertlast(378);
		list.insertlast(478);
		list.display();
		System.out.println("jkh");
		list.atindex(2, 10);
		list.display();
		list.displayreverse();

	}

}
