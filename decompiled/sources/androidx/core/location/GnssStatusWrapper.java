package androidx.core.location;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(24)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class GnssStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private final android.location.GnssStatus mWrapped;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float getCarrierFrequencyHz(android.location.GnssStatus r0, int r1) {
                float r0 = r0.getCarrierFrequencyHz(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasCarrierFrequencyHz(android.location.GnssStatus r0, int r1) {
                boolean r0 = r0.hasCarrierFrequencyHz(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float getBasebandCn0DbHz(android.location.GnssStatus r0, int r1) {
                float r0 = r0.getBasebandCn0DbHz(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasBasebandCn0DbHz(android.location.GnssStatus r0, int r1) {
                boolean r0 = r0.hasBasebandCn0DbHz(r1)
                return r0
        }
    }

    public GnssStatusWrapper(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.location.GnssStatus r1 = (android.location.GnssStatus) r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.location.GnssStatus r1 = (android.location.GnssStatus) r1
            r0.mWrapped = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.core.location.GnssStatusWrapper
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.core.location.GnssStatusWrapper r2 = (androidx.core.location.GnssStatusWrapper) r2
            android.location.GnssStatus r0 = r1.mWrapped
            android.location.GnssStatus r2 = r2.mWrapped
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r2 = r0.getAzimuthDegrees(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            float r3 = androidx.core.location.GnssStatusWrapper.Api30Impl.getBasebandCn0DbHz(r0, r3)
            return r3
        Ld:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            float r3 = androidx.core.location.GnssStatusWrapper.Api26Impl.getCarrierFrequencyHz(r0, r3)
            return r3
        Ld:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r2 = r0.getCn0DbHz(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r2 = r0.getConstellationType(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r2 = r0.getElevationDegrees(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.getSatelliteCount()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r2 = r0.getSvid(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r2 = r0.hasAlmanacData(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            boolean r3 = androidx.core.location.GnssStatusWrapper.Api30Impl.hasBasebandCn0DbHz(r0, r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            boolean r3 = androidx.core.location.GnssStatusWrapper.Api26Impl.hasCarrierFrequencyHz(r0, r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r2 = r0.hasEphemerisData(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r2 = r0.usedInFix(r2)
            return r2
    }
}
