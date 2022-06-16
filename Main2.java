import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main2 {
	public static void main(String[] args) throws Exception {
		int interval = 428;
		Robot r = new Robot();
		Note[] note = new Note[] {
//				new Note('Z'),
//				new Note('X'),
//				new Note('C'),
//				new Note('V'),
//				new Note('B'),
//				new Note('N'),
//				new Note('M'),
//				new Note('A'),
//				new Note('S'),
//				new Note('D'),
//				new Note('F'),
//				new Note('G'),
//				new Note('H'),
//				new Note('J'),
//				new Note('Q'),
//				new Note('W'),
//				new Note('E'),
//				new Note('R'),
//				new Note('T'),
//				new Note('Y'),
//				new Note('U'),
				
				new Note('Z'),
				new Note('X'),
				new Note('C'),
				new Note('V'),
				new Note('B'),
				new Note('N'),
				new Note('M'),
				
				new Note('A'),
				new Note('S'),
				new Note('D',-2,14,24,25, 30),
				new Note('F'),
				new Note('G',-1,7,8,11,15,22,24.5, 31,39,55),
				new Note('H',0,1,9,10.5,12,16,17,21,23, 32,33,48,53,53.5,56),
				new Note('J',2,10,18,20, 34,52),
				
				new Note('Q',3,19, 35,44),
				new Note('W',5,6, 37,38,43.5,47),
				new Note('E',4, 36,40,42.5,46,47.5),
				new Note('R',41),
				new Note('T',42),
				new Note('Y'),
				new Note('U'),
				
				new Note("ZVNAF", 0, 2, 16, 18, 32, 34, 48, 50),
				new Note("CBMDG", 4, 6,  36, 38),
				new Note("XBMSG", 8, 10, 20, 22, 40, 42, 52),
				new Note("ZCNA", 28, 29, 30, 31),
				new Note("ZCNAD", 12, 14, 24, 26, 44, 46, 56, 58, 60, 62),
				
				new Note("ZCNADH", 64.6),
				
//				new Note("Z",64.5),
//				new Note("C",64.6),
//				new Note("N",64.7),
//				new Note("A",64.8),
//				new Note("D",64.9),
//				new Note("H",65),
				
				
				new Note('#', 66),

			};
		long now = System.currentTimeMillis(), last;
		long start = now + 5000;
//		boolean pressed[] = new boolean[1000];
a:		for (;;) {
			Thread.sleep(12);
			last = now;
			now = System.currentTimeMillis();
			for (Note n : note) {
				for (double b : n.begin) {
					if (last - start <= b * interval && b * interval < now - start) {
						if (n.key == '#') {
//							for (int i = 0; i < pressed.length; i++) {
//								if (pressed[i]) r.keyRelease(i);
//							}
							break a;
						}
//						if (pressed[n.key]) r.keyRelease(n.key);
						new Thread() {
							public void run() {
								if (n.key != -1) r.keyPress(n.key);
								else for (int i = 0; i < n.key1.length(); i++) r.keyPress(n.key1.charAt(i));
								try {
									sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								if (n.key != -1) r.keyRelease(n.key);
								else for (int i = 0; i < n.key1.length(); i++) r.keyRelease(n.key1.charAt(i));
							}
						}.start();
						
//						pressed[n.key] = true;
					}
				}
				
			}
			
		}
	}
}
