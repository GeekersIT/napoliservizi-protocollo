package it.napoli.comune.protocollo;

import it.cdn.util.ProtocolloUtenteEsterno;
import it.cdn.util.ProtocolloUtenteInterno;

public class ProtocolloData {
		
	  public ProtocolloData() {}
	
	  private String note;
	  public String getnote() { return this.note; }
	  
	  private String oggetto;
	  public String getoggetto() { return this.oggetto; }
	  
	  private ProtocolloUtenteInterno mittenteInterno;
	  public ProtocolloUtenteInterno getmittenteInterno() { return this.mittenteInterno; }
	  
	  private Iterable<ProtocolloUtenteInterno> destinatariInterni;
	  public Iterable<ProtocolloUtenteInterno> getdestinatariInterni() { return this.destinatariInterni; }
	  
	  private ProtocolloUtenteEsterno mittenteEsterno;
	  public ProtocolloUtenteEsterno getmittenteEsterno() { return this.mittenteEsterno; }
	  
	  private Iterable<ProtocolloUtenteEsterno> destinatariEsterni;
	  public Iterable<ProtocolloUtenteEsterno> getdestinatariEsterni() { return this.destinatariEsterni; }
	}