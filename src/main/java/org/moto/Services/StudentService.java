package org.moto.Services;

import org.moto.Models.Student;
import org.moto.Repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nahid on 4/14/2016.
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepo dao;

    public void createStudent(String name,String email){

        Student ob = new Student();
        ob.setName(name);
        ob.setEmail(email);
        dao.save(ob);

    }
}
