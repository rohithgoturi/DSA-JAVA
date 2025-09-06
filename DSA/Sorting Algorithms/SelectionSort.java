public class SelectionSort {

    //array printing function
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};

        //sorting
        for(int i=0; i<arr.length; i++){
            int smallest = i;

            //finding smallest element
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }

            //swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        PrintArr(arr);

    }
}
