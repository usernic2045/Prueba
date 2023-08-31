package prueba1;

import java.util.*;
public class DateUtils {
static final int MILLS_IN_DAY = 24 * 60 * 60 * 1000;
public static Date getCurrentDate() { // Retorna Date de hoy día a las 0 horas
GregorianCalendar hoy = new GregorianCalendar();
hoy.set(Calendar.HOUR, 0);
hoy.set(Calendar.MINUTE, 0);
hoy.set(Calendar.SECOND, 0);
return hoy.getTime(); // convierte a Date
}
public static Date createDate(int anno, int mes, int dia) { // Retorna Date a las 0 horas
GregorianCalendar fecha = new GregorianCalendar(anno, mes, dia); // sin tiempo
return fecha.getTime(); // retorna un Date
}
public static Date stripTime(Date date) { // retorna Date de entrada con time = 0
GregorianCalendar fecha = new GregorianCalendar(); // fecha de hoy
fecha.setTime(date); // Cambia el valor de fecha al de date
fecha.set(Calendar.HOUR, 0);
fecha.set(Calendar.MINUTE, 0);
fecha.set(Calendar.SECOND, 0);
return fecha.getTime(); // retorna un Date
}
public static int daysDiff(Date date1, Date date2) { // retorna # días entre dos fechas
date1 = stripTime(date1);
date2 = stripTime(date2);
long longDate1 = date1.getTime();
long longDate2 = date2.getTime();
long longDiff = longDate2 - longDate1; // diferencia en milisegundos
return (int) (longDiff / MILLS_IN_DAY) ;
}
}