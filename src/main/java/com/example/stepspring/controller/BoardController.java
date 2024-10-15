package com.example.stepspring.controller;

import com.example.stepspring.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BoardController {

    @GetMapping("hello")
    public String hello(String name) {
        return "Hello " + name;
    }

    @GetMapping("/getboard")
    public BoardVO getboard() {
        BoardVO board = new BoardVO();
        board.setSeq(1);
        board.setAuthor("테스터");
        board.setTitle("테스트");
        board.setDay(new Date());
        board.setContent("테스트 입니다.");
        board.setWriter("tester");
        board.setStatus(0);
        return board;
    }
}
