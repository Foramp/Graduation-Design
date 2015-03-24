package com.gd.domain;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer nid;
	private String vname;
	private String vpassword;
	private String cmark;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String vname, String vpassword, String cmark) {
		this.vname = vname;
		this.vpassword = vpassword;
		this.cmark = cmark;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getVname() {
		return this.vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVpassword() {
		return this.vpassword;
	}

	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}

	public String getCmark() {
		return this.cmark;
	}

	public void setCmark(String cmark) {
		this.cmark = cmark;
	}

}