import java.awt.AWTException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class FieldDiagramWindow extends JPanel {
	// private static final int MAX_SCORE = 20;
	private static final int PREF_W = 590;
	private static final int PREF_H = 353;
	private static final int BORDER_GAP = 30;
	private static final Color GRAPH_COLOR = Color.green;
	private static final Color GRAPH_POINT_COLOR = Color.YELLOW;
	private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
	private static final int GRAPH_POINT_WIDTH = 5;
	private static final double XORIGIN_OFFSET = 40;
	private static final double YORIGIN_OFFSET = 17.75;
	private List<Double[]> data; 

	public FieldDiagramWindow(List<Double[]> pts) {
		this.data = pts;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		try {
			Image bg = ImageIO.read(new File("football.jpg"));
			g2.drawImage(bg, 0, 0, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		double xScale = 4.609999999999998989;// ((double) getWidth() - 2 * BORDER_GAP) / (data.size() - 1);
		double yScale = 5;

		List<Point> graphPoints = new ArrayList<Point>();
		for (int i = 0; i < data.size(); i++) {
			int x1 = (int) (data.get(i)[0] * xScale + BORDER_GAP + XORIGIN_OFFSET);
			int y1 = (int) ((data.get(i)[1]) * yScale + BORDER_GAP + YORIGIN_OFFSET);
			graphPoints.add(new Point(x1, y1));
		}

		// create x and y axes
		// g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
		// g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, getWidth() - BORDER_GAP,
		// getHeight() - BORDER_GAP);

		// create hatch marks for y axis.
		// for (int i = 0; i < Y_HATCH_CNT; i++) {
		// int x0 = BORDER_GAP;
		// int x1 = GRAPH_POINT_WIDTH + BORDER_GAP;
		// int y0 = getHeight() - (((i + 1) * (getHeight() - BORDER_GAP * 2)) /
		// Y_HATCH_CNT + BORDER_GAP);
		// int y1 = y0;
		// g2.drawLine(x0, y0, x1, y1);
		// }

		// and for x axis
		// for (int i = 0; i < scores.size() - 1; i++) {
		// int x0 = (i + 1) * (getWidth() - BORDER_GAP * 2) / (scores.size() - 1) +
		// BORDER_GAP;
		// int x1 = x0;
		// int y0 = getHeight() - BORDER_GAP;
		// int y1 = y0 - GRAPH_POINT_WIDTH;
		// g2.drawLine(x0, y0, x1, y1);
		// }

		Stroke oldStroke = g2.getStroke();
		g2.setColor(GRAPH_COLOR);
		g2.setStroke(GRAPH_STROKE);
		for (int i = 0; i < graphPoints.size() - 1; i++) {
			int x1 = graphPoints.get(i).x;
			int y1 = graphPoints.get(i).y;
			int x2 = graphPoints.get(i + 1).x;
			int y2 = graphPoints.get(i + 1).y;
			g2.drawLine(x1, y1, x2, y2);
		}

		g2.setStroke(oldStroke);
		g2.setColor(GRAPH_POINT_COLOR);
		for (int i = 0; i < graphPoints.size(); i++) {
			int x = graphPoints.get(i).x - GRAPH_POINT_WIDTH / 2;
			int y = graphPoints.get(i).y - GRAPH_POINT_WIDTH / 2;
			;
			int ovalW = GRAPH_POINT_WIDTH;
			int ovalH = GRAPH_POINT_WIDTH;
			g2.fillOval(x, y, ovalW, ovalH);
		}
	}

	public static void copyImage(JPanel panel) throws MalformedURLException, AWTException {
		
		ClipboardImage.write(createImage(panel));
		displayTray();
//		TransferableImage trans = new TransferableImage( i );
//        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
//        c.setContents( trans, this );
		System.out.println("Copied!");
	}
	
	public static BufferedImage createImage(JPanel panel) {

	    int w = panel.getWidth();
	    int h = panel.getHeight();
	    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g = bi.createGraphics();
	    panel.paint(g);
	    g.dispose();
	    return bi;
	}
	
	public static void displayTray() throws AWTException, MalformedURLException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = (new ImageIcon("Novi-Logo2.png")).getImage();
        //Alternative (if the icon is on the classpath):
//        Image image = Toolkit.getToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Image Copied to Clipboard!", 
        		"Your field diagram has been copied to your Windows Clipboard", MessageType.INFO);
    }

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(PREF_W, PREF_H);
	}

	private static void createAndShowGui() {
		List<Double[]> points = new ArrayList<Double[]>();

		FieldDiagramWindow mainPanel = new FieldDiagramWindow(points);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Field Diagram");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton  saveBtn = new JButton(new ImageIcon("wincap.png"));
		ImageIcon icon = new ImageIcon("Novi-Logo.png");
		JLabel	logoLbl = new JLabel(icon);
		final KeyStroke cStroke = KeyStroke.getKeyStroke(KeyEvent.VK_C, 0);
	    final ActionListener cKeyListener = new ActionListener() {
	        public void actionPerformed(final ActionEvent actionEvent) {
	            try {
					copyImage(mainPanel);
				} catch (MalformedURLException | AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    };
		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					copyImage(mainPanel);
				} catch (MalformedURLException | AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		saveBtn.registerKeyboardAction(cKeyListener, cStroke, JButton.WHEN_IN_FOCUSED_WINDOW);
		frame.setContentPane(mainPanel);
		frame.setLayout(null);
		frame.setIconImage(icon
				.getImage());
		saveBtn.setBackground(new Color(13, 170, 82));
		saveBtn.setBounds(555, 320, 40, 40);
		logoLbl.setBounds(555, 0, 40, 40);
		logoLbl.setToolTipText("Dedicated to the Novi Marching Band ©Joshua Huang 2018");
		saveBtn.setToolTipText("Copy Image (Key: C)");
		frame.add(logoLbl);
		frame.add(saveBtn);
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGui();
			}
		});
	}
}