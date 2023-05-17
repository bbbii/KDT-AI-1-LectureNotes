package com.example.demo.lectureClass.jpa.board.service;

import com.example.demo.lectureClass.jpa.board.controller.form.RequestBoardForm;
import com.example.demo.lectureClass.jpa.board.entity.JpaBoard;

import java.util.ArrayList;
import java.util.List;

public interface JpaBoardService {

    // 각종 기능을 가진 인터페이스

    List<JpaBoard> list();

    JpaBoard register(JpaBoard jpaBoard);

    JpaBoard read (Long boardId);

    void delete(Long boardId);


    JpaBoard modify(Long boardId, RequestBoardForm requestBoardForm);
}
