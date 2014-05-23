package Kijkwijzer;

/**
 *
 * @author Pascal
 */
public class Film {
  private String naam, genre;  
  private int imdb;

    public Film(int imdb, String naam, String genre){
    this.imdb = imdb;
    this.naam = naam;
    this.genre = genre;     
    }
    
    public int getImdb(){
        return imdb;
    }
    
    public String getNaam(){
        return naam;
    } 
    
    public String getGenre(){
        return genre;
    }   
}
