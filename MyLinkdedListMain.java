package assignment;

public class MyLinkdedListMain {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.delete(2);

        System.out.println("Element at index 0: "+myList.get(0));
        System.out.println("Element at index 1: "+myList.get(1));
        System.out.println("Element at index 2: "+myList.get(2));
        //System.out.println("Element at index 3: "+myList.get(3));

    }
}
