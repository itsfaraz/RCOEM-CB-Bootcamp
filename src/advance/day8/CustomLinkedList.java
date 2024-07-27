package advance.day8;

public class CustomLinkedList {


    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        list.addElement(60);
        list.display();
    }

    class Node{
        int data ;
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
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(".");
    }


    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node kFromLast(Node head,int k){
        Node slow = head;
        Node fast = head;
        for (int idx = 1; idx <= k; idx++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


}
