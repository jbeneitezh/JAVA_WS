package DateAndTime;
import java.text.SimpleDateFormat;
import java.util.*;
public class FechaSimple {
		public static String FechaString(Calendar fecha){
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
			String Res="";
			Res=String.valueOf(anho);
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			return Res;
		}
		public static String FechaCompletaString(Calendar fecha){
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora=fecha.get(Calendar.HOUR_OF_DAY);
	        int min=fecha.get(Calendar.MINUTE);
	        
			String Res="";
			Res=String.valueOf(anho);
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			if (hora<10){
				Res+="0"+String.valueOf(hora);
			}else{
				Res+=String.valueOf(hora);
			}
			if (min<10){
				Res+="0"+String.valueOf(min);
			}else{
				Res+=String.valueOf(min);
			}
			return Res;
		}
		public static String FechaSistemaString(){
			Calendar fecha = new GregorianCalendar();
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
			String Res="";
			Res=String.valueOf(anho);
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			return Res;
		}
		
		public static String FechaSistemaCompletaTXT() {
			Calendar fecha = new GregorianCalendar();
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora=fecha.get(Calendar.HOUR_OF_DAY);
	        int min=fecha.get(Calendar.MINUTE);
	        int sec=fecha.get(Calendar.SECOND);
	        String Res="";
			Res=String.valueOf(anho)+".";
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			Res+=".";
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			Res+=" - ";
			
			if (hora<10){
				Res+="0"+String.valueOf(hora);
			}else{
				Res+=String.valueOf(hora);
			}
			Res+=":";
			if (min<10){
				Res+="0"+String.valueOf(min);
			}else{
				Res+=String.valueOf(min);
			}
			Res+=":";
			if (sec<10){
				Res+="0"+String.valueOf(sec);
			}else{
				Res+=String.valueOf(sec);
			}
			return Res;
	        
			
		}
		public static String FechaSistemaCompletaString(){
			Calendar fecha = new GregorianCalendar();
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora=fecha.get(Calendar.HOUR_OF_DAY);
	        int min=fecha.get(Calendar.MINUTE);
	        int sec=fecha.get(Calendar.SECOND);
	        
			String Res="";
			Res=String.valueOf(anho);
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			if (hora<10){
				Res+="0"+String.valueOf(hora);
			}else{
				Res+=String.valueOf(hora);
			}
			if (min<10){
				Res+="0"+String.valueOf(min);
			}else{
				Res+=String.valueOf(min);
			}
			if (sec<10){
				Res+="0"+String.valueOf(sec);
			}else{
				Res+=String.valueOf(sec);
			}
			return Res;
		}
		public static String FechaSistemaLogString(){
			Calendar fecha = new GregorianCalendar();
			int anho = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH)+1;
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora=fecha.get(Calendar.HOUR_OF_DAY);
	        int min=fecha.get(Calendar.MINUTE);
	        int sec=fecha.get(Calendar.SECOND);
	        
			String Res="";
			Res=String.valueOf(anho);
			Res+=".";
			if (mes<10){
				Res+="0"+String.valueOf(mes);
			}else{
				Res+=String.valueOf(mes);
			}
			Res+=".";
			if (dia<10){
				Res+="0"+String.valueOf(dia);
			}else{
				Res+=String.valueOf(dia);
			}
			Res+=" ";
			if (hora<10){
				Res+="0"+String.valueOf(hora);
			}else{
				Res+=String.valueOf(hora);
			}
			Res+=":";
			if (min<10){
				Res+="0"+String.valueOf(min);
			}else{
				Res+=String.valueOf(min);
			}
			Res+=":";
			if (sec<10){
				Res+="0"+String.valueOf(sec);
			}else{
				Res+=String.valueOf(sec);
			}
			return Res;
		}
		
		public FechaSimple(){
			
		}
		
		public static double DifAnhosBase365(String fecIni, String fecFin) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date fechaInicial=dateFormat.parse(fecIni);
				Date fechaFinal=dateFormat.parse(fecFin);
				double fecIniDbl=(double) (fechaInicial.getTime());
				double fecFinDbl=(double) (fechaFinal.getTime());
				double anhos=(fecFinDbl-fecIniDbl)/86400000/365;
				return anhos;
			} catch (Exception e) {
				// TODO: handle exception
				String msg="FechaSimple::DifAnhosBase365::ERROR::No se pudieron restar las fechas\n"+e.toString();
				System.out.println(msg);
				return 0;
			}
		}
		
		public static double DifAnhosBase360(String fecIni, String fecFin) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date fechaInicial=dateFormat.parse(fecIni);
				Date fechaFinal=dateFormat.parse(fecFin);
				double fecIniDbl=(double) (fechaInicial.getTime());
				double fecFinDbl=(double) (fechaFinal.getTime());
				double anhos=(fecFinDbl-fecIniDbl)/(86400000*360);
				return anhos;
			} catch (Exception e) {
				// TODO: handle exception
				String msg="FechaSimple::DifAnhosBase360::ERROR::No se pudieron restar las fechas\n"+e.toString();
				System.out.println(msg);
				return 0;
			}
		}



}
