public class TV {
    private boolean status;
    private int volume;
    private int channel;

    public TV() {
        this.status = false;
        this.channel = 0;
        this.volume = 0;
    }

    public TV(boolean status, int volume, int channel) {
        this.status = status;
        this.volume = volume;
        this.channel = channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    public void channelUp() {
        if(channel >= 999) {
            this.channel = 0;
            return;
        }
        this.channel++;
    }

    public void channelDown() {
        if(this.channel <= 0) {
            this.channel = 999;
            return;
        }
        this.channel--;
    }

    public void volumeUp() {
        if(this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if(volume > 0) {
            this.volume--;
        }
    }

    public void powerOn() {
        this.status = true;
    }

    public void powerOff() {
        this.status = false;
    }
}
