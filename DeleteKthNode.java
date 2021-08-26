package listdeletekthnode;
class ListNode<T>{
    T data;
    ListNode next;
    
    ListNode(T ob1, ListNode ob2)
    {
    this.data = ob1;
    this.next = ob2;
    }
}

public class DeleteKthNode {
	public static void main(String aa[])
	{
		ListNode<Integer> head=null;
		
		ListNode<Integer> newnode1 = new ListNode<>(5, null);
		
		ListNode<Integer> newnode2 = new ListNode<>(50, null);
		ListNode<Integer> newnode3 = new ListNode<>(2, null);
		ListNode<Integer> newnode4 = new ListNode<>(8, null);
		ListNode<Integer> newnode5 = new ListNode<>(54, null);
		ListNode<Integer> newnode6 = new ListNode<>(25, null);
		ListNode<Integer> newnode7 = new ListNode<>(22, null);
		head = insert(head,newnode1 );
		head = insert(head,newnode2 );
		head = insert(head,newnode3 );
		head = insert(head,newnode4 );
		head = insert(head,newnode5 );
		head = insert(head,newnode6 );
		head = insert(head,newnode7 );
		
		ListNode<Integer> p1 = head;
		System.out.println("Before Deletion");
		while(p1!=null)
		{
		System.out.println(p1.data);
		p1 = p1.next;
		}
		
		ListNode<Integer> p2 =removeKthLast(head, 5);
		System.out.println("After Deletion");
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

	// Assumes L has at least k nodes, deletes the k-th last node in L.
	public static ListNode<Integer> removeKthLast(ListNode <Integer> L, int k) {
	ListNode <Integer> dummyHead = new ListNode<>(0, L);
	ListNode <Integer> first = dummyHead.next ;
	//System.out.println(dummyHead.data);
	while (k-- > 0) {
	first = first.next;
	}
	ListNode <Integer > second = dummyHead;
	while (first != null) {
	second  = second. next;
	first = first. next;
	}
	// second points to the (k + l)-th last node, deletes its successor.
	second.next = second.next.next ;
	return dummyHead.next ;
	}


}
