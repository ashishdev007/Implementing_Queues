public interface QueueInt<E> {
    E remove();
    E peek();
    E offer(E obj);
    boolean empty();
}
