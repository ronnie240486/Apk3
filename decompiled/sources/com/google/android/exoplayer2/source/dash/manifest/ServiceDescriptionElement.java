package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long r1, long r3, long r5, float r7, float r8) {
            r0 = this;
            r0.<init>()
            r0.targetOffsetMs = r1
            r0.minOffsetMs = r3
            r0.maxOffsetMs = r5
            r0.minPlaybackSpeed = r7
            r0.maxPlaybackSpeed = r8
            return
    }
}
