
import javax.swing.text.Position;





public class rectangle extends figure{
    private double hauteur;
    private double largeur;
    public rectangle(double H,double L){
        hauteur=H;
        largeur=L;
    }
    public rectangle(rectangle autre){
        hauteur=autre.hauteur;
        largeur=autre.largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }
    public void setHauteur(double hauteur){
        this.hauteur=hauteur;
    }
    public void seLargeur(double largeur){
        this.largeur=largeur;
    }
    public double surface(){
        return this.hauteur*this.largeur;
    }
public String toString(){
   return " Rectangle " + hauteur + " X " + largeur;
}
public boolean equals(rectangle autre){
    if (autre == null) return false;
    else {
        return (autre.hauteur== hauteur && autre.largeur==largeur);
    }
}
public void affiche(){
    System.err.println("la valeur de position " + position);
}
    

    
}
