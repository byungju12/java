import javax.swing.*;

import java,awt.*;

public class SwingEx extends JFrame {
	public swingEX() {
		setTitle("스윙 컴포넌트 보이기 예제");
		createMenu();
		createToolBar();
		createSplitepane();
		setSize(500, 400);
		setVisible(true);
}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Sourse"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.setJMenuBar(mb);
	}
       
     private void createToolBar() {
    	 JToolBar bar = new JToolBar("kitae Menu");
    	 
     bar.setBackground(Color.LIGHT_GRAY);
     bar.add(new JButton("new"));
     bar.add(new JButton(new ImageIcon("imges/open.jpg")));
     bar.addSeparator();
     bar.add(new JButton(new ImageIcon("imges/save.jpg")));
     bar.add(new JLabel("search"));
     bar.add(new JTextField("xtet field"));
     
     JComboBox<String> combo = new JComboBox<String>();
     combo.addItem("java");
     combo.addItem("C#");
     combo.addItem("C");
     combo.addItem("C++");
     bar.add(combo);
     add(bar, BorderLayout.NORTH);
     