package org.example.anomymousclass;

public class MyRunnableMain2 {

    public static void main(String[] args) {

        /** MyRunnable을 구현하고 있는 익명 클래스의 인스턴스를 myRunnable에 참조하도록 함 */
        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!");
            }
        };

        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(myRunnable);   // hello!

    }
}
