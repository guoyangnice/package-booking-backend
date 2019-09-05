package tws.entity;

import java.sql.Date;

public class PackageBean {
	//id
	private int id;
	//�˵���
	private int packageNumber;
	//�ռ���
	private String recipient;
	//�绰
	private int phoneNumber;
	//����
	private int weight;
	//״̬
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	//ԤԼʱ��
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
	
	//��ȡ״̬
	public String changeStatus(int status) {
		if(status == 1) {
			return "δȡ��";
		}else if(status == 2) {
			return "��ȡ��";
		}else if(status == 3) {
			return "δԤԼ";
		}else if(status == 4) {
			return "��ԤԼ";
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
