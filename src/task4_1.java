// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
public class task4_1 {
    public static LinkedList<Object> fillList(){    // создание двусвязного списка
        LinkedList<Object> month = new LinkedList<>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        return month;
    }
    public static void printList(LinkedList<Object> list){ // печать
        for(Object el: list){
            System.out.printf(el + " ");
        }
    }
    public static void replaceList(LinkedList<Object> list){ // развертывание списка
        int n = list.size()/2;
        int m = list.size();
        for(int i = 0; i < n; i++){
            Object temp = list.get(i);
            list.set(i, list.get(m-i-1));
            list.set(m-i-1, temp);
        }
    }
    public static void main(String[] args) { // вывод
        LinkedList<Object> listFirst = fillList();
        printList(listFirst);
        replaceList(listFirst);
        System.out.println();
        printList(listFirst);
    }
}