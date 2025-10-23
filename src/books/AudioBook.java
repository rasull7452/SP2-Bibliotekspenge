package books;

public class AudioBook extends Title {
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    protected double calculatePoints(){
        double points = 0;
        double literatureTypeValue = convertLiteratureType();

        points = (durationInMinutes * 0.5) * literatureTypeValue * copies;


        return points;
    }
}
