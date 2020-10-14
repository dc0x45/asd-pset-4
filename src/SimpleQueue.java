import java.util.NoSuchElementException;

public class SimpleQueue{

    private Node head;
    private Node tail;
    private int size;
    private int maxSize;

    public SimpleQueue(int initialCapacity){
        if (initialCapacity > 0){
            size = 0;
            maxSize = initialCapacity;
        } else {
            throw new IllegalArgumentException();
        }
    } 

    public boolean add(String s) {
        boolean returnMe = false;
        Node current = tail;
        Node newNode = new Node(current, s, null);
        tail = newNode;
        if(s != null){
            if(this.size != this.maxSize){
                if (current == null) {
                    head = newNode;
                    returnMe = true;
                } else {
                    current.next = newNode;
                    returnMe = true;
                }
                size++;
                return returnMe;
            } else {
                throw new IllegalStateException("Queue full");
            }
        } else {
            throw new NullPointerException();
        }
    }

    public boolean offer(String s) {
        boolean returnMe = false;
        Node current = tail;
        Node newNode = new Node(current, s, null);
        if (s != null){
            if (this.size != maxSize){
                tail = newNode;
                if (current == null) {
                    head = newNode;
                    returnMe = true;
                } else {
                    current.next = newNode;
                    returnMe = true;
                }
                size++;
                return returnMe;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public String peek(){
        String returnMe = null;
        if (head != null){
            returnMe = head.data;
        }
        return returnMe;
    }


    public String removeFirst(){
        String returnMe = "";
        returnMe = head.data;
        if (head.next != null){
            head = head.next;
            head.prev = null;
            size--;
        } else if (tail == head) {
            head = null;
            tail = null;
            size = 0;
        }
        return returnMe;
    }

    public String removeLast(){
        String returnMe = "";
        returnMe = tail.data;
        if (tail.prev != null){
            tail = tail.prev;
            tail.next = null;
            size--;
        } else if(tail == head) {
            head = null;
            tail = null;
            size = 0;
        }
        return returnMe;
    }

    public boolean contains(String s){
        boolean returnMe = false;
        Node track = head; 
        for (int i = 0; i < size; i++){
            if (track.data == s) {
                returnMe = true;
            } else {
                track = track.next;
            }
        }
        return returnMe;
    }

    public String poll(){
        String returnMe = null;
        if (size == 0 || head == null){
            return null;
        }
        if (head.next != null){
            returnMe = head.data;
            head = head.next;
            head.prev = null;
            size--;
        } else if (tail == head && head != null) {
            returnMe = head.data;
            head = null;
            tail = null;
            size = 0;
        } 
        return returnMe;
    }

    public int remainingCapacity(){
        return this.maxSize - this.size;
    }

    public String remove(int index){
        String returnMe = "";
        if (index >= 0 && index < size){
            if (index == 0){
                returnMe = removeFirst();
            } else if (index == size){
                returnMe = removeLast();
            } else {
                Node track = getNode(index);
                returnMe = track.data;
                track.data = null;
                track.prev.next = track.next;
                track.next.prev = track.prev;
                size--;
            }
        } else {
            String s = "Index: " + index + ", Size: " + size();
            throw new IndexOutOfBoundsException(s);
        }
        return returnMe;
    }

    public boolean remove(String s){
        boolean returnMe = false;
        String rStr = "";
        if (s != null){
            int index = indexOf(s);
            if (index != -1){
                rStr = remove(index);
            }
            if (rStr != ""){
                returnMe = true;
            }
        }
        return returnMe;
    }

    public String remove(){
        String returnMe = null;
        if (size == 0 || head == null){
            throw new NoSuchElementException();
        }
        if (head.next != null){
            returnMe = head.data;
            head = head.next;
            head.prev = null;
            size--;
        } else if (tail == head && head != null) {
            returnMe = head.data;
            head = null;
            tail = null;
            size = 0;
        } 
        return returnMe;
    }

    public String toString(){
        String finalString = "";
        Node track = head;
        for (int i = 0; i < size; i++){
            if (i == 0){
                finalString = track.data;
            } else{
                finalString = finalString + ", " + track.data;
            }
            track = track.next;

        }
        return "[" + finalString + "]";
    }

    public int indexOf(String s){
        int returnMe = -1;
        Node track = head; 
        int count = 0;
        for (int i = 0; i < size; i++){
            if (track.data == s) {
                returnMe = count;
            } else {
                if (track.next != null){
                    track = track.next;
                    count++;
                }
            }
        }
        return returnMe;
    }

    public String element(){
        if (size != 0 || head != null){
            return head.data;
        } else{
            throw new NoSuchElementException();
        }
    }   

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            if (count++ == index) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    private static class Node {

        Node prev;
        String data;
        Node next;

        public Node(Node prev, String data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}