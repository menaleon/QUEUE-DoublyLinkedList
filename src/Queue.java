public class Queue {
    private DoublyLinkedList queueList;

    public Queue(){ // CONSTRUCTOR
        queueList = new DoublyLinkedList();
    }
    /*********************+***************************************************************/
    public void enqueue(Object newElement){
        this.queueList.insertLast(newElement);
    }

    public void dequeue(){
        this.queueList.deleteFirst();
    }

    public Node peak(){
        return this.queueList.getLast();
    }

    public void show(){
        System.out.println(this.queueList.display());
    }
    public void getSize(){
        System.out.println(queueList.size());
    }

    public static void main(String[] args){
        Queue queue1 = new Queue();

        queue1.enqueue(5);
        queue1.enqueue(8);
        queue1.enqueue(3);
        queue1.enqueue(12);
        queue1.enqueue(0);
        queue1.enqueue(89);
        queue1.enqueue(77);

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

        queue1.show();

        /**Los resultados sí son los esperados, pues un Queue es de tipo FIFO: añade en el "rear" y elimina el "front" **/
        /**Esto porque un Queue es como una fila en el banco: el primero en entrar(enqueue) es el primero que atienden(dequeue) **/

    }
}
