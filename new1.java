package assignement;


class Bank_system{

   private String bank_name;
    private int bank_id;
    private    String bank_address;

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_address() {
        return bank_address;
    }

    public void setBank_address(String bank_address) {
        this.bank_address = bank_address;
    }

    public void display(){

    }

    @Override
    public String toString() {
        return "Bank_system{" +
                "bank_name='" + bank_name + '\'' +
                ", bank_id=" + bank_id +
                ", bank_address='" + bank_address + '\'' +
                '}';
    }
}


public class new1 {

    public static void main(String[] args) {
        Bank_system newbank = new Bank_system();
        newbank.setBank_id(1);
        newbank.setBank_name("SBI");
        newbank.setBank_address("pune");

        int idd= newbank.getBank_id();
        String bname = newbank.getBank_name();
        String baddress =  newbank.getBank_address();

        System.out.println("bank id: "+idd+" bank name: "+bname+" bank address: "+baddress);
    }

}
