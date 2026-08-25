package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(18)
public final class FrameworkMediaDrm implements com.google.android.exoplayer2.drm.ExoMediaDrm {
    private static final java.lang.String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final com.google.android.exoplayer2.drm.ExoMediaDrm.Provider DEFAULT_PROVIDER = null;
    private static final java.lang.String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final java.lang.String MOCK_LA_URL_VALUE = "https://x";
    private static final java.lang.String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final android.media.MediaDrm mediaDrm;
    private int referenceCount;
    private final java.util.UUID uuid;

    @androidx.annotation.RequiresApi(31)
    public static class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean requiresSecureDecoder(android.media.MediaDrm r0, java.lang.String r1) {
                boolean r0 = r0.requiresSecureDecoder(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setLogSessionIdOnMediaDrmSession(android.media.MediaDrm r1, byte[] r2, com.google.android.exoplayer2.analytics.PlayerId r3) {
                android.media.metrics.LogSessionId r3 = r3.getLogSessionId()
                android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L19
                android.media.MediaDrm$PlaybackComponent r1 = r1.getPlaybackComponent(r2)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                android.media.MediaDrm$PlaybackComponent r1 = (android.media.MediaDrm.PlaybackComponent) r1
                r1.setLogSessionId(r3)
            L19:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$PrsEaVXrCLK5aTEYQhJGaDyDVUY(com.google.android.exoplayer2.drm.FrameworkMediaDrm r0, com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r1, android.media.MediaDrm r2, byte[] r3, java.util.List r4, boolean r5) {
            r0.lambda$setOnKeyStatusChangeListener$2(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.ExoMediaDrm $r8$lambda$bo2VTWM695CkzP_RISh_4pxsXf8(java.util.UUID r0) {
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = lambda$static$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$mQSlY-84Csnw-d1Znq4XWE81ScE, reason: not valid java name */
    public static /* synthetic */ void m220$r8$lambda$mQSlY84Csnwd1Znq4XWE81ScE(com.google.android.exoplayer2.drm.FrameworkMediaDrm r0, com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener r1, android.media.MediaDrm r2, byte[] r3, int r4, int r5, byte[] r6) {
            r0.lambda$setOnEventListener$1(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$prIkSJ3aPqJCpyWNDn6Q71fn9w0(com.google.android.exoplayer2.drm.FrameworkMediaDrm r0, com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener r1, android.media.MediaDrm r2, byte[] r3, long r4) {
            r0.lambda$setOnExpirationUpdateListener$3(r1, r2, r3, r4)
            return
    }

    static {
            com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3 r0 = com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3.INSTANCE
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.DEFAULT_PROVIDER = r0
            return
    }

    private FrameworkMediaDrm(java.util.UUID r4) throws android.media.UnsupportedSchemeException {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.util.UUID r0 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            boolean r0 = r0.equals(r4)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Use C.CLEARKEY_UUID instead"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r2)
            r3.uuid = r4
            android.media.MediaDrm r0 = new android.media.MediaDrm
            java.util.UUID r2 = adjustUuid(r4)
            r0.<init>(r2)
            r3.mediaDrm = r0
            r3.referenceCount = r1
            java.util.UUID r1 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L33
            boolean r4 = needsForceWidevineL3Workaround()
            if (r4 == 0) goto L33
            forceWidevineL3(r0)
        L33:
            return
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] r7) {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r7)
            int r1 = r0.readLittleEndianInt()
            short r2 = r0.readLittleEndianShort()
            short r3 = r0.readLittleEndianShort()
            java.lang.String r4 = "FrameworkMediaDrm"
            r5 = 1
            if (r2 != r5) goto L83
            if (r3 == r5) goto L19
            goto L83
        L19:
            short r5 = r0.readLittleEndianShort()
            java.nio.charset.Charset r6 = com.google.common.base.Charsets.UTF_16LE
            java.lang.String r0 = r0.readString(r5, r6)
            java.lang.String r5 = "<LA_URL>"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L2c
            return r7
        L2c:
            java.lang.String r7 = "</DATA>"
            int r7 = r0.indexOf(r7)
            r5 = -1
            if (r7 != r5) goto L3a
            java.lang.String r5 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            com.google.android.exoplayer2.util.Log.w(r4, r5)
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            java.lang.String r5 = r0.substring(r5, r7)
            r4.append(r5)
            java.lang.String r5 = "<LA_URL>https://x</LA_URL>"
            r4.append(r5)
            java.lang.String r7 = r0.substring(r7)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            int r1 = r1 + 52
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r4)
            r0.putInt(r1)
            short r1 = (short) r2
            r0.putShort(r1)
            short r1 = (short) r3
            r0.putShort(r1)
            int r1 = r7.length()
            int r1 = r1 * 2
            short r1 = (short) r1
            r0.putShort(r1)
            byte[] r7 = r7.getBytes(r6)
            r0.put(r7)
            byte[] r7 = r0.array()
            return r7
        L83:
            java.lang.String r0 = "Unexpected record count or type. Skipping LA_URL workaround."
            com.google.android.exoplayer2.util.Log.i(r4, r0)
            return r7
    }

    private static java.lang.String adjustLicenseServerUrl(java.lang.String r3) {
            java.lang.String r0 = "<LA_URL>https://x</LA_URL>"
            boolean r0 = r0.equals(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 33
            if (r0 != r2) goto L1a
            java.lang.String r0 = "https://default.url"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1a
            return r1
        L1a:
            return r3
    }

    private static byte[] adjustRequestData(java.util.UUID r1, byte[] r2) {
            java.util.UUID r0 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld
            byte[] r1 = com.google.android.exoplayer2.drm.ClearKeyUtil.adjustRequestData(r2)
            return r1
        Ld:
            return r2
    }

    private static byte[] adjustRequestInitData(java.util.UUID r3, byte[] r4) {
            java.util.UUID r0 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = addLaUrlAttributeIfMissing(r4)
            byte[] r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r0, r4)
        L18:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
    }

    private static java.lang.String adjustRequestMimeType(java.util.UUID r2, java.lang.String r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L22
            java.util.UUID r0 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L22
            java.lang.String r2 = "video/mp4"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            java.lang.String r2 = "audio/mp4"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L22
        L1f:
            java.lang.String r2 = "cenc"
            return r2
        L22:
            return r3
    }

    private static java.util.UUID adjustUuid(java.util.UUID r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 27
            if (r0 >= r1) goto L10
            java.util.UUID r0 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L10
            java.util.UUID r2 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
        L10:
            return r2
    }

    private static void forceWidevineL3(android.media.MediaDrm r2) {
            java.lang.String r0 = "securityLevel"
            java.lang.String r1 = "L3"
            r2.setPropertyString(r0, r1)
            return
    }

    private static com.google.android.exoplayer2.drm.DrmInitData.SchemeData getSchemeData(java.util.UUID r8, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r9) {
            java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r8 = r0.equals(r8)
            r0 = 0
            if (r8 != 0) goto L10
            java.lang.Object r8 = r9.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r8
            return r8
        L10:
            int r8 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            r2 = 1
            if (r8 < r1) goto L82
            int r8 = r9.size()
            if (r8 <= r2) goto L82
            java.lang.Object r8 = r9.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r8
            r1 = 0
            r3 = 0
        L25:
            int r4 = r9.size()
            if (r1 >= r4) goto L5a
            java.lang.Object r4 = r9.get(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r4 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r4
            byte[] r5 = r4.data
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            byte[] r5 = (byte[]) r5
            java.lang.String r6 = r4.mimeType
            java.lang.String r7 = r8.mimeType
            boolean r6 = com.google.android.exoplayer2.util.Util.areEqual(r6, r7)
            if (r6 == 0) goto L58
            java.lang.String r4 = r4.licenseServerUrl
            java.lang.String r6 = r8.licenseServerUrl
            boolean r4 = com.google.android.exoplayer2.util.Util.areEqual(r4, r6)
            if (r4 == 0) goto L58
            boolean r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.isPsshAtom(r5)
            if (r4 == 0) goto L58
            int r4 = r5.length
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L25
        L58:
            r1 = 0
            goto L5b
        L5a:
            r1 = 1
        L5b:
            if (r1 == 0) goto L82
            byte[] r1 = new byte[r3]
            r2 = 0
            r3 = 0
        L61:
            int r4 = r9.size()
            if (r2 >= r4) goto L7d
            java.lang.Object r4 = r9.get(r2)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r4 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r4
            byte[] r4 = r4.data
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            byte[] r4 = (byte[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r5)
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L61
        L7d:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = r8.copyWithData(r1)
            return r8
        L82:
            r8 = 0
        L83:
            int r1 = r9.size()
            if (r8 >= r1) goto Lac
            java.lang.Object r1 = r9.get(r8)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            byte[] r3 = r1.data
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            int r3 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseVersion(r3)
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            r5 = 23
            if (r4 >= r5) goto La4
            if (r3 != 0) goto La4
            return r1
        La4:
            if (r4 < r5) goto La9
            if (r3 != r2) goto La9
            return r1
        La9:
            int r8 = r8 + 1
            goto L83
        Lac:
            java.lang.Object r8 = r9.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r8
            return r8
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID r0) {
            java.util.UUID r0 = adjustUuid(r0)
            boolean r0 = android.media.MediaDrm.isCryptoSchemeSupported(r0)
            return r0
    }

    private /* synthetic */ void lambda$setOnEventListener$1(com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener r7, android.media.MediaDrm r8, byte[] r9, int r10, int r11, byte[] r12) {
            r6 = this;
            r0 = r7
            r1 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.onEvent(r1, r2, r3, r4, r5)
            return
    }

    private /* synthetic */ void lambda$setOnExpirationUpdateListener$3(com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener r1, android.media.MediaDrm r2, byte[] r3, long r4) {
            r0 = this;
            r1.onExpirationUpdate(r0, r3, r4)
            return
    }

    private /* synthetic */ void lambda$setOnKeyStatusChangeListener$2(com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r4, android.media.MediaDrm r5, byte[] r6, java.util.List r7, boolean r8) {
            r3 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r7.next()
            android.media.MediaDrm$KeyStatus r0 = (android.media.MediaDrm.KeyStatus) r0
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyStatus r1 = new com.google.android.exoplayer2.drm.ExoMediaDrm$KeyStatus
            int r2 = r0.getStatusCode()
            byte[] r0 = r0.getKeyId()
            r1.<init>(r2, r0)
            r5.add(r1)
            goto L9
        L26:
            r4.onKeyStatusChange(r3, r6, r5, r8)
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.drm.ExoMediaDrm lambda$static$0(java.util.UUID r2) {
            com.google.android.exoplayer2.drm.FrameworkMediaDrm r2 = newInstance(r2)     // Catch: com.google.android.exoplayer2.drm.UnsupportedDrmException -> L5
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate a FrameworkMediaDrm for uuid: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "FrameworkMediaDrm"
            com.google.android.exoplayer2.util.Log.e(r0, r2)
            com.google.android.exoplayer2.drm.DummyExoMediaDrm r2 = new com.google.android.exoplayer2.drm.DummyExoMediaDrm
            r2.<init>()
            return r2
    }

    private static boolean needsForceWidevineL3Workaround() {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "ASUS_Z00AD"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public static com.google.android.exoplayer2.drm.FrameworkMediaDrm newInstance(java.util.UUID r2) throws com.google.android.exoplayer2.drm.UnsupportedDrmException {
            com.google.android.exoplayer2.drm.FrameworkMediaDrm r0 = new com.google.android.exoplayer2.drm.FrameworkMediaDrm     // Catch: java.lang.Exception -> L6 android.media.UnsupportedSchemeException -> Le
            r0.<init>(r2)     // Catch: java.lang.Exception -> L6 android.media.UnsupportedSchemeException -> Le
            return r0
        L6:
            r2 = move-exception
            com.google.android.exoplayer2.drm.UnsupportedDrmException r0 = new com.google.android.exoplayer2.drm.UnsupportedDrmException
            r1 = 2
            r0.<init>(r1, r2)
            throw r0
        Le:
            r2 = move-exception
            com.google.android.exoplayer2.drm.UnsupportedDrmException r0 = new com.google.android.exoplayer2.drm.UnsupportedDrmException
            r1 = 1
            r0.<init>(r1, r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void acquire() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.referenceCount     // Catch: java.lang.Throwable -> L13
            r1 = 1
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L13
            int r0 = r2.referenceCount     // Catch: java.lang.Throwable -> L13
            int r0 = r0 + r1
            r2.referenceCount = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            r0.closeSession(r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.decoder.CryptoConfig createCryptoConfig(byte[] r1) throws android.media.MediaCryptoException {
            r0 = this;
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r1 = r0.createCryptoConfig(r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.FrameworkCryptoConfig createCryptoConfig(byte[] r4) throws android.media.MediaCryptoException {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L21
            java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            java.util.UUID r1 = r3.uuid
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            java.lang.String r0 = "securityLevel"
            java.lang.String r0 = r3.getPropertyString(r0)
            java.lang.String r1 = "L3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            com.google.android.exoplayer2.drm.FrameworkCryptoConfig r1 = new com.google.android.exoplayer2.drm.FrameworkCryptoConfig
            java.util.UUID r2 = r3.uuid
            java.util.UUID r2 = adjustUuid(r2)
            r1.<init>(r2, r4, r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public int getCryptoType() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @android.annotation.SuppressLint({"WrongConstant"})
    public com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] r9, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r10, int r11, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r12) throws android.media.NotProvisionedException {
            r8 = this;
            r0 = 0
            if (r10 == 0) goto L22
            java.util.UUID r0 = r8.uuid
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = getSchemeData(r0, r10)
            java.util.UUID r10 = r8.uuid
            byte[] r1 = r0.data
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            byte[] r10 = adjustRequestInitData(r10, r1)
            java.util.UUID r1 = r8.uuid
            java.lang.String r2 = r0.mimeType
            java.lang.String r1 = adjustRequestMimeType(r1, r2)
            r4 = r10
            r5 = r1
            goto L24
        L22:
            r4 = r0
            r5 = r4
        L24:
            android.media.MediaDrm r2 = r8.mediaDrm
            r3 = r9
            r6 = r11
            r7 = r12
            android.media.MediaDrm$KeyRequest r9 = r2.getKeyRequest(r3, r4, r5, r6, r7)
            java.util.UUID r10 = r8.uuid
            byte[] r11 = r9.getData()
            byte[] r10 = adjustRequestData(r10, r11)
            java.lang.String r11 = r9.getDefaultUrl()
            java.lang.String r11 = adjustLicenseServerUrl(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L51
            if (r0 == 0) goto L51
            java.lang.String r12 = r0.licenseServerUrl
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L51
            java.lang.String r11 = r0.licenseServerUrl
        L51:
            int r12 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 23
            if (r12 < r0) goto L5c
            int r9 = r9.getRequestType()
            goto L5e
        L5c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L5e:
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r12 = new com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest
            r12.<init>(r10, r11, r9)
            return r12
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.Nullable
    public android.os.PersistableBundle getMetrics() {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            android.media.MediaDrm r0 = r2.mediaDrm
            android.os.PersistableBundle r0 = r0.getMetrics()
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            byte[] r2 = r0.getPropertyByteArray(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            java.lang.String r2 = r0.getPropertyString(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
            r3 = this;
            android.media.MediaDrm r0 = r3.mediaDrm
            android.media.MediaDrm$ProvisionRequest r0 = r0.getProvisionRequest()
            com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest r1 = new com.google.android.exoplayer2.drm.ExoMediaDrm$ProvisionRequest
            byte[] r2 = r0.getData()
            java.lang.String r0 = r0.getDefaultUrl()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            byte[] r0 = r0.openSession()
            return r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.Nullable
    public byte[] provideKeyResponse(byte[] r3, byte[] r4) throws android.media.NotProvisionedException, android.media.DeniedByServerException {
            r2 = this;
            java.util.UUID r0 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            java.util.UUID r1 = r2.uuid
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            byte[] r4 = com.google.android.exoplayer2.drm.ClearKeyUtil.adjustResponseData(r4)
        Le:
            android.media.MediaDrm r0 = r2.mediaDrm
            byte[] r3 = r0.provideKeyResponse(r3, r4)
            return r3
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] r2) throws android.media.DeniedByServerException {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            r0.provideProvisionResponse(r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] r2) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            java.util.HashMap r2 = r0.queryKeyStatus(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void release() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.referenceCount     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + (-1)
            r1.referenceCount = r0     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            android.media.MediaDrm r0 = r1.mediaDrm     // Catch: java.lang.Throwable -> L10
            r0.release()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] r3, java.lang.String r4) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 31
            if (r0 < r1) goto Ld
            android.media.MediaDrm r3 = r2.mediaDrm
            boolean r3 = com.google.android.exoplayer2.drm.FrameworkMediaDrm.Api31.requiresSecureDecoder(r3, r4)
            return r3
        Ld:
            android.media.MediaCrypto r0 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L21
            java.util.UUID r1 = r2.uuid     // Catch: android.media.MediaCryptoException -> L21
            r0.<init>(r1, r3)     // Catch: android.media.MediaCryptoException -> L21
            boolean r3 = r0.requiresSecureDecoderComponent(r4)     // Catch: java.lang.Throwable -> L1c
            r0.release()
            return r3
        L1c:
            r3 = move-exception
            r0.release()
            throw r3
        L21:
            r3 = 1
            return r3
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] r2, byte[] r3) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            r0.restoreKeys(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener r3) {
            r2 = this;
            android.media.MediaDrm r0 = r2.mediaDrm
            if (r3 != 0) goto L6
            r3 = 0
            goto Lc
        L6:
            com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            r3 = r1
        Lc:
            r0.setOnEventListener(r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.RequiresApi(23)
    public void setOnExpirationUpdateListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener r4) {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            android.media.MediaDrm r0 = r3.mediaDrm
            r1 = 0
            if (r4 != 0) goto Ld
            r2 = r1
            goto L12
        Ld:
            com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1
            r2.<init>(r3, r4)
        L12:
            r0.setOnExpirationUpdateListener(r2, r1)
            return
        L16:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @androidx.annotation.RequiresApi(23)
    public void setOnKeyStatusChangeListener(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener r4) {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            android.media.MediaDrm r0 = r3.mediaDrm
            r1 = 0
            if (r4 != 0) goto Ld
            r2 = r1
            goto L12
        Ld:
            com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2 r2 = new com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
            r2.<init>(r3, r4)
        L12:
            r0.setOnKeyStatusChangeListener(r2, r1)
            return
        L16:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPlayerIdForSession(byte[] r3, com.google.android.exoplayer2.analytics.PlayerId r4) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 31
            if (r0 < r1) goto L14
            android.media.MediaDrm r0 = r2.mediaDrm     // Catch: java.lang.UnsupportedOperationException -> Lc
            com.google.android.exoplayer2.drm.FrameworkMediaDrm.Api31.setLogSessionIdOnMediaDrmSession(r0, r3, r4)     // Catch: java.lang.UnsupportedOperationException -> Lc
            goto L14
        Lc:
            java.lang.String r3 = "FrameworkMediaDrm"
            java.lang.String r4 = "setLogSessionId failed."
            com.google.android.exoplayer2.util.Log.w(r3, r4)
        L14:
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String r2, byte[] r3) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            r0.setPropertyByteArray(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.media.MediaDrm r0 = r1.mediaDrm
            r0.setPropertyString(r2, r3)
            return
    }
}
