package orderModify;

import java.sql.Timestamp;

public class T_MYWaterNumber {

	
	
	public String yare;

	public String month;

	public Integer numberId;

	public Timestamp createdTime;
	
	public String getYare() {
		return yare;
	}

	public void setYare(String yare) {
		this.yare = yare;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getNumberId() {
		return numberId;
	}

	public void setNumberId(Integer numberId) {
		this.numberId = numberId;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public String toString() {
		return "T_MYWaterNumber [yare=" + yare + ", month=" + month + ", numberId=" + numberId + ", createdTime="
				+ createdTime + "]";
	}

	public T_MYWaterNumber(String yare, String month, Integer numberId, Timestamp createdTime) {
		super();
		this.yare = yare;
		this.month = month;
		this.numberId = numberId;
		this.createdTime = createdTime;
	}

	public T_MYWaterNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
