package lab7;

public class Track { 
       
    // Main method
    public static void main(String[] args) {

        Track t1 = new Track("Love over gold", 123, 234, "12/08/1982", (short)2473);
        t1.setGenre("RO");

        Track t2 = new Track("Gozleri aska gulen", 0, 98, "18/04/2018", (short)257);
        t2.setGenre("PO");

        Track t3 = new Track("Down to the waterline", 123, 234, "09/06/1978", (short)235);

        System.out.println("Is t1 before t2? " + t1.isBefore(t2));
        System.out.println("Is t2 before t3? " + t2.isBefore(t3));
        
        t1.play();
        t3.play();
        t3.play();
        t1.playBatch(100);
        t3.playBatch(10);
        t1.play();
        t2.playBatch(50);
        t1.unregister();
        t1.play();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());

    }

    // Static Datas
    private static int count;
    private static int allCount = 1;

    // Instance Datas
    private int ID;
    private String title;
    private int album;
    private int artists;
    private String releaseDate;
    private int duration;
    private String genre = "UN";
    private boolean isActive = false;
    private int playCount;

    // Constructor
    public Track(String title, int album, int artists, String releaseDate, int duration) {
        this.title = title;
        this.album = album;
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.ID = allCount;
        
        // register track
        this.register();
    }

    // Accessor methods to access data
    public String getTitle() {
        return this.title;
    }

    public int getAlbum() {
        return this.album;
    }

    public int getArtists() {
        return this.artists;
    }

    public String getRealeasDate() {
        return this.releaseDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getID() {
        return ID;
    }

    // Settere methods to set data
    public void setGenre(String genre){
        if (genre.equals("PO") || genre.equals("RO") || genre.equals("JA") || genre.equals("OT")){
            this.genre = genre;
        }        
    }

    // register track
    public void register(){
        if (isActive == false){
            this.isActive = true;
            count++;
            allCount++;
        }        
    }

    // Unregister track
    public void unregister(){
        if (this.isActive == true) {
            this.isActive = false;
            count--;
        }
    }

    
    public boolean isBefore(Track other){

        // Shuffle the dates
        String tDate = this.releaseDate.substring(6) + this.releaseDate.substring(2,6) + 
        this.releaseDate.substring(0, 2);

        String oDate = other.releaseDate.substring(6) + other.releaseDate.substring(2,6) + 
        other.releaseDate.substring(0, 2);

        // Compare them
        if (tDate.compareTo(oDate) < 0) {
            return true;
        }
        else {
            return false;
        }        
    }

    public void play(){
        if (this.isActive) {
            this.playCount++;
        }
        else{
            System.out.println("play() called on inactive track!");
        }        
    }
    
    public void playBatch(int countToIncrement){
        this.playCount += countToIncrement;
    }

    public String toString(){
        System.out.println("*".repeat(40));

        // Active or Not
        if (this.isActive){
            System.out.println("Ative track " + this.ID + " among " + count + " active tracks");
        }
        else{
            System.out.println("Inactive track " + this.ID + " among " + allCount + " tracks");
        }

        System.out.println("Title: " + this.title);
        System.out.println("Album: " + this.album);
        System.out.println("Artists: " + this.artists);
        System.out.println("Release: " + this.releaseDate);
        System.out.println("Length: " + this.duration / 60 + " minutes " + this.duration % 60 + " seconds");

        // Genre
        System.out.print("Title: ");
        if (this.genre.equals("PO")){
            System.out.println("Popular");
        }
        else if (this.genre.equals("RO")){
            System.out.println("Rock");
        }
        else if (this.genre.equals("JA")){
            System.out.println("Jazz");
        }
        else if (this.genre.equals("OT")){
            System.out.println("Other");
        }
        else{
            System.out.println("Unspecified");
        }

        // Play count
        System.out.println("played: " + this.playCount);

        System.out.println("*".repeat(40));
        return "";
    }
}
