public class Tester {
    public static void main(String args[]){
        QueueInt<String> queue = new LinkedQueue<>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        queue.remove();
        try {
            queue.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
