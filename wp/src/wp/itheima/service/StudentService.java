package wp.itheima.service;

import java.sql.SQLException;
import java.util.List;


import wp.itheima.dao.StudentDao;
import wp.itheima.domain.Student;

public class StudentService {

	public int student_count() {
		StudentDao dao = new StudentDao();
		int student_count = 0;
		try {
			student_count = (int)dao.student_count();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student_count;
	}

	public int teacher_count() {
		StudentDao dao = new StudentDao();
		int teacher_count = 0;
		try {
			teacher_count = (int)dao.teacher_count();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher_count;
	}

	public List<Student> findStudentByType(String ptype,int page) {
		StudentDao dao = new StudentDao();
		Integer i = new Integer(ptype).intValue();
		List<Student> StudentList = null;
		try {
			StudentList = dao.findProductListByType(i,page);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return StudentList;
	}

	public List<Student> findStudentByType1(String ptype, int page) {
		StudentDao dao = new StudentDao();
		Integer i = new Integer(ptype).intValue();
		List<Student> StudentList = null;
		try {
			StudentList = dao.findProductListByType1(i,page);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return StudentList;
	}

	public int addstudent(String name, String password, int clASS1, byte majorOrEle, String teacher,
			String selfDescn) {
		StudentDao dao = new StudentDao();
		try {
			dao.addstudent(name,password,clASS1,majorOrEle,teacher,selfDescn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

	public void delect(int delect_id) {
		StudentDao dao = new StudentDao();
		try {
			dao.delect(delect_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	public Student findStudentByid(int user_id1) {
		StudentDao dao = new StudentDao();
		Student student=new Student();
		try {
			student=dao.findStudentByid(user_id1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return student;
	}

	public void changestudent(Integer id1, String name, String password, int clASS1, byte majorOrEle, String teacher,
			String selfDescn) {
		StudentDao dao = new StudentDao();
		try {
			dao.changestudent(id1,name,password,clASS1,majorOrEle,teacher,selfDescn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Student> findStudentByType2(String string, int i) {
		StudentDao dao = new StudentDao();
		List<Student> StudentList = null;
		try {
			StudentList = dao.findProductListByType2();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return StudentList;
	}

	public void changestudent(Integer id1, String name, String password, int clASS1, String selfDescn) {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDao();
		try {
			dao.changestudent(id1,name,password,clASS1,selfDescn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
