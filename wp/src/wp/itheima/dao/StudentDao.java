package wp.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;



import wp.itheima.domain.Student;
import wp.itheima.util.DataSourceUtils;



public class StudentDao {

	public long student_count() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "SELECT  count(*) from students where role=1";
		return (long) runner.query(sql,new ScalarHandler());
	}

	public long teacher_count() throws SQLException{
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "SELECT  count(*) from students where role=2";
		return (long) runner.query(sql,new ScalarHandler());
	}

	public List<Student> findProductListByType(Integer i, int page) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from students where role=1";
		return runner.query(sql, new BeanListHandler<Student>(Student.class));
	}

	public List<Student> findProductListByType1(Integer i, int page) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from students where role=1";
		return runner.query(sql, new BeanListHandler<Student>(Student.class));
	}

	public void addstudent(String name, String password, int clASS1, byte majorOrEle, String teacher,
			String selfDescn) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into students values(?,?,?,?,?,?,?,?)";
		runner.update(sql,null,name,password,clASS1,majorOrEle,teacher,selfDescn,1);
		
	}

	public void delect(int delect_id) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from  Students where studentid=?";
		 runner.update(sql,delect_id);	
	}

	public Student findStudentByid(int user_id1) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from students where studentid=?";
		return (Student) runner.query(sql, new BeanHandler<Student>(Student.class),user_id1);
		
	}

	public void changestudent(Integer id1, String name, String password, int clASS1, byte majorOrEle, String teacher,
			String selfDescn) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update students set name=?,password=?,class=?,majorOrEle=?,teacher=?,selfDescn=? where studentid=? ";
		 runner.update(sql,name,password,clASS1,majorOrEle,teacher,selfDescn,id1);	
		
	}

	public List<Student> findProductListByType2() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from students where role=2";
		return runner.query(sql, new BeanListHandler<Student>(Student.class));
	}

	public void changestudent(Integer id1, String name, String password, int clASS1, String selfDescn) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update students set name=?,password=?,class=?,selfDescn=? where studentid=? ";
		 runner.update(sql,name,password,clASS1,selfDescn,id1);	
	}



		
}
