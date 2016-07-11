package day2;

public class Conditions {
	
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
        
        /*
         * You can string more than one comparison together
         * && is an and comparison:
         * both condition 1 and condition 2 have to be true to continue
         * 
         * || is an or comparison:
         * either condition 1 or condition 2 have to be true to continue
         */
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
