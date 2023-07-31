public class ReturnValues {
   public static void main(String[] args) {
    double area1 = calArea(3.6,8.2); 
    System.out.println(area1);  
    String engExp = explAr("English");
    System.out.println(engExp);
    }
    public static double calArea(double len, double wid){
        double area = len * wid;
        return area;
    }
    public static String explAr(String language){
        switch(language){
            case "English": return "Area equals length * width";
            case "French" : return "La surface est egale a la longueur * la largeur";
            case "Spanish" : return "area es igual a largo * ancho";
            default: return "Language not found";
        }
    }
} 
// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"