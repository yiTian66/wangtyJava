package wtyDemo;

public class food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("今天的食物是："+name);
    }
}
