package zhuanshizhe;

/**
 * 彩铃手机
 */
public class ColoringPhone {

    private Phone phone;

    public ColoringPhone (Phone phone){

        this.phone=phone;
    }
    public void call(){
        System.out.println("听彩铃。。。");
        phone.call();

    }


}
