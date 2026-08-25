package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ICronetEngineBuilder {
    public ICronetEngineBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String r1, java.util.Set<byte[]> r2, boolean r3, java.util.Date r4);

    public abstract org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String r1, int r2, int r3);

    public abstract org.chromium.net.ExperimentalCronetEngine build();

    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean r1) {
            r0 = this;
            return r0
    }

    public abstract org.chromium.net.ICronetEngineBuilder enableHttp2(boolean r1);

    public abstract org.chromium.net.ICronetEngineBuilder enableHttpCache(int r1, long r2);

    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean r1) {
            r0 = this;
            return r0
    }

    public abstract org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean r1);

    public abstract org.chromium.net.ICronetEngineBuilder enableQuic(boolean r1);

    public abstract org.chromium.net.ICronetEngineBuilder enableSdch(boolean r1);

    public abstract java.lang.String getDefaultUserAgent();

    public abstract org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String r1);

    public abstract org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader r1);

    public abstract org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String r1);

    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int r1) {
            r0 = this;
            return r0
    }

    public abstract org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String r1);
}
