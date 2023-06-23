// Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10

public class CountingFromString {
    static void countCharacterType(String str)
    {
        int vowels = 0, consonant = 0, chars = 0,
                word = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ( (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ) {

                ch = Character.toLowerCase(ch);


                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
            else if ((ch == ' ') && ((ch+1) != ' '))
            { word++; }

        }

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonant: " + consonant);
        System.out.println("Total number of words: " + (word+1) );
        System.out.println("Total number of characters without spaces: " + count);
    }


    static public void main (String[] args)
    {
        String str = "I live in Bangladesh";
        countCharacterType(str);
    }
}

