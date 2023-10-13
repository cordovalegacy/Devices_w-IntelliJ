public class Phone {
    private int battery;

    public Phone(){
        this.battery = 100;
    }
    public Phone(int battery){
        this.battery = battery;
    }

    // !Getters/Setters
    public int getBattery(){
        return this.battery;
    }
    public void phoneDied(){
        System.out.println("Your Phone is Dead");
    }
    public void setPhoneCall(){
        if(this.battery == 0){
            phoneDied();
        }
        else {
            this.battery -= 5;
        }
    }
    public void setPlayGame(){
        this.battery -= 20;
    }
    public void setChargePhone(){
        this.battery += 50;
    }
}
