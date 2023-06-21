package lab4;

public class Lab04_Q4 {
    public static void main(String[] args) {
        // Data and Variables
        String function = "sin(PI * x) + sin(PI * x * 3) / 3 ";
        int x_start_original = 0;
        int x_end_original = 1;
        double x_start = 0.0;
        double x_end = 1;
        double step_size = 0.01;
        double total_area = 0;
        double rectangle_height = 0;
        double rectangle_area = 0;

        /*Calculate the area of each rectangle one by one
          and add to total area
        */         
        while (x_start < x_end) {
            rectangle_height = Math.sin(Math.PI * x_start) + Math.sin(Math.PI * x_start * 3) / 3;
            rectangle_area = step_size * rectangle_height;
            total_area += rectangle_area;
            x_start += step_size;
        }


        // Output the data
        System.out.println("The function is:" + function);
        System.out.println("Parameters: ");
        System.out.println("x_start = " + x_start_original + ", x_end: " + x_end_original );
        System.out.println("step_size = " + step_size);
        System.out.println("Area under \"" + function + "\" from " + x_start_original + " to " + x_end_original + ": " + total_area);

        
    }
}
