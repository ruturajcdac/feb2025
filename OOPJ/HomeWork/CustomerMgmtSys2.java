import java.util.Scanner;

class Customer {
    int customerId;
    String customerName;
    String customerAddress;
    long customerPhone;

    static int count = 0;

    Customer() {
        this.customerId = 0;
        this.customerName = "Default Name";
        this.customerAddress = "Default Address";
        this.customerPhone = 0;
    }

    void insertData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID: ");
        this.customerId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Customer Name: ");
        this.customerName = sc.nextLine();

        System.out.println("Enter Customer Address: ");
        this.customerAddress = sc.nextLine();

        System.out.println("Enter Customer Phone: ");
        this.customerPhone = sc.nextLong();

        Customer.count++;
        System.out.println("Customer added successfully! Total customers: " + Customer.count);
    }

    void printDetails() {
        System.out.println("Customer ID: " + this.customerId);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Customer Address: " + this.customerAddress);
        System.out.println("Customer Phone: " + this.customerPhone);
    }
}

class CustomerMgmtSys2{
    public static void main(String[] args) {
        Customer[] customers = new Customer[15];

        for (int i = 0; i < 15; i++) {
            customers[i] = new Customer();
        }

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nCustomer Management System");
            System.out.println("1) Add new customer");
            System.out.println("2) Print customer");
            System.out.println("3) Delete customer");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (Customer.count >= 15) {
                        System.out.println("Customer list is full!");
                    } else {
                        customers[Customer.count].insertData();
                    }
                    break;

                case 2:
                    if (Customer.count == 0) {
                        System.out.println("Customer list is empty!");
                    } else {
                        System.out.print("Enter Customer ID to print details: ");
                        int searchId = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < Customer.count; i++) {
                            if (customers[i].customerId == searchId) {
                                customers[i].printDetails();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Customer not found!");
                        }
                    }
                    break;

                case 3:
                    if (Customer.count == 0) {
                        System.out.println("Customer list is empty!");
                    } else {
                        System.out.print("Enter Customer ID to delete: ");
                        int deleteId = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < Customer.count; i++) {
                            if (customers[i].customerId == deleteId) {
                                // Shift elements to remove the customer
                                for (int j = i; j < Customer.count - 1; j++) {
                                    customers[j] = customers[j + 1];
                                }
                                Customer.count--;
                                System.out.println("Customer deleted!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Customer not found!");
                        }
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}