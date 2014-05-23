/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kijkwijzer;

import java.util.ArrayList;

/**
 *
 * @author Pascal
 */
public class Kijkwijzer {

    String genre, html =""; //horror, detective, actie, romantisch, komisch
      
  
   private ArrayList<Film> array;
    
    public Kijkwijzer(){ 
        array = new ArrayList<Film>();
    }
    
    public void voegtoefilm(){
        array.add(new Film(1877832, "X-Men: Days of Future Past","horror"));
        array.add(new Film(1086772, "Blended","detective"));
        
    }
   
    
    public Kijkwijzer(String genre) {
        this.genre = genre;
    }
    
    public String getPlaatjes() {
        String pre = "<img class='kijkwijzer' src='images/";
        String post = ".jpg'>";
        if (genre.equals("horror")) {
            return pre + "5" + post + pre + "4" + post + pre + "3" + post;
        } else if (genre.equals("detective")) {
            return pre + "5" + post + pre + "6" + post;
        } else if (genre.equals("actie")) {
            return pre + "3" + post + pre + "4" + post + pre + "16" + post;
        } else if (genre.equals("romantisch")) {
            return pre + "1" + post + pre + "6" + post;
        } else if (genre.equals("komisch")) {
            return pre + "1" + post;
        } else {
            return "";
        }
    }

    public String maakPagina(){
        String begin ="http://www.imdb.com/title/tt";
        String eind ="/?ref_=nv_sr_1";
        for(Film film : array)
        { 
        html += "<div class=\"informatie\">"
             +" De naam van de film:  "+ film.getNaam()+"<br />"
             + begin+film.getImdb()+eind+"<br />"
             + "het genre van de film is "+film.getGenre()+"</br /></br />"
             + "</div>";
        }
     
        return html; 
    }
}

/*
new Film(1877832, "X-Men: Days of Future Past", new Kijkwijzer("horror"));

new Film(1086772, "Blended", new Kijkwijzer("detective"));

new Film(1179031, "Cold in July", new Kijkwijzer("actie"));

new Film(2405372, "Stand clear of the closing doors", new Kijkwijzer("romantisch"));

new Film(2380331, "Words and Pictures", new Kijkwijzer("horror"));

new Film(1294970, "The angriest man in Brooklyn", new Kijkwijzer("actie"));

*/