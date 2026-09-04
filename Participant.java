class Participant {
    String name;
    String teamName;
    boolean registered;

    // Primary constructor setting all fields directly
    public Participant(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.registered = true;
    }

    // Overloaded constructor chaining via this(...)
    public Participant(String name) {
        this(name, "Unassigned");
    }

    public void printStatus() {
        System.out.println(name + " | " + teamName + " | Registered: " + registered);
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya"};
        String[] teamNames = {"ByteBusters", "", "CodeCrafters", ""};

        // Loop over parallel arrays with if-else checking for empty team name
        for (int i = 0; i < names.length; i++) {
            Participant p;
            if (teamNames[i].isEmpty()) {
                p = new Participant(names[i]);
            } else {
                p = new Participant(names[i], teamNames[i]);
            }
            p.printStatus();
        }
    }
}