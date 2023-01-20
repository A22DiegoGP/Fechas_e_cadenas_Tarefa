package main.java.local.fechasecadeas.tarefa2;

import java.util.GregorianCalendar;

public class tarefa2 {
    
    public String findDay(int dia, int mes, int ano) {
        GregorianCalendar dayforfind = new GregorianCalendar(ano, mes - 1, dia);
        int daynum = dayforfind.get(GregorianCalendar.DAY_OF_WEEK);
        String[] nomesdias = {"DOMINGO", "LUNS", "MARTES", "MERCORES", "XOVES", "VENRES", "SABADO"};
        return nomesdias[daynum - 1];
    }
}
