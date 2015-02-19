package com.instructure.canvasapi.model;

import android.os.Parcel;

import java.util.Date;

public class CommunicationChannel extends CanvasModel<CommunicationChannel> {

    public long id;
    public String address;
    public String type;
    public long position;
    public long user_id;
    public String workflow_state;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Date getComparisonDate() {
        return null;
    }

    @Override
    public String getComparisonString() {
        return null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.address);
        dest.writeString(this.type);
        dest.writeLong(this.position);
        dest.writeLong(this.user_id);
        dest.writeString(this.workflow_state);
    }

    public CommunicationChannel() {
    }

    private CommunicationChannel(Parcel in) {
        this.id = in.readLong();
        this.address = in.readString();
        this.type = in.readString();
        this.position = in.readLong();
        this.user_id = in.readLong();
        this.workflow_state = in.readString();
    }

    public static final Creator<CommunicationChannel> CREATOR = new Creator<CommunicationChannel>() {
        public CommunicationChannel createFromParcel(Parcel source) {
            return new CommunicationChannel(source);
        }

        public CommunicationChannel[] newArray(int size) {
            return new CommunicationChannel[size];
        }
    };
}
