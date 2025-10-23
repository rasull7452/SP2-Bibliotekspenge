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

        /* TEST FOR AT SE OM DET VIRKER
        Author a2 = new Author("Test");
        PrintedBook tb1 = new PrintedBook("Celestine", "SKØN", 166, 140);
        AudioBook tb2 = new AudioBook("Celestine Audio", "SKØN", 192,140);

        a2.addTitle(tb1);
        a2.addTitle(tb2);

        System.out.println(tb2.calculatePoints());

        System.out.println(a2.calculateRoyalties()); */

        System.out.println(a1.calculateRoyalties());

        a1.showAuthorRoyalties();
    }
}
