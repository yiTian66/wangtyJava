package Single;

/**
 * 单例设计模式之饿汉式
 */

/**
 *
 */
public class Single {

    private  static  Single s =new Single();

    private Single(){}

    public static Single getSingle(){
        return s;
    }
}
