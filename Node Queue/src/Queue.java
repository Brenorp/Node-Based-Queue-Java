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

    public void enqueue(int value){

        Node newNode = new Node(value);

        if(this.isEmpty()==true){ //empty queue case

            this.front = newNode;
            this.back = newNode;

        }else{ //general queue case

            newNode.setNext(this.front);
            this.front = newNode;
        }
    }

    public int dequeue (){ //dequeue method
        int info;

        if(this.isEmpty() == true){  // empty queue case
            return -1;

        } else if (this.front == this.back) { //size 1 queue case

            info = this.back.getInfo();
            this.front = null;
            this.back = null;
            return info;

        } else{ //general queue case
            Node temp = this.front;
            while(temp.getNext() != this.back) { //iterator to find new rear node
                temp.setNext(temp.getNext());
                temp = temp.getNext();
            }

            info = this.back.getInfo();
            this.back = temp;
            this.back.setNext(null);
            return info;
        }
    }

    public void printIterate(){ //iteration method just for fun
        Node temp = this.front;

        System.out.println("Queue values are as follows:");

        System.out.println(temp.getInfo());
        while(temp != this.back){

            temp.setNext(temp.getNext());
            temp = temp.getNext();
            System.out.println(temp.getInfo());

        }
        System.out.println();
    }
}
