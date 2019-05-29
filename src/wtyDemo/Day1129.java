package wtyDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day1129 {
    public static void

    main(String[] args) {
        fun("aaa$$$$aaa$$$aa", "\\$+");
    }

    public static void

    fun(String src, String target) {
        Matcher m = Pattern.compile(target).matcher(src);
        while (m.find()) {
            System.out.println(" res:" + m.group(0) + " start at" + m.start() + " end at:" + m.end());

        }
        // res:$$$$ start at3 end at:7
        // res:$$$ start at10 end at:13
    }
}