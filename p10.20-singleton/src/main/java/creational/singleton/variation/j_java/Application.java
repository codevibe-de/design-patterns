package creational.singleton.variation.j_java;

import java.awt.*;


public class Application {

    public static void main(String[] args) {
        final Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        runtime.addShutdownHook(new Thread(() -> System.out.println("after main")));

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        System.out.println(toolkit.getScreenSize());
        toolkit.beep();

        System.out.println("end of main");
    }
}
