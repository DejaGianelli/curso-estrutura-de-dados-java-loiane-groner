package estruturadados.vetor.testes;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args){
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("A");
            arrayList.add("C");
            System.out.println(arrayList);
            arrayList.add(1, "D");
            System.out.println(arrayList);
            boolean existe = arrayList.contains("A");
            System.out.println(existe);
            int indice = arrayList.indexOf("Z");
            System.out.println(indice);
            arrayList.get(0);
            arrayList.remove("D");
            arrayList.remove(1);
            System.out.println(arrayList);
            System.out.println(arrayList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
