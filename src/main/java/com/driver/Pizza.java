package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
   private int vegpizza=0;
   private int nonpizza=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price=0;
        this.bill="";
        if(this.isVeg==true){
            vegpizza++;
            this.price+=300;
        }
        else{
            nonpizza++;
            this.price+=400;
        }
    }
    public int getPrice(){
        return this.price;
    }
    private int extracheese=0;
    public void addExtraCheese(){
        extracheese++;
        this.price+=80;
    }
        private int extratopveg=0;
        private int extratopnon=0;
    public void addExtraToppings(){
        if(this.isVeg==true) {
            extratopveg++;
            this.price += 70;
        }
        else{
            extratopnon++;
            this.price += 120;
        }
    }
    private int paperbag=0;
    public void addTakeaway(){
        paperbag++;
        this.price+=20;
    }

    public String getBill(){
        if(this.isVeg==true && vegpizza>0){
            this.bill+="Veg pizza base price: "+(300*vegpizza);
            this.bill+="\n";

             }
        else{
            this.bill+="Non-veg pizza base price: "+(400 * nonpizza);
            this.bill+="\n";
//            System.out.println("Non-veg pizza base price: "+(400 * nonpizza));
        }
        if(extracheese>0) {
            this.bill+="Extra Cheese Added: " + (80*extracheese);
            this.bill+="\n";
//            System.out.println("Extra Cheese Added: " + (80*extracheese));
        }
        if(this.isVeg==true && extratopveg>0) {
            this.bill+="Extra Toppings Added: " + (70*extratopveg);
            this.bill+="\n";
//            System.out.println("Extra Toppings Added: " + (70*extratopveg));
        }
        else if(this.isVeg==false && extratopnon>0){
            this.bill+="Extra Toppings Added: " + (120*extratopnon);
            this.bill+="\n";
//            System.out.println("Extra Toppings Added: " + (120*extratopnon));
        }
        if(paperbag>0) {
            this.bill+="Paperbag Added: " + (20 * paperbag);
            this.bill+="\n";
//            System.out.println("Paperbag Added: " + (20 * paperbag));
        }
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
