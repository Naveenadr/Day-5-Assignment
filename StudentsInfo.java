package student;

public class StudentsInfo {

	public void getStudentInfo (int id) {
		System.out.println ("Student id is 1132007");
	}
	
	

		public void getStudentInfo (int id, String name) {
			System.out.println ("Student id is 1132007, Naveena");
		}
		
		

			public void getStudentInfo (String email ,int phoneNumber) {
				System.out.println ("naveena@gmail.com, 9999900000");
			}
		
		
	public static void main(String[] args) {
		StudentsInfo info = new StudentsInfo();
		info.getStudentInfo(0);
		info.getStudentInfo(0, null);
		info.getStudentInfo(null, 0);

	}

}
		

	