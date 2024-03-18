package com.example.study_auto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Auto {
    public static void getTurn() {
        LocalDate today = LocalDate.now();
        LocalDate startDay = LocalDate.of(2024, 3, 19);
        long diff = ChronoUnit.DAYS.between(startDay, today);
        int dateDiff = (int) (diff / 7);

        String[] studyArr = {"책", "책", "기출", "기출", "sql"};
        String[] memberArr = {"재준", "동윤", "성윤", "세종", "세진"};
        for (int i = 0; i < 5; i++) {
            System.out.println(memberArr[(i + dateDiff) % 5] + " - " + studyArr[i]);
        }
    }
}
