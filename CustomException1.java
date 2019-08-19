package industry;

import javax.imageio.IIOException;

class CustomException1 extends Exception {

	public CustomException1(String message) {
		try {
		} catch (Exception e) {
			System.out.println("do it again");
		}
	}
}
