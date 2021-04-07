package wp.itheima.service;

import java.sql.SQLException;

import wp.itheima.dao.ResourceDao;
import wp.itheima.dao.StudentDao;
import wp.itheima.domain.Resource;
import wp.itheima.domain.Student;

public class ResourceService {

	public int resource_count() {
		ResourceDao dao = new ResourceDao();
		int resource_count = 0;
		try {
			resource_count = (int)dao.resource_count();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resource_count;
	}

	public void delect(int delete_id1) {
		ResourceDao dao = new ResourceDao();
		try {
			dao.delect(delete_id1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

	public Resource findResourceByid(int user_id1) {
		ResourceDao dao = new ResourceDao();
		Resource resource=new Resource();
		try {
			resource=dao.findResourceByid(user_id1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return resource;
	}

	public void change_r(int resourceId1, int categoryId1, String uploader, String name, String descn, String image,
			String code, String level) {
		ResourceDao dao = new ResourceDao();
		try {
			dao.changestudent(resourceId1,categoryId1,uploader,name,descn,image,code,level);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
