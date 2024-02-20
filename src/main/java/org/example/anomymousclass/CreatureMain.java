package org.example.anomymousclass;

class Creature {
    public void bark() {
        System.out.println("동물이 울거나 짖는다.");
    }

    public void bark2(Creature creature) {
        creature.bark();
    }
}

public class CreatureMain {

    public static void main(String[] args) {
        Creature cat = new Creature() {
            @Override
            public void bark() {
                System.out.println("고양이가 운다.");
            }

            public void barkkkkkk() {
                System.out.println("고양이가 또 우네?.");   // 자식 레벨에서 정의한 메서드 호출 불가 (사용X)
            }
        };

        cat.bark();  // 고양이가 운다.

        Creature dog = new Creature();
        dog.bark2(new Creature() {
            @Override
            public void bark() {
                System.out.println("개가 짖기도 한다.");
            }
        });
    }
}
