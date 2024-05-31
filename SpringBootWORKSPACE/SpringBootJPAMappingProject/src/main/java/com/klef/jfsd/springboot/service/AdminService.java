package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.FacultyCourseMapping;

public interface AdminService 
{ 
  public List<Course> viewallcourses();
  public List<Faculty> viewfaculty();
  public Faculty facultybyid(int fid);
  public Course coursebyid(int cid);
  
  public String facultycoursemapping(FacultyCourseMapping fcm);
  public List<FacultyCourseMapping> viewfaFacultyCourseMappings();
  
  public long checkfcoursemapping(Faculty f,Course c,int section);
}
