package com.dream.spring6.iocxml.dimap;

/**
 * @Author : huzejun
 * @Date: 2023/2/5-18:56
 */
public class Lesson {

    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
