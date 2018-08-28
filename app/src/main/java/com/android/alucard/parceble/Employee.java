package com.android.alucard.parceble;

import android.os.Parcel;
import android.os.Parcelable;

public class Employee implements Parcelable {

    private int id, phoneNo;
    private String fistName, LastName;

    public Employee(int id, int phoneNo, String fistName, String lastName) {
        this.id = id;
        this.phoneNo = phoneNo;
        this.fistName = fistName;
        LastName = lastName;
    }

    protected Employee(Parcel in) {
        id = in.readInt();
        phoneNo = in.readInt();
        fistName = in.readString();
        LastName = in.readString();

        //same order parsing data like in writeToParcel() method
    }

    public static final Creator<Employee> CREATOR = new Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //responsible for obj into data stream

        dest.writeInt(id);
        dest.writeInt(phoneNo);
        dest.writeString(fistName);
        dest.writeString(LastName);
    }
}
