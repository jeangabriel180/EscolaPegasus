package com.alura.scpegasus.infrastructure.adapter.in;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/student")
public class StudentController {

//    @PostMapping("/students")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//
////        //TODO implementar esse cara definir domain
////        response.setStatus(HttpStatus.CREATED.value());
////        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
//
//        return null;
//    }
}
