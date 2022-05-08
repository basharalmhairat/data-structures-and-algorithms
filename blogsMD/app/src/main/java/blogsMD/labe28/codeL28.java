package blogsMD.labe28;

public class codeL28 {

    int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {

            if (a[j] < pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }
    void quick(int a[], int start, int end)
    {
        if (start < end)
        {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }


    void printArr(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int a[] = { 13, 18, 27, 2, 19, 25 };
        int n = a.length;

    }
}

