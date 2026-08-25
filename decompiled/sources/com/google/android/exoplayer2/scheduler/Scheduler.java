package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes.dex */
public interface Scheduler {
    boolean cancel();

    com.google.android.exoplayer2.scheduler.Requirements getSupportedRequirements(com.google.android.exoplayer2.scheduler.Requirements r1);

    boolean schedule(com.google.android.exoplayer2.scheduler.Requirements r1, java.lang.String r2, java.lang.String r3);
}
