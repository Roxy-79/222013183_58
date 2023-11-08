
// java program that implements prices of a hotel using classes and an interface and methods 
interface PriceCalculator {
    double calculatePrice(int nights);
}

class StandardRoom implements PriceCalculator {
    private double pricePerNight = 100;

    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }

    public void displayStandardRoomInfo() {
        System.out.println("Standard Room: $100 per night");
    }
}

class DeluxeRoom implements PriceCalculator {
    private double pricePerNight = 150;

    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }

    public void displayDeluxeRoomInfo() {
        System.out.println("Deluxe Room: $150 per night");
    }
}

class SuiteRoom implements PriceCalculator {
    private double pricePerNight = 250;

    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }

    public void displaySuiteRoomInfo() {
        System.out.println("Suite Room: $250 per night");
    }
    }
class Hotel {
    public static void main(String[] args) {
        StandardRoom standardRoom = new StandardRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        int numberOfNights = 5;

        standardRoom.displayStandardRoomInfo();
        System.out.println("Total cost for 5 nights in a standard room: $" + standardRoom.calculatePrice(numberOfNights));

        deluxeRoom.displayDeluxeRoomInfo();
        System.out.println("Total cost for 5 nights in a deluxe room: $" + deluxeRoom.calculatePrice(numberOfNights));

        suiteRoom.displaySuiteRoomInfo();
        System.out.println("Total cost for 5 nights in a suite room: $" + suiteRoom.calculatePrice(numberOfNights));
    }
}





