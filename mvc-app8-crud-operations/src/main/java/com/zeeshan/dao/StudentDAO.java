/**
 * 
 */
package com.zeeshan.dao;

import java.util.List;

import com.zeeshan.bo.StudentBO;

/**
 * @author ZEESHAN KHAN
 *
 */
public interface StudentDAO {

	public List<StudentBO> getAllStudent();

	public int insert(StudentBO bo);

	public StudentBO getStudentById(int id);

	public int update(StudentBO bo);

	public int deleteById(int id);
}
