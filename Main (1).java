public class Main {

    public static void main(String[] args) {
        System.out.println(num1OrNum7(new int[]{1, 2, 3}));       
        System.out.println(num1OrNum7(new int[]{1, 2, 3, 7}));    
        System.out.println(num1OrNum7(new int[]{2, 3, 7}));       

        System.out.println(isLeapYear(2000));                   
        System.out.println(isLeapYear(2015));               
        System.out.println(isLeapYear(2100));                   

        System.out.println(isBelowLimit(new int[]{1, 2, 3}, 5));    
        System.out.println(isBelowLimit(new int[]{6, 7, 8}, 5));    

        System.out.println(yearsToTargetPopulation(1000, 2, 50, 1200));  

        System.out.println(gettingLettersInRange("a-z"));         
        System.out.println(gettingLettersInRange("h-o"));  
        System.out.println(gettingLettersInRange("Q-Z"));  
        System.out.println(gettingLettersInRange("J-J"));        
    }

    public static boolean num1OrNum7(int[] nums) {
        boolean hasOne = false;
        boolean hasSeven = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 7) {
                hasSeven = true;
            }
        }

        return !(hasOne && hasSeven);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isBelowLimit(int[] array, int limit) {
        for (int num : array) {
            if (num > limit) {
                return false;
            }
        }
        return true;
    }

    public static int yearsToTargetPopulation(int initial, double percent, int newInhabitants, int target) {
        int years = 0;
        while (initial < target) {
            initial += (int) (initial * percent / 100) + newInhabitants;
            years++;
        }
        return years;
    }

    public static String gettingLettersInRange(String range) {
        char start = range.charAt(0);
        char end = range.charAt(2);
        StringBuilder result = new StringBuilder();

        for (char i = start; i <= end; i++) {
            result.append(i);
        }

        return result.toString();
    }
}