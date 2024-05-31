package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.FacultyCourseMapping;
import com.klef.jfsd.springboot.repository.CourseRepository;
import com.klef.jfsd.springboot.repository.FacultyCourseMappingRepository;
import com.klef.jfsd.springboot.repository.FacultyRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
    private CourseRepository courseRepository;
    
	@Autowired
    private FacultyRepository facultyRepository;
	
	@Autowired
	private FacultyCourseMappingRepository facultyCourseMappingRepository;
	
	@Override
	public List<Faculty> viewfaculty() 
	{
		return facultyRepository.findAll();
	}


	@Override
	public List<Course> viewallcourses() 
	{
		return courseRepository.findAll();
	}

	@Override
	public Faculty facultybyid(int fid) 
	{
		return facultyRepository.findById(fid).get();
	}

	@Override
	public Course coursebyid(int cid) 
	{
		return courseRepository.findById(cid).get();
	}

	@Override
	public String facultycoursemapping(FacultyCourseMapping fcm) 
	{
		facultyCourseMappingRepository.save(fcm);
		return "Mapping Done";
	}

	@Override
	public List<FacultyCourseMapping> viewfaFacultyCourseMappings() 
	{
		return (List<FacultyCourseMapping>) facultyCourseMappingRepository.findAll();
	}


	@Override
	public long checkfcoursemapping(Faculty f, Course c, int section) 
	{
		return facultyCourseMappingRepository.checkfcoursemapping(f, c, section);
	}

}
