package listpivorting;
class ListNode<T>{
    T data;
    ListNode next;
    
    ListNode(T ob1, ListNode ob2)
    {
    this.data = ob1;
    this.next = ob2;
    }
}
public class Pivorting {
	
	public static void main(String aa[])
	{
		ListNode<Integer> head=null;
		
		ListNode<Integer> newnode1 = new ListNode<>(5, null);
		
		ListNode<Integer> newnode2 = new ListNode<>(3, null);
		ListNode<Integer> newnode3 = new ListNode<>(8, null);
		ListNode<Integer> newnode4 = new ListNode<>(10, null);
		ListNode<Integer> newnode5 = new ListNode<>(7, null);
		ListNode<Integer> newnode6 = new ListNode<>(3, null);
		ListNode<Integer> newnode7 = new ListNode<>(5, null);
		head = insert(head,newnode1 );
		head = insert(head,newnode2 );
		head = insert(head,newnode3 );
		head = insert(head,newnode4 );
		head = insert(head,newnode5 );
		head = insert(head,newnode6 );
		head = insert(head,newnode7 );
		
		ListNode<Integer> p1 = head;
		System.out.println("List is");
		while(p1!=null)
		{
		System.out.println(p1.data);
		p1 = p1.next;
		}
		
		
		ListNode<Integer> p2 = listPivoting(head, 7);
		System.out.println("List is");
		while(p2!=null)
		{
		System.out.println(p2.data);
		p2 = p2.next;
		}
		
			
	}
	static ListNode<Integer> insert(ListNode<Integer> head, ListNode<Integer> newnode)
	{
	if (head==null){
		head = newnode;
		}
		else
		{
			ListNode<Integer> p = head;
			while(p.next !=null)
			p = p.next;
		        
		        p.next = newnode; 
		
		}
	return head;
	}

	public static ListNode<Integer> listPivoting (ListNode <Integer > L, int x) {
	ListNode<Integer > lessHead = new ListNode <> (0 , null);
	ListNode<Integer > equalHead = new ListNode <> (0 , null);
	ListNode<Integer > greaterHead = new ListNode <> (0 , null);
	ListNode <Integer> lessIter = lessHead;
	ListNode <Integer> equalIter = equalHead;
	ListNode <Integer> greaterIter = greaterHead;
	// Populates the three lists.
	ListNode <Integer> iter = L;
	while (iter != null) {
	if (iter.data < x) {
	lessIter.next = iter;
	lessIter = iter;
	} else if (iter. data == x) {
	equalIter.next =iter;
	equalIter = iter;
	} else { // iter . data > x.
	greaterIter.next = iter;
	greaterIter = iter;
	}
	iter = iter.next;
	}

	// Combines the three lists.
	greaterIter.next = null;
	equalIter.next = greaterHead.next ;


	lessIter.next = equalHead.next ;
	return lessHead.next ;
	}

}
