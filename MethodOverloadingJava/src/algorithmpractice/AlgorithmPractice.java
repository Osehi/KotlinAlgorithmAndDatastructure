package algorithmpractice;

public class AlgorithmPractice {
    public static void main(String[] args){
        String output = removeVowels("osehi");
        System.out.println(output);
    }

    public static String removeVowels(String S){
        StringBuilder sb = new StringBuilder();
        for(char s: S.toCharArray()){
            // this if statement means remove characters that are not vowels
            if(s != 'a' && s != 'e' && s != 'i' && s !='o' && s != 'u'){
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
