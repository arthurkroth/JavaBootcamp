import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {
        NamesList names = new NamesList();
        names.setList();
        names.manipulateList();
    }

    private void manipulateList() {
    }


    public ArrayList theList;

    public void setList() {
        theList = new ArrayList();
        theList.add("Arthur Kroth");
        theList.add("Renan Kroth");
        theList.add("Launi Kroth");

        System.out.println("Names List: " + theList);
        System.out.println("Size of the ArrayList: " + theList.size());
        System.out.println();
        theList.remove("Arthur Kroth");
        System.out.println("Names of the list after removing one entry: " + theList);
        System.out.println("Size of the ArrayList: " + theList.size());
        System.out.println();
        theList.add(1, "Arthur Kroth");
        System.out.println("Names list after adding the element back: " + theList);
        System.out.println("Size of the ArrayList: " + theList.size());


    }

}
