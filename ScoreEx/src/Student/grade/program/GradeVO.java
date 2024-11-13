package Student.grade.program;

public class GradeVO {
	// 멤버 변수
	private int studentId; //학생 번호
	private String studentName; //학생 이름
	private int classyear; // 학년 정보
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	private double avg; // 평균점수
	private int rank; // 학생 등수
	
	public GradeVO(int studentId, String studentName, int classyear, int kor, int eng, int math) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.classyear = classyear;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math) / 3.0;
//혹시 오류나면 여기부터 확인해보자
//		double.Avg = (kor + eng + math) / 3.0 ;
//		this.avg = Avg;
	}

	public GradeVO() {
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getClassyear() {
		return classyear;
	}

	public void setClassyear(int classyear) {
		this.classyear = classyear;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "GradeVO [studentId=" + studentId + ", studentName=" + studentName + ", classyear=" + classyear
				+ ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", rank =" + rank + "]";
	}



}
