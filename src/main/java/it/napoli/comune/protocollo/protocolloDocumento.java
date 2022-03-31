//package it.napoli.comune.protocollo;
//
//import java.util.regex.Pattern;
//
//import it.cdn.protocollo.Protocollo;
//
//public class protocolloDocumento {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] poResult={"",""}; 		
//		String pg="", anno="", num_pg="";
//		Protocollo prot= new Protocollo();	
//		
//		pg=args[0];
//		//pg="PG_2019_995.pdf";
//		
//		anno=pg.substring(pg.indexOf("_")+1,pg.lastIndexOf("_"));
//		num_pg=pg.substring(pg.lastIndexOf("_")+1);
//		num_pg=num_pg.split(Pattern.quote("."))[0];
//				
//		prot.ModificaRegistrazione(anno, num_pg,"/var/www/html/assets/pis/protocollo/"+pg,pg,poResult );		
//	
//        return ;
//	}
//
//}
