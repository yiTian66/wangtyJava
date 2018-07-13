package JK;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class timeTest {

        public static void main(String[] args)
        {
            List<Integer> filterLists = new ArrayList<>();
            for(int i=0;i<1000000;i++)
            {
                filterLists.add(i);
            }

            Date a = new Date();
            for(int j=0;j<1000000;j++)
            {
                System.out.println(filterLists.get(j));
            }
            Date b = new Date();

            Date c = new Date();
            filterLists.stream().forEach(s -> System.out.println(s));
            Date d = new Date();

            long interval = b.getTime()-a.getTime();
            long interval2 = d.getTime()-c.getTime();
            System.out.println("for循环两个时间相差1:"+interval);//6602
            System.out.println("foreach两个时间相差2:"+interval2);//6824
            /**
             * 两个时间相差1:18464
             两个时间相差2:16844
             */
            /**
             * for循环两个时间相差1:15773
             foreach两个时间相差2:14915
             */
            /**
             * for循环两个时间相差1:19501
             foreach两个时间相差2:18591
             */
        }
    }

