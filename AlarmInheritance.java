// inheritance classes practice final questions for CSE 123

public class AlarmInheritance {

    public static void main(String[] args) {

    }



    public class Alarm {
        private boolean onOff;
        private int time; // in minutes

        public Alarm() {
            onOff = false;
            time = 0;
        }

        public void turnOnOff() {
            this.onOff = !this.onOff;
        }

        // sets an alarm "time" minutes into the future
        public void setAlarm(int time) {
            this.time = time;
        }
    }

    public class BuildingAlarm extends Alarm {

        public void sendAlert() {
            System.out.println("Alert sent!");
        }
    }

    public class FireAlarm extends BuildingAlarm {
        
        public void sendAlert() {
            System.out.println("Fire trucks on the way!");
        }
    }

    public class PhoneAlarm extends Alarm {

        public void sleep() {
            setAlarm(5);
        }
    }



}