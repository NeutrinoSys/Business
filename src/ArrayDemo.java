public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(args.length);
//        System.out.println(args[3]);


        String [][] employees = {
                {"Airi Satou", "Accountant", "Tokyo", "33", "2008/11/28", "$162,700.00"},
                {"Angelica Ramos", "Chief Executive Officer (CEO)", "London", "47", "2009/10/09", "$1,200,000.00"},
                {"Ashton Cox", "Junior Technical", "San Francisco", "66", "2009/01/12", "$86,000.00"}
        };

        String [][] emp2 = new String[3][6];
        emp2[0][0] = "Airi Satou";
        emp2[0][1] = "Accountant";
        emp2[0][2] = "Tokyo";

        System.out.println(employees[1][1]);
    }

}
