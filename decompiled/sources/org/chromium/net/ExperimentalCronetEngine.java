package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExperimentalCronetEngine extends org.chromium.net.CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    public static class Builder extends org.chromium.net.CronetEngine.Builder {
        public Builder(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public Builder(org.chromium.net.ICronetEngineBuilder r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String r1, java.util.Set r2, boolean r3, java.util.Date r4) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.addPublicKeyPins(r1, r2, r3, r4)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addPublicKeyPins(java.lang.String r1, java.util.Set<byte[]> r2, boolean r3, java.util.Date r4) {
                r0 = this;
                super.addPublicKeyPins(r1, r2, r3, r4)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder addQuicHint(java.lang.String r1, int r2, int r3) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.addQuicHint(r1, r2, r3)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addQuicHint(java.lang.String r1, int r2, int r3) {
                r0 = this;
                super.addQuicHint(r1, r2, r3)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine build() {
                r1 = this;
                org.chromium.net.ExperimentalCronetEngine r0 = r1.build()
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine build() {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                org.chromium.net.ExperimentalCronetEngine r0 = r0.build()
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder enableHttp2(boolean r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.enableHttp2(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttp2(boolean r1) {
                r0 = this;
                super.enableHttp2(r1)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder enableHttpCache(int r1, long r2) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.enableHttpCache(r1, r2)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttpCache(int r1, long r2) {
                r0 = this;
                super.enableHttpCache(r1, r2)
                return r0
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder enableNetworkQualityEstimator(boolean r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enableNetworkQualityEstimator(r2)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.enablePublicKeyPinningBypassForLocalTrustAnchors(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean r1) {
                r0 = this;
                super.enablePublicKeyPinningBypassForLocalTrustAnchors(r1)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder enableQuic(boolean r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.enableQuic(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableQuic(boolean r1) {
                r0 = this;
                super.enableQuic(r1)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder enableSdch(boolean r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.enableSdch(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableSdch(boolean r1) {
                r0 = this;
                return r0
        }

        @androidx.annotation.VisibleForTesting
        public org.chromium.net.ICronetEngineBuilder getBuilderDelegate() {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                return r0
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setExperimentalOptions(java.lang.String r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.setExperimentalOptions(r2)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.setLibraryLoader(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader r1) {
                r0 = this;
                super.setLibraryLoader(r1)
                return r0
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder setStoragePath(java.lang.String r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.setStoragePath(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setStoragePath(java.lang.String r1) {
                r0 = this;
                super.setStoragePath(r1)
                return r0
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setThreadPriority(int r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.setThreadPriority(r2)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder setUserAgent(java.lang.String r1) {
                r0 = this;
                org.chromium.net.ExperimentalCronetEngine$Builder r1 = r0.setUserAgent(r1)
                return r1
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setUserAgent(java.lang.String r1) {
                r0 = this;
                super.setUserAgent(r1)
                return r0
        }
    }

    public ExperimentalCronetEngine() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener r1) {
            r0 = this;
            return
    }

    public void addRttListener(org.chromium.net.NetworkQualityRttListener r1) {
            r0 = this;
            return
    }

    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener r1) {
            r0 = this;
            return
    }

    public void configureNetworkQualityEstimatorForTesting(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            return
    }

    public int getDownstreamThroughputKbps() {
            r1 = this;
            r0 = -1
            return r0
    }

    public int getEffectiveConnectionType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getHttpRttMs() {
            r1 = this;
            r0 = -1
            return r0
    }

    public int getTransportRttMs() {
            r1 = this;
            r0 = -1
            return r0
    }

    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String r1, org.chromium.net.BidirectionalStream.Callback r2, java.util.concurrent.Executor r3);

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String r1, org.chromium.net.UrlRequest.Callback r2, java.util.concurrent.Executor r3);

    @Override // org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String r1, org.chromium.net.UrlRequest.Callback r2, java.util.concurrent.Executor r3) {
            r0 = this;
            org.chromium.net.ExperimentalUrlRequest$Builder r1 = r0.newUrlRequestBuilder(r1, r2, r3)
            return r1
    }

    public java.net.URLConnection openConnection(java.net.URL r1, java.net.Proxy r2) throws java.io.IOException {
            r0 = this;
            java.net.URLConnection r1 = r1.openConnection(r2)
            return r1
    }

    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener r1) {
            r0 = this;
            return
    }

    public void removeRttListener(org.chromium.net.NetworkQualityRttListener r1) {
            r0 = this;
            return
    }

    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener r1) {
            r0 = this;
            return
    }

    public void startNetLogToDisk(java.lang.String r1, boolean r2, int r3) {
            r0 = this;
            return
    }
}
