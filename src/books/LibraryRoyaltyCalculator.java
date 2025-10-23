package books;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args){
        Author a1 = new Author("Khaled Hosseini");
        PrintedBook b1 = new PrintedBook("A Thousand Splendid Suns", "SKØN", 384, 80);
        PrintedBook b2 = new PrintedBook("And The Mountains Echoed", "SKØN", 450,  163);
        AudioBook ab1 = new AudioBook("How To Write A Book", "FAG", 480, 97);

        a1.addTitle(b1);
        a1.addTitle(b2);
        a1.addTitle(ab1);

        System.out.println(a1.calculateRoyalties());
    }
}
