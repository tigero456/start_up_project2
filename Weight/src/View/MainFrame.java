package View;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
	private JFrame frame;
	
	/* Panel */
	JPanel basePanel = new JPanel(new BorderLayout());
	JPanel LoginPanel;
	JPanel MauePanel;
	JPanel InfoPanel;
	JPanel CalenderPanel;
	JPanel WritPanel;
	
	/* Label */
	JLabel idL = new JLabel("아이디");
	JLabel pwL = new JLabel("비밀번호");
	
	/* TextField */
	JTextField id = new JTextField();
	JPasswordField pw = new JPasswordField();
	
	/* Button */
	JButton loginBtn = new JButton("로그인");
	JButton joinBtn = new JButton("회원가입");
	JButton btnmenu = new JButton("확인");
	JButton exitBtn = new JButton("프로그램 종료");
	
	Operator o = null;
	private final JLabel infopw = new JLabel("비밀번호");
	private final JLabel infoname = new JLabel("이름");
	private final JButton btncal = new JButton("달력");
	private final JButton btnwrite = new JButton("게시판");
	private final JButton btnmenu2 = new JButton("메뉴");
	private final JButton btnmenu3 = new JButton("메뉴");
	private JTextField textFieldpw;
	private JTextField textField_1id;
	private final JLabel infoid = new JLabel("아이디");
	private final JLabel infoppw = new JLabel("비밀번호");
	private final JTextField textFieldname = new JTextField();
	private JTextField Tname = new JTextField();
	
	MainFrame(Operator _o){
		textFieldname.setBounds(0, 10, 116, 21);
		textFieldname.setColumns(10);
		o = _o;
		
		JoinFrame jn = new JoinFrame(_o);
		
		frame = new JFrame();
		setTitle("로그인");
		LoginPanel = new Loginpanel(new ImageIcon("C:/Users/tiger/eclipse-workspace/Weight/image/bind.jpg").getImage());
		MauePanel = new Loginpanel(new ImageIcon("C:/Users/tiger/eclipse-workspace/Weight/image/bind3.jpg").getImage());
		InfoPanel = new Loginpanel(new ImageIcon("C:/Users/tiger/eclipse-workspace/Weight/image/bind2.jpg").getImage());
		CalenderPanel = new Loginpanel(new ImageIcon("C:/Users/tiger/eclipse-workspace/Weight/image/bind2.jpg").getImage());
		WritPanel = new Loginpanel(new ImageIcon("C:/Users/tiger/eclipse-workspace/Weight/image/bind2.jpg").getImage());
		
		//Mauepanel.setBounds(0, 0, 834, 601);
		MauePanel.setVisible(false);
		InfoPanel.setVisible(false);
		WritPanel.setVisible(false);
		CalenderPanel.setVisible(false);
		//Mauepanel.setLayout(null);
		
		frame.setSize(LoginPanel.getWidth(), LoginPanel.getHeight());
		LoginPanel.setLayout(null);
		
		/* Label 크기 작업 */
		idL.setPreferredSize(new Dimension(50, 30));
		pwL.setPreferredSize(new Dimension(50, 30));
		
		/* TextField 크기 작업 */
		id.setPreferredSize(new Dimension(140, 30));
		pw.setPreferredSize(new Dimension(140, 30));
		
		/* Button 크기 작업 */
		loginBtn.setPreferredSize(new Dimension(75, 63));
		joinBtn.setPreferredSize(new Dimension(135, 25));
		//exitBtn.setPreferredSize(new Dimension(135, 25));
		
		/* Panel 추가 작업 */
		setContentPane(basePanel);	//panel을 기본 컨테이너로 설정
		
		basePanel.add(LoginPanel);
		
		basePanel.add(MauePanel);
		
		basePanel.add(InfoPanel);
		
		basePanel.add(WritPanel);

		WritPanel.add(btnmenu3);
		btnmenu3.setBounds(0, 0, 97, 23);
		
		WritPanel.add(btnmenu3);
		btnwrite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginPanel.setVisible(false);
				MauePanel.setVisible(false);
				CalenderPanel.setVisible(true);
				InfoPanel.setVisible(false);
				WritPanel.setVisible(false);
			}
		});
		btnmenu3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginPanel.setVisible(false);
				MauePanel.setVisible(true);
				CalenderPanel.setVisible(false);
				InfoPanel.setVisible(false);
				WritPanel.setVisible(false);
			}
		});
		btnmenu.setFont(new Font("굴림", Font.BOLD, 30));
		InfoPanel.add(btnmenu);
		btnmenu.setBounds(270, 445, 120, 54);
		
		basePanel.add(CalenderPanel);
		btnmenu2.setBounds(0, 0, 97, 23);
		
		CalenderPanel.add(btnmenu2);
		btncal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginPanel.setVisible(false);
				MauePanel.setVisible(false);
				CalenderPanel.setVisible(true);
				InfoPanel.setVisible(false);
				WritPanel.setVisible(false);
			}
		});
		btnmenu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginPanel.setVisible(false);
				MauePanel.setVisible(true);
				CalenderPanel.setVisible(false);
				InfoPanel.setVisible(false);
				WritPanel.setVisible(false);
			}
		});
		
		textField_1id = new JTextField();
		textField_1id.setFont(new Font("굴림", Font.BOLD, 30));
		textField_1id.setBounds(270, 150, 284, 46);
		InfoPanel.add(textField_1id);
		textField_1id.setColumns(10);
		
		textFieldpw = new JTextField();
		textFieldpw.setFont(new Font("굴림", Font.BOLD, 30));
		textFieldpw.setBounds(270, 270, 284, 46);
		InfoPanel.add(textFieldpw);
		textFieldpw.setColumns(10);
		infoid.setFont(new Font("굴림", Font.BOLD, 30));
		infoid.setBounds(160, 150, 100, 35);
		
		InfoPanel.add(infoid);
		infoppw.setFont(new Font("굴림", Font.BOLD, 30));
		infoppw.setBounds(129, 270, 165, 35);
		
		InfoPanel.add(infoppw);
		
		InfoPanel.add(textFieldname);
		
		btnmenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginPanel.setVisible(false);
				MauePanel.setVisible(true);
				CalenderPanel.setVisible(false);
				InfoPanel.setVisible(false);
				WritPanel.setVisible(false);
			}
		});
		
		idL.setForeground(Color.WHITE);
		idL.setFont(new Font("����", Font.BOLD, 30));
		idL.setBounds(153, 273, 100, 35);
		LoginPanel.add(idL);
		id.setFont(new Font("����", Font.PLAIN, 30));
		id.setBounds(272, 262, 284, 46);
		LoginPanel.add(id);
		id.setColumns(10);
		
		pwL.setForeground(Color.WHITE);
		pwL.setFont(new Font("����", Font.BOLD, 30));
		pwL.setBounds(124, 353, 134, 35);
		LoginPanel.add(pwL);
		pw.setFont(new Font("����", Font.PLAIN, 30));
		pw.setColumns(10);
		pw.setBounds(272, 350, 284, 46);
		LoginPanel.add(pw);
		
		/* westPanel 컴포넌트 */
		//westPanel.add(idL);
		//westPanel.add(id);
		//westPanel.add(pwL);
		//westPanel.add(pw);
		
		/* eastPanel 컴포넌트 */
		//eastPanel.add(loginBtn);
		loginBtn.setIcon(new ImageIcon("C:\\Users\\tiger\\OneDrive\\바탕 화면\\운동일지프로그램 이미지\\loginb.png"));
		loginBtn.setFont(new Font("����", Font.BOLD, 25));
		loginBtn.setBounds(581, 284, 134, 56);
		LoginPanel.add(loginBtn);
		
		/* southPanel 컴포넌트 */
		exitBtn.setFont(new Font("Dialog", Font.BOLD, 30));
		MauePanel.add(exitBtn);
		exitBtn.setBounds(451, 400, 255, 51);
		//southPanel.add(joinBtn);
		joinBtn.setIcon(new ImageIcon("C:\\Users\\tiger\\OneDrive\\바탕 화면\\운동일지프로그램 이미지\\joinb.png"));
		joinBtn.setBounds(599, 367, 97, 23);
		LoginPanel.add(joinBtn);
		
		
		/* Button 이벤트 리스너 추가 */
		ButtonListener bl = new ButtonListener();
		
		loginBtn.addActionListener(bl);
		exitBtn.addActionListener(bl);
		joinBtn.addActionListener(bl);
		
		JButton btnInfo = new JButton("내 정보");
		btnInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Database infonnn= new Database();
			String Tname=infonnn.myinfo(id.getText());
			
			textField_1id.setText(id.getText());
			textFieldpw.setText(pw.getText());
			textFieldname.setText(Tname);
			
			LoginPanel.setVisible(false);
			MauePanel.setVisible(false);
			InfoPanel.setVisible(true);
			CalenderPanel.setVisible(false);
			WritPanel.setVisible(false);
			}
		});
		MauePanel.setLayout(null);
		btnInfo.setFont(new Font("����", Font.BOLD, 30));
		btnInfo.setBounds(179, 262, 159, 51);
		MauePanel.add(btnInfo);
		btncal.setFont(new Font("Dialog", Font.BOLD, 30));
		btncal.setBounds(451, 262, 159, 51);
		
		MauePanel.add(btncal);
		btnwrite.setFont(new Font("Dialog", Font.BOLD, 30));
		btnwrite.setBounds(179, 400, 159, 51);
		
		MauePanel.add(btnwrite);
		
		setSize(834, 601);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/* Button 이벤트 리스너 */
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			/* TextField에 입력된 아이디와 비밀번호를 변수에 초기화 */
			String uid = id.getText();
			String upass = "";
			for(int i=0; i<pw.getPassword().length; i++) {
				upass = upass + pw.getPassword()[i];
			}
			
			/* 게임종료 버튼 이벤트 */
			if(b.getText().equals("프로그램 종료")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			/* 회원가입 버튼 이벤트 */
			else if(b.getText().equals("회원가입")) {
				o.jf.setVisible(true);
			}
			
			/* 로그인 버튼 이벤트 */
			else if(b.getText().equals("로그인")) {
				if(uid.equals("") || upass.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호 모두 입력해주세요", "로그인 실패", JOptionPane.ERROR_MESSAGE);
					System.out.println("로그인 실패 > 로그인 정보 미입력");
				}
				
				else if(uid != null && upass != null) {
					if(o.db.logincheck(uid, upass)) {	//이 부분이 데이터베이스에 접속해 로그인 정보를 확인하는 부분이다.
						System.out.println("로그인 성공");
						JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다");
						LoginPanel.setVisible(false);
						MauePanel.setVisible(true);
						//Celenderpanel.setVisible(false);
					} else {
						System.out.println("로그인 실패 > 로그인 정보 불일치");
						JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다");
					}
				}
			}
		}
	}
}

class Loginpanel extends JPanel{
	private Image img;
	public Loginpanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	public int getHeight() {
		return img.getHeight(null);
	}
	public void paintComponent(Graphics q) {
		q.drawImage(img, 0, 0, null);
	}
}