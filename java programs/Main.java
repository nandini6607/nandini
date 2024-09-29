abstract class Bank {
    // Abstract method to get the balance, to be implemented by subclasses
    public abstract int getBalance();
}

class BankA extends Bank {
    // Method to return the deposited balance of $100
    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    // Method to return the deposited balance of $150
    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    // Method to return the deposited balance of $200
    @Override
    public int getBalance() {
        return 200;
    }
}
class Main {
    public static void main(String s[]) {
        // Creating objects for BankA, BankB, and BankC
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        // Display the balances
        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
}