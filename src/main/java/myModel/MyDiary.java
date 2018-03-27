package myModel;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class MyDiary {

	private Date date;
	private String title;
	private String content;
	private String goodThing;
	private String badThing;
	private String toDo;
	private int number;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getGoodThing() {
		return goodThing;
	}

	public void setGoodThing(String goodThing) {
		this.goodThing = goodThing;
	}

	public String getBadThing() {
		return badThing;
	}

	public void setBadThing(String badThing) {
		this.badThing = badThing;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
