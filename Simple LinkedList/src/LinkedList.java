public class LinkedList {
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    public void update(int index , int newData){
        Node current = head;
      for (int i = 0 ; i < index ; i++){
        current = current.next; }
     current.data = newData;}


    public void delete(int index){
        if (index == 0){
            head = head.next;
            return;
        } Node current = head;
        for (int i = 0 ; i < index - 1 ; i++){
            current = current.next;
        }
        current.next = current.next.next;
    }
}