package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class CatchupModel implements java.io.Serializable {
    private java.lang.String dayofweek;
    private java.util.List<com.flextv.livestore.models.CatchUpEpg> epgEvents;
    private java.lang.String name;

    public CatchupModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getDayofweek() {
            r1 = this;
            java.lang.String r0 = r1.dayofweek
            return r0
    }

    public java.util.List<com.flextv.livestore.models.CatchUpEpg> getEpgEvents() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r1.epgEvents
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public void setDayofweek(java.lang.String r1) {
            r0 = this;
            r0.dayofweek = r1
            return
    }

    public void setEpgEvents(java.util.List<com.flextv.livestore.models.CatchUpEpg> r1) {
            r0 = this;
            r0.epgEvents = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }
}
