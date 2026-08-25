package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.scheduler.Requirements> CREATOR = null;
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;


    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    static {
            com.google.android.exoplayer2.scheduler.Requirements$1 r0 = new com.google.android.exoplayer2.scheduler.Requirements$1
            r0.<init>()
            com.google.android.exoplayer2.scheduler.Requirements.CREATOR = r0
            return
    }

    public Requirements(int r2) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 2
            if (r0 == 0) goto L9
            r2 = r2 | 1
        L9:
            r1.requirements = r2
            return
    }

    private int getNotMetNetworkRequirements(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.isNetworkRequired()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r0 = r3.getActiveNetworkInfo()
            if (r0 == 0) goto L36
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L36
            boolean r0 = isInternetConnectivityValidated(r3)
            if (r0 != 0) goto L27
            goto L36
        L27:
            boolean r0 = r2.isUnmeteredNetworkRequired()
            if (r0 == 0) goto L35
            boolean r3 = r3.isActiveNetworkMetered()
            if (r3 == 0) goto L35
            r3 = 2
            return r3
        L35:
            return r1
        L36:
            int r3 = r2.requirements
            r3 = r3 & 3
            return r3
    }

    private boolean isDeviceCharging(android.content.Context r4) {
            r3 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r4 = r4.registerReceiver(r1, r0)
            r0 = 0
            if (r4 != 0) goto L10
            return r0
        L10:
            r1 = -1
            java.lang.String r2 = "status"
            int r4 = r4.getIntExtra(r2, r1)
            r1 = 2
            if (r4 == r1) goto L1e
            r1 = 5
            if (r4 != r1) goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    private boolean isDeviceIdle(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "power"
            java.lang.Object r5 = r5.getSystemService(r0)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            android.os.PowerManager r5 = (android.os.PowerManager) r5
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 < r3) goto L1a
            boolean r1 = r5.isDeviceIdleMode()
            goto L2d
        L1a:
            r3 = 20
            if (r0 < r3) goto L25
            boolean r5 = r5.isInteractive()
            if (r5 != 0) goto L2c
            goto L2d
        L25:
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    private static boolean isInternetConnectivityValidated(android.net.ConnectivityManager r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 24
            if (r0 >= r2) goto L8
            return r1
        L8:
            android.net.Network r0 = r3.getActiveNetwork()
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r0)     // Catch: java.lang.SecurityException -> L20
            if (r3 == 0) goto L1f
            r0 = 16
            boolean r3 = r3.hasCapability(r0)     // Catch: java.lang.SecurityException -> L20
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    private boolean isStorageNotLow(android.content.Context r3) {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)
            if (r3 != 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            return r3
    }

    public boolean checkRequirements(android.content.Context r1) {
            r0 = this;
            int r1 = r0.getNotMetRequirements(r1)
            if (r1 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1b
            java.lang.Class<com.google.android.exoplayer2.scheduler.Requirements> r2 = com.google.android.exoplayer2.scheduler.Requirements.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1b
        L10:
            int r2 = r4.requirements
            com.google.android.exoplayer2.scheduler.Requirements r5 = (com.google.android.exoplayer2.scheduler.Requirements) r5
            int r5 = r5.requirements
            if (r2 != r5) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            return r1
    }

    public com.google.android.exoplayer2.scheduler.Requirements filterRequirements(int r2) {
            r1 = this;
            int r0 = r1.requirements
            r2 = r2 & r0
            if (r2 != r0) goto L7
            r0 = r1
            goto Lc
        L7:
            com.google.android.exoplayer2.scheduler.Requirements r0 = new com.google.android.exoplayer2.scheduler.Requirements
            r0.<init>(r2)
        Lc:
            return r0
    }

    public int getNotMetRequirements(android.content.Context r3) {
            r2 = this;
            int r0 = r2.getNotMetNetworkRequirements(r3)
            boolean r1 = r2.isChargingRequired()
            if (r1 == 0) goto L12
            boolean r1 = r2.isDeviceCharging(r3)
            if (r1 != 0) goto L12
            r0 = r0 | 8
        L12:
            boolean r1 = r2.isIdleRequired()
            if (r1 == 0) goto L20
            boolean r1 = r2.isDeviceIdle(r3)
            if (r1 != 0) goto L20
            r0 = r0 | 4
        L20:
            boolean r1 = r2.isStorageNotLowRequired()
            if (r1 == 0) goto L2e
            boolean r3 = r2.isStorageNotLow(r3)
            if (r3 != 0) goto L2e
            r0 = r0 | 16
        L2e:
            return r0
    }

    public int getRequirements() {
            r1 = this;
            int r0 = r1.requirements
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.requirements
            return r0
    }

    public boolean isChargingRequired() {
            r1 = this;
            int r0 = r1.requirements
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isIdleRequired() {
            r1 = this;
            int r0 = r1.requirements
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isNetworkRequired() {
            r2 = this;
            int r0 = r2.requirements
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public boolean isStorageNotLowRequired() {
            r1 = this;
            int r0 = r1.requirements
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isUnmeteredNetworkRequired() {
            r1 = this;
            int r0 = r1.requirements
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.requirements
            r1.writeInt(r2)
            return
    }
}
