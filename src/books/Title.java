package books;

abstract class Title {
    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){

    }

   protected double calculatePoints(){

    }

    protected double convertLiteratureType() {

        double value = 0;

        switch (literatureType) {
            case "BI", "TE":
                value = 3;
                break;

            case "LYRIK":
                value = 6;
                break;

            case "SKØN":
                value = 1.7;
                break;

            case "FAG":
                value = 1;
                break;

            default:
                System.out.println("Du har valgt en literatur type som ikke eksisterer i systemet");
        }

        return value;
    }
}
