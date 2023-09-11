package relationship;

public class Guy {
    private String name;
    private String phoneNumber;
    private Lady girlFriend;

    public void changeBabe(Lady newBabe){
        girlFriend = newBabe;
    }
    public String whatsYourBabeName(){
        return girlFriend.getName();
    }

}
