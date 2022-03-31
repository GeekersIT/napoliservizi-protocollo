package it.napoli.comune.protocollo;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.cdn.protocollo.Protocollo;

@RestController
class AggiungiAllegato {
	@PostMapping("/aggiungi_allegato")
	ProtocolloOutput handler(@RequestParam("file") MultipartFile multipartFile, @RequestParam("protocollo") String protocollo) throws IllegalStateException, IOException {
		String[] poResult={"",""}; 		
		String anno="", num_pg="";
		Protocollo prot= new Protocollo();	
//		protocollo=args.getprotocollo();
//		MultipartFile multipartFile = args.getFile();
		//pg="PG_2019_995.pdf";
		
		System.out.println(protocollo);
		
		anno=protocollo.substring(protocollo.indexOf("_")+1,protocollo.lastIndexOf("_"));
		num_pg=protocollo.substring(protocollo.lastIndexOf("_")+1);
		num_pg=num_pg.split(Pattern.quote("."))[0];
		
	    File file = new File(System.getProperty("java.io.tmpdir")+"/"+protocollo);
		multipartFile.transferTo(file);

		prot.ModificaRegistrazione(anno, num_pg, file, protocollo, poResult);	
		
		ProtocolloOutput output;
		
		if(poResult[1].split(" - ")[0] != "") {
			output = new ProtocolloOutput(false);
		}else {
			output = new ProtocolloOutput(true, poResult[0]);
		}
		return output;
			
	}
}