package com.example.model;

import java.util.Date;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Classes {
	private long id;
	private long cid;
	private Date startday;
	private Date endday;
	private String wstudent;
	private String timelearn;
	private String status;
	private long userid;
	
	 @Override
	    public String toString() {
	        return "CLasses{" +
	                "id=" + id +
	                ", cid='" + cid + '\'' +
	                ", startday='" + startday + '\'' +
	                ", endday='" + endday + '\'' +
	                ", wstudent='" + wstudent + '\'' +
	                ", timelearn='" + timelearn + '\'' +
	                ", status='" + status + '\'' +
	                ", userid=" + userid +
	                '}';
	    }
}
