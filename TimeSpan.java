public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Хвилини не можуть бути від'ємними");
        }
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Некоректні значення годин або хвилин");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeSpan(TimeSpan span) {
        this.hours = span.getHours();
        this.minutes = span.getMinutes();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getTotalHours() {
        return hours + (double) minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void add(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes <= 59) {
            int total = this.getTotalMinutes() + (hours * 60 + minutes);
            this.hours = total / 60;
            this.minutes = total % 60;
        }
    }

    public void add(int minutes) {
        if (minutes >= 0) {
            int total = this.getTotalMinutes() + minutes;
            this.hours = total / 60;
            this.minutes = total % 60;
        }
    }

    public void add(TimeSpan span) {
        int total = this.getTotalMinutes() + span.getTotalMinutes();
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    public void subtract(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes <= 59) {
            int diff = this.getTotalMinutes() - (hours * 60 + minutes);
            if (diff >= 0) {
                this.hours = diff / 60;
                this.minutes = diff % 60;
            }
        }
    }

    public void subtract(int minutes) {
        if (minutes >= 0) {
            int diff = this.getTotalMinutes() - minutes;
            if (diff >= 0) {
                this.hours = diff / 60;
                this.minutes = diff % 60;
            }
        }
    }

    public void subtract(TimeSpan span) {
        int diff = this.getTotalMinutes() - span.getTotalMinutes();
        if (diff >= 0) {
            this.hours = diff / 60;
            this.minutes = diff % 60;
        }
    }
    
    public void scale(int factor) {
        if (factor > 0) {
            int total = this.getTotalMinutes() * factor;
            this.hours = total / 60;
            this.minutes = total % 60;
        }
    }

    @Override
    public String toString() {
        return hours + " годин " + minutes + " хвилин";
    }
}
