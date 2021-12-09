package day03;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset % 26;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    String encrypts(String input) {
        String encriptedString = "";
        for (char c : input.toCharArray()) {
            //a = 97 A = 65 z = 123 Z = 91
            int newChar = c + offset;
            if (c == ' ') {
                newChar = ' ';
            } else if (newChar > 122) {
                    newChar = newChar - 123 + 97;
                } else if (newChar > 90 && c < 92) {
                    newChar = newChar - 91 + 65;
                }
            encriptedString += Character.toString(newChar);
        }
        return encriptedString;
    }
}
