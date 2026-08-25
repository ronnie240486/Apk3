package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class CatchUpEpg implements java.io.Serializable {
    private java.lang.String channel_id;
    private java.lang.String description;
    private java.lang.String end;
    private long epg_id;
    private int has_archive;
    private long id;
    private java.lang.String lang;
    private int now_playing;
    private java.lang.String start;
    private long start_timestamp;
    private long stop_timestamp;
    private java.lang.String title;

    public CatchUpEpg() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getChannel_id() {
            r1 = this;
            java.lang.String r0 = r1.channel_id
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public int getDuration() {
            r5 = this;
            java.lang.String r0 = r5.getStart()
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Date r0 = com.flextv.livestore.utils.Utils.getDateFromString(r1, r0)
            java.lang.String r2 = r5.getEnd()
            java.util.Date r1 = com.flextv.livestore.utils.Utils.getDateFromString(r1, r2)
            long r1 = r1.getTime()
            long r3 = r0.getTime()
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r3 = 60
            long r1 = r1 / r3
            int r0 = (int) r1
            return r0
    }

    public java.lang.String getEnd() {
            r1 = this;
            java.lang.String r0 = r1.end
            return r0
    }

    public long getEpg_id() {
            r2 = this;
            long r0 = r2.epg_id
            return r0
    }

    public int getHas_archive() {
            r1 = this;
            int r0 = r1.has_archive
            return r0
    }

    public long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public java.lang.String getLang() {
            r1 = this;
            java.lang.String r0 = r1.lang
            return r0
    }

    public int getNow_playing() {
            r1 = this;
            int r0 = r1.now_playing
            return r0
    }

    public int getProgress() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r7.getStop_timestamp()
            long r4 = r7.getStart_timestamp()
            long r2 = r2 - r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L22
            long r4 = r7.getStart_timestamp()
            long r0 = r0 - r4
            r4 = 100
            long r0 = r0 * r4
            long r0 = r0 / r2
            int r1 = (int) r0
            return r1
        L22:
            r0 = 1
            return r0
    }

    public java.lang.String getStart() {
            r1 = this;
            java.lang.String r0 = r1.start
            return r0
    }

    public java.lang.String getStartForUrl() {
            r3 = this;
            java.lang.String r0 = r3.getStart()
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r2 = "yyyy-MM-dd:HH-mm"
            java.lang.String r0 = com.flextv.livestore.utils.Utils.formatDateFromString(r1, r2, r0)
            return r0
    }

    public long getStart_timestamp() {
            r2 = this;
            long r0 = r2.start_timestamp
            return r0
    }

    public long getStop_timestamp() {
            r2 = this;
            long r0 = r2.stop_timestamp
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public java.lang.String getUrl(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/timeshift/"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "/"
            r0.append(r2)
            r0.append(r4)
            r0.append(r2)
            int r3 = r1.getDuration()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r1.getStartForUrl()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ".ts"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r2)
            return r2
    }

    public void setChannel_id(java.lang.String r1) {
            r0 = this;
            r0.channel_id = r1
            return
    }

    public void setDescription(java.lang.String r1) {
            r0 = this;
            r0.description = r1
            return
    }

    public void setEnd(java.lang.String r1) {
            r0 = this;
            r0.end = r1
            return
    }

    public void setEpg_id(long r1) {
            r0 = this;
            r0.epg_id = r1
            return
    }

    public void setHas_archive(int r1) {
            r0 = this;
            r0.has_archive = r1
            return
    }

    public void setId(long r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setLang(java.lang.String r1) {
            r0 = this;
            r0.lang = r1
            return
    }

    public void setNow_playing(int r1) {
            r0 = this;
            r0.now_playing = r1
            return
    }

    public void setStart(java.lang.String r1) {
            r0 = this;
            r0.start = r1
            return
    }

    public void setStart_timestamp(long r1) {
            r0 = this;
            r0.start_timestamp = r1
            return
    }

    public void setStop_timestamp(long r1) {
            r0 = this;
            r0.stop_timestamp = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Epg{id="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r4.id
            r0.append(r1)
            java.lang.String r1 = ", epg_id="
            r0.append(r1)
            long r1 = r4.epg_id
            r0.append(r1)
            java.lang.String r1 = ", title='"
            r0.append(r1)
            java.lang.String r1 = r4.title
            r2 = 39
            java.lang.String r3 = ", lang='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.lang
            java.lang.String r3 = ", start='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.start
            java.lang.String r3 = ", end='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.end
            java.lang.String r3 = ", description='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.description
            java.lang.String r3 = ", channel_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.channel_id
            java.lang.String r3 = ", start_timestamp="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            long r1 = r4.start_timestamp
            r0.append(r1)
            java.lang.String r1 = ", stop_timestamp="
            r0.append(r1)
            long r1 = r4.stop_timestamp
            r0.append(r1)
            java.lang.String r1 = ", now_playing="
            r0.append(r1)
            int r1 = r4.now_playing
            r0.append(r1)
            java.lang.String r1 = ", has_archive="
            r0.append(r1)
            int r1 = r4.has_archive
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
