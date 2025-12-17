package com.example.demo.repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.Jpa.repository;
@Repository
public interface studentrepository extends JpaRepository<studententity,Integer>{

}