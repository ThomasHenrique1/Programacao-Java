package prova;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class QueueRegistrados implements TAD_Queue{
    private int total = 0;
    private int head = -1;
    private int tail = -1;
    private Object memo[];
    private int MAX;

    public QueueRegistrados() {
        MAX = 5;
        memo = new Object[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    @Override
    public boolean isEmpty() {
        return (total == 0);
    }

    @Override
    public boolean isFull() {
        return (total == MAX);
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return (memo[head]);
        } else {
            return null;
        }
    }

    @Override
    public Object enqueue(Object x) {
        if (!isFull() && x != null) { // pré-condições
            if (++tail >= MAX) {
                tail = 0; // avançamos a cauda (circular)
            }
            if (head == -1) {
                head = tail; // só se fila estava vazia
            }
            memo[tail] = x;
            total++;
            return x;
        } else {
            return null; //não podemos inserir se a fila está cheia ou x==null
        }
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) { //verificamos a pré-condição
            Object objeto = memo[head];
            if (++head >= MAX) {
                head = 0; //avançamos a cabeça (circular)
            }
            total--;
            if (total == 0) { //ficou vazia
                head = -1;
                tail = -1;
            }
            return objeto; //retornamos o objeto que estava na cabeça
        } else {
            return null; //não podemos retirar de uma fila vazia
        }
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String saida
                    = "";
            int pos = head; //variável auxiliar, para não alterar head
            for (int i = 1; i <= total; i++) { // total é a qtde. de elementos
                saida += memo[pos].toString();
                if (i != total) {
                    saida += ", ";
                }
                pos++;
                if (pos >= MAX) {
                    pos = 0;
                }
            }
            return ("F: " + " [ " + saida + " ]");
        } else {
            return ("F: [ ]"); // fila vazia
        }
    }
}
