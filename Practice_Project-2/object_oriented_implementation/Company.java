package object_oriented_implementation;

// Demonstration of Encapsulation

class Company {
    private String companyName;
    private int companyId;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyName("Xyz");
        company.setCompanyId(123);
        System.out.println("Company name: " + company.getCompanyName());
        System.out.println("Company Id: " + company.getCompanyId());

    }
}
