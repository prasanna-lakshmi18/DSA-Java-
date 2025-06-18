import java.util.*;

class StudentManagementSystem {
    public static void Entry_fee(int Entry, HashMap<String, Integer> User_details) {
        Scanner sc = new Scanner(System.in);

        if (Entry == 0) {
            System.out.print("Enter your id (Please enter at least 3 characters): ");
            sc.nextLine(); // consume leftover newline from previous nextInt
            String User_name = sc.nextLine();

            if (User_details.containsKey(User_name)) {
                System.out.println("ID already exists! Try logging in.");
            } else {
                System.out.print("\nEnter 1 -- Student\n2 -- Faculty\nChoose (1 or 2): ");
                int Status = sc.nextInt();
                User_details.put(User_name, Status);
                System.out.println("Registered successfully as " + (Status == 1 ? "Student" : "Faculty"));
            }

        } else {
            System.out.print("Enter your id: ");
            sc.nextLine(); // consume leftover newline from previous nextInt
            String user = sc.nextLine();

            if (User_details.containsKey(user)) {
                int num = User_details.get(user);
                Details(num);
            } else {
                System.out.println("Invalid ID. Please register first.");
                Entry_fee(0, User_details); // Suggest registration instead
            }
        }
    }

    public static void Details(int Status, HashMap<String, Integer> User_details) {
        ArrayList<Integer> details=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        if (Status == 1) {
            Student();
        } else {
            Faculty();
        }
    }

    public static void Student(HashMap<String, Integer> User_details) {
        System.out.println("Welcome, Student!");
    }

    public static void Faculty(HashMap<String, Integer> User_details) {
        System.out.println("Welcome, Faculty!");
    }

    public static void main(String[] args) {
        HashMap<String, Integer> User_details = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Login | Register\nEnter 1 for Login or 0 for Register:");
        int Entry = sc.nextInt();
        Entry_fee(Entry, User_details);
    }
}
