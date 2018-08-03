package wtyDemo;

public class computer {
    String screen = "液晶显示屏";
    void startup() {
        System.out.println("电脑正在开机，请稍后。。。");
    }
}
class pad extends computer{               //pad继承computer
    String battery = "5000 毫安电池";            //子类独有的属性
    public static void main(String[] args) {
        computer pc = new computer();//电脑类
        System.out.println("computer的屏幕是：" + pc.screen);
        pc.startup();
        pad ipad = new pad() ;                            //平板电脑类
        System.out.println("pad的屏幕是：" + ipad.screen);                //子类可以直接使用父类属性
        System.out.println("pad的电池是：" + ipad.battery);             //子类独有属性
        ipad.startup();//子类可以直接使用父类方法
    }

}
