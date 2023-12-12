package main;
import java.util.Scanner;
import java.util.Arrays;

public class coseWork {
    private	static Scanner input=new Scanner(System.in);
    private	static String[][] suppliers = new String[0][1];
    private	static  String[][] ararry =new String[0][1];
    private	static String [] items=new String[0];
    private	static  String [][] additems =new String[0][1];
    private	static String[][] discreptionandQty =new String[0][5];

    private final static void clearConsole() {
        final String os = System.getProperty("os.name");
        try {
            if (os.equals("Linux")) System.out.print("\033\143");
            else if (os.equals("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String args[]){

        log();

    }


    public static void log(){

        System.out.print("+--------------------------------------------------------------+\n");
        System.out.print("|                  LOGIN PAGE                                  |\n");
        System.out.print("+--------------------------------------------------------------+\n\n");

        String [][]userNmaePassword =new String[1][2];
        String [][] temp= new String[1][2];

        userNmaePassword [0][0]="k";
        userNmaePassword [0][1]="1";

        System.out.print("input user name: ");
        String userName=input.next();
        System.out.println();

        if (userNmaePassword[0][0].equals(userName) ){
            System.out.println("sussesfull user name: ");
            System.out.println();
        }
        else{
            for (int i = 0; i < 3; i++)
            {
                System.out.print("wrong user name try: ");
                temp[0][0]=input.next();
                System.out.println();

                if (temp[0][0].equals(userNmaePassword[0][0]))
                {
                    System.out.println("ok sussesfull");
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("oops....wrong");
                    System.out.println();

                }
            }
        }

        String password="0";

        if (userNmaePassword[0][0].equals(userName) || temp[0][0].equals(userNmaePassword[0][0])){

            System.out.print("input password: ");
            password=input.next();
            System.out.println();

            if (userNmaePassword[0][1].equals(password) )
            {
                System.out.print("Sussesfull password");
                System.out.println();
                System.out.println();
            }

            else{
                System.out.print("Do you want change passworod(Y/N): ");
                char update=input.next().charAt(0);
                System.out.println();

                if (update=='y')
                {
                    System.out.print("input new password: ");
                    String newPassword=input.next();
                    System.out.println();

                    System.out.print("conform new password: ");
                    String confirmPassword=input.next();
                    System.out.println();

                    userNmaePassword [0][1]=confirmPassword;

                    System.out.print("sussesfull new password");
                    System.out.println();


                }
                else if(update=='n'){
                    for (int i = 0; i < 3; i++)
                    {
                        System.out.print("wrong password try: ");
                        temp[0][1]=input.next();
                        System.out.println();

                        if (temp[0][1].equals(userNmaePassword[0][1]))
                        {
                            System.out.println("ok sussesfull");
                            System.out.println();
                            break;
                        }
                        else{
                            System.out.println("oops....wrong");
                            System.out.println();

                        }
                    }
                }
            }
        }


        else{

            System.exit(0);
        }


        if (userNmaePassword[0][0].equals(userName) || userNmaePassword[0][1].equals(password)){
            clearConsole();
            stokeManegemetSystem(userNmaePassword);
        }

        else if (userNmaePassword[0][0].equals(temp[0][0]) || userNmaePassword[0][1].equals(temp[0][1])){
            clearConsole();
            stokeManegemetSystem(userNmaePassword);
        }

    }


    public static void stokeManegemetSystem(String[][]userNmaePassword){
        String [][] copyarray1=new String[1][2];

        for (int i = 0; i < copyarray1.length; i++)
        {
            for (int j = 0; j < copyarray1[i].length; j++) if (i<copyarray1.length) copyarray1[i][j]=userNmaePassword[i][j];

        }

        System.out.print("+--------------------------------------------------------------+\n");
        System.out.print("|                  WELCOME TO IJSE STOCK MANAGEMENT SYSTEM     |\n");
        System.out.print("+------------------------------------------------------------+\n\n");

        System.out.print("[1] change the creadentils");
        System.out.print(" "+" "+" ");

        System.out.println("[2] suplierr manage");

        System.out.print("[3] Stok management");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[4] Log Out");


        System.out.println("[5] Exit the system");
        System.out.println();

        int op=0;

        L1:	 for (int i = 0; i <= 3; i++)
        {
            System.out.print("Enter the opteion to continue: ");
            op=input.nextInt();
            System.out.println();

            switch (op)
            {
                case 1:
                    clearConsole();
                    creadentils(copyarray1);
                    break L1;

                case 2:
                    clearConsole();
                    suplierrManage(copyarray1);
                    break L1;

                case 3:
                    clearConsole();
                    StokManagement();
                    break L1;

                case 4:
                    clearConsole();
                    log();
                    break L1;

                case 5:
                    System.exit(0);
                    break L1;

                default:{
                    System.out.print("wrong try again ");

                }
            }
        }
    }

    public static void creadentils(String[][]copyarray1){

        String [][]verityfy=new String[1][2];
        String [][] temp= new String[1][2];

        System.out.print("Plese the enter user name verityfy you: ");
        verityfy[0][0]=input.next();
        System.out.println();

        if (verityfy[0][0].equals(copyarray1[0][0]))
        {
            System.out.println(" "+"Hey: "+verityfy[0][0]);
            System.out.println();
            System.out.println();
        }
        else{

            for (int i = 0; i < 3; i++)
            {
                System.out.print("wrong user name try again: ");
                temp[0][0]=input.next();
                System.out.println();

                if (temp[0][0].equals(copyarray1[0][0]))
                {
                    System.out.println("hey "+temp[0][0]);
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("oops....wrong");
                    System.out.println();
                }
            }
        }

        String password="0";

        if (copyarray1[0][0].equals(verityfy[0][0]) || temp[0][0].equals(copyarray1[0][0])){


            System.out.print("input password: ");
            verityfy[0][1]=input.next();
            System.out.println();

            if (copyarray1[0][1].equals(verityfy[0][1]) )
            {
                System.out.print("Sussesfull password");
                System.out.println();
                System.out.println();
            }

            else{

                System.out.print("Do you want change passworod(Y/N): ");
                char update=input.next().charAt(0);
                System.out.println();


                if (update=='y')
                {
                    System.out.print("input new password: ");
                    String newPassword=input.next();
                    System.out.println();

                    System.out.print("conform new password: ");
                    String confirmPassword=input.next();
                    System.out.println();

                    copyarray1 [0][1]=confirmPassword;

                    System.out.print("sussesfull new password");
                    System.out.println();
                    System.out.println();

                    for(String []array2d : copyarray1) System.out.print(Arrays.toString(array2d));

                }

                else if(update=='n'){

                    for (int i = 0; i < 3; i++)
                    {
                        System.out.print("wrong password try: ");
                        temp[0][1]=input.next();
                        System.out.println();

                        if (temp[0][1].equals(copyarray1[0][1]))
                        {
                            System.out.println("ok sussesfull");
                            System.out.println();
                            break;
                        }
                        else{
                            System.out.println("oops....wrong");
                            System.out.println();

                        }
                    }
                }
            }
        }

        else{
            System.exit(0);
        }

        System.out.print("Do you want to go home page(Y/N)");
        char left=input.next().charAt(0);
        System.out.println();


        if (left=='y') stokeManegemetSystem(copyarray1);

    }


    public static void suplierrManage(String[][]copyarray1){


        System.out.print("+--------------------------------------+\n");
        System.out.print("|            SUPPLIER MANAGE           |\n");
        System.out.print("+------------------------------------+\n\n");

        System.out.print("[1] Add Suplier");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[2] update Suplier");

        System.out.print("[3] delet Suplier");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[4]  view Suplier");

        System.out.print("[5] search suplier");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[6] Home page");

        System.out.println();

        int op=0;


        L1:	  for (int i = 0; i <= 3; i++)
        {
            System.out.print("Enter the opteion to continue: ");
            op=input.nextInt();
            System.out.println();


            switch (op)
            {
                case 1:
                    clearConsole();
                    addSuplier();
                    break L1;

                case 2:
                    clearConsole();
                    String[][]w=updatesupllier();
                    break L1;

                case 3:
                    clearConsole();
                    deleteSupplier();
                    break L1;

                case 4:
                    clearConsole();
                    viewSupplier();
                    break L1;

                case 5:
                    clearConsole();
                    saerchSupplier();
                    break L1;

                case 6:
                    clearConsole();
                    stokeManegemetSystem(copyarray1);
                    break L1;

                default:{
                    System.out.print("wrong try again ");

                }

            }

        }

    }


    public static void addSuplier(){

        System.out.print("+--------------------------------------------------------------+\n");
        System.out.print("|                  ADD SUPPLIER                                |\n");
        System.out.print("+------------------------------------------------------------+\n\n");

        while (true) {
            System.out.print("Do you want to add a supplier? (Y/N): ");
            char answer = input.next().charAt(0);
            System.out.println();

            if (answer == 'Y' || answer == 'y') {
                System.out.print("Add supplier ID: ");
                String supplierId = input.next();
                System.out.println();

                System.out.print("Add supplier name: ");
                String supplierName = input.next();
                System.out.println();

                String[][] newSuppliers = new String[suppliers.length + 1][2];
                for (int i = 0; i < suppliers.length; i++) {
                    newSuppliers[i] = suppliers[i];
                }

                newSuppliers[suppliers.length][0] = supplierId;
                newSuppliers[suppliers.length][1] = supplierName;

                suppliers = newSuppliers;
            } else if (answer == 'N' || answer == 'n') {
                clearConsole();
                suplierrManage(suppliers);
                break;
            }
        }

    }

    public static void StokManagement(){


        System.out.print("+-----------------------------------------+\n");
        System.out.print("|                   STOCK MANAGEMENT      |\n");
        System.out.print("+---------------------------------------+\n\n");

        System.out.print("[1] Manage Iteam Catogari");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[2] Add Item");

        System.out.print("[3] Get Upadte Supplier Wise");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[4] view Item");

        System.out.print("[5] Ranl Item PER Unit Price");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");


        System.out.println("[6] Home page");

        System.out.println();

        int op=0;

        L1:		  for (int i = 0; i <= 3; i++)
        {
            System.out.print("Enter the opteion to continue: ");
            op=input.nextInt();
            System.out.println();

            switch (op)
            {
                case 1:
                    clearConsole();
                    manageItemCatogary(items);
                    break L1;

                case 2:
                    clearConsole();
                    addItem2();
                    break L1;

                case 3:
                    clearConsole();
                    getUpdateAndSupplierWise();
                    break L1;

                case 4:
                    clearConsole();
                    viewItem();
                    break L1;

                case 5:
                    clearConsole();
                    rankedUnitPrice();
                    break L1;

                case 6:
                    clearConsole();
                    // stokeManegemetSystem();
                    break L1;

                default:{
                    System.out.print("wrong try again ");

                }
            }
        }
    }


    public static void getUpdateAndSupplierWise() {
        System.out.print("+------------------------------------------------------------------------------+\n");
        System.out.print("|                  get Update And Supplier Wise                                |\n");
        System.out.print("+----------------------------------------------------------------------------+\n\n");

        L1:		while (true) {
            boolean empty = true;

            for (int k = 0; k < suppliers.length; k++) {
                if (suppliers[k].length > 1) {
                    empty = false;
                    break;
                }
            }

            if (empty) {
                while (true) {
                    System.out.print("Do you want to add a new supplier? (Y/N): ");
                    char answer = input.next().charAt(0);

                    if (answer == 'Y' || answer == 'y') {
                        clearConsole();
                        addSuplier();
                        break;
                    } else if (answer == 'N' || answer == 'n') {
                        clearConsole();
                        manageItemCatogary(items);
                        return;
                    } else {
                        System.out.println("Invalid option. Please enter Y or N.");
                    }
                }
            }

            System.out.print("Enter Supplier ID: ");
            String supplierId = input.next();

            System.out.print("Enter Supplier name: ");
            String supplierName = input.next();

            boolean supplierFound = false;

            for (int i = 0; i < suppliers.length; i++) {
                for (int k = 0; k < suppliers[i].length; k++) {
                    if (supplierId.equals(suppliers[i][k]) || supplierName.equals(suppliers[i][k])) {
                        supplierFound = true;
                        break;
                    }
                }
                if (supplierFound) {
                    break;
                }
            }

            if (supplierFound) {
                boolean a = false;

                while (!a) {
                    for (int q = 0; q < items.length; q++) {
                        System.out.println(items[q] + ": ");
                        System.out.println("-----------------------------");
                        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s%n",
                                "SID", "code", "desk", "price", "qty", "cat");

                        for (int h = 0; h < discreptionandQty.length; h++) {
                            for (int p = 0; p < discreptionandQty[h].length; p += 5) {
                                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s%n",
                                        discreptionandQty[h][p], discreptionandQty[h][p + 1],
                                        discreptionandQty[h][p + 2], discreptionandQty[h][p + 3],
                                        discreptionandQty[h][p + 4], items[q]);
                                break;
                            }
                        }

                        System.out.println("-----------------------------");

                        a = true;
                        break;
                    }

                    break;
                }
            } else {
                System.out.println("Supplier not found. Please enter a valid Supplier ID or Supplier name.");
            }
            System.out.print("Do you want add another seach (Y/N): ");
            char answer4 = input.next().charAt(0);

            if (answer4 == 'Y' || answer4 == 'y') {
                continue L1;
            } else {
                StokManagement();
            }
        }
    }


    public static void addItem2(){

        System.out.print("+------------------------------------------------------------+\n");
        System.out.print("|                  ADD ITEMS                                 |\n");
        System.out.print("+----------------------------------------------------------+\n\n");

        while (true) {
            boolean isEmpty = true;

            for (int k = 0; k < items.length; k++) {
                if (items.length > 1) {
                    isEmpty = false;
                    break;
                }
            }


            if (isEmpty) {
                while (true) {
                    System.out.print("Do you want to add a new  category? (Y/N): ");
                    char answer = input.next().charAt(0);

                    if (answer == 'Y' || answer == 'y') {
                        clearConsole();
                        addItems();


                        break;
                    } else if (answer == 'N' || answer == 'n') {
                        clearConsole();
                        manageItemCatogary(items);
                        return;
                    } else System.out.println("Invalid option. Please enter Y or N: ");
                }
            }



            while (true) {
                boolean Empty = true;

                for (int k = 0; k < suppliers.length; k++) {
                    if (suppliers[k].length > 1) {
                        Empty = false;
                        break;
                    }
                }



                if (Empty) {
                    while (true) {
                        System.out.print("Do you want to add a new  supplier? (Y/N): ");
                        char answer = input.next().charAt(0);

                        if (answer == 'Y' || answer == 'y') {
                            clearConsole();
                            addSuplier();


                            break;
                        } else if (answer == 'N' || answer == 'n') {
                            clearConsole();
                            manageItemCatogary(items);
                            return;
                        } else {
                            System.out.println("Invalid option. Please enter Y or N: ");
                        }
                    }
                }

                System.out.print("Do you want to add a new item? (Y/N): ");
                char answer = input.next().charAt(0);
                System.out.println();

                if (answer == 'Y' || answer == 'y') {
                    System.out.print("input item code: ");
                    int itemCode = input.nextInt();
                    System.out.println();

                    if (itemCode >=0) {

                        System.out.println("Supplier Table:");
                        System.out.println("-----------------------------");
                        System.out.printf("%-10s %-10s %-15s%n","#", "ID", "Name");

                        System.out.println("-----------------------------");

                        int h=0;


                        for ( h = 0; h < suppliers.length; h++) {
                            for (int p = 0; p < suppliers[h].length; p++) {
                                System.out.printf("%-10s %-10s %-15s%n",h+1, suppliers[h][p], suppliers[h][p + 1]);
                                break;
                            }
                        }

                        System.out.println("-----------------------------");

                        for (int r = 0; r < ararry.length; r++) {
                            for (int k = 0; k < ararry[r].length; k++)  System.out.printf("%-10s ", ararry[r][k]);

                            System.out.println();
                        }

                        System.out.println("-----------------------------");
                        System.out.println();

                        System.out.print("enter the suplier number");
                        int suplierNumber=input.nextInt();
                        System.out.println();

                        int r=0;

                        if (suplierNumber >= 1 && suplierNumber <= suppliers.length)
                        {
                            System.out.println("Supplier Table:");
                            System.out.println("-----------------------------");
                            System.out.printf(" %-10s %-15s%n","#", "catogary Name");


                            System.out.println("-----------------------------");

                            for ( r = 0; r < items.length; r++) {

                                System.out.printf("%-10s %-15s%n",r+1, items[r]);
                                System.out.println();
                            }

                            System.out.println("-----------------------------");
                            System.out.println();

                        }


                        System.out.print("enter the catogary number");
                        int catogaryNumber=input.nextInt();
                        System.out.println();

                        boolean flag= false;

                        L1:	  while(!flag){
                            if (catogaryNumber >= 1 && catogaryNumber <= items.length)
                            {
                                String[][] newcoppyQty = new String[discreptionandQty.length +1][5];

                                System.out.print("enter the discrepshio: ");
                                String discrepshion=input.next();
                                System.out.println();

                                System.out.print("enter the unity Price: ");
                                String unityPrice=input.next();
                                System.out.println();

                                System.out.print("enter the qty: ");
                                String qty=input.next();
                                System.out.println();


                                for (int i = 0; i < newcoppyQty.length+1; i++) {
                                    for (int s = 0; s < newcoppyQty[i].length; s++) {
                                        newcoppyQty[i][0]=suppliers[i][0];
                                        newcoppyQty[i][1]=Integer.toString(itemCode);
                                        newcoppyQty[i][2]=discrepshion;
                                        newcoppyQty[i][3]=unityPrice;
                                        newcoppyQty[i][4]=qty;

                                        discreptionandQty = newcoppyQty;
                                        break L1;

                                    }
                                }
                            }

                            else flag=true;
                        }
                    }
                } else if (answer == 'N' || answer == 'n') {
                    clearConsole();
                    manageItemCatogary(items);
                    break;
                } else  System.out.println("Invalid option. Please enter Y or N.");
            }
        }
    }



    public static void manageItemCatogary(String[]items){

        System.out.print("+--------------------------------------------+\n");
        System.out.print("|                  MANAGE ITEMS CATOGARY     |\n");
        System.out.print("+------------------------------------------+\n\n");

        System.out.print("[1] Add Item Catogary");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[2] Delet Item catogary");

        System.out.print("[3] update Item Catogary");
        System.out.print(" "+" "+" "+" "+" "+" "+" "+" "+" "+" ");

        System.out.println("[4] Stoke Manegement");

        System.out.println();

        int op=0;

        L1:	  for (int i = 0; i <= 3; i++)
        {
            System.out.print("Enter the opteion to continue: ----->");
            op=input.nextInt();
            System.out.println();

            switch (op)
            {
                case 1:
                    clearConsole();
                    addItems();
                    break L1;

                case 2:
                    clearConsole();
                    deletItems();
                    break L1;

                case 3:
                    clearConsole();
                    updateCatogary();
                    break L1;

                case 4:
                    clearConsole();
                    StokManagement();
                    break L1;

                default:{
                    System.out.print("wrong try again ");

                }
            }
        }
    }


    public static void addItems(){


        System.out.print("+----------------------------------------+\n");
        System.out.print("|                  ADD ITEM CATAGORY     |\n");
        System.out.print("+-------------------------------- -----+\n\n");


        while (true) {
            System.out.print("Do you want to add a new item category? (Y/N): ");
            char answer = input.next().charAt(0);
            System.out.println();

            if (answer == 'Y' || answer == 'y') {
                System.out.print("Add item category name: ");
                String itemName = input.next();
                System.out.println();

                String[]newItems = new String[items.length + 1];
                for (int i = 0; i < items.length; i++) {
                    newItems[i] = items[i];
                }

                newItems[items.length] = itemName;

                items = newItems;
            } else if (answer == 'N' || answer == 'n') {
                clearConsole();
                manageItemCatogary(items);
                break;
            } else  System.out.println("Invalid option. Please enter Y or N.");
        }
    }


    public static void updateCatogary(){


        L1:  while (true) {
            System.out.print("Do you want to update supplier (Y/N): ");
            char answer = input.next().charAt(0);

            if (answer == 'Y' || answer == 'y') {
                System.out.print("Input current ID: ");
                String categoryName = input.next();
                System.out.println();

                boolean found = false;

                for (int z = 0; z < items.length; z++) {
                    if (items != null && items.equals(categoryName)) {
                        System.out.println("Found category");
                        System.out.println();

                        System.out.print("Update supplier ID: ");
                        items[z] = input.next();
                        System.out.println();
                        System.out.println("Your updated supplier data: " + Arrays.toString(items));

                        found = true;
                        break;
                    }

                    if (found) break;
                }

                if (!found) {
                    System.out.println("Category not found. Try again");
                }
            } else if (answer == 'N' || answer == 'n') {
                clearConsole();
                manageItemCatogary(items);
                break;
            } else {
                System.out.println("Invalid option. Exiting search.");
                break L1;
            }

            System.out.print("Do you want to go to manage Item Catogary or Exit (Y/N): ");
            char answer4 = input.next().charAt(0);

            if (answer4 == 'Y' || answer4 == 'y') {
                clearConsole();
                manageItemCatogary(items);
            } else if (answer4 == 'N' || answer4 == 'n') {
                continue L1;
            } else {
                System.out.println("Invalid option. Exiting search.");
                break L1;
            }
        }


    }


    public static void deletItems(){

        L1:	 while(true){

            System.out.print("Input category name: ");
            String categoryName = input.next();
            System.out.println();

            boolean found = false;

            for (int z = 0; z < items.length; z++) {

                if (items != null && items.equals(categoryName)) {
                    System.out.println("Found category");
                    System.out.println("Your item data: " + Arrays.toString(items));

                    for (int i = z; i < items.length - 1; i++)  items[i] = items[i + 1];
                    items = Arrays.copyOf(items, items.length - 1);

                    found = true;
                    break;
                }

                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println("Category not found.");
            }

            System.out.print("Do you want to go to manage Item Catogary or Exit (Y/N): ");
            char answer4 = input.next().charAt(0);

            if (answer4 == 'Y' || answer4 == 'y') {
                clearConsole();
                manageItemCatogary(items);
            } else if (answer4 == 'N' || answer4 == 'n') {
                continue L1;
            } else {
                System.out.println("Invalid option. Exiting search.");

            }
        }


    }


    public static String[][] updatesupllier(){


        while (true) {
            boolean empty = true;

            for (int k = 0; k < suppliers.length; k++) {
                if (suppliers[k].length > 1) {
                    empty = false;
                    break;
                }
            }

            if (empty) {
                while (true) {
                    System.out.print("Do you want to add a new supplier? (Y/N): ");
                    char answer = input.next().charAt(0);

                    if (answer == 'Y' || answer == 'y') {
                        clearConsole();
                        addSuplier();
                        break;
                    } else if (answer == 'N' || answer == 'n') {
                        clearConsole();
                        manageItemCatogary(items);
                        //return;
                    } else {
                        System.out.println("Invalid option. Please enter Y or N.");
                    }
                }
            }

            while (true) {
                System.out.print("Do you want to update supplier (Y/N): ");
                char answer = input.next().charAt(0);
                System.out.println();

                if (answer == 'y') {
                    System.out.print("Input current ID: ");
                    String currentId = input.next();
                    System.out.println();

                    System.out.print("Input current name: ");
                    String currentName = input.next();
                    System.out.println();

                    boolean found = false;

                    for (int z = 0; z < suppliers.length; z++) {
                        for (int v = 0; v < suppliers[z].length; v++) {
                            if (suppliers[z][v].equals(currentId) || suppliers[z][v].equals(currentName)) {
                                System.out.print("Found ID");
                                System.out.println();

                                System.out.print("Update supplier ID: ");
                                suppliers[z][v] = input.next();
                                System.out.println();


                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.print("Try again");
                        System.out.println();
                    }

                    for (int p = 0; p < suppliers.length; p++) {
                        for (int w = 0; w < suppliers[p].length; w++) {
                            if (suppliers[p][w].equals(currentId) || suppliers[p][w].equals(currentName)) {
                                System.out.print("Found ID");
                                System.out.println();

                                System.out.print("Update supplier name: ");
                                suppliers[p][w] = input.next();
                                System.out.println();



                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.print("Try again");
                        System.out.println();
                    }
                } else if (answer == 'n') {
                    System.out.print("Do you want to go to Supplier Manager or Exit (Y/N): ");
                    char answer2 = input.next().charAt(0);
                    System.out.println();

                    if (answer2 == 'y') {
                        clearConsole();
                        suplierrManage(suppliers);
                    } else {
                        System.exit(0);
                    }
                }


                ararry = new String[suppliers.length][suppliers[0].length];

                for (int q = 0; q < suppliers.length; q++) {
                    for (int d = 0; d < suppliers[q].length; d++) {
                        if (q < suppliers.length) {
                            ararry[q][d] = suppliers[q][d];
                        }
                    }
                }


                System.out.print("Do you want to add another Supplier Manager(Y/N): ");
                char answer3 = input.next().charAt(0);

                if (answer3 == 'y') {
                    clearConsole();
                    suplierrManage(suppliers);
                } else {
                    clearConsole();
                    StokManagement();
                }



            }
        }
    }


    public static void deleteSupplier(){

        while (true) {
            boolean empty = true;

            for (int k = 0; k < suppliers.length; k++) {
                if (suppliers[k].length > 1) {
                    empty = false;
                    break;
                }
            }

            if (empty) {
                while (true) {
                    System.out.print("Do you want to add a new supplier? (Y/N): ");
                    char answer = input.next().charAt(0);
                    System.out.println();

                    if (answer == 'Y' || answer == 'y') {
                        clearConsole();
                        addSuplier();
                        break;
                    } else if (answer == 'N' || answer == 'n') {
                        clearConsole();
                        manageItemCatogary(items);

                    } else {
                        System.out.println("Invalid option. Please enter Y or N.");
                    }
                }
            }


            while (true) {
                System.out.print("Do you want to delete a supplier? (Y/N): ");
                char answer = input.next().charAt(0);
                System.out.println();

                if (answer == 'Y' || answer == 'y') {
                    System.out.print("Input current ID: ");
                    String currentId = input.next();
                    System.out.println();

                    System.out.print("Input current name: ");
                    String currentName = input.next();
                    System.out.println();

                    boolean found = false;

                    for (int z = 0; z < ararry.length; z++) {
                        for (int g = 0; g < ararry[z].length; g++) {
                            if (ararry[z][g].equals(currentId) || ararry[z][g].equals(currentName)) {
                                System.out.println("Found ID");
                                System.out.println();


                                for (int i = z; i < ararry.length - 1; i++) {
                                    ararry[i] = ararry[i + 1];
                                }
                                ararry = Arrays.copyOf(ararry, ararry.length - 1);


                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }


                    if (!found) {
                        System.out.println("Supplier not found.");
                    }

                    found = false;

                    for (int h = 0; h < suppliers.length; h++) {
                        for (int x = 0; x < suppliers[h].length; x++) {
                            if (suppliers[h][x].equals(currentId) || suppliers[h][x].equals(currentName)) {
                                System.out.println("Found ID");
                                System.out.println();


                                for (int i = h; i < suppliers.length - 1; i++) {
                                    suppliers[i] = suppliers[i + 1];
                                }
                                suppliers = Arrays.copyOf(suppliers, suppliers.length - 1);

                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Supplier not found.");
                        System.out.println();
                    }
                } else if (answer == 'N' || answer == 'n') {
                    break;
                }
            }
        }
    }


    public static void viewItem() {


        boolean flag = false;

        L1:  while (!flag) {
            for (int q = 0; q < items.length; q++) {
                System.out.println(items[q] + ": ");

                System.out.println("-----------------------------");
                System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", "SID", "code", "desk", "price", "qty");


                L3:   for (int h = 0; h < discreptionandQty.length; h++) {
                    for (int p = 0; p < discreptionandQty[h].length; p++) {
                        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", discreptionandQty[h][0], discreptionandQty[h][1], discreptionandQty[h][2], discreptionandQty[h][3], discreptionandQty[h][4]);
                        break;
                    }
                }

                System.out.println("-----------------------------");

            }
            break L1;
        }



    }


    public static void viewSupplier(){


        System.out.println("Supplier Table:");
        System.out.println("-----------------------------");
        System.out.printf("%-10s %-15s%n", "ID", "Name");


        for (int h = 0; h < suppliers.length; h++) {
            for (int p = 0; p < suppliers[h].length; p++) {
                System.out.printf("%-10s %-15s%n", suppliers[h][p], suppliers[h][p + 1]);
                break;
            }
        }

        System.out.println("-----------------------------");

        for (int r = 0; r < ararry.length; r++) {
            for (int k = 0; k < ararry[r].length; k++) {
                System.out.printf("%-10s ", ararry[r][k]);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        System.out.print("Do you want to go to Supplier Manager or Exit (Y/N): ");
        char answer4 = input.next().charAt(0);
        if (answer4 == 'y') {
            clearConsole();
            suplierrManage(suppliers);
        }
        else  System.exit(0);

    }


    public static void saerchSupplier(){

        boolean found = false;

        L1: 	while (!found) {
            System.out.print("What ID do you want to search for: ");
            String searchId = input.next();

            for (int i = 0; i < suppliers.length; i++) {
                for (int j = 0; j < suppliers[i].length; j++) {
                    if (searchId.equals(suppliers[i][j])) {
                        System.out.println("Supplier found!");
                        for (String value : suppliers[i]) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                        found = true;
                        break L1;
                    }
                }
            }

            for (int i = 0; i < ararry.length; i++) {
                for (int j = 0; j < ararry[i].length; j++) {
                    if (searchId.equals(ararry[i][j])) {
                        System.out.println("Supplier found in ararry!");
                        for (String value : ararry[i]) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                        found = true;
                        break L1;
                    }
                }
            }

            if (!found) {
                System.out.println("Supplier not found.");

                System.out.print("Do you want to go to Supplier Manager or Exit (Y/N): ");
                char answer4 = input.next().charAt(0);

                if (answer4 == 'Y' || answer4 == 'y') {
                    clearConsole();
                    suplierrManage(suppliers);
                } else if (answer4 == 'N' || answer4 == 'n') {
                    continue L1;
                } else {
                    System.out.println("Invalid option. Exiting search.");
                    break L1;
                }
            }
        }


    }

    public static void rankedUnitPrice() {
        boolean flag = false;

        L1: while (!flag) {
            System.out.println("-----------------------------");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s%n", "SID", "CODE", "DESK", "PRICE", "QTY", "CAT");

            for (int j = 0; j < items.length; j++) {
                L3: for (int h = 0; h < discreptionandQty.length; h++) {
                    for (int p = 0; p < discreptionandQty[h].length; p++) {

                        if (p + 4 < discreptionandQty[h].length) {
                            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s%n", discreptionandQty[h][p], discreptionandQty[h][p + 1], discreptionandQty[h][p + 2], discreptionandQty[h][p + 3], discreptionandQty[h][p + 4], items[j]);
                            break L3;
                        }
                    }
                }
            }

            System.out.println("-----------------------------");

            break L1;
        }

        System.out.print("Do you want to go to Supplier Manager or Exit (Y/N): ");
        char answer4 = input.next().charAt(0);

        if (answer4 == 'Y' || answer4 == 'y') {
            clearConsole();
            StokManagement();
        } else {
            System.exit(0);
        }
    }

}



