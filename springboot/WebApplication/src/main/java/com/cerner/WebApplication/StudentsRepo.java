package com.cerner.WebApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends JpaRepository<Students, String> {

}
