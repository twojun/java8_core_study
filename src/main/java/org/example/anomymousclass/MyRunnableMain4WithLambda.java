package org.example.anomymousclass;

public class MyRunnableMain4WithLambda {

    public static void main(String[] args) {

        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute( () -> {
                System.out.println("hello Main3!");
            }
        );
    }
}
