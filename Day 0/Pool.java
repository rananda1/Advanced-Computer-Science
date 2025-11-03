public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsChemicalCheck = false;
        this.username = PoolUtils.generateUsername(this.ownerName);

    }

    public Pool() {
        this.name = "Pool cleaner";
        this.ownerName = "Rose Ananda";
        this.cleanlinessLevel = 5;
        this.needsChemicalCheck = false;
        this.username = PoolUtils.generateUsername(this.ownerName); 
    }

    public String toString() {
        if (this.needsChemicalCheck == false) {
            return "== ABOUT POOL ==\nName: " + this.name + "\nOwner: " 
                + this.ownerName + "\nUsername: " + this.username 
                + "\nCleanliness Level: " + this.cleanlinessLevel 
                + "\nDoes the pool need chemical check? No"; //+ this.needsChemicalCheck;
        } else {
            return "== ABOUT POOL ==\nName: " + this.name + "\nOwner: " 
                + this.ownerName + "\nUsername: " + this.username 
                + "\nCleanliness Level: " + this.cleanlinessLevel 
                + "\nDoes the pool need chemical check? Yes"; //+ this.needsChemicalCheck;
        }
        // return "== ABOUT POOL ==\nName: " + this.name + "\nOwner: " 
        //     + this.ownerName + "\nUsername: " + this.username 
        //     + "\nCleanliness Level: " + this.cleanlinessLevel 
        //     + "\nDoes the pool need chemical check? " + this.needsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }















}
