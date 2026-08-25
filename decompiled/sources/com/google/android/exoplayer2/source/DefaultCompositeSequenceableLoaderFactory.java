package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory {
    public DefaultCompositeSequenceableLoaderFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory
    public com.google.android.exoplayer2.source.SequenceableLoader createCompositeSequenceableLoader(com.google.android.exoplayer2.source.SequenceableLoader... r2) {
            r1 = this;
            com.google.android.exoplayer2.source.CompositeSequenceableLoader r0 = new com.google.android.exoplayer2.source.CompositeSequenceableLoader
            r0.<init>(r2)
            return r0
    }
}
