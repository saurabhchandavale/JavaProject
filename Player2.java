public class Player2 extends Player1{
private  int health;
private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health <= 0)
                this.health = 0;
            System.out.println("Armour is on. Got hit by gun 1. Health is" +
                    "reduced by 20 " + this.health);
        }
        if(!armour){
            this.health -= 30;
            if(this.health <= 0)
                this.health = 0;
            System.out.println("Armour is off. Got hit by gun 1. Health is" +
                    "reduced by 30 " + this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <= 0)
                this.health = 0;
            System.out.println("Armour is on. Got hit by gun 2. Health is " +
                    "reduced by 40 " + this.health);
        }
        if(!armour){
            this.health -= 50;
            if(this.health <= 0)
                this.health = 0;
            System.out.println("Armour is off. Got hit by gun 2. Health is " +
                    "reduced by 50 " + this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead.");
        }
    }
    public void heal() {
        if (this.health <= 0) {
            System.out.println("Player is dead. Heal is not possible.");
        }else{
            this.health = 100;
            System.out.println("Health is " + this.health);
        }
    }
}

