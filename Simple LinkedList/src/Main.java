//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(60);
        list.add(40);
        list.display();

        list.update(3, 30);
        list.display();

        list.delete(1);
        list.display();
    }
}