package Student.grade.program;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class StudentGradeFrame {
	JFrame frame;
	private JTextArea txtAreaLog_1;
	private static GradeDAO dao;
	private Component currentComponent;
	
	// 스윙 테이블을 이용하기 위한 멤버 변수 선언
	
	private JTable table;
	private String[] colNames = { "학번", "학년", "이름", "국어", "수학", "영어", "평균", "석차" }; // 테이블 헤더에 들어갈 이름들
	private Object[] records = new Object[colNames.length]; // 테이블 데이터를 저장할 배열 객체
	private DefaultTableModel tableModel;
	
	public StudentGradeFrame () {
		try {
			dao = GradeDAOImple.getInstance();
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100,820,409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnselectstudentid = new JButton("학번검색");
		btnselectstudentid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String TxtAreaLog_1 = txtAreaLog_1.getText();
				

				if (TxtAreaLog_1.isBlank() || TxtAreaLog_1.equals("학번입력")) {
					JOptionPane.showMessageDialog(frame, "학번을 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
					return; // 에러가 발생했으므로 더 이상 진행하지 않고 메서드를 종료합니다.
				}
				
				String studentid = txtAreaLog_1.getText();
				// textAreaLog_1에 있는 텍스트를 문자열 student로 받아줌
				int Studentid = Integer.parseInt(studentid);
				// String studentid를 정수로바꿔주고 Studentid라는 새로운 unt Studentid로 받아줌
				ArrayList<GradeVO> list = dao.select();
				
				if (list.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "학생 정보가 없습니다", "오류", JOptionPane.ERROR_MESSAGE);
					// 학생 정보가 없는 경우, 해당 문구를 출력하고 테이블에 아무것도 표시하지 않도록 처리
					tableModel.setRowCount(0); // 테이블 초기화
				} else {
					System.out.println("학생 정보가 있습니다.");
					//학생 정보가 있는 경우, 해당 문구를 출력하고 테이블에 정보를 표시
					selectGradeTable(Studentid);
					// 마지막으로 int로 받은 Studentid 값을 GradeTable로 받아 보여지게함
					// 테이블에 보여지게만 하면 되니 이거만 있으면 되고 만약 0을넣으면 모든값이 0으로 나오게된다.
				}
			}
		});
		btnselectstudentid.setFont(new Font("나눔고딕",Font.PLAIN,18));
		btnselectstudentid.setBounds(96,71,110,34);
		frame.getContentPane().add(btnselectstudentid);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(302,10,490,312);
		frame.getContentPane().add(scrollPane);
		
		// 테이블 초기화
		tableModel = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				Object value = table.getValueAt(row, col);
				System.out.println(value);
			}
		});
		table.setFont(new Font("굴림",Font.PLAIN,15));
		
		scrollPane.setViewportView(table);
		
		JLabel lblstudentid_1 = new JLabel("학번검색");
		lblstudentid_1.setFont(new Font("나눔고딕",Font.PLAIN,20));
		lblstudentid_1.setBounds(12,10,76,34);
		frame.getContentPane().add(lblstudentid_1);
	}
}
