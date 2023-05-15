import java.util.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(0);
        integers1.add(1);
        integers1.add(2);
        System.out.println(symmetricDifference(integers, integers1));
    }
       public static Set<Integer> symmetricDifference (HashSet<Integer>firstSet, HashSet<Integer> secondSet){
        Set<Integer> newSet= new HashSet<>();
        for(Integer integer2: firstSet){
            for(Integer integer1: secondSet){
                if(!firstSet.contains(integer1)){
                    newSet.add(integer1);
                }else if (!secondSet.contains(integer2)){
                    newSet.add(integer2);
                }
            }
        }
        return newSet;

    }
}