package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public class AdaptationSet {
    public static final int ID_UNSET = -1;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> accessibilityDescriptors;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> essentialProperties;
    public final int id;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> representations;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> supplementalProperties;
    public final int type;

    public AdaptationSet(int r1, int r2, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r3, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r4, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r5, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r6) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.type = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.representations = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.accessibilityDescriptors = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.essentialProperties = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r6)
            r0.supplementalProperties = r1
            return
    }
}
