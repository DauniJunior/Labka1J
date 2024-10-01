public class Tariff {

    private static double cost;
    private final String operatorName;
    private final int numberOfSubscribers;


    public Tariff(String operatorName, int numberOfSubscribers) {
        this.operatorName = operatorName;
        this.numberOfSubscribers = numberOfSubscribers;
    }


    public static void setCost(double cost) {
        Tariff.cost = cost;
    }


    public double calculateRevenue() {
        return cost * numberOfSubscribers;
    }


    public static void main(String[] args) {
        Tariff.setCost(50.0);
        Tariff tariff = new Tariff("Ростелеком", 69);

        // Выводим расчетную информацию
        System.out.println("Общая выручка: " + tariff.calculateRevenue());
    }
}