public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        enqueue(queue, 1);
        enqueue(queue, 2);
        enqueue(queue, 3);

        System.out.println();
        queue.printIterate();

        dequeue(queue);
        dequeue(queue);
        dequeue(queue);
        dequeue(queue);
    }

    public static void dequeue(Queue queue){
        int data;
        System.out.println("removing data from queue:");
        data = queue.dequeue();
        if(data == -1){
            System.out.println("queue is empty");
        }else{
            System.out.println(data);
        }
    }

    public static void enqueue(Queue queue, int value){
        queue.enqueue(value);
        System.out.println("value added to queue");
    }
}