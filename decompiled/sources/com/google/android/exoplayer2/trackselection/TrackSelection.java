package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    com.google.android.exoplayer2.Format getFormat(int r1);

    int getIndexInTrackGroup(int r1);

    com.google.android.exoplayer2.source.TrackGroup getTrackGroup();

    int getType();

    int indexOf(int r1);

    int indexOf(com.google.android.exoplayer2.Format r1);

    int length();
}
