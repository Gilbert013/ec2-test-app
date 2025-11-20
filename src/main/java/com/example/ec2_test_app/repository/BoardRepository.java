package com.example.ec2_test_app.repository;

import com.example.ec2_test_app.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
