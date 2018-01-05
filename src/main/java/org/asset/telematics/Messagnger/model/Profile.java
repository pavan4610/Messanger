package org.asset.telematics.Messagnger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Profile {
	private long id;
	private String profileName;
	private String lastName;
	private Date created;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getProfileName() {
		return profileName;
	}


	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Profile()
	{
		
	}
	
	public Profile(long id, String profileName, String lastName, Date created) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.lastName = lastName;
		this.created = created;
	}
	

}
