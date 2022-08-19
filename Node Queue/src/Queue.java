public class Queue { //FIFO
    Node front, back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    public boolean isEmpty(){
        if (this.back == null){
            return true;
        }
        return false;
    }


    //enqueue (add), dequeue (remove), Iterate

}
