package blogsMD.labe27;

import java.lang.reflect.Array;

public class codeL27 {

    public Integer[] merge(Integer[] left, Integer[] right){
        Integer[] result = new Integer[left.length + right.length];
        int k = 0;
        int j = 0;
        int i = 0;
        while(i < left.length && j < right.length){
            if (left[i] <= right[j]){
                result[k] = left[i];
                i++;} else {
                result[k] = right[j];
                j++;}
            k++;}
        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;}
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;}
        return result;
    }
}