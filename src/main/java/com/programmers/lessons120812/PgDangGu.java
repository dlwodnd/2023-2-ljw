package com.programmers.lessons120812;

import java.util.Arrays;

public class PgDangGu {
    public static void main(String[] args) {
        int[][] ex = {{3, 3}, {2, 7}, {7, 3}};
        int[] result = DangGu.solution(10, 10, 3, 7, ex);
        System.out.println(Arrays.toString(result));
    }
}

class DangGu {
    public static int[] solution(int x, int y, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        for (int i = 0; i < balls.length; i++) {
            int a = ((y - startY) + (y - balls[i][1])) * ((y - startY) + (y - balls[i][1]))+ (Math.abs(startX - balls[i][0]) * Math.abs(startX - balls[i][0]));
            int b = (startY + balls[i][1]) * (startY + balls[i][1]) + (Math.abs(startX - balls[i][0]) * Math.abs(startX - balls[i][0]));
            int c = (startX + balls[i][0]) * (startX + balls[i][0]) + Math.abs(startY - balls[i][1]) * Math.abs(startY - balls[i][1]);
            int d = ((x - startX) + (x - balls[i][0])) * ((x - startX) + (x - balls[i][0])) + (Math.abs(startY - balls[i][1]) * Math.abs(startY - balls[i][1]));
            int[] news = {a, b, c, d};

            int min = Integer.MAX_VALUE;
            if (balls[i][1] == startY) {
                if (y - startY > startY) {
                    answer[i] = (startY * 2) * (startY * 2) + (startX - balls[i][0]) * (startX - balls[i][0]);
                } else {
                    answer[i] = ((y - startY) * 2) * ((y - startY) * 2) + (startX - balls[i][0]) * (startX - balls[i][0]);
                }
            } else if (balls[i][0] == startX) {
                if (x - startX > startX) {
                    answer[i] = (int)Math.pow((startX * 2),2) + (int)Math.pow((startY - balls[i][1]),2);
                } else {
                    answer[i] = ((x - startX) * 2) * ((x - startX) * 2) + (startY - balls[i][1]) * (startY - balls[i][1]);
                }
            } else if (balls[i][0] != startX && balls[i][1] != startY) {
                for (int j = 0; j < news.length; j++) {
                    if (min > news[j]) {
                        min = news[j];
                    }
                }
                answer [i] = min;
            }
        }
        return answer;
    }
}