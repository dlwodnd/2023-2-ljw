package com.programmers.lessons120812;

import java.util.Arrays;

public class PgDangGu {
    public static void main(String[] args) {
        int[][] ex = {{3, 3}, {2, 7}};
        int[] result = DangGu.solution(10, 10, 3, 7, ex);
        System.out.println(Arrays.toString(result));
    }
}

class DangGu {
    public static int[] solution(int x, int y, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        for (int i = 0; i < balls.length; i++) {
            if (balls[i][1] == startY) {
                if (y - startY > startY) {
                    answer[i] = (startY * 2) * (startY * 2) + (startX - balls[i][0]) * (startX - balls[i][0]);
                } else {
                    answer[i] = ((y - startY)*2) *((y - startY)*2) + (startX - balls[i][0]) * (startX - balls[i][0]);
                }
            } else if (balls[i][0] == startX) {
                if (x - startX > startX) {
                    answer[i] = (startX * 2) * (startX * 2)+ (startY - balls[i][1]) * (startY - balls[i][1]);
                } else {
                    answer[i] = ((x - startX)*2) * ((x - startX)*2) + (startY - balls[i][1]) * (startY - balls[i][1]);
                }
            }
        }
        return answer;
    }
}