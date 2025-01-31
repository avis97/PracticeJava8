import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LemdaEx{
    public static void main(String[] args){
//        String s="letstartwithcodel";

        // print the frequency-->
//        Map<String,Long> frequencyOfElement=Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(frequencyOfElement);
//
//        List<String> duplicateCharacter=Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(ch->ch.getValue()>1)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(duplicateCharacter);
//
//        String firstDuplicate=Arrays.stream(s.split(""))
//                .collect(Collectors
//                        .groupingBy(
//                                Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(ch->ch.getValue()==1)
//                .findFirst().get().getKey();
//        System.out.println(firstDuplicate);
//
//        int arr[]={1,23,5,13,15,6,15,1};
//
//        Integer secondMax=Arrays.stream(arr).boxed()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst().get();
//
//        System.out.println(secondMax);
//
//        List<Integer> startWith1=Arrays.stream(arr).boxed()
//                .filter(num->num.toString().startsWith("1"))
//                .toList();
//        System.out.println(startWith1);
        String s="letstartwithcodel";
        //fre of all element
        Map<String,Long> fre=Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fre);

        //duplicate
        List<String> duplicateEl=Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c->c.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(duplicateEl);

        String firstNonDup=Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c1->c1.getValue()==1)
                .findFirst().get().getKey();

        System.out.println(firstNonDup);


        int arr[]={1,23,5,13,15,6,15,1};

        Integer secondMax=Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondMax);

        List<Integer> startWithOne=Arrays.stream(arr).boxed()
                .filter(ch1->ch1.toString().startsWith("1"))
                .toList();

        System.out.println(startWithOne);


    }
}
