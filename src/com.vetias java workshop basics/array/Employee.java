import java.util.Arrays;

public class Employee {
    public static void main(Sentences[]args){
    Sentences[][] employee = new Sentences [3] [2];
    employee [0] [0] = "1";
    employee [0] [1] = "20000";
    employee [1] [0] = "2";
    employee [1] [1] = "30000";
    employee [2] [0] = "3";
    employee [2] [1] = "40000";
    for(Sentences[] employees : employee) {
        System.out.println(Arrays.toString(employees));
    }


    }
}

