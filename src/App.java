import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("colections");

       System.out.println("\n/////////////// List ///////////////");

       //   Array list é melhor para acesso aleatorio, mas ele e pior para incercao e remocao
       List<String> arrayList = new ArrayList<>();
       arrayList.add("java");
       arrayList.add("c#");
       arrayList.add("c++");

       // linkedlist e eficiente para incercao e remocao, mas e pior para acesso aleatorio
       List<String> linkedList = new LinkedList<>();
        linkedList.add("C++");
        linkedList.add("php");
        linkedList.add("java");

        linkedList.replaceAll(element -> element.equals("C++")? "c#" : element);

        linkedList.removeIf(element -> element.equals("java"));
        linkedList.addAll(Arrays.asList("HTML", "javascript", "CSS"));

        int[] vetor = {1};
        int teste = 1;

        linkedList.forEach(e -> System.out.println("foreach valor: "+vetor[0]++ +" "+e));
        System.out.println(" ");
        linkedList.forEach(System.out::println);


        System.out.println("\n/////////////// Aluno ///////////////");
        Aluno aluno = new Aluno("pedro", new LinkedList<Materia>());
        String[] materias = {"php", "java", "html", "css", "c#"};
        //aluno.getMateria().addAll(materias);

        for (String mat : materias){
            aluno.getMateria().add(new Materia(mat));
        }
        Materia java = null;
        Materia javascript = null;
        for(Materia materia : aluno.getMateria()){
            if(materia.getNome().equals(java)){
                java = materia;
            }
            if(materia.getNome().equals(javascript)){
                javascript = materia;
            }
        }
        if(java != null) aluno.getMateria().remove(java);
        if(javascript != null)javascript.setNome("css");
        System.out.println("possui o objeto " + aluno.getMateria().contains(javascript));

        aluno.getMateria().size();
        aluno.getMateria().set(2, new Materia("sei la"));
        //Collection.sort(aluno.getMateria());
        System.out.println(aluno);

    }
}
