package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class ProgramInformation {

    @androidx.annotation.Nullable
    public final java.lang.String copyright;

    @androidx.annotation.Nullable
    public final java.lang.String lang;

    @androidx.annotation.Nullable
    public final java.lang.String moreInformationURL;

    @androidx.annotation.Nullable
    public final java.lang.String source;

    @androidx.annotation.Nullable
    public final java.lang.String title;

    public ProgramInformation(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.title = r1
            r0.source = r2
            r0.copyright = r3
            r0.moreInformationURL = r4
            r0.lang = r5
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.source.dash.manifest.ProgramInformation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.source.dash.manifest.ProgramInformation r5 = (com.google.android.exoplayer2.source.dash.manifest.ProgramInformation) r5
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.source
            java.lang.String r3 = r5.source
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.copyright
            java.lang.String r3 = r5.copyright
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.moreInformationURL
            java.lang.String r3 = r5.moreInformationURL
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.lang
            java.lang.String r5 = r5.lang
            boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.title
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.source
            if (r0 == 0) goto L19
            int r0 = r0.hashCode()
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.copyright
            if (r0 == 0) goto L26
            int r0 = r0.hashCode()
            goto L27
        L26:
            r0 = 0
        L27:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.moreInformationURL
            if (r0 == 0) goto L33
            int r0 = r0.hashCode()
            goto L34
        L33:
            r0 = 0
        L34:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.lang
            if (r0 == 0) goto L3f
            int r1 = r0.hashCode()
        L3f:
            int r2 = r2 + r1
            return r2
    }
}
