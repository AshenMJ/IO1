package com.example.punkty.db;

import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<StudentRow,Long>
{

}