package basic.day3;

public class LInkedList {


    public static void main(String[] args) {
        LInkedList list = new LInkedList();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        list.addElement(60);
        list.display();
        System.out.println("Middle "+list.getMiddle());
        System.out.println("Kth From Last "+list.kthFromLast(4));

    }

    class Node{
        int data;
        Node next;
    }


    private Node head;
    private Node tail;
    private int size = 0;
    public void addElement(int data){
        Node nn = new Node();
        nn.data = data;
        if (size == 0){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public int getMiddle(){
        return getMiddle(head).data;
    }
    private Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public int kthFromLast(int k){
        Node slow = head;
        Node fast = head;
        for (int idx = 0; idx < k; idx++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }


//    public Node kReverse(Node node,int k){
//        if (node == null)
//            return node;
//        Node temp = node;
//        for (int idx = 1; idx <= k; idx++){
//            temp = temp.next;
//        }
//        Node prev = kReverse(temp,k);
//        return
//    }


}
