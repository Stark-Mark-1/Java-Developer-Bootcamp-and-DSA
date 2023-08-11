public class singleLinkedList {
    public node head;
    public node tail;
    public int size;
    public node singlyLinkedList(int nodeValue){
        head= new node();
        node node= new node();
        node.next=null;
        node.val=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
}
