package Smart_Agriculture_Automation;

import java.lang.System;
import java.util.*;


class LowSkillException extends Exception {
    public LowSkillException(String message) {
        super(message);
    }
}
class MachineBreakdownException extends Exception {
    public MachineBreakdownException(String message) {
        super(message);
    }
}
class CropNotSuitableException extends Exception {
    public CropNotSuitableException(String message) {
        super(message);
    }
}

public class SAA {
    public static void main() {
        List<Worker> workers = new ArrayList<>();
        HashSet<Machine> machines = new HashSet<>();
        Map<Integer, Crop> crops = new HashMap<>();
        Map<Integer, Crop> sortedMap = new TreeMap<>(crops);
        Iterator<Crop> it = sortedMap.values().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        YieldOp var_1 = (area,fertilizer) ->{
            return area * fertilizer;
        };
        Object commonLock = new Object();

        IrrigationThread t1 = new IrrigationThread(commonLock);
        SensorThread t2 = new SensorThread(commonLock);

        t1.start();
        t2.start();
    }

    }
class IrrigationThread extends Thread {
    private final Object lock;

    IrrigationThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Irrigation running…");
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        }
    }
}

class SensorThread extends Thread {
    private final Object lock;

    SensorThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Sensor reading: moisture OK / low");
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        }
    }
}

@FunctionalInterface
interface YieldOp {
    double calculate(double area, double fertilizer);
}


class BaseEntity{
    long id;
    String createdAt;
    BaseEntity(long id, String createdAt){
        this.id=id;
        this.createdAt = createdAt;
    }
}
class Person_1 extends BaseEntity{
    String name;
    int age;
    Person_1(String name,long id,String createdAt,int age){
        super(id,createdAt);
        this.name=name;
        this.age=age;
    }
}
class Worker extends Person_1{
    String workerId;
    int skillLevel;
    Worker(long id,String createdAt,String workerId, int skillLevel,String name,int age) {
        super(name, id, createdAt, age);
        this.workerId = workerId;
        this.skillLevel = skillLevel;
    }
    void the() throws LowSkillException,MachineBreakdownException{
        if (skillLevel < 3) {
            throw new LowSkillException("Worker skill level too low for task.");
        } else if (skillLevel > 7) {
            throw new MachineBreakdownException("Worker skill level too high, may cause machine breakdown.");
        } else {
            System.out.println("Worker skill level too low for task.");
        }
    }
    int[] dailyHours = new int[7];
    void logHours(int day, int hours) {
        dailyHours[day] = hours;
        int [] totlhours = new int[dailyHours.length];
        for (int i=0; i<dailyHours.length; i++){
            totlhours[i] += dailyHours[i];
        }
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        for (int j : dailyHours){
            if(highest < dailyHours[j]){
                highest = dailyHours[j];
                System.out.println(highest);
            }
            if(lowest > dailyHours[j]){
                lowest = dailyHours[j];
                System.out.println(lowest);
            }
        }


    }
}
class Owner extends Person_1{
    long ownerId;
    double farmArea;
    Owner(long id,String createdAt,String workerId,double farmArea,String name,int age,long ownerId){
        super(name,id,createdAt,age);
        this.ownerId=ownerId;
        this.farmArea=farmArea;
    }
    class Location{
        String village;
        String district;

    }
}
class Machine extends BaseEntity{
    long machineId;
    String type;
    int conditionScore;
    Machine(long id,String createdAt,long machineId,String type,int conditionScore){
        super(id,createdAt);
        this.machineId=machineId;
        this.type=type;
        this.conditionScore=conditionScore;
    }
    static class Stats{
        static int totalMachines;
        static double avgCondition;
    }
}
abstract class Crop{
    long cropId;
    String name;
    Crop(long cropId,String name){
        this.cropId=cropId;
        this.name=name;
    }
    abstract double expectedYield();
}
@FunctionalInterface
interface Maintainable{
    boolean serviceMachine(double hoursUsed);
}
class Wheat extends Crop implements Maintainable{
    double area;
    double fertilizerNeeded;
    Wheat(double area,double fertilizerNeeded, long cropId,String name){
        super(cropId,name);
        this.area=area;
        this.fertilizerNeeded=fertilizerNeeded;
    }
    @Override
    public double expectedYield() {
        return area*1.2;
    }
    @Override
    public boolean serviceMachine(double hoursUsed) {
        return hoursUsed > 5.0;
    }
}
class WeatherService{
    void getAlert(String cropname){
        System.out.println(cropname+" is alive");
    }
    void getAlert(String cropname, int humidity){
        System.out.println(cropname+" is affected by "+humidity);
    }
    void getAlert(String cropname, int humidity, int temperature){
        System.out.println(cropname+" is affected by "+humidity+" and temperature is "+temperature);
    }

}