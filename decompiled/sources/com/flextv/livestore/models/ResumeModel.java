package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class ResumeModel implements java.io.Serializable {
    public long last_position;
    public java.lang.String name;
    public int pro;
    public java.lang.String tmdb_id;

    public ResumeModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.tmdb_id = r0
            return
    }

    public long getLast_position() {
            r2 = this;
            long r0 = r2.last_position
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int getPro() {
            r1 = this;
            int r0 = r1.pro
            return r0
    }

    public java.lang.String getTmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.tmdb_id
            return r0
    }

    public void setLast_position(long r1) {
            r0 = this;
            r0.last_position = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setPro(int r1) {
            r0 = this;
            r0.pro = r1
            return
    }

    public void setTmdb_id(java.lang.String r1) {
            r0 = this;
            r0.tmdb_id = r1
            return
    }
}
