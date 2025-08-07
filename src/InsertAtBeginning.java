import java.util.*;
public class InsertAtBeginning {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List.add(0, 5);
        System.out.println(List);
    }
}

