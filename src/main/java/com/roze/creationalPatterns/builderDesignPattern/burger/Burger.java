package com.roze.creationalPatterns.builderDesignPattern.burger;

public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean onion;
    private boolean lettuce;
    private boolean mayonnaise;

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                ", mayonnaise=" + mayonnaise +
                '}';
    }

    //this constructor is private, because they use to build burger using BurgerBuilder
    private Burger(BurgerBuilder burgerBuilder) {
        //all the validation goes here
        //if some wants burger he must bread
        //otherwise can not make burger without bread
        //such type of validation need
    }

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean onion;
        private boolean lettuce;
        private boolean mayonnaise;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder mayonnaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
