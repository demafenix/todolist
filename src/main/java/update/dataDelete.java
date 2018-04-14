package update;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import validation.GroupOrder1;
import validation.GroupOrder2;

public class dataDelete{
	
	public Date date;
	
	public Date getDate() {
		return date;
		
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
}