package matematica;

public class Permuta {
	public static void Permutacao(String p, String S){
        if(S.length() == 1){
            System.out.println(p+S);
        } else {
            String SLinha;
            String pLinha;
            
            for(int i=0; i<S.length();i++){
                SLinha = S.substring(0,i) + S.substring(i+1);
                pLinha = p + S.charAt(i);
                Permutacao(pLinha, SLinha);
            }
        }
	}
}
