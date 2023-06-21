public class Main {
    public static void main(String[] args) {
        Group B = new Group("B", 4);
        Team germany = new Team(6, "Germany");
        Team turkiye = new Team(38, "Türkiye");
        Team england = new Team(34, "England");
        Team iran = new Team(22,"Iran");
        B.addTeam(england);
        B.addTeam(germany);
        B.addTeam(turkiye);
        B.addTeam(iran);
        Game g1 = new Game(turkiye, germany, 2, 4);
        Game g2 = new Game(turkiye, england, 1, 3);
        Game g3 = new Game(germany, england, 1, 1);

        B.addGame(g3);
        System.out.println(B);

        B.addGame(g2);
        System.out.println(B);
        

        B.addGame(g1);        
        System.out.println(B);
    }
}
