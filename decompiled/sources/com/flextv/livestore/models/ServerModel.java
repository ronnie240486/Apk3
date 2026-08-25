package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class ServerModel implements java.io.Serializable {
    private java.lang.String time_now;
    private long timestamp_now;

    public ServerModel() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.timestamp_now = r0
            return
    }

    public java.lang.String getTime_now() {
            r1 = this;
            java.lang.String r0 = r1.time_now
            return r0
    }

    public long getTimestamp_now() {
            r2 = this;
            long r0 = r2.timestamp_now
            return r0
    }

    public void setTime_now(java.lang.String r1) {
            r0 = this;
            r0.time_now = r1
            return
    }

    public void setTimestamp_now(long r1) {
            r0 = this;
            r0.timestamp_now = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ServerModel{timestamp_now='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.timestamp_now
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", time_now='"
            r0.append(r2)
            java.lang.String r2 = r3.time_now
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
