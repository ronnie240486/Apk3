package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleLinkModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("file_name")
    public java.lang.String file_name;

    @com.google.gson.annotations.SerializedName("link")
    public java.lang.String link;

    @com.google.gson.annotations.SerializedName("message")
    public java.lang.String message;

    @com.google.gson.annotations.SerializedName("remaining")
    public int remaining;

    @com.google.gson.annotations.SerializedName("requests")
    public int requests;

    @com.google.gson.annotations.SerializedName("reset_time")
    public java.lang.String reset_time;

    @com.google.gson.annotations.SerializedName("reset_time_utc")
    public java.lang.String reset_time_utc;

    public SubtitleLinkModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getFile_name() {
            r1 = this;
            java.lang.String r0 = r1.file_name
            return r0
    }

    public java.lang.String getLink() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public int getRemaining() {
            r1 = this;
            int r0 = r1.remaining
            return r0
    }

    public int getRequests() {
            r1 = this;
            int r0 = r1.requests
            return r0
    }

    public java.lang.String getReset_time() {
            r1 = this;
            java.lang.String r0 = r1.reset_time
            return r0
    }

    public java.lang.String getReset_time_utc() {
            r1 = this;
            java.lang.String r0 = r1.reset_time_utc
            return r0
    }
}
