package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CronetEngine {
    private static final java.lang.String TAG = "CronetEngine";

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        public final org.chromium.net.ICronetEngineBuilder mBuilderDelegate;


        public static abstract class LibraryLoader {
            public LibraryLoader() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract void loadLibrary(java.lang.String r1);
        }

        public Builder(android.content.Context r1) {
                r0 = this;
                org.chromium.net.ICronetEngineBuilder r1 = createBuilderDelegate(r1)
                r0.<init>(r1)
                return
        }

        public Builder(org.chromium.net.ICronetEngineBuilder r1) {
                r0 = this;
                r0.<init>()
                r0.mBuilderDelegate = r1
                return
        }

        @androidx.annotation.VisibleForTesting
        public static int compareVersions(java.lang.String r4, java.lang.String r5) {
                if (r4 == 0) goto L54
                if (r5 == 0) goto L54
                java.lang.String r0 = "\\."
                java.lang.String[] r4 = r4.split(r0)
                java.lang.String[] r5 = r5.split(r0)
                r0 = 0
            Lf:
                int r1 = r4.length
                if (r0 >= r1) goto L4c
                int r1 = r5.length
                if (r0 >= r1) goto L4c
                r1 = r4[r0]     // Catch: java.lang.NumberFormatException -> L2c
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L2c
                r2 = r5[r0]     // Catch: java.lang.NumberFormatException -> L2c
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2c
                if (r1 == r2) goto L29
                int r1 = r1 - r2
                int r4 = java.lang.Integer.signum(r1)     // Catch: java.lang.NumberFormatException -> L2c
                return r4
            L29:
                int r0 = r0 + 1
                goto Lf
            L2c:
                r1 = move-exception
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Unable to convert version segments into integers: "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                r4 = r4[r0]
                r3.append(r4)
                java.lang.String r4 = " & "
                r3.append(r4)
                r4 = r5[r0]
                r3.append(r4)
                java.lang.String r4 = r3.toString()
                r2.<init>(r4, r1)
                throw r2
            L4c:
                int r4 = r4.length
                int r5 = r5.length
                int r4 = r4 - r5
                int r4 = java.lang.Integer.signum(r4)
                return r4
            L54:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "The input values cannot be null"
                r4.<init>(r5)
                throw r4
        }

        private static org.chromium.net.ICronetEngineBuilder createBuilderDelegate(android.content.Context r3) {
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List r1 = org.chromium.net.CronetProvider.getAllProviders(r3)
                r0.<init>(r1)
                java.util.List r3 = getEnabledCronetProviders(r3, r0)
                r0 = 0
                java.lang.Object r3 = r3.get(r0)
                org.chromium.net.CronetProvider r3 = (org.chromium.net.CronetProvider) r3
                java.lang.String r1 = org.chromium.net.CronetEngine.access$000()
                r2 = 3
                boolean r1 = android.util.Log.isLoggable(r1, r2)
                if (r1 == 0) goto L31
                java.lang.String r1 = org.chromium.net.CronetEngine.access$000()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r0] = r3
                java.lang.String r0 = "Using '%s' provider for creating CronetEngine.Builder."
                java.lang.String r0 = java.lang.String.format(r0, r2)
                android.util.Log.d(r1, r0)
            L31:
                org.chromium.net.CronetEngine$Builder r3 = r3.createBuilder()
                org.chromium.net.ICronetEngineBuilder r3 = r3.mBuilderDelegate
                return r3
        }

        @androidx.annotation.VisibleForTesting
        public static java.util.List<org.chromium.net.CronetProvider> getEnabledCronetProviders(android.content.Context r1, java.util.List<org.chromium.net.CronetProvider> r2) {
                int r1 = r2.size()
                if (r1 == 0) goto L37
                java.util.Iterator r1 = r2.iterator()
            La:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L20
                java.lang.Object r0 = r1.next()
                org.chromium.net.CronetProvider r0 = (org.chromium.net.CronetProvider) r0
                boolean r0 = r0.isEnabled()
                if (r0 != 0) goto La
                r1.remove()
                goto La
            L20:
                int r1 = r2.size()
                if (r1 == 0) goto L2f
                org.chromium.net.CronetEngine$Builder$1 r1 = new org.chromium.net.CronetEngine$Builder$1
                r1.<init>()
                java.util.Collections.sort(r2, r1)
                return r2
            L2f:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "All available Cronet providers are disabled. A provider should be enabled before it can be used."
                r1.<init>(r2)
                throw r1
            L37:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to find any Cronet provider. Have you included all necessary jars?"
                r1.<init>(r2)
                throw r1
        }

        public org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String r2, java.util.Set<byte[]> r3, boolean r4, java.util.Date r5) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.addPublicKeyPins(r2, r3, r4, r5)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder addQuicHint(java.lang.String r2, int r3, int r4) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.addQuicHint(r2, r3, r4)
                return r1
        }

        public org.chromium.net.CronetEngine build() {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                org.chromium.net.ExperimentalCronetEngine r0 = r0.build()
                return r0
        }

        public org.chromium.net.CronetEngine.Builder enableBrotli(boolean r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enableBrotli(r2)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder enableHttp2(boolean r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enableHttp2(r2)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder enableHttpCache(int r2, long r3) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enableHttpCache(r2, r3)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enablePublicKeyPinningBypassForLocalTrustAnchors(r2)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder enableQuic(boolean r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.enableQuic(r2)
                return r1
        }

        @java.lang.Deprecated
        public org.chromium.net.CronetEngine.Builder enableSdch(boolean r1) {
                r0 = this;
                return r0
        }

        public java.lang.String getDefaultUserAgent() {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                java.lang.String r0 = r0.getDefaultUserAgent()
                return r0
        }

        public org.chromium.net.CronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.setLibraryLoader(r2)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder setStoragePath(java.lang.String r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.setStoragePath(r2)
                return r1
        }

        public org.chromium.net.CronetEngine.Builder setUserAgent(java.lang.String r2) {
                r1 = this;
                org.chromium.net.ICronetEngineBuilder r0 = r1.mBuilderDelegate
                r0.setUserAgent(r2)
                return r1
        }
    }

    public CronetEngine() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = org.chromium.net.CronetEngine.TAG
            return r0
    }

    public abstract java.net.URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract java.lang.String getVersionString();

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String r1, org.chromium.net.UrlRequest.Callback r2, java.util.concurrent.Executor r3);

    public abstract java.net.URLConnection openConnection(java.net.URL r1) throws java.io.IOException;

    public abstract void shutdown();

    public abstract void startNetLogToFile(java.lang.String r1, boolean r2);

    public abstract void stopNetLog();
}
