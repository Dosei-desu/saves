package sorting;

import java.util.List;

public class Heapsort implements ISorter
{
    private List<Integer> list;
    private int size;

    private int leftChild(int n)
    {
        return 2*n+1;
    }

    private int rightChild(int n)
    {
        return 2*n+2;
    }

    private void heapifyAll()
    {
        int startNode = size-1;
        while(startNode >= 0)
        {
            heapifyDown(startNode);
            --startNode;
        }
    }

    private void heapSort()
    {
        while(size > 1)
        {
            swap(0, size - 1);
            --size;
            heapifyDown(0);
        }
    }

    private void heapifyDown(int n)
    {
        int left = leftChild(n);
        if(left >= size) return;
        int largestChild = left;
        int right = rightChild(n);
        if(right < size && list.get(right) > list.get(left))
        {
            largestChild = right;
        }
        if(list.get(largestChild) <= list.get(n)) return;
        swap(n, largestChild);
        heapifyDown(largestChild);
    }

    private void swap(int a, int b)
    {
        Integer tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);
    }

    @Override
    public void sort(List<Integer> list)
    {
        this.list = list;
        this.size = list.size();
        heapifyAll();
        heapSort();
    }
}
