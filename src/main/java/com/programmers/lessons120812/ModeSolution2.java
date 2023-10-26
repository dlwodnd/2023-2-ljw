package com.programmers.lessons120812;
import javax.crypto.spec.PSource;
import java.util.*;
public class ModeSolution2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {2,1,3,3};
        int x = sol.sol(arr);
        System.out.println(x);
    }


}
class Solution2 {
    public int sol(int[] array) {
        int Max=0;
        Arrays.sort(array);
        List<Integer> listarr =  new ArrayList<>();
        if(array.length==1){
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            listarr.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(!(listarr.contains(i))){
                continue;
            }
            if(listarr.lastIndexOf(i)-listarr.indexOf(i)>Max){
                Max=listarr.lastIndexOf(i)-listarr.indexOf(i);
                continue;
            }else if(listarr.lastIndexOf(i)-listarr.indexOf(i)<Max){
                continue;
            }else if(listarr.lastIndexOf(i)-listarr.indexOf(i)==Max){
                return -1;
            }
        }
        return Max;
    }
}