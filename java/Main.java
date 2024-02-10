import java.io.File;

public class Main {
    public native void helloFromRust();

    static {
        System.loadLibrary("foreign_java");
    }
    public static void main(String[] args){
        new Main().helloFromRust();
    }
}