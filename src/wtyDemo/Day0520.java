package wtyDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Day0520 {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                count++;
                String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                System.out.println(time + "   定时任务执行了" + count + "次");
            }
        };
       timer.schedule(task,new Date());
//// time为Date类型：在指定时间执行一次。
//
//        timer.schedule(task, firstTime, period);
//// firstTime为Date类型,period为long
//// 从firstTime时刻开始，每隔period毫秒执行一次。
//
//        timer.schedule(task, delay)
//// delay 为long类型：从现在起过delay毫秒执行一次
//
//        timer.schedule(task, delay, period)
//// delay为long,period为long：从现在起过delay毫秒以后，每隔period
//// 毫秒执行一次。

//        timer.schedule(timerTask, 2000, 4000);
    }
}
