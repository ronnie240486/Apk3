package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionManagerProvider implements com.google.android.exoplayer2.drm.DrmSessionManagerProvider {

    @androidx.annotation.GuardedBy("lock")
    private com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource.Factory drmHttpDataSourceFactory;
    private final java.lang.Object lock;

    @androidx.annotation.GuardedBy("lock")
    private com.google.android.exoplayer2.drm.DrmSessionManager manager;

    @androidx.annotation.Nullable
    private java.lang.String userAgent;

    public DefaultDrmSessionManagerProvider() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            return
    }

    @androidx.annotation.RequiresApi(18)
    private com.google.android.exoplayer2.drm.DrmSessionManager createManager(com.google.android.exoplayer2.MediaItem.DrmConfiguration r5) {
            r4 = this;
            com.google.android.exoplayer2.upstream.DataSource$Factory r0 = r4.drmHttpDataSourceFactory
            if (r0 == 0) goto L5
            goto L10
        L5:
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            java.lang.String r1 = r4.userAgent
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = r0.setUserAgent(r1)
        L10:
            com.google.android.exoplayer2.drm.HttpMediaDrmCallback r1 = new com.google.android.exoplayer2.drm.HttpMediaDrmCallback
            android.net.Uri r2 = r5.licenseUri
            if (r2 != 0) goto L18
            r2 = 0
            goto L1c
        L18:
            java.lang.String r2 = r2.toString()
        L1c:
            boolean r3 = r5.forceDefaultLicenseUri
            r1.<init>(r2, r3, r0)
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r5.licenseRequestHeaders
            com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.setKeyRequestProperty(r3, r2)
            goto L2b
        L47:
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder
            r0.<init>()
            java.util.UUID r2 = r5.scheme
            com.google.android.exoplayer2.drm.ExoMediaDrm$Provider r3 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.DEFAULT_PROVIDER
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = r0.setUuidAndExoMediaDrmProvider(r2, r3)
            boolean r2 = r5.multiSession
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = r0.setMultiSession(r2)
            boolean r2 = r5.playClearContentWithoutKey
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = r0.setPlayClearSamplesWithoutKeys(r2)
            com.google.common.collect.ImmutableList<java.lang.Integer> r2 = r5.forcedSessionTrackTypes
            int[] r2 = com.google.common.primitives.Ints.toArray(r2)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$Builder r0 = r0.setUseDrmSessionsForClearContent(r2)
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = r0.build(r1)
            r1 = 0
            byte[] r5 = r5.getKeySetId()
            r0.setMode(r1, r5)
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    public com.google.android.exoplayer2.drm.DrmSessionManager get(com.google.android.exoplayer2.MediaItem r3) {
            r2 = this;
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r3.localConfiguration
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r3 = r3.localConfiguration
            com.google.android.exoplayer2.MediaItem$DrmConfiguration r3 = r3.drmConfiguration
            if (r3 == 0) goto L32
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 18
            if (r0 >= r1) goto L12
            goto L32
        L12:
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.MediaItem$DrmConfiguration r1 = r2.drmConfiguration     // Catch: java.lang.Throwable -> L2f
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r3, r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L25
            r2.drmConfiguration = r3     // Catch: java.lang.Throwable -> L2f
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.createManager(r3)     // Catch: java.lang.Throwable -> L2f
            r2.manager = r3     // Catch: java.lang.Throwable -> L2f
        L25:
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r2.manager     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = (com.google.android.exoplayer2.drm.DrmSessionManager) r3     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r3
        L2f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r3
        L32:
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED
            return r3
    }

    public void setDrmHttpDataSourceFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
            r0 = this;
            r0.drmHttpDataSourceFactory = r1
            return
    }

    @java.lang.Deprecated
    public void setDrmUserAgent(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.userAgent = r1
            return
    }
}
