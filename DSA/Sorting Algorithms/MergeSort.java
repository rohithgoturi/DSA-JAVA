public class MergeSort {
    
    public static void Conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int [ei - si + 1];

        int Idx1 = si;
        int Idx2 = mid+1;
        int x = 0;

        while(Idx1 <= mid && Idx2 <=ei){
            if(arr[Idx1] <= arr[Idx2]){
                merged[x] = arr[Idx1];
                x++;
                Idx1++;
            }

            else{
                merged[x] = arr[Idx2];
                x++;
                Idx2++;
            }
        }

        while(Idx1 <= mid) {
            merged[x++] = arr[Idx1++];
        }

        while(Idx2 <= ei) {
            merged[x++] = arr[Idx2++];
        }

        for (int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide (int arr[], int si, int ei){
        
        int mid = si + (ei - si) / 2;

        if(si >= ei) {
            return;
        }

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        Conquer(arr, si, mid, ei);
    }

    public static void main (String args[]) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
}
