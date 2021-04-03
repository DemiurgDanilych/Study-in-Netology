package HomeWork.CheckingAccess.ExceptionOfAcces;


public class AccessDeniedException extends Exception {
	public AccessDeniedException(String user, int age) {
		System.out.println("Уважамый " + user + " вам всего " + age
				+ ", этого недостаточно для доступа на наш \"интересный сайт\", приходите когда вам исполнится 18 лет!");
	}
}
