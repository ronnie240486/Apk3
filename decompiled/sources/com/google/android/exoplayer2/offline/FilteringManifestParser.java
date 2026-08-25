package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.FilterableManifest;

/* JADX INFO: loaded from: classes.dex */
public final class FilteringManifestParser<T extends com.google.android.exoplayer2.offline.FilterableManifest<T>> implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<T> {
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> parser;

    @androidx.annotation.Nullable
    private final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;

    public FilteringManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> r1, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2) {
            r0 = this;
            r0.<init>()
            r0.parser = r1
            r0.streamKeys = r2
            return
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(android.net.Uri r2, java.io.InputStream r3) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser<? extends T extends com.google.android.exoplayer2.offline.FilterableManifest<T>> r0 = r1.parser
            java.lang.Object r2 = r0.parse(r2, r3)
            com.google.android.exoplayer2.offline.FilterableManifest r2 = (com.google.android.exoplayer2.offline.FilterableManifest) r2
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r3 = r1.streamKeys
            if (r3 == 0) goto L1b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L13
            goto L1b
        L13:
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r3 = r1.streamKeys
            java.lang.Object r2 = r2.copy(r3)
            com.google.android.exoplayer2.offline.FilterableManifest r2 = (com.google.android.exoplayer2.offline.FilterableManifest) r2
        L1b:
            return r2
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.offline.FilterableManifest r1 = r0.parse(r1, r2)
            return r1
    }
}
