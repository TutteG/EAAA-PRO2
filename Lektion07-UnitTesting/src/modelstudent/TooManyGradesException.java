package modelstudent;

@SuppressWarnings("serial")
public class TooManyGradesException extends RuntimeException {

	public TooManyGradesException(String msg) {
		super(msg);
	}
}
