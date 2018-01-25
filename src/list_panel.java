	import java.awt.*;
	import javax.swing.*;
	import javax.swing.event.*;

	public class list_panel extends JPanel {
		public JLabel label;
		public JList image_list;
		public list_panel(JLabel image_name) {
			label = image_name;
			String [] names = {"vodafonepark.jpg" , "sun.jpg"};
			image_list = new JList(names);
			image_list.addListSelectionListener(new List_Listener());
			image_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			add(image_list);
			setBackground(Color.WHITE);
		}
		public class List_Listener implements ListSelectionListener {
			public void valueChanged(ListSelectionEvent event) {
				if (image_list.isSelectionEmpty())
					label.setIcon(null);
				else {
					String name = (String) image_list.getSelectedValue();
					ImageIcon image = new ImageIcon(name);
					label.setIcon(image);
				}
			}
		}
	}
