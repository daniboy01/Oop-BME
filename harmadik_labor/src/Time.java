public class Time {
    private int min;

    public Time(int hh, int mm) {
        this.min = 60 * hh + mm;
    }

    public Time() {
        this.min = 0;
    }

    public Time(int hh) {
        this.min = 60 * hh;
    }

    public int getMins() {
        return this.min % 60;
    }

    public int getHours() {
        return this.min / 60;
    }

    public int getMinsOnly() {
        return min;
    }

    public Time add(Time t) {
        int res = this.min + t.min;
        int hh = res / 60;
        int mm = res % 60;
        if(hh > 24) {
            hh = hh - 24;
        }
        Time time = new Time(hh,mm);
        return time;
    }

    public Time sub(Time t) {
        int res = this.min - t.min;
        if (res < 0) {
            res = (24 * 60) + res;
        }
        int hh = res / 60;
        int mm = res % 60;
        Time time = new Time(hh,mm);
        return time;
    }

    public void addMins(int mm) {
        this.min += mm;
    }

    public void addHours(int hh) {
        this.min += hh * 60;
    }

    public boolean greaterThan(Time t) {
        return this.min > t.min;
    }

    public boolean lessThan(Time t) {
        return this.min < t.min;
    }

    public int compareTo(Time t) {
        if (this.lessThan(t)) {
            return -1;
        } else if (this.greaterThan(t)) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        int hh = this.min / 60;
        int mm = this.min % 60;
        String hour = "";
        String min = "";
        if (hh < 12) {
            hour += "0" + hh;
        } else {
            hour += hh;
        }
        if (mm < 10) {
            min +=  "0" + mm;
        } else {
            min += mm;
        }
        return hour + ":" + min;
    }

    public static void main(String[] args) {
        Time time = new Time(1,30);
        Time time2 = new Time(2,40);
        Time res = time.sub(time2);
        System.out.println(res.toString());
        System.out.println(time.add(time2).toString());
        time.addHours(1);
        System.out.println(time.toString());
        time.addMins(30);
        System.out.println(time.toString());

        System.out.println("**************************************************");

        Time time3 = new Time(1,0);
        Time time4 = new Time(1,0);
        System.out.println(time3.greaterThan(time4));
        System.out.println(time3.lessThan(time4));
        System.out.println(time3.compareTo(time4));

    }
}
