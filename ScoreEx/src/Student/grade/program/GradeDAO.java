package Student.grade.program;
import java.util.ArrayList;

public interface GradeDAO {
	
	// 교사는 모든기능 사용 가능
	// 성적입력 (teacher id) 교사만 학생 성적 등록 가능 
		public abstract int insert(GradeVO vo);
	// 성적 전체 리스트 검색 , 교사만 전체 리스트 검색 가능
		public abstract ArrayList<GradeVO> select();
	// 학생은 성적 정보 인덱스 검색만 가능
		public abstract GradeVO select(int studentId);
	// 성적 정보 인덱스 수정 교사만 학생의 정보 수정가능
		public abstract int update(int studentID, GradeVO vo);
	// 성적 정보 인덱스 삭제 교사만 학생의 정보 삭제 가능
		public abstract int delete(int studentId);

}
