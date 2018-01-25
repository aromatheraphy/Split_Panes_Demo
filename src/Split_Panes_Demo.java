import java.awt.*;
import javax.swing.*;

public class Split_Panes_Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Split Panes Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel image_label = new JLabel();
		JPanel image_panel = new JPanel();
		image_panel.add(image_label);
		image_panel.setBackground(Color.WHITE);
		
		list_panel list_image = new list_panel(image_label);
		
		JSplitPane splitp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,list_image,image_panel);
		
		splitp.setOneTouchExpandable(true);
		
		frame.getContentPane().add(splitp);
		frame.pack();
		frame.setVisible(true);
	}
}
