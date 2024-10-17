public class Main {
    public static Employee[] createEmployeeArray() {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivanov@gmail.com", "892312312", 30000, 21);
        persArray[1] = new Employee("Joe Peach Petrovich", "Manager", "peach@gmail.com", "892345612", 45000, 40);
        persArray[2] = new Employee("Ilya Davudov Sergeevich", "Analyst", "honeymad@gmail.com", "892389745", 45000, 36);
        persArray[3] = new Employee("Yuri Khovansky Mikhaloivich", "Developer", "hova@gmail.com", "892389733", 20500, 34);
        persArray[4] = new Employee("Chidetaka Miyadzaki Darksoulovovich", "Designer", "miyadzaki@gmail.com", "892347291", 99999, 50);
        return persArray;
    }

    public static void main(String[] args) {
        Employee[] persArray = createEmployeeArray();
        System.out.println("Employee Information:");
        for (Employee employee : persArray) {
            employee.displayInfo();
            System.out.println();
        }
        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Chertovo Kolesk", "12 AM - 12 PM", 10.0);
        Park.Attraction attraction2 = park.new Attraction("Mayak Vedmaka", "10 AM - 8 PM", 30.0);
        Park.Attraction attraction3 = park.new Attraction("Shaverma Dom", "6 AM - 12 PM", 40.0);

        System.out.println("Attraction Information:");
        attraction1.displayAttractionInfo();
        System.out.println();
        attraction2.displayAttractionInfo();
        System.out.println();
        attraction3.displayAttractionInfo();
    }
}