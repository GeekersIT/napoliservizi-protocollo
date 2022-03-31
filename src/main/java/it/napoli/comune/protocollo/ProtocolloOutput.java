package it.napoli.comune.protocollo;

import java.util.Date;

public class ProtocolloOutput {		
	  private Boolean error;
	  public Boolean geterror() { return this.error; }
	  
	  private String number;
	  public String getnumber() { return this.number; }
	  
	  private Date datetime;
	  public Date getdatetime() { return this.datetime; }
	  
	  private String message;
	  public String getmessage() { return this.message; }
	  
	  public ProtocolloOutput(Boolean error, String number, Date datetime, String message) {
		  this.datetime = datetime;
		  this.error = error;
		  this.number = number;
		  this.message = message;
	  }
	  
	  public ProtocolloOutput(Boolean error, String message) {
		  this.error = error;
		  this.message = message;
	  }
	  
	  public ProtocolloOutput(Boolean error) {
		  this.error = error;
	  }
	  
	}
