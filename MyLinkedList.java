package assignment;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
        this.head = null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){ //리스트가 비어있을 경우,
            head = newNode; //새로운 노드를 첫 번째 노드로 설정한다
        }else{
            Node current = head; // 현재 노드를 첫 번째 노드로 설정한다
            while (current.next != null){ // 현재 노드가 마지막 노드가 될 때까지 반복
                current = current.next; //다음 노드로 이동
            }
            current.next = newNode; //현재 노드의 다음 노드로 새로운 노드를 추가
        }

    }

    public void delete(int index){
        Node current = head;
        for(int i=0; i<index-1; i++){
            if(current.next ==null){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        current.next=current.next.next;
    }

    public int get(int index){
        Node current = head;
        for(int i=0; i< index; i++){
            if(current.next ==null){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        return current.data;
    }
}
