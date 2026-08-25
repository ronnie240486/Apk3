package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WebvttSubtitle$$ExternalSyntheticLambda0 implements java.util.Comparator {
    public static final /* synthetic */ com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0.INSTANCE = r0
            return
    }

    public /* synthetic */ WebvttSubtitle$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r2 = (com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) r2
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r3 = (com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) r3
            int r2 = com.google.android.exoplayer2.text.webvtt.WebvttSubtitle.$r8$lambda$6TuP2ixuvA2bH4nhA1WV45ZOrAo(r2, r3)
            return r2
        Lf:
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element r2 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element) r2
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element r3 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element) r3
            int r2 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.$r8$lambda$VyiDJ7qRfxCLGd6CXvAWYb7Vhxg(r2, r3)
            return r2
    }
}
