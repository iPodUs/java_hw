package main.java;

public class Dog extends Animal {
    private String nickname;
    private boolean long_haired;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isLong_haired() {
        return long_haired;
    }

    public void setLong_haired(boolean long_haired) {
        this.long_haired = long_haired;
    }

    public String toString(){
        return "Собака " + this.getName() + " по кличке " + this.getNickname();
    }
}
