public interface QueueInt<E> {
    E remove();
    E peek();
    E offer();
    boolean empty();
}
