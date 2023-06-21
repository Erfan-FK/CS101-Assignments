import java.util.ArrayList;

public class Team {
    
    // Instances Data
    private int ID;
    private String name;
    private int averageAge;
    private int marketValue;
    private ArrayList<Player> squad = new ArrayList<>();
    
    // Constructor
    public Team(int ID, String name){
        if (ID > 0) {
            this.ID = ID;
        }
        this.name = name;
        
    }

    // Accessors
    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public int getAverageAge(){
        return this.averageAge;
    }

    public int getMarketValue(){
        return this.marketValue;
    }

    // Player Exist checker method
    public boolean playerExist(int jerseyNumber){
        for (int i = 0; i < this.squad.size(); i++){
            if (squad.get(i).getJerseyNumber() == jerseyNumber) {
                return true;
            }
        }
        return false;
    }

    // Add a player to the team method
    public void addPlayer(Player player){
        int total = 0;
        if (player.getNationality().equals(this.getName()) && !playerExist(player.getJerseyNumber())){
            this.squad.add(player);

            this.marketValue += player.getMarketValue();

            for (int i = 0; i < this.squad.size(); i++){
             total += this.squad.get(i).getAge();
            }
            this.averageAge = total / this.squad.size();
        }   
    }

    // Remove a player from the team method 
    public void removePlayer(int jerseyNumber){
        this.marketValue = 0;
        int total = 0 ;
        for (int i = 0; i < this.squad.size(); i++){
            if (this.squad.get(i).getJerseyNumber() == jerseyNumber) {
                this.squad.remove(i);
            }
        }
        
        for (int i = 0; i < this.squad.size(); i++){
            total += this.squad.get(i).getAge();
            this.marketValue += this.squad.get(i).getMarketValue();
        }
        this.averageAge = total / this.squad.size();
    }

    // ToString
    public String toString(){
        String output = "";
        output += "=".repeat(121) + "\n=\t\t\t\t\t\t\t Team Details \t\t\t\t\t\t\t=\n" + "=".repeat(121) + "\n";

        output += "ID: " + this.getID() + "\nTeam: " + this.getName() + "\nAverage Age: " + this.getAverageAge() + 
        "\nMarket Value: " + String.format("%,d", this.getMarketValue()) + "\n";

        output += "Squad is composed of following players: \n";
        output += "-".repeat(121) + "\nName\t\t\tAge\tNatioanlity\tNumber\tPosition\t\tMarket Value\n" + "-".repeat(121) + "\n";

        for (int i = 0; i < this.squad.size(); i++) {
            output += squad.get(i).toString();
        }
        
        output += "=".repeat(121) + "\n";

        return output;
    }
}
