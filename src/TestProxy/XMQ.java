package TestProxy;

public class XMQ {
    public static void main(String[] args) {

        KindWomen wangPo = (KindWomen) ProxyFactory.getProxy(PJL.class);
        wangPo.throwEye(10);
        wangPo.doSomeThing(100);
    }
}
