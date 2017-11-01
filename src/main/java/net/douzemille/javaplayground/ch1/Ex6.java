package net.douzemille.javaplayground.ch1;

@FunctionalInterface
interface RunnableEx {
    void run() throws Exception;
}

public class Ex6 {
    public static Runnable uncheck(RunnableEx runner){
        return () -> {
            try {
                runner.run();
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
