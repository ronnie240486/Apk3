package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
public interface LoaderErrorThrower {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Dummy implements com.google.android.exoplayer2.upstream.LoaderErrorThrower {
        public Dummy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int r1) {
                r0 = this;
                return
        }
    }

    void maybeThrowError() throws java.io.IOException;

    void maybeThrowError(int r1) throws java.io.IOException;
}
