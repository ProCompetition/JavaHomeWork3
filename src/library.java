import java.util.ArrayList;

public class library {
    public static void PrintArray(ArrayList<Integer> arr){
        for(int element: arr){
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
    public static ArrayList<Integer> FillRandomArray(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add((int)(Math.random()*200));
        }
        return list;
    }
}
