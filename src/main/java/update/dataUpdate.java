package update;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import validation.GroupOrder1;
import validation.GroupOrder2;

public class dataUpdate{
	@NotEmpty(groups= {GroupOrder1.class},message="内容を入力してください")
	@Size(min=1,max=40,groups= {GroupOrder2.class},message="40文字以内で記述してください")
	public String data;
	
	public Date date;
	
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data=data;
	}
	
	public Date getDate() {
		return date;
		
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
}