package wtyDemo;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Day0521 {
    public static void main(String[] args) {
        int width = 60;
        int height = 20;
        String code = null;
        BufferedImage buffImg = null;
        createCode(width, height, buffImg, code);
    }

    private static void createCode(int width, int height, BufferedImage buffImg, String code) {
        //图像buffer
        buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = buffImg.createGraphics();
        //生成随机数
        Random random = new Random();
        //将图片填充为白色
        //g.setColor(Color.BLACK);
        g.setColor(getRandColor(200, 500));
        g.fillRect(0, 0, width, height);
        //创建字体
        Font font = new Font("Times New Roman", Font.PLAIN, 18);
        g.setFont(font);
        g.setColor(getRandColor(160, 200));
        //干扰线
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(width);

            int y = random.nextInt(height);
            int x1 = random.nextInt(12);
            int y1 = random.nextInt(12);
            g.drawLine(x, y, x1, y1);
        }
        //randomCode记录随机产生的验证码
        String sRand = "";
        //随机产生codeCount个字符的验证码
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            g.drawString(rand, 13 * i + 6, 16);
        }
//将四位数验证码保存到session中
        code = sRand;

    }

    private static Color getRandColor(int i, int i1) {

        Random r = new Random();
        if (i > 255) {
            i = 255;
        }
        if (i1 > 255) {
            i1 = 255;
        }
        int r1 = i + r.nextInt(i1 - i);
        int g = i + r.nextInt(i1 - i);
        int b = i + r.nextInt(i1 - i);
        return new Color(r1, g, b);

    }
}
