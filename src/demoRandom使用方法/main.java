package demoRandom使用方法;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        GroupOwner groupOwner = new GroupOwner("groupOwner",1000,5);
        groupOwner.shareBoundPacket();
        groupOwner.printPackets();
    }

}
