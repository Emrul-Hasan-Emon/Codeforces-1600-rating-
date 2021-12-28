package currencyConverter;

import java.awt.EventQueue;

public class CurrencyConverter {

	public static void main(String[] args)  {
            

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Create and show main window at startup
					MainWindow mainWindow = new MainWindow();
					mainWindow.setVisible(true);
                                        
                                        
				} catch (Exception e) {
					e.printStackTrace();
				}
                                
                                
			}
		});
	}
}
