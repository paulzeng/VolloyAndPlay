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
@Table(name = "tb_message")
public class MessageWrapper extends GenericModel {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "content")
	private String content;
	@Column(name = "type")
	private int type;
	@Column(name = "cdate")
	private Date cdate;

	public MessageWrapper(String content, int type, Date cdate) {
		this.content = content;
		this.type = type;
		this.cdate = cdate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
