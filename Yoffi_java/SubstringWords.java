class SubstringWords{
    public static String[] findWords(String[] words) {
        String answer[] = new String[words.length];
        int count=0;
        for (int i=0;i<words.length;i++) {
                for (int j=0;j<words.length;j++) {
                    if (i!=j && words[j].contains(words[i])) {
                    answer[count]=words[i];
                    count++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String words[]={"mass","as","hero","superhero"};
        String answer[]=findWords(words);
        for (int i=0;i<answer.length;i++) {
            if (answer[i]!=null) {
                System.out.println(answer[i]);
            }
        }
    }
}