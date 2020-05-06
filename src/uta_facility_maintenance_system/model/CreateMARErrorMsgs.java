package uta_facility_maintenance_system.model;

public class CreateMARErrorMsgs {


	private String errorMsg;
	private String descriptionError;
	private String urgencyError;
	private String timeError;

	
	public CreateMARErrorMsgs() {
		this.errorMsg = "";
		this.descriptionError = "";
		this.urgencyError = "";
		this.timeError = "";
	}

	public void setTimeError(String timeError) {
		this.errorMsg =  "Please correct the following errors";
		this.timeError = timeError;
	}
	
	public String getTimeError() {
		return timeError;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg() {
		if (!descriptionError.equals(""))
			this.errorMsg = "Please correct the following errors";
	}

	public String getDescriptionError() {
		return descriptionError;
	}


	public void setDescriptionError(String descriptionError) {
		this.descriptionError = descriptionError;
	}


	public String getUrgencyError() {
		return urgencyError;
	}


	public void setUrgencyError(String urgencyError) {
		this.urgencyError = urgencyError;
	}
	
}
