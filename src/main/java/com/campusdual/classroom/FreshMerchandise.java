package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private final Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate){
        super();
        this.expirationDate = expirationDate;
    }

    @Override
    public String getSpecificData() {
        //devuelve string con todos los datos de la mercancia seleccionada
        String n = this.name;
        String uId = this.uniqueId;
        String rId = this.responsibleId;
        String zone = ""+this.zone;
        String a = this.area;
        String shelf = this.shelf;
        String quantity = ""+this.quantity;
        String time = getFormattedDate(this.expirationDate);
        String info = n + " "+ uId + " "+ rId + " "+ zone + " "+a+" "+shelf+" "+quantity+" "+time+" ";
        return info;
    }

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }


    public void printSpecificData(){
        System.out.println(getSpecificData());

    }

}
