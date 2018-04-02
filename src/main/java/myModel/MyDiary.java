package myModel;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class MyDiary {

	private Date date;
	private String title;
	private String content;
	private String goodthing;
	private String badthing;
	private String todo;
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

	public String getGoodthing() {
		return goodthing;
	}

	public void setGoodthing(String goodthing) {
		this.goodthing = goodthing;
	}

	public String getBadthing() {
		return badthing;
	}

	public void setBadthing(String badthing) {
		this.badthing = badthing;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
