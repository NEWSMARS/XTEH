package wp.itheima.domain;

public class Student {
		int  studentId;
		String name;
		String password;
		int CLASS;
		int majorOrEle;
		String teacher;
		String selfDescn;
		int role;
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public int getRole() {
			return role;
		}
		public void setRole(int role) {
			this.role = role;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getCLASS() {
			return CLASS;
		}
		public void setCLASS(int cLASS) {
			CLASS = cLASS;
		}
		public int getMajorOrEle() {
			return majorOrEle;
		}
		public void setMajorOrEle(int majorOrEle) {
			this.majorOrEle = majorOrEle;
		}
		public String getTeacher() {
			return teacher;
		}
		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}
		public String getSelfDescn() {
			return selfDescn;
		}
		public void setSelfDescn(String selfDescn) {
			this.selfDescn = selfDescn;
		}
		
		
}
