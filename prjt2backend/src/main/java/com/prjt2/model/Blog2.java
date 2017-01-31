package com.prjt2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Blog2 {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int blog_id;
	private String blog_title;
	@Lob
	private String blog_body;
	private String blog_comment;
	private Date createdon;
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public String getBlog_title() {
		return blog_title;
	}
	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}
	public String getBlog_body() {
		return blog_body;
	}
	public void setBlog_body(String blog_body) {
		this.blog_body = blog_body;
	}
	public String getBlog_author() {
		return blog_comment;
	}
	public void setBlog_author(String blog_comment) {
		this.blog_comment = blog_comment;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	
	
	
	
}
