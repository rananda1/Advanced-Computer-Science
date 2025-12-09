public class Theater {

    private String theaterName;
    private TheaterMember[] registeredMembers;

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public boolean isFull() {
        for (int n = 0; n < registeredMembers.length; n++) {
            if (registeredMembers[n] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newArray = new TheaterMember[registeredMembers.length * 2];
        for (int g = 0; g < registeredMembers.length; g++) {
            newArray[g] = registeredMembers[g];
        }
        registeredMembers = newArray;
    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            TheaterMember[] newArray = new TheaterMember[registeredMembers.length + 1];
            for (int g = 0; g < registeredMembers.length; g++) {
                newArray[g] = registeredMembers[g];
            }
            newArray[newArray.length - 1] = member;
            registeredMembers = newArray;
        } else {
            for (int f = 0; f < registeredMembers.length; f++) {
                if (registeredMembers[f] == null) {
                    registeredMembers[f] = member;
                    return;
                }
            }
        }
    }

    public String toString() {
        String finalString = "== " + theaterName + " ==\n";
        for (int o = 0; o < registeredMembers.length; o++) {
            finalString += o + ".) " + registeredMembers[o].toString() + "\n";
            // finalString = finalString + "\n" + (o + 1) + ".) " +
            // enrolledStudents[o].toString();
        }
        return finalString;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int o = 0; o < registeredMembers.length; o++) {
            if (registeredMembers[o].equals(member)) {
                registeredMembers[o] = null;
                return true;
            }
        }
        return false;
    }

}
