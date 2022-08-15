import java.util.ArrayList;
import java.util.Random;

public class mainOne {

    public static void addRandomNum(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();

       if ( list instanceof  ConditionArrayList){
           ConditionArrayList conditionList = (ConditionArrayList) list;
           while (!conditionList.isEligible(random.nextInt())){
       }
       }
    }

    public static void main(String[] args) {

        ConditionArrayList oddArrayList = new ConditionArrayList( n -> Math.abs(n) % 2 == 1);

        oddArrayList.add(1);
        oddArrayList.add(4);
        oddArrayList.add(5);
        oddArrayList.add(83);
        oddArrayList.add(112);



    }
}
