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
        return null;
    }

    @Override
    public E peek() {

        return null;
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
    }

    @Override
    public boolean empty() {
        return startOfQueue == null;
    }
}
