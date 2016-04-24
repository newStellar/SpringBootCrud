package org.moto.Repositories;

import org.moto.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nahid on 4/14/2016.
 */

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


}
