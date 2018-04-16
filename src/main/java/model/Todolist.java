package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Date;;


/**
 * The persistent class for the todolist database table.
 * 
 */
@Entity
@NamedQuery(name="Todolist.findAll", query="SELECT t FROM Todolist t")
public class Todolist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private Date date;

	private int priority;

	private String todo;

	public Todolist() {
	}

	public Todolist(int id, Date date, int priority, String todo) {
		this.id=id;
		this.date=date;
		this.priority=priority;
		this.todo=todo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTodo() {
		return this.todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

}