package Pr_2;

import java.util.ArrayList;

public class _3_TesterCircle {
    public static void main(String[] args) {

        ArrayList<_3_Circle> arr = new ArrayList<>();
        //_3_Circle[] arr_static = new _3_Circle[10];
        //int length = arr_static.length;

        _3_Circle c1 = new _3_Circle();
        _3_Circle c2 = new _3_Circle();

        //arr_static[0] = c1;

        arr.add(c1);
        arr.add(c2);

        int length = arr.size();
        System.out.println("Длина динамического массива: " + length);
        System.out.println(arr);
    }
}
