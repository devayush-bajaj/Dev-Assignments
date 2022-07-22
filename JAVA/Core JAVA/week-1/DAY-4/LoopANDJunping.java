
public class LoopANDJunping {
    public void week() {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String TodaysDay = "Thursday";          //USER INPUT PART
        for (String days : week) {
            if (days.equals(TodaysDay))
                continue;
            System.out.print(days+"\n");
        }
    }
    void datesTillToday(){
        int TodaysDate = 21;                    //USER INPUT PART
        for(int i = 1; i<TodaysDate; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        LoopANDJunping loopANDJunping = new LoopANDJunping();
        loopANDJunping.week();
        loopANDJunping.datesTillToday();
    }
}
/*      OUTPUT
Monday
Tuesday
Wednesday
Friday
Saturday
Sunday
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

Process finished with exit code 0

*/