import javax.swing.*;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price > 600 && this.price < 1000){
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight(){
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if(this.weight > 1000 && this.weight < 1800){
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkYear(){
        if (this.price < 800 && this.year < 2010) {
            System.out.println("This notebook is cheap but too old");
        } else if(this.price > 800 && this.year < 2016){
            System.out.println("This notebook is fine, but you may find better one");
        } else if(this.price <1100 && this.year > 2018){
            System.out.println("This notebook is very good, you should buy it");
        }
    }
}


