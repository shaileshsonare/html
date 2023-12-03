class MyCalc {
    public static void add(int x, int y) {
        System.out.println("I am from add with 2 int parameter");
    }

    public static void add(int x, float y) {
        System.out.println("I am from add with 2 int,float parameter");
    }

    public static void add(int x, int y, int z) {
        System.out.println("I am from add with 3 int parameter");
    }
}

class Main {
    static public void main(String args[]) {
        MyCalc.add(4, 5.5f);
    }
}












// class Person {
    
    // }
    
    // interface AchaPerson {
    
    // }
    
    // interface ChanglaManus {
    
    // }
    
    // class Employee extends Person implements AchaPerson, ChanglaManus {
    
    // }