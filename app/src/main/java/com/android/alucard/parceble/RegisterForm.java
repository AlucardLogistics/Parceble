package com.android.alucard.parceble;

import android.os.Parcel;
import android.os.Parcelable;

public class RegisterForm implements Parcelable {

    String user, pass;
    int phoneNo;

    public RegisterForm(String user, String pass, int phoneNo) {
        this.user = user;
        this.pass = pass;
        this.phoneNo = phoneNo;
    }

    public RegisterForm(Parcel in) {
        user = in.readString();
        pass = in.readString();
        phoneNo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(user);
        dest.writeString(pass);
        dest.writeInt(phoneNo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RegisterForm> CREATOR = new Creator<RegisterForm>() {
        @Override
        public RegisterForm createFromParcel(Parcel in) {
            return new RegisterForm(in);
        }

        @Override
        public RegisterForm[] newArray(int size) {
            return new RegisterForm[size];
        }
    };
}
