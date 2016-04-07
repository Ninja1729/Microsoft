/**
 * Created by Niranjana on 06-04-2016.
 */
public class LinkedList {
    ListNode head;

    public ListNode insert(int num){

        if (head == null){
            head = new ListNode(num);
        }else{
            ListNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new ListNode(num);
        }
        return head;
    }

    public void display(){
        ListNode curr = head;

        while (curr!= null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println("");

    }
    public boolean isCycle(){
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while (ptr2.next != null && ptr2 != null){

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if (ptr1 == ptr2){
                return true;
            }

        }
        return false;
    }

    public ListNode detectCycle() {

        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while (ptr2.next != null && ptr2 != null){

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if (ptr1 == ptr2){
                return ptr1;
            }
        }
        return  null;
    }

    public void reverse(){

        if (head == null) return;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public ListNode reverseBetween(int m, int n) {
        if (head == null) return null;
        if(head.next == null) return head;
        int num = 1;
        ListNode curr = head;
        ListNode prev = null;
        while ( num != m){
            prev = curr;
            curr = curr.next;
            num++;
        }
        ListNode curr1 = curr;
        ListNode prev1 = null;
        while (num != n+1){
            ListNode temp = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = temp;
            num++;
        }
        prev.next = prev1;
        curr.next = curr1;




        return head;
    }

}
