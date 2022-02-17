public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Ram", "Sword", 100);
       /* System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());*/
        player.damageByGun1();
        player.damageByGun2();
        player.heal();

        Player2 betterPlayer = new Player2("Sam", "Machine Gun", 80, true);
        betterPlayer.damageByGun1();
        betterPlayer.damageByGun2();
        betterPlayer.damageByGun2();
        betterPlayer.heal();

    }
}
