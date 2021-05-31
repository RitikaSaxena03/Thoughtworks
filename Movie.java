import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public ArrayList<Movie> getPG(ArrayList<Movie> arr)
    {
        ArrayList<Movie> arr2= new ArrayList<>();
        for (Movie i:arr) {
            if(i.rating.equals("PG")){
                arr2.add(i);
            }
        }
        return arr2;

    }
    public static void main(String[] args) {
        ArrayList<Movie> arrayList=new ArrayList<>();
        Movie movie1= new Movie("Casino Royale", "Eon Productions","PG-13");
        arrayList.add(movie1);
        Movie movie2= new Movie("Inception", "Legendary Pictures Production");
        arrayList.add(movie2);
        Movie movie3= new Movie("Finding Nemo", "Walt Disney Pictures Pixar Animation Studios", "G");
        arrayList.add(movie3);
        Movie movie4= new Movie("Soul", "Pixar Animation Studios");
        arrayList.add(movie4);

        ArrayList<Movie> arr2=new ArrayList<>();
        arr2= movie1.getPG(arrayList);
        for (Movie i:arr2) {
            System.out.println(i.title);
        }
    }
}
