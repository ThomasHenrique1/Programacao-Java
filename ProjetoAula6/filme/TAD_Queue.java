package filme;


interface TAD_Queue {
    //Verifica se a Queue está vazia:
    public boolean isEmpty();
    
    //Verifica se a Queue está cheia:
    public boolean isFull();

    //Insere um elemento na fila:
    public Object enqueue(Object x);

    //Remove um elemento do início da fila:
    public Object dequeue();

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar:
    public Object peek();

    //Retorna o conteúdo (todos os elementos) da Queue

    public String toString();
}
