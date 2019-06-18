
public class DoublyLinkList<T> {
    Node head;
    public DoublyLinkList(){
        head = null;
    }
    public void addNode(Object value){
        Node newNode = new Node(value, null, null);
        if(head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head.previous= newNode;
            head = newNode;
        }
    }
    public void deleteNode(){
        head = head.next;
        head.previous = null;
    }
    public void displayNode(){
        Node n = head;
        while (n!=null){
            System.out.println((T)n.value);
            n = n.next;
        }
    }
}
