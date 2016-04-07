public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.display();

        /**************1. Detect and Remove Cycle********************/
        /*l.head.next.next.next = l.head;
        if (l.isCycle()){
            System.out.println("Cycle at"+l.detectCycle().val);
        }*/

        /**************2. Reverse ********************/
        //2.Reverse
        l.reverse();
        l.display();

        /**************3. Reverse Between ********************/
        l.reverseBetween(1,2);
        l.display();

    }
}
