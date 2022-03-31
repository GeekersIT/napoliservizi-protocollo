package it.napoli.comune.protocollo;

import java.util.Date;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.cdn.protocollo.Protocollo;

@RestController
class GeneraProtocollo {
	@PostMapping("/genera_protocollo")
	ProtocolloOutput handler(@RequestBody ProtocolloArgs args) {
		String[] poResult={"",""};
		ProtocolloData input = args.getinput().getdata();
		Protocollo prot= new Protocollo();
		Date time = new Date();
		String timeStamp = new java.text.SimpleDateFormat("dd-MMM-yyyy HH:mm", java.util.Locale.ITALY).format(time);
		prot.Protocollazione(input.getoggetto(), timeStamp, input.getnote(), input.getmittenteEsterno(), input.getmittenteInterno(), input.getdestinatariEsterni(), input.getdestinatariInterni(), poResult, 1);
		ProtocolloOutput output;
		
		System.out.println(poResult[1]);
		System.out.println(poResult[0]);
				
		if(poResult[1].split(" - ")[0] != "") {
			output = new ProtocolloOutput(false, poResult[1].split(" - ")[0], time, poResult[0]);
		}else {
			output = new ProtocolloOutput(true, poResult[0]);
		}
		return output;
	}
}