package JK;

public interface eat {

    String lunch(String a);

    default String apple(){

        return "eat apple";
    }
}
