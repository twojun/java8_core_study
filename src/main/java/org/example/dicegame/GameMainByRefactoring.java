package org.example.dicegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameMainByRefactoring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("반복 횟수를 입력해 주세요 : ");
        int count = Integer.parseInt(br.readLine());  // 10
        System.out.printf("주사위의 최대 눈의 수를 입력하세요 : ");
        int maxDiceNumber = Integer.parseInt(br.readLine());

        int[] appearanceDiceNumber = new int[maxDiceNumber];

        for (int i = 0; i < count; i++) {
            int randomDiceNumber = (int) (Math.random() * maxDiceNumber) + 1 ;  // 1~6
            appearanceDiceNumber[randomDiceNumber - 1]++;
        }

        // 결과 출력
        for (int i = 0; i < maxDiceNumber; i++) {
            System.out.printf("%d은(는) %d번 나왔습니다.\n", (i + 1), appearanceDiceNumber[i]);
        }

        br.close();
    }
}
