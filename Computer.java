package java_programs;

public class Computer {
    class Processor {
        String brand;
        double speed; 
        
        public Processor(String brand, double speed) {
            this.brand = brand;
            this.speed = speed;
        }
        public void displayDetails() {
            System.out.println("Processor Brand: " + brand);
            System.out.println("Processor Speed: " + speed);
        }
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        Processor processor = computer.new Processor("Intel", 5.5);
        processor.displayDetails();
    }
}

