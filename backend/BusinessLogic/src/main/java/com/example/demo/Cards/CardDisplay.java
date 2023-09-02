package com.example.demo.Cards;


public class CardDisplay{

    private String name;
    private int points;
    private int basePoints;
    private String cardInfo;
    private int timer;
    private int id;
    private String color;

    public CardDisplay(String name, int points, int basePoints, String cardInfo, int id, String color) {
        this.color = color;
        this.name = name;
        this.points = points;
        this.basePoints = basePoints;
        this.cardInfo = cardInfo;
        this.id = id;
        timer = CardsFactory.noTimer;
    }


    public CardDisplay(String name, int basePoints, String color) {
        this.name = name;
        this.color = color;
        this.basePoints = basePoints;
        this.points = basePoints;
        cardInfo = "";
        timer = CardsFactory.noTimer;
        this.id = -1;
    }
    public CardDisplay(String name, int points, int basePoints, String cardInfo) {
        this.name = name;
        this.points = points;
        this.basePoints = basePoints;
        this.cardInfo = cardInfo;
        timer = CardsFactory.noTimer;
        this.id = -1;
        this.color = "";
    }


    public CardDisplay(String name) {
        this.name = name;
        points = 1;
        cardInfo = "";
        basePoints = 0;
        this.id = -1;
        timer = CardsFactory.noTimer;
        this.color = "";
    }

    public CardDisplay() {
        name="";
        points = 0;
        basePoints = 0;
        cardInfo = "";
        timer = CardsFactory.noTimer;
        this.id = -1;
        this.color = "";
    }



    public int getId() {
        return id;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
    public int getTimer() {
        return timer;
    }
    public int getPoints() {
        return points;
    }
    public int getBasePoints(){return basePoints;}

    public String getName() {
        return name;
    }

    public String getCardInfo() {
        return cardInfo;
    }
    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CardDisplay){
            CardDisplay dis = (CardDisplay) obj;
            return dis.name.equals(name);
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "CardDisplay{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", basePoints=" + basePoints +
                ", cardInfo='" + cardInfo + '\'' +
                ", timer=" + timer +
                ", id=" + id +
                ", color=" + color +
                '}';
    }
}