package org.example.anomymousclass;

public class MyRunnableMain3 {

    public static void main(String[] args) {

        /** 생성된 익명 클래스(객체)를 생성하자마자 메소드의 파라미터로 넣음
         * 아래와 같이 넣은 이유는, MyRunnable을 구현하고 있는 객체를 재사용할 일이 없다고 판단했기 때문 */
        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello Main3!");
            }
        });
    }
}
