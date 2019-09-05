package tws.entity;

import java.sql.Date;

public class PackageBean {
	//id
	private int id;
	//运单号
	private int packageNumber;
	//收件人
	private String recipient;
	//电话
	private int phoneNumber;
	//重量
	private int weight;
	//状态
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	//预约时间
	private Date bookedTime;
	
	public int getPackageNumber() {
		return packageNumber;
	}
	public void setPackageNumber(int packageNumber) {
		this.packageNumber = packageNumber;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//获取状态
	public String changeStatus(int status) {
		if(status == 1) {
			return "未取件";
		}else if(status == 2) {
			return "已取件";
		}else if(status == 3) {
			return "未预约";
		}else if(status == 4) {
			return "已预约";
		}
		return null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBookedTime() {
		return bookedTime;
	}
	public void setBookedTime(Date bookedTime) {
		this.bookedTime = bookedTime;
	}
	
	public PackageBean() {
		
	}
	
}
