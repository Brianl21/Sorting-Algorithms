class Main {
  public static void main(String[] args) {
    int a [] = {9,3,0,2,11,5,7,4};
      bubbleSort(a);
      insertionSort(a);
      mergeSort(a);
    System.out.println();
    System.out.println("merge sorted: ");
    for (int x : a){
      System.out.print(x + " ");
    }
  }
  public static void bubbleSort(int a[]){
    int temp = 0;
    int len = a.length - 1; //5 integers
    for( int i = 1;i <= len; i++) // 1st element to the last
    for (int j=0; j <= len-1; j++) //1st element to 2nd last
    if (a[j]>a[j+1]){
      temp = a[j];
      a[j] = a [j+1];
      a[j+1] = temp;
    }

    System.out.print("Bubble Sorted array: ");
    for(int x : a){
      System.out.print(x+" ");
    }
  }

  public static void insertionSort(int []a){
    int temp = 0, len = a.length - 1;
    int j =0;
    for(int i = 1 ; i<= len; i++)
      j=1;
    while(j>0&& a[j-1] > a[j]){
      temp = a[j];
      a[j] = a [j+1];
      a[j-1] = temp;
      j--;
    }
    System.out.print("Insertion Sorted array: ");
    for(int x : a){
      System.out.print(x+" ");
  }
}

  public static void mergeSort(int list[]){
    if(list.length > 1){
    int n = list.length/2;
      int [] firstHalf = new int [n];
      int [] secondHalf = new int [list.length-n];
      System.arraycopy(list,0, firstHalf, 0, n);
      System.arraycopy(list,n, secondHalf, 0, list.length-n);
      mergeSort(firstHalf);
      mergeSort(secondHalf);
      merge(list, firstHalf, secondHalf);
      }
  }

  public static void merge(int list[], int []firstHalf, int [] secondHalf){
    int firstIndex = 0;
    int secondIndex = 0;
    int listIndex = 0;

    while(firstIndex < firstHalf.length && secondIndex < secondHalf.length){
      if(firstHalf[firstIndex] < secondHalf [secondIndex]){
        list[listIndex] = firstHalf[firstIndex];
        firstIndex++;
      }else{
        list[listIndex] = secondHalf[secondIndex];
        secondIndex++;
      }
      listIndex++;
      }
      while(firstIndex < firstHalf.length){
        list[listIndex] = firstHalf[firstIndex];
        firstIndex++;
        listIndex++;
      }
      while(secondIndex < secondHalf.length){
        list[listIndex] = secondHalf[secondIndex];
        secondIndex++;
        listIndex++;
      }
    }
  }
