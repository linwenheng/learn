import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CommonTest {
    @Test
    public void partitionTest(){
        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> subList = Lists.partition(intList,3);
        List<Integer> exceptionList = Lists.<Integer> newArrayList(7,8);
        System.out.println(subList.size());
        System.out.println(exceptionList.equals(subList.get(2)));
    }
}
