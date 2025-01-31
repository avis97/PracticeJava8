import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementByStream {
    public static void main(String[] args) {
        String st = "leetcodekarlo";

        List<String> listOfDuplicate=Arrays
                .stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(listOfDuplicate);

        String nonDuplicateFirst=Arrays
                .stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(nonDuplicateFirst);

        int arr[]={1,2,3,4,5};
        Integer secondLargest=Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargest);
    }
}
