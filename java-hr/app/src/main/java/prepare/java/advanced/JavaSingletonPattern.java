package prepare.java.advanced;

public class JavaSingletonPattern {
    public static void main(String[] args) {
        Singleton.getSingleInstance().str = "hello world";

        System.out.println("Hello I am a singleton! Let me say "+Singleton.getSingleInstance().str+" to you");
    }
}

class Singleton {

    private static Singleton INSTANCE;
    public String str;

    private Singleton() {
    }

    static Singleton getSingleInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}