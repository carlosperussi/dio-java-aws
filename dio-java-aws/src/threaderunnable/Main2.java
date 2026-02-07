package threaderunnable;

import java.util.ArrayList;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;


public class Main2 {
    private static int number = 0;

    // Utilizando listas sincronizadas com Queue

    public static void main(String[] args) {
        Runnable inc = () -> {
            for(int i = 0; i < 100; i++) {
                number += 1;
            }
        };

        Runnable dec = () -> {
            for(int i = 0; i > -100; i--) {
                number -= 1;
            }
        };

        Runnable show = () -> {
            for(int i = 0; i < 250; i++) {
                System.out.println(number);
            }
        };

        var execInc = new Thread(inc);
        execInc.start();
        execInc.setName("execInc");

        var execDec = new Thread(dec);
        execDec.start();
        execDec.setName("execDec");

        var execShow = new Thread(show);
        execShow.start();
        execShow.setName("execShow");

        System.out.println(execInc.getName());
        System.out.println(execDec.getName());
        System.out.println(execShow.getName());
    }
}
