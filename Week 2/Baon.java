
import java.util.Scanner;

public class Baon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int savings = 0;
        int savings_per_day [] = new int[5];
        for(int day = 1; day <= 5; day++){
            System.out.println("Day "+day);
            int baon = in.nextInt();
            int binigay = baon;
            int expenses = 0;

            // Going to school
            System.out.println("How do you want to go to school?");
            System.out.println("[1] Jeep");
            System.out.println("[2] LRT");
            System.out.println("[3] Angkas");
            System.out.println("[4] Grab");
            int transpo_toSchool = in.nextInt();

            if(transpo_toSchool == 1){
                baon -= 36;
                expenses += 36;
                System.out.println("Remaining baon: "+baon);
            }
            else if(transpo_toSchool == 2){
                baon -= 45;
                expenses += 45;
                System.out.println("Remaining baon: "+baon);
            }
            else if(transpo_toSchool == 3){
                baon -= 120;
                expenses += 120;
                System.out.println("Remaining baon: "+baon);
            }
            else if(transpo_toSchool == 4){
                baon -= 340;
                expenses += 340;
                System.out.println("Remaining baon: "+baon);
            }
            else{
                System.out.println("Invalid input");
            }

            System.out.println("What do you want for breakfast?");
            System.out.println("[1] 7eleven");
            System.out.println("[2] Canteen");
            System.out.println("[3] Eatery");
            System.out.println("[4] Alfamart");
            System.out.println("[5] Mcdo");
            System.out.println("[6] Jollibee");

            int breakfast = in.nextInt();

            switch(breakfast){
                case 1: baon -= 100;
                        expenses += 100;
                        System.out.println("Remaining baon: "+baon);
                        break;
                case 2: baon -= 45;
                        expenses += 45;
                        System.out.println("Remaining baon: "+baon);
                        break;
                case 3: baon -= 40;
                        expenses += 40;
                        System.out.println("Remaining baon: "+baon);
                        break;
                case 4: baon -= 75;
                        expenses += 75;
                        System.out.println("Remaining baon: "+baon);
                        break;
                case 5: baon -= 115;
                        expenses += 115;
                        System.out.println("Remaining baon: "+baon);
                        break;
                case 6: baon -= 125;
                        expenses += 125;
                        System.out.println("Remaining baon: "+baon);
                        break;
                default: System.out.println("Invalid input");
                        break;
            }
            int idx = day - 1;
            savings_per_day[idx] = baon;
            savings += baon;
        }
        System.out.println("Total savings for 5 days: "+savings);
        
        int day_most_savings = 0;
        int max = 0;
        // Print savings for each day by looping through the array
        for (int i = 0; i < savings_per_day.length; i++) {
            System.out.println("Day "+(i+1)+": "+savings_per_day[i]);
            if(savings_per_day[i] > max){
                max = savings_per_day[i];
                day_most_savings = i+1;
            }
        }
        System.out.println("Day with the most savings: "+day_most_savings);
    }
}
