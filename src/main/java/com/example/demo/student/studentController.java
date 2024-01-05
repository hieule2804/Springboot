package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {

    private final studentService sv;

    @Autowired
    public studentController(studentService sv) {
        this.sv = sv;
    }

    @GetMapping()
    public List<student> hello(){
        return  sv.hello();
    }
}
