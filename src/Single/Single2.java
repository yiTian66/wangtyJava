package Single;

/**
 * 单例设计模式之懒汉式。。。。延迟加载
 */
public class Single2 {
    private static Single2 s;

    private Single2() {
    }

    /**
     * 不加锁版本，容易出现线程安全问题
     * @return
     */
//    public static Single2 getSingle2() {
//
//            if (s == null) {
//                s = new Single2();
//            }
//
//        return s;
//    }

    /**
     * 加锁版本，没有线程安全问题，效率比较低
     *
     * @return
     */
//    public static Single2 getSingle2() {
//        synchronized (Single2.class) {
//            if (s == null) {
//                s = new Single2();
//            }
//        }
//        return s;
//    }

    /**
     * 加锁版本，双重判断提高效率
     *
     * @return
     */
    public static Single2 getSingle2() {
        if (s == null) {
            synchronized (Single2.class) {
                if (s == null) {
                    s = new Single2();
                }
            }
        }
        return s;
    }

}
