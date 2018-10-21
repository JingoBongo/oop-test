package queue;

public class myQueue {
    int data;
    int[] array;
    int capacity=0;


    public myQueue(){
    }

    public myQueue(int number){
        this.data=number;
        this.array= new int[number];
    }

    public boolean isFull(){
        return this.capacity == this.data;
    }

    public boolean isEmpty(){
        return this.capacity == 0;
    }

    public void printArray() {
        System.out.println("===");

        for(int i = 0; i < this.data; ++i) {
            System.out.println(this.array[i]);
        }
    }

    public void push(int newData) {
               if(this.isEmpty()){
                     this.array[0]=newData;
        } else if (this.isFull()) {
                     int[] newArr = new int[this.data + 1];

                        for (int j=0; j<this.data; j++){
                              newArr[j]=this.array[j];
                              newArr[j+1]=newData;
                          }
                       this.data = this.data+1;
                     this.array = newArr;
        } else {
                        this.array[this.capacity] = newData;
               }
       this.capacity=this.capacity+1;
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("Can't pop. It's empty.");
        }
        int[] newArr = new int[this.data - 1];

        this.data=this.data-1;
        this.capacity=this.capacity-1;
        for (int i =1; i<this.data; i++){
            newArr[i-1]=this.array[i];
        }
        this.array = newArr;

    }



}
