public class Lasagna {
    int totalTime = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return totalTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int lastTime){
        return totalTime - lastTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer){
        return 2*layer;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer,int lastTime){
        return preparationTimeInMinutes(layer) + lastTime;
    }
}
