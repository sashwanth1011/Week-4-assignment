class MembershipCard {
    String studentName;

    // Shared static fields
    static String libraryName;
    static String validUntil;

    // Static block executes exactly once when class is loaded
    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";
        System.out.println("Library info loaded");
    }

    public MembershipCard(String studentName) {
        this.studentName = studentName;
        System.out.println("Membership card issued: " + this.studentName);
    }

    public static void main(String[] args) {
        String[] names = {"Ananya", "Rohan", "Priya", "Arjun", "Sneha"};

        // Creating multiple objects in loop without re-triggering static block
        for (String name : names) {
            new MembershipCard(name);
        }
    }
}