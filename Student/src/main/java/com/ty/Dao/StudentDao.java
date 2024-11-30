package com.ty.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.Dto.Student;

public class StudentDao {
	
	public Student saveStudent(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student student2 = new Student();
		student2.setId(1);
		student2.setName("ajay");
		student2.setPhNo(7997640418l);
		student2.setClgName("audisankara");
		saveStudent(student2);
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}

}
