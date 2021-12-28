package currencyConverter;

import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class AboutWindow extends JFrame {
                 private JPanel contentPane;
	private static AboutWindow windowInstance = null;

	/**
	 * Create the aboutWindow frame
	 */
	private AboutWindow() {
		
		setBounds(100, 100, 347, 260);
		setLocationRelativeTo(null);
		setResizable( false );

		// Window components
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(null);

		// label "title"
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(65, 12, 219, 33);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);

		// label "version"
		JLabel lblVersion = new JLabel("Convert the currency between USD, BDT and Euro");
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(15, 60, 300, 33);
		contentPane.add(lblVersion);
                                   
		
		
	}

	// Check if the window is already created to launch only one instance of the window.
	public static AboutWindow getInstance() {
		if (windowInstance == null) {
			windowInstance = new AboutWindow();
		}
		 return windowInstance;
	}
}