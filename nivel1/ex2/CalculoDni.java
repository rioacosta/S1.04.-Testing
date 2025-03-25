package nivel1.ex2;

public class CalculoDni {
		private static final String letterExcpected = "TRWAGMYFPDXBNJZSQVHLCKE";
		private int userNumber;
		private static int total;
		
		public CalculoDni (int userNumber) {
			this.userNumber = userNumber;
			this.total = userNumber % 23;
		}

		public int getUserNumber() {
			return this.userNumber;
		}

		public int getTotal() {
			return this.total;
		}
		public static char getLetterExpected() {
			return letterExcpected.charAt(total);
		}
		
}
