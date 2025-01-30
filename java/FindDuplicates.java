import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
            List<Integer> list1=new ArrayList<Integer>(Arrays.asList(3,7,5,6,7,4,8,5,7,66));
            List<Integer> list2=new ArrayList<Integer>(Arrays.asList(3,5,6,4,4,5,66,6,7,6));
            List<Integer> list3=new ArrayList<Integer>(Arrays.asList(3,0,5,1,0));
            List<Integer> list4=new ArrayList<Integer>(Arrays.asList(3));

            System.out.println("List 1: "+findDuplicatesNestedLoops(list1));
            System.out.println("List 2: "+findDuplicatesNestedLoops(list2));
            System.out.println("List 3: "+findDuplicatesNestedLoops(list3));
            System.out.println("List 4: "+findDuplicatesNestedLoops(list4));
    }

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> list) {
        Set<Integer> duplicates=new HashSet<Integer>();
        int len=list.size();

        for (int i=0; i<len-1; i=i+1) {
            for (int j=i+1; j<len; j=j+1) {
                if (list.get(i)==list.get(j)) {
                    duplicates.add(list.get(j));
                    break;
                }
            }
        }

        return new ArrayList<Integer>(duplicates);
    }
}