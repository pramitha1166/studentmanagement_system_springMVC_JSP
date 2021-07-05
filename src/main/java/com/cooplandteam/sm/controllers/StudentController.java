package com.cooplandteam.sm.controllers;

import com.cooplandteam.sm.api.Student;
import com.cooplandteam.sm.api.StudentDTO;
import com.cooplandteam.sm.dao.StudentDAO;
import com.cooplandteam.sm.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/get-students")
    public String getStudentList(Model model) {

        List<Student> studentList = service.listAllStudents();

//        for(Student tempStudent: studentList) {
  //          System.out.println(tempStudent.getName());
      //      System.out.println(tempStudent.getCountry());
    //    }

        model.addAttribute("students", studentList);

        return "student-list";
    }

    @GetMapping("/saveStudentPage")
    public String getSaveStudentPage(Model model) {

        model.addAttribute("student", new StudentDTO());
        return "add-student";
    }

    @PostMapping("/save-student")
    public String saveStudent(StudentDTO studentDTO) {
       // System.out.println("student saved..");
       // System.out.println(studentDTO);

        service.saveStudent(studentDTO);

        return "redirect:/get-students";
    }

    @PutMapping("/update-student")
    public String updateStudent(StudentDTO studentDTO, @ModelAttribute("id") int id) {

        System.out.println(studentDTO);
        //System.out.println(id);

        service.updateStudent(studentDTO.getId(), studentDTO);

        return "redirect:/get-students";
    }

    @GetMapping("/update")
    public String updateStudentPage(Model model, @RequestParam("userId") int id) {

        StudentDTO studentDTO = service.getSingleStudent(id);
        model.addAttribute("student", studentDTO);

        return "update-student";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("userId") int id) {

        System.out.println(id);
        service.deleteStudent(id);
        return "redirect:/get-students";
    }

}
