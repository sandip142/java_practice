import java.util.*;

public class arrayList {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

          ArrayList<Integer> list =new ArrayList<>(5);

          list.add(2);
          list.add(3);
          list.add(5);
          list.add(6);
          list.add(8);
          list.add(2);
          list.add(3);
          list.add(5);
          list.add(6);
          list.add(8);

          System.out.println(list);
          list.remove(1);
          System.out.println(list);
    }
    
}
