public class Main {

    public static void main(String[] args) {
        DoublyLinkList<String> dll = new DoublyLinkList<String>();
        dll.addNode("Himanshu");
        dll.addNode("Himan");
        dll.addNode("Hershit");
        dll.addNode("Hersh");
        dll.displayNode();
        dll.deleteNode();
        dll.displayNode();
    }
}
