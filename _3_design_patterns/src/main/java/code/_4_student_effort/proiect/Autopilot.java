package code._4_student_effort.proiect;


public class Autopilot {
    private DrivingStrategy drivingStrategy=new NormalRoadStrategy(this);
    private String mod;
    private int speed; //speed-km/h
    private int time;  //time-minutes

    public Autopilot(Builder_Pilot builder)
    {
    this.mod=builder.mod;
    this.time=builder.time;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    @Override
    public String toString() {
        return
                "drivingStrategy=" + drivingStrategy.getClass().getSimpleName() +
                ";\n mod='" + mod + '\'' +
                ";\n speed=" + speed + "km/h"+
                ";\n time=" + time + "min;";

    }
    public void check(String mod) {
        if(this.mod.equals(mod))
            throw new ImproperSelectedMod("This mod is not suitable for weather conditions or quality of the road!");

    }

    public static class Builder_Pilot {
        private final int time;
       // private int speed;
       // private DrivingStrategy drivingStrategy=new NormalRoadStrategy(Autopilot.this);
        private String mod;
        public Builder_Pilot(int time) {

            this.time = time;
        }

        public Builder_Pilot setMod (String mod)
        {
            this.mod=mod;
            return this;
        }
        //        public Builder_Pilot setSpeed(int speed) {
//            this.speed = speed;
//            return this;
//        }

//        public Builder_Pilot setDrivingStrategy (DrivingStrategy drivingStrategy)
//        {
//            this.drivingStrategy=drivingStrategy;
//            return this;
//        }

        public Autopilot build(){return new Autopilot(this);}
    }
}