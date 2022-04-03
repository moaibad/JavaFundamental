/**
 *
 * @author Moaibad
 */
public class Main{
    public static void main (String[] args){
        Employee[] staff = new Employee[4];
        staff[0] = new Manager("Fathul Ibad", 4000000, 1, 10, 1989);
        staff[1] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989);
        staff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[3] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);

        int i;
        for (i = 0; i < 4; i++){
            staff[i].raiseSalary(5);
        }
        Sortable.shell_sort(staff);
        for (i = 0; i < 4; i++){
            staff[i].print();
        }
    }
}
