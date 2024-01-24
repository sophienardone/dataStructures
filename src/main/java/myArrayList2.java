public class myArrayList2 {

    private static final int MAX_EXPANSION=10000;
    private static final int MAX_INITIAL_CAPACITY=10000;

    private int[] data;
    private int numElements;
    private  int capacity=10;
    private int expansionFactor=10;

    public myArrayList2(int capacity){
        this.capacity=capacity;
        data=new int[capacity];
    }

    public myArrayList2(int capacity, int expansionFactor){
        if(capacity <= MAX_INITIAL_CAPACITY && capacity > 0) {
            this.capacity = capacity;
        } else if (capacity > MAX_INITIAL_CAPACITY) {
            this.capacity=MAX_INITIAL_CAPACITY;
        }

        if(expansionFactor<= MAX_EXPANSION && expansionFactor > 0) {
            this.expansionFactor = expansionFactor;
        }else if (expansionFactor > MAX_EXPANSION){
            this.expansionFactor=MAX_EXPANSION;
        }
        data=new int[capacity];
    }

    public myArrayList2(){
        capacity=10;
        data = new int[capacity];
    }

    public int size(){
        return numElements;
    }

    public void add(int num){
        if(numElements== data.length){
            grow();
        }

        data[numElements]=num;
        numElements++;
    }


    //grow array - create new array with X extra slots
//loop through original array and copy to new array
    //replace the original array with the new one

    private void grow(){
        int [] tempArray = new int[data.length + 10];
        for(int i = 0; i < data.length; i++){
            tempArray[i] = data[i];
        }

        data = tempArray;
    }







}
