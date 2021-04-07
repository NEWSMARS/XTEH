package wp.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import wp.itheima.domain.Resource;
import wp.itheima.domain.Student;
import wp.itheima.util.DataSourceUtils;

public class ResourceDao {

	public long resource_count() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "SELECT  count(*) from resource ";
		return (long) runner.query(sql,new ScalarHandler());
	}

	public List<Resource> findresource() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from resource ";
		return runner.query(sql, new BeanListHandler<Resource>(Resource.class));
	}

	public void delect(int delete_id1) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from  resource where resourceid=?";
		 runner.update(sql,delete_id1);	
		
	}

	public Resource findResourceByid(int user_id1) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from Resource where Resourceid=?";
		return (Resource) runner.query(sql, new BeanHandler<Resource>(Resource.class),user_id1);
		
	}

	public void changestudent(int resourceId1, int categoryId1, String uploader, String name, String descn,
			String image, String code, String level) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update resource set categoryId=?,uploader=?,name=?,descn=?,image=?,code=?,level=? where resourceId=? ";
		 runner.update(sql,categoryId1,uploader,name,descn,image,code,level,resourceId1);	
		
	}

}
