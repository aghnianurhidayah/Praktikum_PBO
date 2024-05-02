package javapackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import medpackage.*;

public class Employee extends Account implements Features {
    private String id;
    private String name;
    private int age;
    private float salary;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    ArrayList<Medicine> medList = new ArrayList<>();
    int numofmedtab = 1;
    int numofmedsy = 1;
    int numofmedcs = 1;

    public Employee(String username, String password, String id, boolean isAdmin, String name, int age, float salary) {
        super(username, password, isAdmin);
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getIdEmp() {
        return id;
    }

    public String getNameEmp() {
        return name;
    }

    public int getAgeEmp() {
        return age;
    }

    public float getSalaryEmp() {
        return salary;
    }

    public void setIdEmp(String id) {
        this.id = id;
    }

    public void setNameEmp(String name) {
        this.name = name;
    }

    public void setAgeEmp(int age) {
        this.age = age;
    }

    public void setSalaryEmp(float salary) {
        this.salary = salary;
    }

    public void menu() {
        while (true) {
            App.cls();
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                    Manage Medicines                                   ");
            System.out
                    .println("=======================================================================================");
            System.out.println("1. Add Medicine");
            System.out.println("2. Show Medicine");
            System.out.println("3. Update Medicine");
            System.out.println("4. Delete Medicine");
            System.out.println("0. Back");
            System.out
                    .println("=======================================================================================");
            System.out.print("Input Menu : ");
            String input = App.in.nextLine();

            if (input.equals("1")) {
                App.cls();
                add();
            } else if (input.equals("2")) {
                App.cls();
                read();
                App.con();
            } else if (input.equals("3")) {
                App.cls();
                update();
                App.con();
            } else if (input.equals("4")) {
                App.cls();
                delete();
                App.con();
            } else if (input.equals("0")) {
                App.isLogged = true;
                break;
            }
        }
    }

    public void add() {
        while (true) {
            App.cls();
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                      Add Medicine                                     ");
            System.out
                    .println("=======================================================================================");
            System.out.println("1. Tablet");
            System.out.println("2. Syrup");
            System.out.println("3. Capsule");
            System.out.println("0. Back");
            System.out
                    .println("=======================================================================================");
            System.out.print("Input type of med : ");
            String input = App.in.nextLine();
            if (input.equals("1")) {
                App.cls();
                add_med_tab();
                App.con();
            } else if (input.equals("2")) {
                App.cls();
                add_med_sy();
                App.con();
            } else if (input.equals("3")) {
                App.cls();
                add_med_cs();
                App.con();
            } else if (input.equals("0")) {
                break;
            }
        }
    }

    void add_med_tab() {
        try {
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                       Add Tablet                                      ");
            System.out
                    .println("=======================================================================================");
            System.out.print("Name     : ");
            String name = App.in.nextLine();
            System.out.print("Stok     : ");
            String inputstok = App.in.nextLine();
            int stok = Integer.parseInt(inputstok);
            System.out.print("Price    : Rp.");
            String inputprice = App.in.nextLine();
            int price = Integer.parseInt(inputprice);
            System.out.print("mg       : ");
            String inputmg = App.in.nextLine();
            int mg = Integer.parseInt(inputmg);
            String id = "MEDT" + Integer.toString(numofmedtab);
            String date = dtf.format(now);

            Tablet med_tab = new Tablet(id, name, stok, price, date, mg);
            medList.add(med_tab);

            numofmedtab++;
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added successfully!");
        } catch (NumberFormatException ex) {
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added failed!");
            System.out.println("Error: Input must be number.");
        }
    }

    void add_med_sy() {
        try {
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                        Add Syrup                                      ");
            System.out
                    .println("=======================================================================================");
            System.out.print("Name     : ");
            String name = App.in.nextLine();
            System.out.print("Stok     : ");
            String inputstok = App.in.nextLine();
            int stok = Integer.parseInt(inputstok);
            System.out.print("Price    : Rp.");
            String inputprice = App.in.nextLine();
            int price = Integer.parseInt(inputprice);
            System.out.print("ml       : ");
            String inputml = App.in.nextLine();
            int ml = Integer.parseInt(inputml);
            String id = "MEDS" + Integer.toString(numofmedsy);
            String date = dtf.format(now);

            Syrup med_sy = new Syrup(id, name, stok, price, date, ml);
            medList.add(med_sy);
            numofmedsy++;
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added successfully!");
        } catch (NumberFormatException ex) {
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added failed!");
            System.out.println("Error: Input must be number.");
        }
    }

    void add_med_cs() {
        try {
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                      Add Capsule                                      ");
            System.out
                    .println("=======================================================================================");
            System.out.print("Name     : ");
            String name = App.in.nextLine();
            System.out.print("Stok     : ");
            String inputstok = App.in.nextLine();
            int stok = Integer.parseInt(inputstok);
            System.out.print("Price    : Rp.");
            String inputprice = App.in.nextLine();
            int price = Integer.parseInt(inputprice);
            System.out.print("mg       : ");
            String inputmg = App.in.nextLine();
            int mg = Integer.parseInt(inputmg);
            String id = "MEDC" + Integer.toString(numofmedcs);
            String date = dtf.format(now);

            Capsule med_cs = new Capsule(id, name, stok, price, date, mg);
            medList.add(med_cs);
            numofmedcs++;
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added successfully!");
        } catch (NumberFormatException ex) {
            System.out
                    .println("=======================================================================================");
            System.out.println("Item added failed!");
            System.out.println("Error: Input must be number.");
        }
    }

    public void read() {
        System.out.println("=======================================================================================");
        System.out.println("                                    Show Medicines                                     ");
        System.out.println("=======================================================================================");
        if (medList.isEmpty()) {
            System.out.println("Data is empty");
        } else {
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("|   ID   |         Name         |    Price    |   Stok   |    Type    |    Content    |");
            System.out
                    .println("=======================================================================================");
            for (Medicine getMed : medList) {
                getMed.display();
            }
            System.out
                    .println("=======================================================================================");
        }
    }

    public void update() {
        try {
            System.out
                    .println("=======================================================================================");
            System.out
                    .println("                                    Update Medicine                                    ");
            System.out
                    .println("=======================================================================================");
            System.out.print("Med ID : ");
            String temp = App.in.nextLine();
            int i;
            for (i = 0; i < medList.size(); i++) {
                Medicine getMed = medList.get(i);
                if (temp.equals(getMed.getId())) {
                    System.out.println(
                            "=======================================================================================");
                    System.out.print("Name     : ");
                    String name = App.in.nextLine();
                    System.out.print("Stok     : ");
                    String inputstok = App.in.nextLine();
                    int stok = Integer.parseInt(inputstok);
                    System.out.print("Price    : Rp.");
                    String inputprice = App.in.nextLine();
                    int price = Integer.parseInt(inputprice);
                    if (getMed.getId().contains("MEDT")) {
                        System.out.print("mg       : ");
                        String inputmg = App.in.nextLine();
                        int mg = Integer.parseInt(inputmg);
                        Tablet new_tab = new Tablet(getMed.getId(), name, stok, price, getMed.getDate(), mg);
                        medList.set(i, new_tab);
                    } else if (getMed.getId().contains("MEDS")) {
                        System.out.print("ml       : ");
                        String inputml = App.in.nextLine();
                        int ml = Integer.parseInt(inputml);
                        Syrup new_sy = new Syrup(getMed.getId(), name, stok, price, getMed.getDate(), ml);
                        medList.set(i, new_sy);
                    } else if (getMed.getId().contains("MEDC")) {
                        System.out.print("mg       : ");
                        String inputmg = App.in.nextLine();
                        int mg = Integer.parseInt(inputmg);
                        Capsule new_sy = new Capsule(getMed.getId(), name, stok, price, getMed.getDate(), mg);
                        medList.set(i, new_sy);
                    }
                    System.out.println(
                            "=======================================================================================");
                    System.out.println("Item changed successfully!");
                    break;
                }
            }
            if (i == medList.size()) {
                System.out.println("Invalid ID");
            }
        } catch (NumberFormatException ex) {
            System.out
                    .println("=======================================================================================");
            System.out.println("Item changed failed!");
            System.out.println("Error: Input must be number.");
        }
    }

    public void delete() {
        System.out.println("=======================================================================================");
        System.out.println("                                    Delete Medicine                                    ");
        System.out.println("=======================================================================================");
        System.out.print("Med ID   : ");
        String temp = App.in.nextLine();
        int i;
        int isDelete = 0;
        for (i = 0; i < medList.size(); i++) {
            Medicine getMed = medList.get(i);
            if (temp.equals(getMed.getId())) {
                medList.remove(i);
                System.out.println(
                        "=======================================================================================");
                System.out.println("Item deleted successfully!");
                isDelete = 1;
                break;
            }
        }
        if (isDelete != 1) {
            if (i == medList.size()) {
                System.out.println("Invalid ID");
            }
        }

    }
}
