
public class Note {
	int key = -1;
	String key1 = null;
	double begin[];
//	double duration;
	
//	Note(int key, double begin, double duration) {
//		this.key = key;
//		this.begin = begin;
//		this.duration = duration;
//	}
	
	Note(int key, double...begin) {
		this.key = key;
		this.begin = begin;
//		this.duration = -1;
	}
//	Note(String key, double begin) {
//		this.key1 = key;
//		this.begin = begin;
//		this.duration = -1;
//	}
	Note(String key, double...begin) {
		this.key1 = key;
		this.begin = begin;
//		this.duration = -1;
	}
}
