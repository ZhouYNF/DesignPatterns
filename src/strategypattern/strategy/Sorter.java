package strategypattern.strategy;

/**
 * 这里封装了排序的算法
 * 通过泛型对不同类型的数据都可以进行排序
 * @param <T>
 */
public class Sorter<T> {
    //这里传入对象的数据，然后传入实现了Comparator接口的类，
    // 当然由于泛型的存在使得传入的类有了一定的限制
    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                //通过实行的接口类的的方法返回的数据，判断大小
                minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    //sort(int)

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}