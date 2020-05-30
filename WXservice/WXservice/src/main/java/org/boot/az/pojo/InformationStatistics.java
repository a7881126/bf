package org.boot.az.pojo;

import java.util.Date;

public class InformationStatistics {

	private String compname;

	private String year;

	private String month;

	private String count;
	
	private String factrorySettlementPrice;

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getFactrorySettlementPrice() {
		return factrorySettlementPrice;
	}

	public void setFactrorySettlementPrice(String factrorySettlementPrice) {
		this.factrorySettlementPrice = factrorySettlementPrice;
	}

	@Override
	public String toString() {
		return "InformationStatistics [compname=" + compname + ", year=" + year + ", month=" + month + ", count="
				+ count + ", FactrorySettlementPrice=" + factrorySettlementPrice + "]";
	}

	
	


}
