package Student.grade.program;

public class StudentVO {
	// 멤버 변수
	
	private String id; //
	private String pw; //
	private String name;
	private int classyear;
	private String email;
	
	// 기본 생성자
	
	public StudentVO() {
		
	}
	
	// 매개 변수 생성자
	public StudentVO(String id, String pw, String name, int classyear, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.classyear = classyear;
		this.email = email;
 }
// getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassyear() {
		return classyear;
	}

	public void setClassyear(int classyear) {
		this.classyear = classyear;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", " + "pw=" + pw + ", " + "name=" + name + ", " + "classyear=" + classyear + ","
				+ " email=" + email + "]";
	}
	
}