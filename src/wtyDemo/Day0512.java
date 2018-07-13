package wtyDemo;

import java.io.IOException;
import java.io.InputStream;

public class Day0512 {

    public static void main(String[] args) throws IOException {
        InputStream in_2 = System.in;
        StringBuffer sb = new StringBuffer();
        int ch = 0;
        while ((ch = in_2.read()) != -1) {
            if (ch == '\r') {
                continue;
            }

            if (ch == '\n') {
                String temp = sb.toString();
                if ("over".equals(temp)) {
                    break;
                }
                System.out.println(temp.toUpperCase());
                sb.delete(0, sb.length());
            } else {
                sb.append((char) ch);
            }
        }
    }
}
