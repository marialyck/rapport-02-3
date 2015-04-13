

public class OperationNotAllowedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String operation;

	public OperationNotAllowedException(String errorMsg, String operation) {
		super(errorMsg);
		this.operation = operation;

	}

	public Object getOperation() {
		// TODO Auto-generated method stub
		return operation;
	}
}
