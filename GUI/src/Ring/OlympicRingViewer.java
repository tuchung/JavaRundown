package Ring;


import javax.swing.JFrame;

public class OlympicRingViewer {

	public static void main(String[] args) {
		JFrame Frame = new JFrame();
		Frame.setSize(300, 300);
		Frame.setTitle("Olympic Ring");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Ring ring = new Ring();
		Frame.add(ring);
		Frame.setVisible(true);

	}

}
