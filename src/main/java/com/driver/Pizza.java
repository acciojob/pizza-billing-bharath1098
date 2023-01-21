package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtracheese;
    private boolean isExtraTopping;
    private boolean isbill;
    private boolean iscarrybag;
    private int extracheese;
    private int extratopping;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        this.isExtracheese=false;
        this.isExtraTopping=false;
        this.isbill=false;
        this.iscarrybag=false;


        if(this.isVeg==true){
            this.price+=300;
            this.extratopping=70;
        }
        else{
            this.price+=400;
            this.extratopping=120;
        }
        this.extracheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price;
        this.bill+="\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isExtracheese==false) {
            this.price +=extracheese;
            isExtracheese=true;
        }
    }

    public void addExtraToppings(){
       if(isExtraTopping==false){
           this.price+=extratopping;
           isExtraTopping=true;
       }
    }
    public void addTakeaway(){
        if(iscarrybag==false)
        this.price+=20;
        iscarrybag=true;
    }

    public String getBill(){
        if(isbill==false){
            if(isExtracheese) {
                this.bill += "Extra Cheese Added: " + extracheese + "\n";
            }
            if(isExtraTopping){
                this.bill+="Extra Toppings Added: " +extratopping+"\n";
            }
            if(iscarrybag){
                this.bill+="Paperbag Added: " +20+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isbill=true;
        }

        return this.bill;
    }
}
