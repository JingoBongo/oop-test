package queue;

public class Main
{
    public static void main(String args[])
    {
        myQueue queue1 = new myQueue(5);
        myQueue queue2 = new myQueue(10);

        for (int i = 0; i< 5; i++) {
            queue1.push(i);
        }
        queue1.printArray();

        queue1.pop();

        queue1.printArray();


    }

}
