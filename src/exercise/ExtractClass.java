package exercise;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class Person {
		private String name;

		public String getName() {
			return name;
		}
	}

	class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;

		public String getTelephoneNumber() {
			return ("(" + officeAreaCode + ") " + officeNumber);
		}

		public String getOfficeAreaCode() {
			return officeAreaCode;
		}

		public void setOfficeAreaCode(String arg) {
			officeAreaCode = arg;
		}

		public String getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(String arg) {
			officeNumber = arg;
		}
	}
}