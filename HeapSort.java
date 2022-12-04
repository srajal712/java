public class heapsort {
    static void maxheapify(int A[],int n,int i){
        int largest =i;
        int l= 2*i+1;
        int r=2*i+2;
        if(l<n && A[l]>A[largest]){
            largest=l;
        }
        if(r<n && A[r]>A[largest]){
            largest=r;
            
        }
        if(largest!=i){
             int temp = A[i];  
        A[i] = A[largest];  
        A[largest] = temp;  
          
        maxheapify(A, n, largest);  
        }
    }
    static void heapSort(int A[], int n)  
{  
    for (int i = n / 2 - 1; i >= 0; i--)  
        maxheapify(A, n, i);  
  
    for (int i = n - 1; i >= 0; i--) {  
        int temp = A[0];  
        A[0] = A[i];  
        A[i] = temp;  
          
        maxheapify(A, i, 0);  
    
}
}
  static void printArr(int A[], int n)  
{  
    for (int i = 0; i < n; ++i)  
        System.out.print(A[i] + " ");  
}  
public static void main(String args[])   
{  
    int A[] = {81,89,9,11,14,76,54};  
    int n = A.length;  
    System.out.print("Before sorting array elements are - \n");  
    printArr(A, n);  
    heapSort(A, n);  
    System.out.print("\nAfter sorting array elements are - \n");  
    printArr(A, n);  
}  
}

//Time Complexity=O(n log n)
