import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int nList : intList) {
            if (nList > 0) {
                newList.add(nList);
            }
        }

        List<Integer> finalList = new ArrayList<>();
        for (int fList : newList) {
            if (fList % 2 == 0) {
                finalList.add(fList);
            }

        }
        Collections.sort(finalList);
        System.out.println(finalList);


    }
}