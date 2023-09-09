///////////////////////////////////////LEcTURE 57//////////////////////////////25-AUG-2023 1:00PM


package javacode;

interface camera {
    void photo();
    void video();
    private void greet(){//iss method ko directly jo classes iss interface ko implement vo access nhi kr skte bcoz private
        System.out.println("good morning");
    }
    default void seeVideo(){//ye method baad m lagye jiske vjha se jo jo class iss camera interface ko implement kr rhi h vo error dengi fir jo class implement kr rhi h iss method ko usme jake thikh krne pdega isse se bach ne k liye default keyword k use kiye
        greet();//fyada ye ki agr default method k logic bhut long ho jate h to private method m daal k uss method ko run kr skte h
        System.out.println("See the video");
    }
}
interface GPS{
    void NetworkConnect();
    void NetworkConnectionLost();
}
interface wifi{
    String [] searchingNetwork();
    void connectNetwork(String Network);
}
class mycellphone{
    void dialing(long phoneNumber){
        System.out.println("phone number dial:"+phoneNumber);
    }
    void receiving(long phoneNumber){
        System.out.println("Call Recived:"+phoneNumber);
    }
}
class Smartphone extends mycellphone implements GPS,wifi,camera {
    public void photo(){
        System.out.println("take photo");
    }
    public void video(){
        System.out.println("take video");
    }

//    @Override
//    public void seeVideo() {//seeVideo ko override kiye h to call krne par uper valle nhi ye wale method execute hoga
//        System.out.println("watch video in smart phone");
//    }

    public String [] searchingNetwork(){
        System.out.println("network list are...");
        String [] networkList={"ritik","rahul","rocky"};
        return networkList;
    }
    public void connectNetwork(String Network){
        System.out.println("network connected from is:"+Network);

    }
    public void NetworkConnect(){
        System.out.println("Connected.....");
    }
    @Override
    public void NetworkConnectionLost() {
        System.out.println("Connection Lost....");
    }

}
public class Lecture57{
    public static void main(String[] args) {
        Smartphone obj=new Smartphone();
        for(String item: obj.searchingNetwork()){
            System.out.println(item);
        }
        obj.connectNetwork("rocky");
        obj.dialing(7456921425L);
        obj.receiving(9219210220L);
        obj.photo();
        obj.video();
        obj.NetworkConnect();
        obj.NetworkConnectionLost();
        obj.seeVideo();
    }
}