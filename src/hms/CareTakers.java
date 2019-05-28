package hms;

//just for creating instances of CAretakers
class CareTakers {
int phoneno,salary,nationalid;
String name,address,gender,permanentaddress;
//String date;

    public CareTakers(String name,int phoneno, String address,String gender,int salary, int nationalid,String permanentaddress) {
        this.phoneno = phoneno;
        this.salary = salary;
        this.nationalid = nationalid;
        this.name = name;
        this.address = address;
       
        this.gender = gender;
        this.permanentaddress = permanentaddress;
        // this.date = date;
        
    }



    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNationalid() {
        return nationalid;
    }

    public void setNationalid(int nationalid) {
        this.nationalid = nationalid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(String permanentaddress) {
        this.permanentaddress = permanentaddress;
    }
    
}