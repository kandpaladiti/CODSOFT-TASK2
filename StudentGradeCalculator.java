import java.util.Scanner;
import java.text.DecimalFormat;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME to student grade calculator.");
        System.out.println("Enter each subject marks out of 100.");
        System.out.print("Enter number of subjects: ");
        int num = scanner.nextInt();
        int marks[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter marks of subject"+(i+1)+": ");
            marks[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        System.out.println("Total marks: "+sum);
        double avgPcent = (double)sum/num;
        DecimalFormat df = new DecimalFormat("#.#");
        String FinalAvgPcent = df.format(avgPcent);
        System.out.println("Average Percentage of student is: "+FinalAvgPcent+"%");
        if(avgPcent >90 && avgPcent <=100){
            System.out.println("Excellent, you got 'A' Grade.");
        }
        else if(avgPcent >80 && avgPcent <=90){
            System.out.println("Good, you got 'B' Grade.");
        }
        else if(avgPcent >70 && avgPcent <=80){
            System.out.println("You Can do better, you got 'C' Grade.");
        }
        else{
            System.out.println("Work hard, you got 'D' Grade.");
        }
    }
}