package com.example.ec2_test_app.service;

import com.example.ec2_test_app.domain.Board;
import com.example.ec2_test_app.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    //생성자 주입 방식으로 의존성 주입
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //게시글 저장
    public Board saveBoard(Board board){
        return boardRepository.save(board);
    }

    //모든 게시글 조회
    public List<Board> getAllBoards(){
        return boardRepository.findAll();
    }
}
