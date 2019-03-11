package Bot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();

	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		// FOR TEXTAREA
		Chatarea.setSize(500, 400);
		Chatarea.setLocation(2, 2);

		// FOR TEXTFIELD
		chatbox.setSize(540, 30);
		chatbox.setLocation(2, 500);

		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU ->" + gtext + "\n");
				chatbox.setText("");

				if (gtext.contains("hallo")) {
					bot("Hallo");
				}
				if (gtext.contains("bitch")) {
					bot("Danke, ebenfalls!");
				}
				if (gtext.contains("hi")) {
					bot("Hi");
				}
				if (gtext.contains("moin")) {
					bot("Moin");
				}
				if (gtext.contains("huhu")) {
					bot("Huhu");
				}
				
				if (gtext.contains("servas")) {
					bot("Servas");
				}
				if (gtext.contains("servus")) {
					bot("Servus");
				}
				if (gtext.contains("wie geht's ,wie steht's")) {
					bot("Mir geht's gut, wie geht's dir?");
				}
				if (gtext.contains("wie geht's dir")) {
					bot("Mir geht's gut!" + " Wie geht es dir?");
				}
				if (gtext.contains("wie geht es dir")) {
					bot("Mir geht's gut!" + " Wie geht es dir?");
				}
				if (gtext.contains("wie geht's euch")) {
					bot("Uns geht's gut!" + " Wie geht es euch?");
				}
				if (gtext.contains("wie geht es euch")) {
					bot("Uns geht's gut!" + " Wie geht es euch?");
				}
				if (gtext.contains("wie ist das wetter")) {
					bot("Das Wetter ist schön, wie ist das Wetter bei dir?");
				}
				if (gtext.contains("wie gehts")) {
					bot("Gut, dir?");
				}
				if (gtext.contains("gut")) {
					bot("Das freut mich!");
				}
			}

		});

	}

	private void bot(String string) {
		Chatarea.append("BOT ->" + string + "\n");
	}

	public static void main(String[] args) {
		new Bot();
	}

}
