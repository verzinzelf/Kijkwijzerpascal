package pack;

/**
 *
 * @author Pascal
 */
public class Film {
   String naam;  
   int imdb;
   Kijkwijzer kijkwijzer;

    public Film(int imdb, String naam, Kijkwijzer kijkwijzer){
    this.imdb = imdb;
    this.naam = naam;
    this.kijkwijzer = kijkwijzer;     
    }
    
    public int getImdb(){
        return imdb;
    }
    
    public String getNaam(){
        return naam;
    } 
    
    public Kijkwijzer getKijkwijzer(){
        return kijkwijzer;
    }   
    
    public String getPlaatjes(){
        return kijkwijzer.getPlaatjes();
    }
}
