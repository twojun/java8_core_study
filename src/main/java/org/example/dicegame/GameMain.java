package org.example.dicegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameMain {

    public static void main(String[] args) throws IOException {
        System.out.print("반복 횟수를 입력해 주세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;

        for (int i = 0; i < count; i++) {
            int randomDiceNumber = (int) (Math.random() * 6);

            if (randomDiceNumber >= 1 && randomDiceNumber < 2) {
                System.out.println(randomDiceNumber);
                d1++;
            } else if (randomDiceNumber >= 2 && randomDiceNumber < 3) {
                System.out.println(randomDiceNumber);
                d2++;
            } else if (randomDiceNumber >= 3 && randomDiceNumber < 4) {
                System.out.println(randomDiceNumber);
                d3++;
            } else if (randomDiceNumber >= 4 && randomDiceNumber < 5) {
                System.out.println(randomDiceNumber);
                d4++;
            } else if (randomDiceNumber >= 5 && randomDiceNumber < 6) {
                System.out.println(randomDiceNumber);
                d5++;
            } else if (randomDiceNumber >= 6 && randomDiceNumber < 7) {
                System.out.println(randomDiceNumber);
                d6++;
            }
        }

        // 결과 출력
        System.out.printf("1은 %d번 나왔습니다.\n", d1);
        System.out.printf("2는 %d번 나왔습니다.\n", d2);
        System.out.printf("3은 %d번 나왔습니다.\n", d3);
        System.out.printf("4는 %d번 나왔습니다.\n", d4);
        System.out.printf("5는 %d번 나왔습니다.\n", d5);
        System.out.printf("6은 %d번 나왔습니다.\n", d6);

        br.close();
    }
}
