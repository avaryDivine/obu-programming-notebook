package edu.okbu.cs1;

public class CableTVChannels {
    int userChannel;
    char channelType;

    public CableTVChannels() {

    }

    public int getUserChannels() {
        return userChannel;
    }

    public void setUserChannel(int userChannel) {
        this.userChannel = userChannel;
    }

    public char getChannelType() {
        if ((userChannel >= 2) && (userChannel <= 499)) {
            channelType = 's';
            }
        else if ((userChannel >= 1002) && (userChannel <= 1499)) {
            channelType = 'h';
            }
        else {
            channelType = 'e';
        }
        return channelType;
    }

    public void setChannelType(char channelType) {
        this.channelType = channelType;
    }
}
