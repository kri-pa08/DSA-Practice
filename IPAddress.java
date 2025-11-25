class DefangingIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangingIPAddress sol = new DefangingIPAddress();
        System.out.println(sol.defangIPaddr("1.1.1.1"));      // Output: 1[.]1[.]1[.]1
        System.out.println(sol.defangIPaddr("255.100.50.0")); // Output: 255[.]100[.]50[.]0
    }
}



 