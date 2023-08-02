public static int camelcase(String s) {
    // Write your code here
        int word_count=1;
        for(int i=0;i<s.length();i++) {
            char ch= s.charAt(i);
            if(Character.isUpperCase(ch)) {
                word_count++;
            }
        }
        return word_count;

    }