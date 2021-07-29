package Product;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProductFileDialog {

	public static void main(String[] args) {
		JFrame f = new JFrame("사진 파일 선택하기");
		f.setSize(300, 300);
		productDAO dt = new productDAO();
		
		JButton b = new JButton("New button");
		f.getContentPane().add(b, BorderLayout.CENTER);
		FileDialog file = new FileDialog(f);
		file.setDirectory(".");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				file.setVisible(true);
				
				
				
				String num =JOptionPane.showInputDialog("상품번호 입력");
				String meet1 =  file.getFile();
				try {
					
					dt.create(num, meet1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		f.setVisible(true);

	}

}
//db 컬럼 , dto 컬럼추가 , input 