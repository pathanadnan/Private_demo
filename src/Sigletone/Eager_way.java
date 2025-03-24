package Sigletone;

public class Eager_way {

    private static Eager_way a;

    public Eager_way() {
    }

    public static Eager_way getea(){
        return a;
    }
}
