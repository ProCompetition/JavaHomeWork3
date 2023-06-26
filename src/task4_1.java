// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
public class task4_1 {
    public static LinkedList<Object> fillList(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Start/Finish");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Finish/Start");
        return list;
    }
    public static void printList(LinkedList<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
    }
    public static void replaceList(LinkedList<Object> list){
        int n = list.size()/2;
        int m = list.size();
        for(int i = 0; i < n; i++){
            Object temp = list.get(i);
            list.set(i, list.get(m-i-1));
            list.set(m-i-1, temp);
        }
    }
    public static void main(String[] args) {
        LinkedList<Object> listFirst = fillList();
        printList(listFirst);
        replaceList(listFirst);
        System.out.println();
        printList(listFirst);
    }
}