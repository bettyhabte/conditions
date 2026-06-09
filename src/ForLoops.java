public class ForLoops {
    public static void main(String[] args) {
        int[] marks = {30,50,60,70,80};
        int totalMarks = 0;
        int minMark = marks[0];
        int maxMark = marks[0];

        for(int mark : marks){
            totalMarks = totalMarks + mark;
        }

        for(int i = 1; i < marks.length; i++){
            if(marks[i] < minMark) {
                minMark = marks[i];
            }
            if(marks[i] > maxMark) {
                maxMark = marks[i];
            }
        }
        System.out.println("the minimum mark is " + minMark);
        System.out.println("the maximum mark is " + maxMark);

        System.out.println("the total mark is:  " + totalMarks);
    }
}
