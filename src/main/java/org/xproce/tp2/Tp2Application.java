package org.xproce.tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.tp2.dao.entities.Course;
import org.xproce.tp2.dao.entities.Professor;
import org.xproce.tp2.dao.entities.Session;
import org.xproce.tp2.dao.repositories.CourseRepository;
import org.xproce.tp2.dao.repositories.ProfessorRepository;
import org.xproce.tp2.dao.repositories.SessionRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private SessionRepository sessionRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course  course = new Course();
        course.setDescription("Computer science");
        course.setTitle("CS");
        courseRepository.save(course);
        List<Session>sessions=new ArrayList<>();
        Session session=new Session();
        session.setDate(new Date());
        sessions.add(session);
        sessionRepository.save(session);


        Professor professor = new Professor();

        professor.setName("r");
        professor.setDate_aff(new Date());
        professor.setCourse(course);

        professor.setCourse(course);
        professorRepository.save(professor);


    }
}



