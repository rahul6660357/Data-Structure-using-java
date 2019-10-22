class CQHeap
{
  static int heap[]=new int[100];
  static int heapSize = -1;
  static void Insert(int element) 
  {
    heapSize++;
    heap[heapSize] = element; /*Insert in the last place*/
    int now = heapSize;
    while (now!=0 && heap[(now-1) / 2] > element) 
    {
      heap[now] = heap[(now-1) / 2];
      now = (now-1) / 2;
    }
    heap[now] = element;
  }

  static int DeleteMin() 
  {
    /* heap[0] is the minimum element. So we remove heap[0]. Size of the heap is decreased.
     Now heap[0] has to be filled. We put the last element in its place and see if it fits.
     If it does not fit, take minimum element among both its children and replaces parent with it.
     Again See if the last element fits in that place.*/
    int minElement, lastElement, child, now;
    minElement = heap[0];
    lastElement = heap[heapSize--];
    for (now = 0; now * 2 < heapSize; now = child) 
    {
      /* child is the index of the element which is minimum among both the children */
      /* Indexes of children are i*2 + 1 and i*2 + 2*/
      child = now * 2 + 1;
      if (child != heapSize && heap[child + 1] < heap[child])
        child++;
      /* To check if the last element fits or not it suffices to check if the last element is less than the minimum element among both the children*/
      if (lastElement > heap[child])
        heap[now] = heap[child];
      else /* It fits there */
        break;
    }
    heap[now] = lastElement;
    return minElement;
  }

  public static void main(String ab[]) 
  {
    int i;
    Insert(10);
    Insert(40);
    Insert(15);
    System.out.println("Heap array after inserting 10, 40, 15 elements : ");
    for (i = 0; i < 3; i++)
      System.out.print(heap[i]+" ");
    System.out.println();
    Insert(30);
    System.out.println("Heap array after inserting 10, 40, 15, 30 elements : ");
    for (i = 0; i < 4; i++)
      System.out.print(heap[i]+" ");
    System.out.println();
    Insert(25);
    System.out.println("Heap array after inserting 10, 40, 15, 30, 25 elements : ");
    for (i = 0; i < 6; i++)
      System.out.print(heap[i]+" ");
    System.out.println();
    Insert(35);
    System.out.println("Heap array after inserting 10, 40, 15, 30, 25, 35 elements : ");
    for (i = 0; i < 6; i++)
      System.out.print(heap[i]+" ");
    System.out.println();
    System.out.println("Elements deleted from heap in following order : ");
    for (i = 0; i < 6; i++)
      System.out.print(DeleteMin() + " ");
    System.out.println();
  }
}