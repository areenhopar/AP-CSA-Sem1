/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("hello");
        
        double num = raise(200000.42, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
	}
	
    public static double raise(double salary, int percent) {
        double newSalary = salary + salary * (percent / 100.0);
        return newSalary;
    }
	
	public static void greeting(String name) {
	    System.out.println("Hello, " + name + "!");
	}
	
	public static void printAnimal() {
	    System.out.println("      .            ");
	    System.out.println("\\_____)\\_____");
	    System.out.println("/--v____ __`<         ");
	    System.out.println("        )/           ");
	    System.out.println("        '");
	}
}