package it.napoli.comune.protocollo;

import org.springframework.web.multipart.MultipartFile;

public class ProtocolloAllegatoArgs {
	
	  private String protocollo;
	  public String getprotocollo() { return this.protocollo; }
	  
	  private MultipartFile file;
	  public MultipartFile getFile() { return this.file; }
	  
	}