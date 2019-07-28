package com.myjavablog.repository;

import com.myjavablog.entity.Todo;
import com.myjavablog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}
