package JK;

public class app {
    public static void main(String[] args) {
        people p = new people();
        String lunch = p.lunch("食堂");
        System.out.println(lunch);
        String apple = p.apple();
        System.out.println(apple);


    }
}
