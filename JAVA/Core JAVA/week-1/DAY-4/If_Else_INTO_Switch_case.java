public class If_Else_INTO_Switch_case {
    int temperature = 1;
    public void temp_fun() {
        switch (temperature) {
            case 1:
                System.out.println("Low");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("High");
                break;
            default:
                System.out.println("Abnormal");
        }
    }
        public static void main (String[]args){
        If_Else_INTO_Switch_case if_else_into_switch_case = new If_Else_INTO_Switch_case();
        if_else_into_switch_case.temp_fun();
    }

}

//OUTPUT --->   Low
