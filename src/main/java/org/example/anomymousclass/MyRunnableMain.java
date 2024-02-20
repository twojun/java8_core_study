package org.example.anomymousclass;

public class MyRunnableMain {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("MyRunnable run()");
            }

            // 새롭게 정의한 메서드
            public void bark() {
                System.out.println("MyRunnableeeeeeeee~!!!!!");
            }
        };

        myRunnable.run();   // MyRunnable run()
//        myRunnable.bark();  호출할 수 없음.
    }
}
