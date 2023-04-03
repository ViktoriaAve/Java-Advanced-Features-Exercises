//        Generic types - Task 2

//        Design the  countIf  generic method wich, based on an array of elements of any type will count the number of elements meeting the condition using a functional interface. Any interface implemented anonymously can be a function.

package GenericTypes;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;


public class GenericTypesTask2 {
    public static void main(String[] args) {

        // An anonymous interface implementation using lambda expression
        CountIfElements countIfMethod = list -> {
            if (list.size() > 0) {
                System.out.print("In the list, there are " + list.size() + " elements: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + ", ");
                }
                System.out.println();
            }
            if (list.size() == 0) {
                System.out.println("The list is empty.");
            }
        };

        // Creating list 1
        List<Integer> IntList = new ArrayList<>();
        IntList.add(1);
        IntList.add(2);
        IntList.add(3);

        // Creating list 2
        List<String> daysList = new ArrayList<>();
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        daysList.add("Sunday");

        // Creating empty list 3
        ArrayList<Element> myList = new ArrayList<>();

        // Implementing a method on list 1
        countIfMethod.countIf(IntList);
        // Implementing a method on list 2
        countIfMethod.countIf(daysList);
        // Implementing a method on list 3
        countIfMethod.countIf(myList);
    }
}
