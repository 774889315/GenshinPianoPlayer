import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
	public static void main(String[] args) throws Exception {
		int interval = 631;
		Robot r = new Robot();
//		Note[] note = new Note[] {
//			new Note('D', 0, 1),
//			new Note('D', 1, 1),
//			new Note('F', 2, 1),
//			new Note('G', 3, 1),
//			new Note('G', 4, 1),
//			new Note('F', 5, 1),
//			new Note('D', 6, 1),
//			new Note('S', 7, 1),
//			new Note('A', 8, 1),
//			new Note('A', 9, 1),
//			new Note('S', 10, 1),
//			new Note('D', 11, 1),
//			new Note('D', 12, 1.5),
//			new Note('S', 13.5, 0.5),
//			new Note('S', 14, 2),
//			new Note('D', 16, 1),
//			new Note('D', 17, 1),
//			new Note('F', 18, 1),
//			new Note('G', 19, 1),
//			new Note('G', 20, 1),
//			new Note('F', 21, 1),
//			new Note('D', 22, 1),
//			new Note('S', 23, 1),
//			new Note('A', 24, 1),
//			new Note('A', 25, 1),
//			new Note('S', 26, 1),
//			new Note('D', 27, 1),
//			new Note('S', 28, 1.5),
//			new Note('A', 29.5, 0.5),
//			new Note('A', 30, 2),
//			new Note('#', 32),
//		};
		Note[] note = new Note[] {
				new Note('H', -1),
				new Note('J', -0.5),
				
				new Note('N', 0),
				new Note('D', 0),
//				new Note('H', 1),
//				new Note('J', 1.5),
//				new Note('Q', 2),
				
				new Note('Q', 0),
				new Note('J', 1.5),
				new Note('Q', 2),
				new Note('E', 3),
				
				new Note('B', 4),
				new Note('S', 4),
//				new Note('G', 5),
//				new Note('H', 5.5),
//				new Note('J', 6),
				
				new Note('J', 4),
				new Note('D', 7),
				
				new Note('V', 8),
				new Note('A', 8),
//				new Note('F', 9),
//				new Note('G', 9.5),
//				new Note('H', 10),
				
				new Note('H', 8),
				new Note('G', 9.5),
				new Note('H', 10),
				new Note('Q', 11),
				
				new Note('C', 12),
				new Note('M', 12),
//				new Note('D', 13),
//				new Note('F', 13.5),
//				new Note('G', 14),
				
				new Note('G', 12),
				new Note('D', 15),
				
				new Note('X', 16),
				new Note('N', 16),
//				new Note('S', 17),
//				new Note('D', 17.5),
//				new Note('F', 18),
				
				new Note('F', 16),
				new Note('D', 17.5),
				new Note('F', 18),
				new Note('Q', 19),
				
				new Note('Z', 20),
				new Note('B', 20),
//				new Note('A', 21),
//				new Note('S', 21.5),
//				new Note('D', 22),
				
				new Note('D', 20),
				new Note('S', 21.5),
				new Note('D', 22),
				new Note('Q', 23),
				
				new Note('X', 24),
				new Note('N', 24),
//				new Note('S', 25),
//				new Note('D', 25.5),
//				new Note('F', 26),
				
				new Note('J', 24),
				new Note('F', 25.5),
				new Note('F', 26),
				new Note('J', 27),
				
				new Note('B', 28),
				new Note('S', 28),
//				new Note('G', 29),
//				new Note('H', 29.5),
//				new Note('J', 30),
				
				new Note('J', 28),
				new Note('H', 31),
				new Note('J', 31.5),
				
				new Note('N', 32),
				new Note('D', 32.5),
				new Note('H', 33),
//				new Note('J', 33.5),
//				new Note('Q', 34),
				
				new Note('Q', 32),
				new Note('J', 33.5),
				new Note('Q', 34),
				new Note('E', 35),
				
				new Note('B', 36),
				new Note('S', 36.5),
				new Note('G', 37),
				new Note('H', 37.5),
				new Note('J', 38),
				
				new Note('J', 36),
				new Note('D', 39),
				
				new Note('V', 40),
				new Note('A', 40.5),
				new Note('F', 41),
//				new Note('G', 41.5),
//				new Note('H', 42),
				
				new Note('H', 40),
				new Note('G', 41.5),
				new Note('H', 42),
				new Note('Q', 43),
				
				new Note('C', 44),
				new Note('M', 44.5),
				new Note('D', 45),
				new Note('F', 45.5),
				new Note('G', 46),
				
				new Note('G', 44),
				new Note('D', 47),
				
				new Note('X', 48),
				new Note('N', 48.5),
				new Note('S', 49),
				new Note('D', 49.5),
				new Note('F', 50),
				new Note('C', 52),
				new Note('M', 52.5),
				new Note('D', 53),
				new Note('F', 53.5),
//				new Note('G', 54),
				
				new Note('F', 48),
				new Note('Q', 49),
				new Note('J', 49.5),
				new Note('Q', 50.5),
				new Note('W', 52),
				new Note('E', 53),
				new Note('Q', 53.5),
				
				new Note('V', 56),
				new Note('A', 56.5),
				new Note('F', 57),
				new Note('B', 58),
				new Note('S', 58),
				
				new Note('Q', 56),
				new Note('J', 56.5),
				new Note('H', 57),
				new Note('J', 58),
				new Note('G', 59),
				
				new Note('N', 60),
				new Note('D', 60.5),
				new Note('H', 61),
				new Note('J', 61.5),
				new Note('K', 62),
				new Note('Q', 63),
				
				new Note('H', 60),
				
				new Note('N', 64),
				new Note('D', 64.5),
				new Note('H', 65),
				new Note('J', 65.5),
				new Note('K', 66),
//				new Note('Q', 67),
				
				new Note('N', 68),
				new Note('D', 68.5),
				new Note('H', 69),
				new Note('J', 69.5),
				new Note('Q', 70),
				
				new Note('Q', 67),
				new Note('W', 67.5),
				new Note('E', 68),
				new Note('W', 69.5),
				new Note('E', 70),
				new Note('T', 71),
				
				new Note('B', 72),
				new Note('S', 72.5),
				new Note('G', 73),
				new Note('H', 73.5),
				new Note('J', 74),
				
				new Note('W', 72),
				new Note('G', 75),
				
				new Note('V', 76),
				new Note('A', 76.5),
				new Note('F', 77),
				new Note('G', 77.5),
				new Note('H', 78),
				
				new Note('Q', 76),
				new Note('J', 77.5),
				new Note('Q', 78),
				new Note('E', 79),
				
				new Note('C', 80),
				new Note('M', 80.5),
				new Note('D', 81),
				new Note('F', 81.5),
				new Note('G', 82),
				
				new Note('E', 80),
				
				new Note('V', 84),
				new Note('A', 84.5),
				new Note('F', 85),
				new Note('B', 86),
				new Note('S', 86.5),
				new Note('G', 87),
				
				new Note('H', 84),
				new Note('J', 84.5),
				new Note('Q', 85),
				new Note('J', 86),
				new Note('Q', 86.5),
				new Note('W', 87),
				
				new Note('Z', 88),
				new Note('B', 88.5),
				new Note('A', 89),
				new Note('D', 89.5),
//				new Note('G', 90),
				
				new Note('Q', 88),
				new Note('G', 90),
				
				new Note('X', 92),
				new Note('N', 92.5),
				new Note('S', 93),
				new Note('F', 93.5),
				new Note('H', 94),
				
				new Note('R', 92),
				new Note('E', 93),
				new Note('W', 94),
				new Note('Q', 95),
				
				new Note('C', 96),
				new Note('M', 96.5),
				new Note('D', 97),
				new Note('M', 97.5),
				new Note('G', 98),
				new Note('M', 98.5),
				new Note('D', 99),
				new Note('M', 99.5),
				
				new Note('E', 96),
				
				new Note('C', 100),
				new Note('M', 100.5),
				new Note('D', 101),
				new Note('M', 101.5),
				new Note('J', 102),
				new Note('M', 102.5),
				new Note('D', 103),
				new Note('M', 103.5),
				
				new Note('E', 103),
				
				new Note('V', 104),
				new Note('N', 104),
				new Note('A', 104),
				new Note('F', 106),
				
				new Note('Y', 104),
				new Note('T', 106),
				
				new Note('C', 108),
				new Note('B', 108),
				new Note('M', 108),
				new Note('D', 110),
				
				new Note('E', 108),
				new Note('W', 108.5),
				new Note('Q', 109),
				new Note('Q', 111),
				
				new Note('X', 112),
				new Note('V', 112),
				new Note('N', 112),
				new Note('S', 114),
				
				new Note('W', 112),
				new Note('Q', 113),
				new Note('W', 113.5),
				new Note('T', 115),
				
				new Note('A', 116),
				new Note('D', 116),
				new Note('G', 116),
				new Note('J', 118),
				
				new Note('E', 116),
				new Note('E', 118),
				
				new Note('V', 120),
				new Note('N', 120),
				new Note('A', 120),
				new Note('F', 122),
				
				new Note('Y', 120),
				new Note('T', 122),
				
				new Note('C', 124),
				new Note('B', 124),
				new Note('M', 124),
				new Note('D', 126),
				
				new Note('E', 124),
				new Note('W', 124.5),
				new Note('Q', 125),
				new Note('Q', 127),
				
				new Note('X', 128),
				new Note('V', 128),
				new Note('N', 128),
				new Note('S', 130),
				
				new Note('W', 128),
				new Note('Q', 129),
				new Note('W', 129.6),
				new Note('J', 131.5),
				
				new Note('C', 132.9),
				new Note('N', 133),
				new Note('A', 133.1),
				new Note('D', 133.2),
				
				new Note('H', 133.3),
				
				new Note('#', 136),

			};
		long now = System.currentTimeMillis(), last;
		long start = now + 5000;
//		boolean pressed[] = new boolean[1000];
a:		for (;;) {
			Thread.sleep(15);
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
