package datastructure.sentencesimilariaity;

public class SentenceSimilarity {

	public static void main(String[] args) {
		SentenceSimilarity ss = new SentenceSimilarity();
		System.out.println(ss.areSentencesSimilar("My name is Haley", "My Haley"));
		System.out.println(ss.areSentencesSimilar("A lot of words","of"));
		System.out.println(ss.areSentencesSimilar("Eating right now","Eating"));
		System.out.println(ss.areSentencesSimilar("eTUny i b R UFKQJ EZx JBJ Q xXz","eTUny i R EZx JBJ xXz"));

	}
	
	public boolean areSentencesSimilar(String sentence1, String sentence2) {

        return sentence1.length()> sentence2.length() ? areSentenceSimilar(sentence2, sentence1) : areSentenceSimilar(sentence1, sentence2);
    }

    private boolean areSentenceSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if(s1.length==1 && (s1[0].equals(s2[0]) || s1[0].equals(s2[s2.length-1])))
           return true; 
        if(s1.length==s2.length && !s1[0].equals(s2[0])){
            return false;
        }
        int firstEnd = -1;
        String s = "";
        String first = "";
        String last = "";
        boolean firstFound = false;
        for(int i =0; i< s2.length; i++){
            if(s1.length>i && !firstFound && s2[i].equals(s1[i])){
                firstEnd = i;
                if(i==0)
                   first = s1[0];
                else 
                   first += " "+ s1[i];
            }else if(s1.length>firstEnd+1 && s2[i].equals(s1[firstEnd+1])) {
                firstEnd++;
                last += " "+ s2[i];
            }else {
                if(!firstFound)
                    firstFound= true;
                s += " "+ s2[i];
            }
        }
        s = first + s + last;
        String f = first + last;
        if(f.trim().equals(sentence1) && s.trim().equals(sentence2) && sentence2.indexOf(s1[0])!=-1)
          return true;
        else 
           return false;
    }

}
