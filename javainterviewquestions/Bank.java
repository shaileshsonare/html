interface Oracle {
    public void update();
    public void insert();

    public static void commit() {
        System.out.println("ay ay ay I am from interface's concrete method");
    }
}

abstract class DBConn {
    abstract public void select();

    public void delete() {
        System.out.println(" I am from delete ");
    }
}

class MySQLDBConn extends DBConn {
    public void select() {
        System.out.println("Thik hai kar diya define.");
    }
}



























class Bank {
    int balance;

    public Bank(int b) {
        this.balance = b;
    }

    public void showBalance() {
        System.out.println("Available Balance: " + this.balance);
    }

    public void deposit(int amt) {
        this.balance = this.balance + amt;
    }

    public final void withdraw(int amt) {
        this.balance = this.balance - amt;
    }
}

class SBI extends Bank {

    public SBI(int b) {
        super(b);
    }

    public void deposit(int amt) {
        this.balance = this.balance + (amt - 50);
    }

    // public void withdraw(int amt) {
    //     this.balance = this.balance - (amt + 50);
    // }
}

class Main {
    public static void main(String[] args) {
        
        Oracle.commit();
        

        SBI b = new SBI(1000);
        b.showBalance();
        b.deposit(500);
        b.showBalance();
        b.withdraw(150);
        b.showBalance();
    }
}
