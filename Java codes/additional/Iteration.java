import java.util.*;

public class Iteration {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(45);
        list.add(36);
        list.add(7);
        list.add(19);

        Iterator<Integer> item = list.iterator();
        
        // printing items through iterator
        
        while(item.hasNext()){
            System.out.println(item.next());
        }
        
        // resetting iterator as with above while  loop iterator is at last index of list
        
        item = list.iterator();
        
        // removing items through iterator
        
        while (item.hasNext()){
            if (item.next() < 20){
                item.remove();
            }
        }
        
        System.out.println(list);
	}
}