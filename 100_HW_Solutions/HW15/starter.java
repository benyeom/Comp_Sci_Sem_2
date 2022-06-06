import pkg.*;

public static void magic(int n) {
	int p= 0;
	int sq = 0;
	int som = 0;
	int addfactor = 1;
	int runs = 0;
	while (true) {
		if (runs == n) {
			break;
		}
		sq = p * p;
		while (som < sq) {
			some += addfactor;
			addfactor++;
			if (som == sq) {
				System.out.println(sq);
				runs++;
				break;
			}
		}
		p++:
	}
}

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
	}
}
