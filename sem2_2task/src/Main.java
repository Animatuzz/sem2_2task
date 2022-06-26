import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();
        int repeats = enterRepeats();
        addElementsInList(list, repeats);

        System.out.print("Source List: "); //В идее всё ещё не работает русский язык. Не знаю как исправить.
        printList(list);

        list.removeEvenElements(list);

        System.out.print("The resulting list: ");
        printList(list);
    }

    private static int enterRepeats() {
        System.out.println("Enter the number of elements in the list (natural number): ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count <= 0) {
            System.out.println("Incorrect number of items entered.");
            count = enterRepeats();
        }

        return count;
    }

    private static void addElementsInList(LinkedList<Integer> list, int repeats) {
        System.out.println("Enter " + repeats + " list items: ");
        int k = 0;

        while (repeats != 0) {
            Scanner scanner = new Scanner(System.in);
            int element = scanner.nextInt();

            list.addElementByIndex(k, element);
            k++;
            repeats--;
        }
    }

    public static void printList(LinkedList<Integer> list) {
        int i = 0;
        for (Integer value : list) {
            System.out.print((i > 0 ? ", " : "") + value);
            i++;
        }
        System.out.println();
    }
}