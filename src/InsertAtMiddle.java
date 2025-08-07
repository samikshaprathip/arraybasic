import java.util.*;
public class InsertAtMiddle {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40));
        list.add(2,25);
        System.out.println(list);
    }
}
