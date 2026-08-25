package com.google.android.exoplayer2.ext.cronet;

/* JADX INFO: loaded from: classes2.dex */
public final class CronetUtil {
    private static final java.lang.String TAG = "CronetUtil";

    /* JADX INFO: loaded from: classes3.dex */
    public static class CronetProviderComparator implements java.util.Comparator<org.chromium.net.CronetProvider> {
        private static final java.lang.String GOOGLE_PLAY_SERVICES_PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
        private final boolean preferGooglePlayServices;

        public CronetProviderComparator(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.preferGooglePlayServices = r1
                return
        }

        private static int compareVersionStrings(@androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.String r6) {
                r0 = 0
                if (r5 == 0) goto L35
                if (r6 != 0) goto L6
                goto L35
            L6:
                java.lang.String r1 = "\\."
                java.lang.String[] r5 = com.google.android.exoplayer2.util.Util.split(r5, r1)
                java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r6, r1)
                int r1 = r5.length
                int r2 = r6.length
                int r1 = java.lang.Math.min(r1, r2)
                r2 = 0
            L17:
                if (r2 >= r1) goto L35
                r3 = r5[r2]
                r4 = r6[r2]
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L32
                r5 = r5[r2]     // Catch: java.lang.NumberFormatException -> L31
                int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L31
                r6 = r6[r2]     // Catch: java.lang.NumberFormatException -> L31
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L31
                int r5 = r5 - r6
                return r5
            L31:
                return r0
            L32:
                int r2 = r2 + 1
                goto L17
            L35:
                return r0
        }

        private int getPriority(org.chromium.net.CronetProvider r2) {
                r1 = this;
                java.lang.String r2 = r2.getName()
                java.lang.String r0 = "App-Packaged-Cronet-Provider"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Le
                r2 = 1
                return r2
            Le:
                java.lang.String r0 = "Google-Play-Services-Cronet-Provider"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L1e
                boolean r2 = r1.preferGooglePlayServices
                if (r2 == 0) goto L1c
                r2 = 0
                goto L1d
            L1c:
                r2 = 2
            L1d:
                return r2
            L1e:
                r2 = 3
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(org.chromium.net.CronetProvider r1, org.chromium.net.CronetProvider r2) {
                r0 = this;
                org.chromium.net.CronetProvider r1 = (org.chromium.net.CronetProvider) r1
                org.chromium.net.CronetProvider r2 = (org.chromium.net.CronetProvider) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(org.chromium.net.CronetProvider r3, org.chromium.net.CronetProvider r4) {
                r2 = this;
                int r0 = r2.getPriority(r3)
                int r1 = r2.getPriority(r4)
                int r0 = r0 - r1
                if (r0 == 0) goto Lc
                return r0
            Lc:
                java.lang.String r3 = r3.getVersion()
                java.lang.String r4 = r4.getVersion()
                int r3 = compareVersionStrings(r3, r4)
                int r3 = -r3
                return r3
        }
    }

    private CronetUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static org.chromium.net.CronetEngine buildCronetEngine(android.content.Context r2) {
            r0 = 0
            r1 = 0
            org.chromium.net.CronetEngine r2 = buildCronetEngine(r2, r0, r1)
            return r2
    }

    @androidx.annotation.Nullable
    public static org.chromium.net.CronetEngine buildCronetEngine(android.content.Context r5, @androidx.annotation.Nullable java.lang.String r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = org.chromium.net.CronetProvider.getAllProviders(r5)
            r0.<init>(r5)
            int r5 = r0.size()
            int r5 = r5 + (-1)
        Lf:
            if (r5 < 0) goto L35
            java.lang.Object r1 = r0.get(r5)
            org.chromium.net.CronetProvider r1 = (org.chromium.net.CronetProvider) r1
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.get(r5)
            org.chromium.net.CronetProvider r1 = (org.chromium.net.CronetProvider) r1
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Fallback-Cronet-Provider"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L32
        L2f:
            r0.remove(r5)
        L32:
            int r5 = r5 + (-1)
            goto Lf
        L35:
            com.google.android.exoplayer2.ext.cronet.CronetUtil$CronetProviderComparator r5 = new com.google.android.exoplayer2.ext.cronet.CronetUtil$CronetProviderComparator
            r5.<init>(r7)
            java.util.Collections.sort(r0, r5)
            r5 = 0
        L3e:
            int r7 = r0.size()
            java.lang.String r1 = "CronetUtil"
            if (r5 >= r7) goto L86
            java.lang.Object r7 = r0.get(r5)
            org.chromium.net.CronetProvider r7 = (org.chromium.net.CronetProvider) r7
            java.lang.String r7 = r7.getName()
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            org.chromium.net.CronetProvider r2 = (org.chromium.net.CronetProvider) r2     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            org.chromium.net.CronetEngine$Builder r2 = r2.createBuilder()     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            if (r6 == 0) goto L5f
            r2.setUserAgent(r6)     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
        L5f:
            org.chromium.net.CronetEngine r2 = r2.build()     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            r3.<init>()     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            java.lang.String r4 = "CronetEngine built using "
            r3.append(r4)     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            r3.append(r7)     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            java.lang.String r7 = r3.toString()     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            com.google.android.exoplayer2.util.Log.d(r1, r7)     // Catch: java.lang.UnsatisfiedLinkError -> L78 java.lang.SecurityException -> L7e
            return r2
        L78:
            java.lang.String r7 = "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app."
            com.google.android.exoplayer2.util.Log.w(r1, r7)
            goto L83
        L7e:
            java.lang.String r7 = "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE."
            com.google.android.exoplayer2.util.Log.w(r1, r7)
        L83:
            int r5 = r5 + 1
            goto L3e
        L86:
            java.lang.String r5 = "CronetEngine could not be built."
            com.google.android.exoplayer2.util.Log.w(r1, r5)
            r5 = 0
            return r5
    }
}
