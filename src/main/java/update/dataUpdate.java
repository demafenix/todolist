package update;

import java.sql.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import validation.GroupOrder1;
import validation.GroupOrder2;

public class dataUpdate{
	@NotEmpty(groups= {GroupOrder1.class},message="内容を入力してください")
	@Size(min=1,max=200,groups= {GroupOrder2.class},message="200文字以内で記述してください")
	@Pattern(regexp="[^;^\"^\'^:^=^<^>^+]+",groups={GroupOrder2.class},message="使用できない文字が含まれています")
	public String data;
	@Future(groups= {GroupOrder1.class},message="過去の値は入力できません")
	public Date date;
	@NotNull(groups= {GroupOrder1.class},message="優先度を入力してください")
	@Min(value=1,groups= {GroupOrder2.class},message="1~3で入力してください")
	@Max(value=3,groups= {GroupOrder2.class},message="1~3で入力してください")
	public int priority;
	
	
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
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority=priority;
	}
	
}