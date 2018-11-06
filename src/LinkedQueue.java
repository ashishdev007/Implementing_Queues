import java.util.NoSuchElementException;

public class LinkedQueue<E> implements QueueInt<E> {

    private class Node<E>{

        private E data;
        private Node<E> next;

        private Node(E data){
            this.data = data;
            this.next = null;
        }

        private Node(E data, Node<E> nodeRef){
            this.data = data;
            this.next = nodeRef;
        }
    }

    private Node<E> startOfQueue = null;

    @Override
    public E remove() {
        if (empty()){
            throw new NoSuchElementException();
        }
        E value = startOfQueue.data;
        startOfQueue = startOfQueue.next;
        return value;
    }

    @Override
    public E peek() {
        if (empty()){
            throw new NoSuchElementException();
        }
        return startOfQueue.data;
    }

    @Override
    public E offer(E obj) {
        if (empty()){
            startOfQueue = new Node<>(obj);
        }else {
            Node current = startOfQueue;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>(obj);
        }
        return obj;
    }

    @Override
    public boolean empty() {
        return startOfQueue == null;
    }

    public String toString(){
        String result = "";
        if (empty()){
            return null;
        }else {
            Node current = startOfQueue;
            result += current.data + " ";
            while (current.next != null){
                current = current.next;
                result += current.data + " ";
            }
            return result;
        }
    }
}
