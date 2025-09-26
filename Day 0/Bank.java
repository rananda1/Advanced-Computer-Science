public class Bank {
    
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public Bank(int newNumberOfLoanOfficers, int newNumberOfTellers) {
        this.numberOfLoanOfficers = newNumberOfLoanOfficers;
        this.numberOfTellers = newNumberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    } 

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }
    
    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " 
            + numberOfTellers + " bank tellers. So, in total, the bank has " 
            + computeTotalEmployees() + " total employees.";
    }

    public boolean equals(Bank otherBank) {
        if (
            this.numberOfLoanOfficers == otherBank.numberOfLoanOfficers
                &&
                this.numberOfTellers == otherBank.numberOfTellers
        ) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            this.numberOfLoanOfficers = this.numberOfLoanOfficers + numberToHire;
        } else {
            this.numberOfTellers = this.numberOfTellers + numberToHire;
        }
    }


    public double getEmployeeRatio() {
        return (double)numberOfLoanOfficers + (double)numberOfTellers / 100.0;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            if (numberToFire > numberOfLoanOfficers) {
                numberOfLoanOfficers = 0;
            } else {
                numberOfLoanOfficers = numberOfLoanOfficers - numberToFire;
            }
        } else {
            if (numberToFire > numberOfTellers) {
                numberOfTellers = 0;
            } else {
                numberOfTellers = numberOfTellers - numberToFire;
            }
        }

    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers - 1;
            numberOfTellers = numberOfTellers + 1;
        } else {
            numberOfTellers = numberOfTellers - 1;
            numberOfLoanOfficers = numberOfLoanOfficers + 1;
        }
    }

    










}
