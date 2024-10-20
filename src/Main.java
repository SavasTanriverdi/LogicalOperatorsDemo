public class Main {
    public static void main(String[] args) {
        // Değişken tanımlama
        int age = 25;
        double salary = 50000;

        // Mantıksal VE (AND) operatörü
        boolean isEligibleForLoan = (age > 18) && (salary > 30000);
        System.out.println("Kredi almaya uygun mu (age > 18 ve salary > 30000)? " + isEligibleForLoan);

        // Mantıksal VEYA (OR) operatörü
        boolean isWeekend = true;
        boolean isHoliday = false;
        boolean canRelax = isWeekend || isHoliday;
        System.out.println("Hafta sonu veya tatil mi? " + canRelax);

        // Mantıksal DEĞİL (NOT) operatörü
        boolean isWorkingDay = !isWeekend;
        System.out.println("Hafta sonu değil, çalışıyor mu? " + isWorkingDay);

        // Karmaşık mantıksal ifadeler
        boolean isSeniorCitizen = (age >= 65) || (age < 18);
        boolean isEligibleForDiscount = isSeniorCitizen && (salary < 40000);
        System.out.println("İndirim almaya uygun mu (65 yaş üstü veya 18 yaş altı ve maaş < 40000)? " + isEligibleForDiscount);
    }
}