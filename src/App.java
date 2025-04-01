import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("colections");

       System.out.println("\n/////////////// Listas ///////////////");

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

    }
}
