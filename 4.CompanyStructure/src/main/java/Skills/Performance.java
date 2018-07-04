package main.java.Skills;

public class Performance {

    private int strength, velocity, stamina, health;

    public static class Builder {
        int strength = 3;
        int velocity = 3;
        int stamina = 3;
        int health = 3;

        public Builder(){

        }

        public Builder strength(int val){
            strength = strength;
            return this;
        }

        public Builder velocity(int val){
            velocity = velocity;
            return this;
        }

        public Builder stamina(int val){
            stamina = stamina;
            return this;
        }

        public Builder health(int val){
            health = health;
            return this;
        }

        public Performance build() {
            return new Performance(this);
        }
    }

    private Performance (Builder builder) {
        strength = builder.strength;
        velocity = builder.velocity;
        stamina = builder.stamina;
        health = builder.health;
    }
}
