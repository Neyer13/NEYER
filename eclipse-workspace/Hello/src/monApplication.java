import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class monApplication {

	public static void main(String[] args) {
		MaFenetre f = new MaFenetre();
		f.afficher();
		f.afficher("Hello la promo");
	}
}


class MaFenetre {
	javax.swing.JFrame mainFrame = null;
	public MaFenetre() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Mon application");
		mainFrame.addWindowListener(new WindowAdapter(){
			
			class MonautreClasse {
				public void afficher(String message) {
					System.out.println(message);
				}
			}
		public void windowClosing(WindowEvent ev) {
			
			System.exit(0);
		}
		
	    });
		mainFrame.setSize(320, 240);
	}
	
	public void afficher() {
		
		mainFrame.setVisible(true);
		JLabel label = new JLabel("Binvenue dans ma premiere application");
		
		mainFrame.add(label);	
	}
	public void afficher(String message) {
		System.out.println(message);
	}
}