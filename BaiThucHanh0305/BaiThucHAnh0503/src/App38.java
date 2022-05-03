import java.util.LinkedList;
public class App38 {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> a = new LinkedList<>();
        a.add("JAVA");
        a.add("PHP");
        a.add("C#");
        a.add("C++");
        // add all:them cac ptu cua list vao list A 
        LinkedList<String> listA = new LinkedList<>();
            listA.addAll(a);
        System.out.println("listA: ");
        showlist(listA);

       // retainAll:xoa nhung ptu khong thuoc list B khoi list A
        LinkedList<String> listB = new LinkedList<>();
            listB.add("JAVA");
            listA.retainAll(listB);
            System.out.println("listA: ");
            showlist(listA);

        // remove all: xoa nhung ptu thuoc list B khoi list
        a.removeAll(listB);
        System.out.println("list:");
        showlist(a);
      
    }

    public static void showlist(LinkedList<String> list){
        for ( String number : list){
            System.out.println("\t" +number+ ", ");
        }
        System.out.println();
    }
}
