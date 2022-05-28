package LAB_2;

public class FindMax {
    //create a Circle class that uses the Comparable interface
    public static class Circle implements Comparable<Circle>{
        //declare the redius variable
        double radius;
        
        /**
         * a single parameterized constructor that accepts this variable
         * @param radius 
         */
        public Circle(double radius) {
            this.radius = radius;
        }  
        
        @Override
        public int compareTo(Circle a){
            if(radius < a.radius){
                return -1;
            }
            else if(radius == a.radius){
                return 0;
            }
            else{
                return 1;
            }
        }
        
        @Override
        public String toString(){
            return "Circle radius = " + radius;
        }
        
        public static <E extends Comparable<E>> E max(E[] list){
            E max = list[0];
            
            for(int i = 0;i < list.length;i++){
                if(max.compareTo(list[i]) < 0){
                    max = list[i];
                }
            }
            return max;
        }
    }
    
    public static void main(String[] args){
        
        //array integers that stores values 1,2,3
        Integer[] num = {1, 2, 3};
        //array string that stores red, green, blue
        String[] colour = {"red", "green", "blue"};
        //array of Circle object of radius 3, 2.9, 5,9
        Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        
        //System.out.println(max(num));
        //System.out.println(max(colour));
        //System.out.println(max(circles));
        
    }
}
