/**@author 2183330170 Zubiri Valdez Hedson Leonardo*/
package busquedabinaria;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int []a={2,4,6,8,10,12,65,21};
        //autor: Salcedo
        int pos,N,encontrado,buscar; N=a.length;
        encontrado=0;
        buscar=4;
        int limSup=N; int limInf=0;
        while (limSup>=limInf && encontrado!=1) {
            pos=(limSup+limInf)/2;
            if (a[pos]==buscar) {
                Sysem.out.println("Encontrado");
            }
	    else if (buscar<a[pos]){
	    	limSup=pos-1;
 	    }
	    else {limInf=pos+1;}
	    
        }
        
    }
}
