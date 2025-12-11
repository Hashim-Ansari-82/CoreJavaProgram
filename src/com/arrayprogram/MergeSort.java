package ArrayDemo;

public class MergeSort {

    int[] array;
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {

        int[] inputArr={76,5,4,3,5,476,8,6};
        MergeSort ms=new MergeSort();
        ms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i+" ");
        }
    }
    public void sort(int inputArr[]){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middleIndex=lowerIndex+(higherIndex-lowerIndex)/2;

            divideArray(lowerIndex,middleIndex);
            divideArray(middleIndex+1,higherIndex);
            mergeArray(lowerIndex, middleIndex,higherIndex);

            }
    }
    public void mergeArray(int lowerIndex, int middleIndex, int higherIndex){

        for(int i=lowerIndex; i<=higherIndex; i++){

         tempMergeArr[i]=array[i];
        }
        int i=lowerIndex;
        int j=middleIndex+1;
        int k=lowerIndex;
        while(i<=middleIndex && j<=higherIndex){

            if(tempMergeArr[i] <= tempMergeArr[j]){

                array[k]=tempMergeArr[i];
                i++;
            }
            else{
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middleIndex){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
    }
}
