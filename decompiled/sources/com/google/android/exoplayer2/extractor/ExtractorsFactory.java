package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorsFactory {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory EMPTY = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ExtractorsFactory$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static com.google.android.exoplayer2.extractor.Extractor[] $default$createExtractors(com.google.android.exoplayer2.extractor.ExtractorsFactory r0, android.net.Uri r1, java.util.Map r2) {
                com.google.android.exoplayer2.extractor.Extractor[] r0 = r0.createExtractors()
                return r0
        }

        static {
                com.google.android.exoplayer2.extractor.ExtractorsFactory r0 = com.google.android.exoplayer2.extractor.ExtractorsFactory.EMPTY
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
                r0 = 0
                com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
                return r0
        }
    }

    static {
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$28
            com.google.android.exoplayer2.extractor.ExtractorsFactory.EMPTY = r0
            return
    }

    com.google.android.exoplayer2.extractor.Extractor[] createExtractors();

    com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri r1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2);
}
