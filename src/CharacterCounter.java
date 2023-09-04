public class CharacterCounter {
    public static void characterCounter(String string)
    {
        int[] counts = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char ch = Character.toLowerCase(string.charAt(i));
            if(ch >= 'a' && ch <= 'z'){
                counts[ch - 'a']++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0){
                char ch = (char) (i + 'a');
                System.out.println(ch + ": " + counts[i]);
            }
        }
    }
}
