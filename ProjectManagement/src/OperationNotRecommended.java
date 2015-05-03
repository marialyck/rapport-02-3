public class OperationNotRecommended extends Exception{

	private static final long serialVersionUID = 1L;
	private String operation;
	
	public OperationNotRecommended(String errorMsg, String operation){
		super(errorMsg);
		this.operation=operation;
		
	}
	public Object getOperation(){
		return operation;
	}
}
