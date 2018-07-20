package com.nt.command;

public class RegisterCommand {
	private String name;
	private String email;
	private long phone;
	private String stream;
	private int experience;
	private int expectedCTC;
	private String prefferedLoc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(int expectedCTC) {
		this.expectedCTC = expectedCTC;
	}
	public String getPrefferedLoc() {
		return prefferedLoc;
	}
	public void setPrefferedLoc(String preferredLoc) {
		this.prefferedLoc = preferredLoc;
	}
	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", email=" + email + ", phone=" + phone + ", stream=" + stream
				+ ", experience=" + experience + ", expectedCTC=" + expectedCTC + ", preferredLoc=" + prefferedLoc
				+ "]";
	}
	

}
