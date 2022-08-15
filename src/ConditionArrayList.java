import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ConditionArrayList extends ArrayList<Integer> {

    private static Predicate<Integer> condition;

    public ConditionArrayList(Predicate<Integer> predicate,Integer... nums){
        super(Arrays.stream(nums).filter(ConditionArrayList :: isEligible).collect(Collectors.toList()));
        this.condition = predicate;
    }


    @Override
    public void add(int index, Integer element){
     if(Math.abs(element) % 2 == 1){
         super.add(index,element);
     }
    }
    public boolean add(Integer element){
        if(Math.abs(element)% 2 == 1){
            return super.add(element);
        }
        else{return false;
        }
    }
    public static boolean isEligible(Integer element){
        return condition.test(element);
    }
}
