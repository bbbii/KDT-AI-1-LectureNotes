package com.example.demo.lectureTest;

import com.example.demo.lectureClass.testCode.lecture.entity.TestLecture;
import com.example.demo.lectureClass.testCode.lecture.service.TestLectureService;
import com.example.demo.lectureClass.testCode.student.entity.TestStudent;
import com.example.demo.lectureClass.testCode.student.service.TestStudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LectureTest {

    @Autowired
    private TestLectureService testLectureService;

    @Autowired
    private TestStudentService testStudentService;

    @Test
    @DisplayName("x 학생이 A 강의 신청 하기")
    void studentRegisterLecture () {
        final String expected = "Math";
        TestStudent testStudent = new TestStudent("x"); // 원래라면 RequestForm 형태여야함
        testStudentService.register(testStudent); // 학생이 사이트에 가입을 해야하기 때문 (현재는 정보 없음)

        if (testStudent == null) {
            System.out.println("닉네임이 같아 생성하지 않았습니다!");
            return;
        }

        final TestLecture testLecture = testLectureService.register(expected, testStudent.getId());
        final String actual = testLecture.getLectureName();

        assertEquals(expected, actual);
    }
}
