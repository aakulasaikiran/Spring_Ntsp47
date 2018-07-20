package com.nt.beans;

public class TV {
	 private Remote remote;

	public void setRemote(Remote remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "TV [remote=" + remote + "]";
	}
	
	

}
