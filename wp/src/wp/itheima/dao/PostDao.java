package wp.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import wp.itheima.domain.Post;
import wp.itheima.domain.Resource;
import wp.itheima.util.DataSourceUtils;

public class PostDao {

	public List<Post> findPost() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from posts ";
		return runner.query(sql, new BeanListHandler<Post>(Post.class));
	}

	public void delect(int delete_id1) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from  posts where postid=?";
		 runner.update(sql,delete_id1);	
		
	}

}
