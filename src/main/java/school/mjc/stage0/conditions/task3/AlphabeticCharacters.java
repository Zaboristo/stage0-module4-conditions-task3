package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character > 64 && character < 90) || (character > 96 && character < 123)) {
            if (character == 'a' || character == 'o' || character=='e'||character=='i'||character=='u' ||character == 'A' || character == 'O' || character=='E'||character=='I'||character=='U' )
            System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
    }
}
