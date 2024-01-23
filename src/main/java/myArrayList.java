import java.util.ArrayList;

public class myArrayList {



    private int[] data;
    private int num_elements;
    public myArrayList(){
        data = new int[10];
    }

    public int size(){
        return num_elements;
    }

public void add(int num){
        if(num_elements== data.length){
            grow();
        }
        data[num_elements]=num;
        num_elements++;
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
