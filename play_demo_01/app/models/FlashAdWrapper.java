package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

import play.db.jpa.GenericModel;

@Entity
@Table(name = "tb_ad")
public class FlashAdWrapper extends GenericModel {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "url")
	private String url;
	@Column(name = "cdate")
	private Date cdate;
	public FlashAdWrapper(String title, String url, Date cdate) { 
		this.title = title;
		this.url = url;
		this.cdate = cdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}
