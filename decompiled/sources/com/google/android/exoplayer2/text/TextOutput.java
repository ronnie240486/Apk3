package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public interface TextOutput {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.TextOutput$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @java.lang.Deprecated
        public static void $default$onCues(com.google.android.exoplayer2.text.TextOutput r0, java.util.List r1) {
                return
        }
    }

    void onCues(com.google.android.exoplayer2.text.CueGroup r1);

    @java.lang.Deprecated
    void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> r1);
}
