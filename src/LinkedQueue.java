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
        Node<E> element = new Node<>(obj);
        return obj;
    }

    @Override
    public boolean empty() {
        return false;
    }
}
