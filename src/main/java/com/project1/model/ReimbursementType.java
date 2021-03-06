package com.project1.model;

public class ReimbursementType {
	private int type;
	private String str;
	
	public ReimbursementType() {
		super();
	}

	public ReimbursementType(int type) {
		if(validate(type)) {
			this.type = type;
			switch(type) {
			case 1:
				this.str = "Lodging";
				break;
			case 2:
				this.str = "Travel";
				break;
			case 3:
				this.str = "Food";
				break;
			case 4:
				this.str = "Other";
				break;
			default:
				this.str = "Something is wrong with the type";
			}
		} else {
			throw new IllegalArgumentException(type + " is not a valid reimbursement type!");
		}
	}
	
	public int getTypeId() {
		return type;
	}
	
	public boolean setTypeId(int id) {
		if(validate(id)) {
			this.type = id;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		switch(type) {
		case 1:
			return "Lodging";
		case 2:
			return "Travel";
		case 3:
			return "Food";
		case 4:
			return "Other";
		default:
			return "Something is wrong with the type";
		}
	}
	
	public boolean validate(int id) {
		return (id > 0 && id < 5); 
	}
	
	
	private void setStr() {
		switch(type) {
		case 1:
			str = "Lodging";
		case 2:
			str = "Travel";
		case 3:
			str = "Food";
		case 4:
			str = "Other";
		default:
			str = "Something is wrong with the type";
		}
	}
	
	public String getStr() {
		return this.str;
	}

}
