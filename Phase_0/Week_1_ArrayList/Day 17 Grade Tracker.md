The Grade Tracker Architecture

Create a HashMap<String, ArrayList<Integer>>.
Add 3 students (e.g., your project teammates) as the keys, and attach an ArrayList containing exactly 3 integer exam scores as the value for each.

Calculate and print each student's average score.

Determine and print the student with the highest average.

Determine and print the student with the lowest average.


    import java.util.*;
    class Main{
        public static void main(String[] args){
            HashMap<String, ArrayList<Integer>> students = new HashMap<>();
            ArrayList<Integer> aksharscores = new ArrayList<>();
            aksharscores.add(85);
            aksharscores.add(96);
            aksharscores.add(88);
            students.put("Akshar",aksharscores);
            ArrayList<Integer> rohanscores = new ArrayList<>();
            rohanscores.add(84);
            rohanscores.add(89);
            rohanscores.add(96);
            students.put("Rohan",rohanscores);
            ArrayList<Integer> priyascores = new ArrayList<>();
            priyascores.add(87);
            priyascores.add(95);
            priyascores.add(67);
            students.put("Priya",priyascores);
            double highestavg=0;
            double lowestavg=100;
            for(Map.Entry<String,ArrayList<Integer>> entry : students.entrySet()){
                String studentname = entry.getKey();
                ArrayList<Integer> scores = entry.getValue();

                double sum=0;
                for(Integer score : scores){
                    sum = sum + score;
                }
                double cavg=0;
                cavg = sum/scores.size();
                System.out.println(studentname +"'s Average marks is: +cavg);

                if(cavg > highestavg)
                {
                    highestavg = cavg;
                }
                if(cavg < lowestavg){
                    lowestavg = cavg;
                }
            }
            System.out.println("Highest average is: "+highestavg);
            System.out.println("Lowest average is: "+lowestavg);
        }
    }