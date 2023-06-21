public class Player {
    
    // Instance Data
    private String name;
    private int age;
    private String nationality;
    private int jerseyNumber;
    private String position;
    private int marketValue;

    // Constructor
    public Player(String name, int age, String nationality, int jerseyNumber, String position, int marketValue){
        this.name = name;

        if (age > 0 ) {
            this.age = age;
        }

        this.nationality = nationality;

        if (jerseyNumber >= 1 && jerseyNumber <= 99) {
            this.jerseyNumber = jerseyNumber;
        }

        this.position = position;

        if (marketValue > 0) {
            this.marketValue = marketValue;
        } 
    }

    // Accessors
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getNationality(){
        return this.nationality;
    }

    public int getJerseyNumber(){
        return this.jerseyNumber;
    }

    public String getPosition(){
        return this.position;
    }

    public int getMarketValue(){
        return this.marketValue;
    }

    // Setters
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }

    
    public void setJerseyNumber(int jerseyNumber){
        if (jerseyNumber >= 1 && jerseyNumber <= 99) {
            this.jerseyNumber = jerseyNumber;
        }
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setMarketValue(int marketValue){
        if (marketValue > 0){
            this.marketValue = marketValue;
        }
    }

    // ToString Method
    public String toString(){
        String output = "";
        output = String.format("%-20s",this.name) + "\t" + this.age + "\t" + this.nationality + "\t\t" + this.jerseyNumber + "\t" +
        String.format("%-20s", this.position) + "\t" + String.format("%,d",this.marketValue) + "\n";

        return output;
    }
}
