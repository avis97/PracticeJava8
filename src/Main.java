import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
//        System.out.println("Hello world!");
//        List<Integer> arr= Arrays.asList(1,22,4,33,56,4);
//        // odd and even using stream-->>
//        arr.stream().filter(e->e%2==0).forEach(e-> System.out.println(e+" "));
//        // find a element start with 5-->
//        arr.stream().filter(e->e.toString().startsWith("5")).forEach(System.out::println);
//        // find the duplicate element in array-->>
//        Set<Integer> temp=new HashSet<>();
//        arr.stream().filter(e->!temp.add(e)).forEach(System.out::println);
//        // max or min
//        Optional<Integer> max=arr.stream().max(Integer::compareTo);
//        Optional<Integer> min=arr.stream().min(Integer::compareTo);
//        System.out.println(max+" "+min);
//        // sort an array-->>
//        arr.stream().sorted().forEach(System.out::println);
//        // sorted array in descending-->>
//        arr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        // check in array have any duplicate otr not:
//        int ar[]={1,2,3,4,5,3};
//        long ans= Arrays.stream(ar).distinct().count();
//        if(ans!=ar.length){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//        Arrays.stream(ar).max().ifPresent(System.out::println);
//
//        String s="streamapiset";

//        // print the all character frequency
//        Map<String,Long> map=Arrays
//               .stream(s.split(""))
//               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);
//
//        // print the duplicate character by stream-->
//        List<String> listOfDuplicate=Arrays
//                .stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(num->num.getValue()>1)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(listOfDuplicate);
//
//        // find first non-duplicate element-->>
//        String firstNonRepeatElement=Arrays
//                .stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(ch->ch.getValue()==1)
//                .findFirst().get().getKey();
//        System.out.println(firstNonRepeatElement);
//
//        // find the second largest element in a array-->>
//        int arr1[]={1,2,13,4,17,5,0};
//        Integer num=Arrays
//                .stream(arr1)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .get();
//        System.out.println(num);
//
//        // in a array print the element who start with 1
//
//       List<Integer> list= Arrays.stream(arr1).boxed()
//                .filter(val->val.toString().startsWith("1"))
//                .toList();
//       System.out.println(list);

        // 1>print the all character frequency
        // 2>print the duplicate character by stream-->
        // 3>find first non-duplicate element-->>
        // 4>find the second largest element in a array-->>
        // 5>in a array print the element who start with 1

        String st="letsstartwithjaval";

        Map<String,Long> fre=Arrays.stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fre);

        List<String> duplicateChar=Arrays.stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicateChar);

        String nonDuplicate=Arrays.stream(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()==1)
                .findFirst().get().getKey();

        System.out.println(nonDuplicate);

        int ar[]={1,2,3,4,15,13,2,4,13};

        Integer secondLargest=Arrays.stream(ar).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLargest);

        List<Integer> valStartsWithOne=Arrays.stream(ar).boxed()
                .filter(ch->ch.toString().startsWith("1")).toList();

        System.out.println(valStartsWithOne);

        HashSet<Integer> temp=new HashSet<>();
        List<Integer> duplicate=Arrays.stream(ar).boxed()
                .filter(val->!temp.add(val)).toList();

        System.out.println(duplicate);
    }
}