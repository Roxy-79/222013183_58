// a java program that implements the goverment offices and their task using classes, interface and an object
interface GovernmentOffice {
    void processDocument(String document);
}

class TaxOffice implements GovernmentOffice {
    public void processDocument(String document) {
        System.out.println("Tax Office is processing the document: " + document);
    }

    public void collectTaxes(double amount) {
        System.out.println("Tax Office is collecting taxes: $" + amount);
    }
}
class SocialSecurityOffice implements GovernmentOffice {
    public void processDocument(String document) {
        System.out.println("Social Security Office is processing the document: " + document);
    }

    public void issueSocialSecurityNumber(String name) {
        System.out.println("Social Security Office is issuing an SSN for: " + name);
    }
}

class DMVOffice implements GovernmentOffice {
    public void processDocument(String document) {
        System.out.println("DMV Office is processing the document: " + document);
    }

    public void issueDriverLicense(String name) {
        System.out.println("DMV Office is issuing a driver's license for: " + name);
    }
}

class PassportOffice implements GovernmentOffice {
    public void processDocument(String document) {
        System.out.println("Passport Office is processing the document: " + document);
    }

    public void issuePassport(String name) {
        System.out.println("Passport Office is issuing a passport for: " + name);
    }
}

public class GovernmentOfficeExample {
    public static void main(String[] args) {
        TaxOffice taxOffice = new TaxOffice();
        SocialSecurityOffice socialSecurityOffice = new SocialSecurityOffice();
        DMVOffice dmvOffice = new DMVOffice();
        PassportOffice passportOffice = new PassportOffice();

        taxOffice.processDocument("Income Tax Return");
        taxOffice.collectTaxes(5000);

        socialSecurityOffice.processDocument("Social Security Application");
        socialSecurityOffice.issueSocialSecurityNumber("John Doe");

        dmvOffice.processDocument("Driver's License Application");
        dmvOffice.issueDriverLicense("Alice Smith");

        passportOffice.processDocument("Passport Application");
        passportOffice.issuePassport("Bob Johnson");
    }
}
    

