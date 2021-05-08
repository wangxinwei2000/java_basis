package demoRandom使用方法;

import java.util.ArrayList;
import java.util.Random;
public class GroupOwner {
    private String name;
    private  float money;
    private final int count;
    ArrayList<Float> packet_list = new ArrayList<Float>();
    GroupOwner(String name,float money,int count){
        this.name = name;
        this.money = money;
        this.count = count;
    }
    public void shareBoundPacket(){
        Random random = new Random();
        for(int i=0;i<this.count-1;i++){
            float packet = (float) (0 + ((this.money/5 - 0) * new Random().nextDouble()));
            packet_list.add(packet);
            this.money = this.money - packet;
        }
        packet_list.add(this.money);
    }
    public void printPackets(){
        for(int i=0;i<this.packet_list.size();i++){
            System.out.println(String.format("%.2f", this.packet_list.get(i)));
        }
    }
}
