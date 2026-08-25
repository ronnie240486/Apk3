package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class Episode implements java.io.Serializable {
    private java.lang.String container_extension;
    private java.lang.String episode_num;
    private java.lang.String id;
    private java.lang.Object info;
    private int season;
    private java.lang.String title;

    public Episode() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getContainer_extension() {
            r1 = this;
            java.lang.String r0 = r1.container_extension
            return r0
    }

    public java.lang.String getEpisode_num() {
            r1 = this;
            java.lang.String r0 = r1.episode_num
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.Object getInfo() {
            r1 = this;
            java.lang.Object r0 = r1.info
            return r0
    }

    public int getSeason() {
            r1 = this;
            int r0 = r1.season
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public void setContainer_extension(java.lang.String r1) {
            r0 = this;
            r0.container_extension = r1
            return
    }

    public void setEpisode_num(java.lang.String r1) {
            r0 = this;
            r0.episode_num = r1
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setInfo(java.lang.Object r1) {
            r0 = this;
            r0.info = r1
            return
    }

    public void setSeason(int r1) {
            r0 = this;
            r0.season = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Episode{id='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.id
            r2 = 39
            java.lang.String r3 = ", episode_num='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.episode_num
            java.lang.String r3 = ", title='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.title
            java.lang.String r3 = ", container_extension='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.container_extension
            java.lang.String r3 = ", season="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            int r1 = r4.season
            r0.append(r1)
            java.lang.String r1 = ", info="
            r0.append(r1)
            java.lang.Object r1 = r4.info
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
