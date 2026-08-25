package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultBandwidthMeter implements com.google.android.exoplayer2.upstream.BandwidthMeter, com.google.android.exoplayer2.upstream.TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = null;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = null;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = null;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = null;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = null;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = null;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.upstream.DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final com.google.android.exoplayer2.upstream.SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {
        private com.google.android.exoplayer2.util.Clock clock;

        @androidx.annotation.Nullable
        private final android.content.Context context;
        private java.util.Map<java.lang.Integer, java.lang.Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                if (r2 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                android.content.Context r0 = r2.getApplicationContext()
            Lb:
                r1.context = r0
                java.lang.String r2 = com.google.android.exoplayer2.util.Util.getCountryCode(r2)
                java.util.Map r2 = getInitialBitrateEstimatesForCountry(r2)
                r1.initialBitrateEstimates = r2
                r2 = 2000(0x7d0, float:2.803E-42)
                r1.slidingWindowMaxWeight = r2
                com.google.android.exoplayer2.util.Clock r2 = com.google.android.exoplayer2.util.Clock.DEFAULT
                r1.clock = r2
                r2 = 1
                r1.resetOnNetworkTypeChange = r2
                return
        }

        private static java.util.Map<java.lang.Integer, java.lang.Long> getInitialBitrateEstimatesForCountry(java.lang.String r8) {
                int[] r8 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.access$100(r8)
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 8
                r0.<init>(r1)
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r3 = 1000000(0xf4240, double:4.940656E-318)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r2, r3)
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.ImmutableList<java.lang.Long> r4 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI
                r5 = r8[r1]
                java.lang.Object r5 = r4.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ImmutableList<java.lang.Long> r6 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G
                r7 = 1
                r7 = r8[r7]
                java.lang.Object r6 = r6.get(r7)
                java.lang.Long r6 = (java.lang.Long) r6
                r0.put(r5, r6)
                r5 = 4
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                com.google.common.collect.ImmutableList<java.lang.Long> r7 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G
                r2 = r8[r2]
                java.lang.Object r2 = r7.get(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                r0.put(r6, r2)
                r2 = 5
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.ImmutableList<java.lang.Long> r7 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G
                r3 = r8[r3]
                java.lang.Object r3 = r7.get(r3)
                java.lang.Long r3 = (java.lang.Long) r3
                r0.put(r6, r3)
                r3 = 10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ImmutableList<java.lang.Long> r6 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA
                r5 = r8[r5]
                java.lang.Object r5 = r6.get(r5)
                java.lang.Long r5 = (java.lang.Long) r5
                r0.put(r3, r5)
                r3 = 9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ImmutableList<java.lang.Long> r5 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA
                r2 = r8[r2]
                java.lang.Object r2 = r5.get(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                r0.put(r3, r2)
                r2 = 7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r8 = r8[r1]
                java.lang.Object r8 = r4.get(r8)
                java.lang.Long r8 = (java.lang.Long) r8
                r0.put(r2, r8)
                return r0
        }

        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter build() {
                r8 = this;
                com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r7 = new com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
                android.content.Context r1 = r8.context
                java.util.Map<java.lang.Integer, java.lang.Long> r2 = r8.initialBitrateEstimates
                int r3 = r8.slidingWindowMaxWeight
                com.google.android.exoplayer2.util.Clock r4 = r8.clock
                boolean r5 = r8.resetOnNetworkTypeChange
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setClock(com.google.android.exoplayer2.util.Clock r1) {
                r0 = this;
                r0.clock = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(int r2, long r3) {
                r1 = this;
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = r1.initialBitrateEstimates
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(long r3) {
                r2 = this;
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = r2.initialBitrateEstimates
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r2.setInitialBitrateEstimate(r1, r3)
                goto La
            L1e:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = com.google.common.base.Ascii.toUpperCase(r1)
                java.util.Map r1 = getInitialBitrateEstimatesForCountry(r1)
                r0.initialBitrateEstimates = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setResetOnNetworkTypeChange(boolean r1) {
                r0 = this;
                r0.resetOnNetworkTypeChange = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder setSlidingWindowMaxWeight(int r1) {
                r0 = this;
                r0.slidingWindowMaxWeight = r1
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$n4HgtxeYBFNUETYzdzpx6UkOs7c(com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r0, int r1) {
            r0.onNetworkTypeChanged(r1)
            return
    }

    static {
            r0 = 4400000(0x432380, double:2.173889E-317)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 3200000(0x30d400, double:1.58101E-317)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2300000(0x231860, double:1.136351E-317)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1600000(0x186a00, double:7.90505E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 810000(0xc5c10, double:4.00193E-318)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0, r1, r2, r3, r4)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = r0
            r0 = 1400000(0x155cc0, double:6.91692E-318)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3 = 990000(0xf1b30, double:4.89125E-318)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 730000(0xb2390, double:3.60668E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 510000(0x7c830, double:2.519735E-318)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 230000(0x38270, double:1.13635E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r0, r1, r3, r4, r5)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = r3
            r3 = 2100000(0x200b20, double:1.037538E-317)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 890000(0xd9490, double:4.397184E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 640000(0x9c400, double:3.16202E-318)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3, r0, r4, r5, r6)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = r3
            r5 = 2600000(0x27ac40, double:1.2845707E-317)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 1700000(0x19f0a0, double:8.399116E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 1300000(0x13d620, double:6.422853E-318)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 700000(0xaae60, double:3.45846E-318)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3, r5, r6, r4, r7)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = r3
            r3 = 5700000(0x56f9a0, double:2.816174E-317)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6 = 3700000(0x387520, double:1.828043E-317)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r3, r4, r2, r5, r1)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = r1
            r1 = 2800000(0x2ab980, double:1.383384E-317)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1100000(0x10c8e0, double:5.43472E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 870000(0xd4670, double:4.29837E-318)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r1, r2, r0, r3, r4)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = r0
            return
    }

    @java.lang.Deprecated
    public DefaultBandwidthMeter() {
            r6 = this;
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
            com.google.android.exoplayer2.util.Clock r4 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r1 = 0
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private DefaultBandwidthMeter(@androidx.annotation.Nullable android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Long> r2, int r3, com.google.android.exoplayer2.util.Clock r4, boolean r5) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.copyOf(r2)
            r0.initialBitrateEstimates = r2
            com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher r2 = new com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher
            r2.<init>()
            r0.eventDispatcher = r2
            com.google.android.exoplayer2.upstream.SlidingPercentile r2 = new com.google.android.exoplayer2.upstream.SlidingPercentile
            r2.<init>(r3)
            r0.slidingPercentile = r2
            r0.clock = r4
            r0.resetOnNetworkTypeChange = r5
            if (r1 == 0) goto L36
            com.google.android.exoplayer2.util.NetworkTypeObserver r1 = com.google.android.exoplayer2.util.NetworkTypeObserver.getInstance(r1)
            int r2 = r1.getNetworkType()
            r0.networkType = r2
            long r2 = r0.getInitialBitrateEstimateForNetworkType(r2)
            r0.bitrateEstimate = r2
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
            r2.<init>(r0)
            r1.register(r2)
            goto L3f
        L36:
            r1 = 0
            r0.networkType = r1
            long r1 = r0.getInitialBitrateEstimateForNetworkType(r1)
            r0.bitrateEstimate = r1
        L3f:
            return
    }

    public /* synthetic */ DefaultBandwidthMeter(android.content.Context r1, java.util.Map r2, int r3, com.google.android.exoplayer2.util.Clock r4, boolean r5, com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ int[] access$100(java.lang.String r0) {
            int[] r0 = getInitialBitrateCountryGroupAssignment(r0)
            return r0
    }

    private static int[] getInitialBitrateCountryGroupAssignment(java.lang.String r3) {
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = 6
            r2 = -1
            switch(r0) {
                case 2083: goto Lcef;
                case 2084: goto Lce4;
                case 2085: goto Lcd9;
                case 2086: goto Lcce;
                case 2088: goto Lcc3;
                case 2091: goto Lcb8;
                case 2092: goto Lcad;
                case 2094: goto Lca2;
                case 2096: goto Lc94;
                case 2098: goto Lc86;
                case 2099: goto Lc78;
                case 2100: goto Lc6a;
                case 2102: goto Lc5c;
                case 2103: goto Lc4e;
                case 2105: goto Lc40;
                case 2111: goto Lc32;
                case 2112: goto Lc24;
                case 2114: goto Lc16;
                case 2115: goto Lc08;
                case 2116: goto Lbfa;
                case 2117: goto Lbec;
                case 2118: goto Lbde;
                case 2119: goto Lbd0;
                case 2120: goto Lbc2;
                case 2122: goto Lbb4;
                case 2123: goto Lba6;
                case 2124: goto Lb98;
                case 2125: goto Lb8a;
                case 2127: goto Lb7c;
                case 2128: goto Lb6e;
                case 2129: goto Lb60;
                case 2130: goto Lb52;
                case 2133: goto Lb44;
                case 2135: goto Lb36;
                case 2136: goto Lb28;
                case 2142: goto Lb1a;
                case 2145: goto Lb0c;
                case 2147: goto Lafe;
                case 2148: goto Laf0;
                case 2149: goto Lae2;
                case 2150: goto Lad4;
                case 2152: goto Lac6;
                case 2153: goto Lab8;
                case 2154: goto Laaa;
                case 2155: goto La9c;
                case 2156: goto La8e;
                case 2159: goto La80;
                case 2162: goto La72;
                case 2163: goto La64;
                case 2164: goto La56;
                case 2165: goto La48;
                case 2166: goto La3a;
                case 2167: goto La2c;
                case 2177: goto La1e;
                case 2182: goto La10;
                case 2183: goto La02;
                case 2185: goto L9f4;
                case 2187: goto L9e6;
                case 2198: goto L9d8;
                case 2206: goto L9ca;
                case 2208: goto L9bc;
                case 2210: goto L9ae;
                case 2221: goto L9a0;
                case 2222: goto L992;
                case 2223: goto L984;
                case 2243: goto L976;
                case 2244: goto L968;
                case 2247: goto L95a;
                case 2249: goto L94c;
                case 2252: goto L93e;
                case 2266: goto L930;
                case 2267: goto L922;
                case 2269: goto L914;
                case 2270: goto L906;
                case 2271: goto L8f8;
                case 2272: goto L8ea;
                case 2273: goto L8dc;
                case 2274: goto L8ce;
                case 2277: goto L8c0;
                case 2278: goto L8b2;
                case 2279: goto L8a4;
                case 2281: goto L896;
                case 2282: goto L888;
                case 2283: goto L87a;
                case 2285: goto L86c;
                case 2286: goto L85e;
                case 2288: goto L850;
                case 2290: goto L842;
                case 2307: goto L834;
                case 2310: goto L826;
                case 2314: goto L818;
                case 2316: goto L80a;
                case 2317: goto L7fc;
                case 2331: goto L7ee;
                case 2332: goto L7e0;
                case 2339: goto L7d2;
                case 2340: goto L7c4;
                case 2341: goto L7b6;
                case 2342: goto L7a8;
                case 2344: goto L79a;
                case 2345: goto L78c;
                case 2346: goto L77e;
                case 2347: goto L770;
                case 2363: goto L762;
                case 2371: goto L754;
                case 2373: goto L746;
                case 2374: goto L738;
                case 2394: goto L72a;
                case 2396: goto L71c;
                case 2397: goto L70e;
                case 2398: goto L700;
                case 2402: goto L6f2;
                case 2403: goto L6e4;
                case 2407: goto L6d6;
                case 2412: goto L6c8;
                case 2414: goto L6ba;
                case 2415: goto L6ac;
                case 2421: goto L69e;
                case 2422: goto L690;
                case 2423: goto L682;
                case 2429: goto L674;
                case 2431: goto L666;
                case 2438: goto L658;
                case 2439: goto L64a;
                case 2440: goto L63c;
                case 2441: goto L62e;
                case 2442: goto L620;
                case 2445: goto L612;
                case 2452: goto L604;
                case 2454: goto L5f6;
                case 2455: goto L5e8;
                case 2456: goto L5da;
                case 2457: goto L5cc;
                case 2458: goto L5be;
                case 2459: goto L5b0;
                case 2462: goto L5a2;
                case 2463: goto L594;
                case 2464: goto L586;
                case 2465: goto L578;
                case 2466: goto L56a;
                case 2467: goto L55c;
                case 2468: goto L54e;
                case 2469: goto L540;
                case 2470: goto L532;
                case 2471: goto L524;
                case 2472: goto L516;
                case 2473: goto L508;
                case 2474: goto L4fa;
                case 2475: goto L4ec;
                case 2476: goto L4de;
                case 2477: goto L4d0;
                case 2483: goto L4c2;
                case 2485: goto L4b4;
                case 2487: goto L4a6;
                case 2489: goto L498;
                case 2491: goto L48a;
                case 2494: goto L47c;
                case 2497: goto L46e;
                case 2498: goto L460;
                case 2500: goto L452;
                case 2503: goto L444;
                case 2508: goto L436;
                case 2526: goto L428;
                case 2545: goto L41a;
                case 2549: goto L40c;
                case 2550: goto L3fe;
                case 2551: goto L3f0;
                case 2552: goto L3e2;
                case 2555: goto L3d4;
                case 2556: goto L3c6;
                case 2557: goto L3b8;
                case 2562: goto L3aa;
                case 2563: goto L39c;
                case 2564: goto L38e;
                case 2567: goto L380;
                case 2569: goto L372;
                case 2576: goto L364;
                case 2611: goto L356;
                case 2621: goto L348;
                case 2625: goto L33a;
                case 2627: goto L32c;
                case 2629: goto L31e;
                case 2638: goto L310;
                case 2639: goto L302;
                case 2640: goto L2f4;
                case 2641: goto L2e6;
                case 2642: goto L2d8;
                case 2644: goto L2ca;
                case 2645: goto L2bc;
                case 2646: goto L2ae;
                case 2647: goto L2a0;
                case 2648: goto L292;
                case 2649: goto L284;
                case 2650: goto L276;
                case 2651: goto L268;
                case 2652: goto L25a;
                case 2655: goto L24c;
                case 2656: goto L23e;
                case 2657: goto L230;
                case 2659: goto L222;
                case 2661: goto L214;
                case 2662: goto L206;
                case 2663: goto L1f8;
                case 2671: goto L1ea;
                case 2672: goto L1dc;
                case 2675: goto L1ce;
                case 2676: goto L1c0;
                case 2678: goto L1b2;
                case 2679: goto L1a4;
                case 2680: goto L196;
                case 2681: goto L188;
                case 2682: goto L17a;
                case 2683: goto L16c;
                case 2686: goto L15e;
                case 2688: goto L150;
                case 2690: goto L142;
                case 2691: goto L134;
                case 2694: goto L126;
                case 2700: goto L118;
                case 2706: goto L10a;
                case 2718: goto Lfc;
                case 2724: goto Lee;
                case 2725: goto Le0;
                case 2731: goto Ld2;
                case 2733: goto Lc4;
                case 2735: goto Lb6;
                case 2737: goto La8;
                case 2739: goto L9a;
                case 2744: goto L8c;
                case 2751: goto L7e;
                case 2767: goto L70;
                case 2780: goto L62;
                case 2803: goto L54;
                case 2828: goto L46;
                case 2843: goto L38;
                case 2855: goto L2a;
                case 2867: goto L1c;
                case 2877: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lcf9
        Le:
            java.lang.String r0 = "ZW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lcf9
        L18:
            r2 = 237(0xed, float:3.32E-43)
            goto Lcf9
        L1c:
            java.lang.String r0 = "ZM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Lcf9
        L26:
            r2 = 236(0xec, float:3.31E-43)
            goto Lcf9
        L2a:
            java.lang.String r0 = "ZA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Lcf9
        L34:
            r2 = 235(0xeb, float:3.3E-43)
            goto Lcf9
        L38:
            java.lang.String r0 = "YT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto Lcf9
        L42:
            r2 = 234(0xea, float:3.28E-43)
            goto Lcf9
        L46:
            java.lang.String r0 = "YE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L50
            goto Lcf9
        L50:
            r2 = 233(0xe9, float:3.27E-43)
            goto Lcf9
        L54:
            java.lang.String r0 = "XK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5e
            goto Lcf9
        L5e:
            r2 = 232(0xe8, float:3.25E-43)
            goto Lcf9
        L62:
            java.lang.String r0 = "WS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6c
            goto Lcf9
        L6c:
            r2 = 231(0xe7, float:3.24E-43)
            goto Lcf9
        L70:
            java.lang.String r0 = "WF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7a
            goto Lcf9
        L7a:
            r2 = 230(0xe6, float:3.22E-43)
            goto Lcf9
        L7e:
            java.lang.String r0 = "VU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L88
            goto Lcf9
        L88:
            r2 = 229(0xe5, float:3.21E-43)
            goto Lcf9
        L8c:
            java.lang.String r0 = "VN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L96
            goto Lcf9
        L96:
            r2 = 228(0xe4, float:3.2E-43)
            goto Lcf9
        L9a:
            java.lang.String r0 = "VI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La4
            goto Lcf9
        La4:
            r2 = 227(0xe3, float:3.18E-43)
            goto Lcf9
        La8:
            java.lang.String r0 = "VG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb2
            goto Lcf9
        Lb2:
            r2 = 226(0xe2, float:3.17E-43)
            goto Lcf9
        Lb6:
            java.lang.String r0 = "VE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc0
            goto Lcf9
        Lc0:
            r2 = 225(0xe1, float:3.15E-43)
            goto Lcf9
        Lc4:
            java.lang.String r0 = "VC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lce
            goto Lcf9
        Lce:
            r2 = 224(0xe0, float:3.14E-43)
            goto Lcf9
        Ld2:
            java.lang.String r0 = "VA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ldc
            goto Lcf9
        Ldc:
            r2 = 223(0xdf, float:3.12E-43)
            goto Lcf9
        Le0:
            java.lang.String r0 = "UZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lea
            goto Lcf9
        Lea:
            r2 = 222(0xde, float:3.11E-43)
            goto Lcf9
        Lee:
            java.lang.String r0 = "UY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lf8
            goto Lcf9
        Lf8:
            r2 = 221(0xdd, float:3.1E-43)
            goto Lcf9
        Lfc:
            java.lang.String r0 = "US"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L106
            goto Lcf9
        L106:
            r2 = 220(0xdc, float:3.08E-43)
            goto Lcf9
        L10a:
            java.lang.String r0 = "UG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L114
            goto Lcf9
        L114:
            r2 = 219(0xdb, float:3.07E-43)
            goto Lcf9
        L118:
            java.lang.String r0 = "UA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L122
            goto Lcf9
        L122:
            r2 = 218(0xda, float:3.05E-43)
            goto Lcf9
        L126:
            java.lang.String r0 = "TZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L130
            goto Lcf9
        L130:
            r2 = 217(0xd9, float:3.04E-43)
            goto Lcf9
        L134:
            java.lang.String r0 = "TW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L13e
            goto Lcf9
        L13e:
            r2 = 216(0xd8, float:3.03E-43)
            goto Lcf9
        L142:
            java.lang.String r0 = "TV"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L14c
            goto Lcf9
        L14c:
            r2 = 215(0xd7, float:3.01E-43)
            goto Lcf9
        L150:
            java.lang.String r0 = "TT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L15a
            goto Lcf9
        L15a:
            r2 = 214(0xd6, float:3.0E-43)
            goto Lcf9
        L15e:
            java.lang.String r0 = "TR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L168
            goto Lcf9
        L168:
            r2 = 213(0xd5, float:2.98E-43)
            goto Lcf9
        L16c:
            java.lang.String r0 = "TO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L176
            goto Lcf9
        L176:
            r2 = 212(0xd4, float:2.97E-43)
            goto Lcf9
        L17a:
            java.lang.String r0 = "TN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L184
            goto Lcf9
        L184:
            r2 = 211(0xd3, float:2.96E-43)
            goto Lcf9
        L188:
            java.lang.String r0 = "TM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L192
            goto Lcf9
        L192:
            r2 = 210(0xd2, float:2.94E-43)
            goto Lcf9
        L196:
            java.lang.String r0 = "TL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1a0
            goto Lcf9
        L1a0:
            r2 = 209(0xd1, float:2.93E-43)
            goto Lcf9
        L1a4:
            java.lang.String r0 = "TK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1ae
            goto Lcf9
        L1ae:
            r2 = 208(0xd0, float:2.91E-43)
            goto Lcf9
        L1b2:
            java.lang.String r0 = "TJ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1bc
            goto Lcf9
        L1bc:
            r2 = 207(0xcf, float:2.9E-43)
            goto Lcf9
        L1c0:
            java.lang.String r0 = "TH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1ca
            goto Lcf9
        L1ca:
            r2 = 206(0xce, float:2.89E-43)
            goto Lcf9
        L1ce:
            java.lang.String r0 = "TG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1d8
            goto Lcf9
        L1d8:
            r2 = 205(0xcd, float:2.87E-43)
            goto Lcf9
        L1dc:
            java.lang.String r0 = "TD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1e6
            goto Lcf9
        L1e6:
            r2 = 204(0xcc, float:2.86E-43)
            goto Lcf9
        L1ea:
            java.lang.String r0 = "TC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1f4
            goto Lcf9
        L1f4:
            r2 = 203(0xcb, float:2.84E-43)
            goto Lcf9
        L1f8:
            java.lang.String r0 = "SZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L202
            goto Lcf9
        L202:
            r2 = 202(0xca, float:2.83E-43)
            goto Lcf9
        L206:
            java.lang.String r0 = "SY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L210
            goto Lcf9
        L210:
            r2 = 201(0xc9, float:2.82E-43)
            goto Lcf9
        L214:
            java.lang.String r0 = "SX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L21e
            goto Lcf9
        L21e:
            r2 = 200(0xc8, float:2.8E-43)
            goto Lcf9
        L222:
            java.lang.String r0 = "SV"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L22c
            goto Lcf9
        L22c:
            r2 = 199(0xc7, float:2.79E-43)
            goto Lcf9
        L230:
            java.lang.String r0 = "ST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L23a
            goto Lcf9
        L23a:
            r2 = 198(0xc6, float:2.77E-43)
            goto Lcf9
        L23e:
            java.lang.String r0 = "SS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L248
            goto Lcf9
        L248:
            r2 = 197(0xc5, float:2.76E-43)
            goto Lcf9
        L24c:
            java.lang.String r0 = "SR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L256
            goto Lcf9
        L256:
            r2 = 196(0xc4, float:2.75E-43)
            goto Lcf9
        L25a:
            java.lang.String r0 = "SO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L264
            goto Lcf9
        L264:
            r2 = 195(0xc3, float:2.73E-43)
            goto Lcf9
        L268:
            java.lang.String r0 = "SN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L272
            goto Lcf9
        L272:
            r2 = 194(0xc2, float:2.72E-43)
            goto Lcf9
        L276:
            java.lang.String r0 = "SM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L280
            goto Lcf9
        L280:
            r2 = 193(0xc1, float:2.7E-43)
            goto Lcf9
        L284:
            java.lang.String r0 = "SL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L28e
            goto Lcf9
        L28e:
            r2 = 192(0xc0, float:2.69E-43)
            goto Lcf9
        L292:
            java.lang.String r0 = "SK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L29c
            goto Lcf9
        L29c:
            r2 = 191(0xbf, float:2.68E-43)
            goto Lcf9
        L2a0:
            java.lang.String r0 = "SJ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2aa
            goto Lcf9
        L2aa:
            r2 = 190(0xbe, float:2.66E-43)
            goto Lcf9
        L2ae:
            java.lang.String r0 = "SI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2b8
            goto Lcf9
        L2b8:
            r2 = 189(0xbd, float:2.65E-43)
            goto Lcf9
        L2bc:
            java.lang.String r0 = "SH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c6
            goto Lcf9
        L2c6:
            r2 = 188(0xbc, float:2.63E-43)
            goto Lcf9
        L2ca:
            java.lang.String r0 = "SG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2d4
            goto Lcf9
        L2d4:
            r2 = 187(0xbb, float:2.62E-43)
            goto Lcf9
        L2d8:
            java.lang.String r0 = "SE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2e2
            goto Lcf9
        L2e2:
            r2 = 186(0xba, float:2.6E-43)
            goto Lcf9
        L2e6:
            java.lang.String r0 = "SD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2f0
            goto Lcf9
        L2f0:
            r2 = 185(0xb9, float:2.59E-43)
            goto Lcf9
        L2f4:
            java.lang.String r0 = "SC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2fe
            goto Lcf9
        L2fe:
            r2 = 184(0xb8, float:2.58E-43)
            goto Lcf9
        L302:
            java.lang.String r0 = "SB"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L30c
            goto Lcf9
        L30c:
            r2 = 183(0xb7, float:2.56E-43)
            goto Lcf9
        L310:
            java.lang.String r0 = "SA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L31a
            goto Lcf9
        L31a:
            r2 = 182(0xb6, float:2.55E-43)
            goto Lcf9
        L31e:
            java.lang.String r0 = "RW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L328
            goto Lcf9
        L328:
            r2 = 181(0xb5, float:2.54E-43)
            goto Lcf9
        L32c:
            java.lang.String r0 = "RU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L336
            goto Lcf9
        L336:
            r2 = 180(0xb4, float:2.52E-43)
            goto Lcf9
        L33a:
            java.lang.String r0 = "RS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L344
            goto Lcf9
        L344:
            r2 = 179(0xb3, float:2.51E-43)
            goto Lcf9
        L348:
            java.lang.String r0 = "RO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L352
            goto Lcf9
        L352:
            r2 = 178(0xb2, float:2.5E-43)
            goto Lcf9
        L356:
            java.lang.String r0 = "RE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L360
            goto Lcf9
        L360:
            r2 = 177(0xb1, float:2.48E-43)
            goto Lcf9
        L364:
            java.lang.String r0 = "QA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36e
            goto Lcf9
        L36e:
            r2 = 176(0xb0, float:2.47E-43)
            goto Lcf9
        L372:
            java.lang.String r0 = "PY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37c
            goto Lcf9
        L37c:
            r2 = 175(0xaf, float:2.45E-43)
            goto Lcf9
        L380:
            java.lang.String r0 = "PW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38a
            goto Lcf9
        L38a:
            r2 = 174(0xae, float:2.44E-43)
            goto Lcf9
        L38e:
            java.lang.String r0 = "PT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L398
            goto Lcf9
        L398:
            r2 = 173(0xad, float:2.42E-43)
            goto Lcf9
        L39c:
            java.lang.String r0 = "PS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3a6
            goto Lcf9
        L3a6:
            r2 = 172(0xac, float:2.41E-43)
            goto Lcf9
        L3aa:
            java.lang.String r0 = "PR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3b4
            goto Lcf9
        L3b4:
            r2 = 171(0xab, float:2.4E-43)
            goto Lcf9
        L3b8:
            java.lang.String r0 = "PM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3c2
            goto Lcf9
        L3c2:
            r2 = 170(0xaa, float:2.38E-43)
            goto Lcf9
        L3c6:
            java.lang.String r0 = "PL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3d0
            goto Lcf9
        L3d0:
            r2 = 169(0xa9, float:2.37E-43)
            goto Lcf9
        L3d4:
            java.lang.String r0 = "PK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3de
            goto Lcf9
        L3de:
            r2 = 168(0xa8, float:2.35E-43)
            goto Lcf9
        L3e2:
            java.lang.String r0 = "PH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3ec
            goto Lcf9
        L3ec:
            r2 = 167(0xa7, float:2.34E-43)
            goto Lcf9
        L3f0:
            java.lang.String r0 = "PG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3fa
            goto Lcf9
        L3fa:
            r2 = 166(0xa6, float:2.33E-43)
            goto Lcf9
        L3fe:
            java.lang.String r0 = "PF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L408
            goto Lcf9
        L408:
            r2 = 165(0xa5, float:2.31E-43)
            goto Lcf9
        L40c:
            java.lang.String r0 = "PE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L416
            goto Lcf9
        L416:
            r2 = 164(0xa4, float:2.3E-43)
            goto Lcf9
        L41a:
            java.lang.String r0 = "PA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L424
            goto Lcf9
        L424:
            r2 = 163(0xa3, float:2.28E-43)
            goto Lcf9
        L428:
            java.lang.String r0 = "OM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L432
            goto Lcf9
        L432:
            r2 = 162(0xa2, float:2.27E-43)
            goto Lcf9
        L436:
            java.lang.String r0 = "NZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L440
            goto Lcf9
        L440:
            r2 = 161(0xa1, float:2.26E-43)
            goto Lcf9
        L444:
            java.lang.String r0 = "NU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44e
            goto Lcf9
        L44e:
            r2 = 160(0xa0, float:2.24E-43)
            goto Lcf9
        L452:
            java.lang.String r0 = "NR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L45c
            goto Lcf9
        L45c:
            r2 = 159(0x9f, float:2.23E-43)
            goto Lcf9
        L460:
            java.lang.String r0 = "NP"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46a
            goto Lcf9
        L46a:
            r2 = 158(0x9e, float:2.21E-43)
            goto Lcf9
        L46e:
            java.lang.String r0 = "NO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L478
            goto Lcf9
        L478:
            r2 = 157(0x9d, float:2.2E-43)
            goto Lcf9
        L47c:
            java.lang.String r0 = "NL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L486
            goto Lcf9
        L486:
            r2 = 156(0x9c, float:2.19E-43)
            goto Lcf9
        L48a:
            java.lang.String r0 = "NI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L494
            goto Lcf9
        L494:
            r2 = 155(0x9b, float:2.17E-43)
            goto Lcf9
        L498:
            java.lang.String r0 = "NG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4a2
            goto Lcf9
        L4a2:
            r2 = 154(0x9a, float:2.16E-43)
            goto Lcf9
        L4a6:
            java.lang.String r0 = "NE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4b0
            goto Lcf9
        L4b0:
            r2 = 153(0x99, float:2.14E-43)
            goto Lcf9
        L4b4:
            java.lang.String r0 = "NC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4be
            goto Lcf9
        L4be:
            r2 = 152(0x98, float:2.13E-43)
            goto Lcf9
        L4c2:
            java.lang.String r0 = "NA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4cc
            goto Lcf9
        L4cc:
            r2 = 151(0x97, float:2.12E-43)
            goto Lcf9
        L4d0:
            java.lang.String r0 = "MZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4da
            goto Lcf9
        L4da:
            r2 = 150(0x96, float:2.1E-43)
            goto Lcf9
        L4de:
            java.lang.String r0 = "MY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e8
            goto Lcf9
        L4e8:
            r2 = 149(0x95, float:2.09E-43)
            goto Lcf9
        L4ec:
            java.lang.String r0 = "MX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f6
            goto Lcf9
        L4f6:
            r2 = 148(0x94, float:2.07E-43)
            goto Lcf9
        L4fa:
            java.lang.String r0 = "MW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L504
            goto Lcf9
        L504:
            r2 = 147(0x93, float:2.06E-43)
            goto Lcf9
        L508:
            java.lang.String r0 = "MV"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L512
            goto Lcf9
        L512:
            r2 = 146(0x92, float:2.05E-43)
            goto Lcf9
        L516:
            java.lang.String r0 = "MU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L520
            goto Lcf9
        L520:
            r2 = 145(0x91, float:2.03E-43)
            goto Lcf9
        L524:
            java.lang.String r0 = "MT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L52e
            goto Lcf9
        L52e:
            r2 = 144(0x90, float:2.02E-43)
            goto Lcf9
        L532:
            java.lang.String r0 = "MS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L53c
            goto Lcf9
        L53c:
            r2 = 143(0x8f, float:2.0E-43)
            goto Lcf9
        L540:
            java.lang.String r0 = "MR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L54a
            goto Lcf9
        L54a:
            r2 = 142(0x8e, float:1.99E-43)
            goto Lcf9
        L54e:
            java.lang.String r0 = "MQ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L558
            goto Lcf9
        L558:
            r2 = 141(0x8d, float:1.98E-43)
            goto Lcf9
        L55c:
            java.lang.String r0 = "MP"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L566
            goto Lcf9
        L566:
            r2 = 140(0x8c, float:1.96E-43)
            goto Lcf9
        L56a:
            java.lang.String r0 = "MO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L574
            goto Lcf9
        L574:
            r2 = 139(0x8b, float:1.95E-43)
            goto Lcf9
        L578:
            java.lang.String r0 = "MN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L582
            goto Lcf9
        L582:
            r2 = 138(0x8a, float:1.93E-43)
            goto Lcf9
        L586:
            java.lang.String r0 = "MM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L590
            goto Lcf9
        L590:
            r2 = 137(0x89, float:1.92E-43)
            goto Lcf9
        L594:
            java.lang.String r0 = "ML"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L59e
            goto Lcf9
        L59e:
            r2 = 136(0x88, float:1.9E-43)
            goto Lcf9
        L5a2:
            java.lang.String r0 = "MK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5ac
            goto Lcf9
        L5ac:
            r2 = 135(0x87, float:1.89E-43)
            goto Lcf9
        L5b0:
            java.lang.String r0 = "MH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5ba
            goto Lcf9
        L5ba:
            r2 = 134(0x86, float:1.88E-43)
            goto Lcf9
        L5be:
            java.lang.String r0 = "MG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5c8
            goto Lcf9
        L5c8:
            r2 = 133(0x85, float:1.86E-43)
            goto Lcf9
        L5cc:
            java.lang.String r0 = "MF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5d6
            goto Lcf9
        L5d6:
            r2 = 132(0x84, float:1.85E-43)
            goto Lcf9
        L5da:
            java.lang.String r0 = "ME"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5e4
            goto Lcf9
        L5e4:
            r2 = 131(0x83, float:1.84E-43)
            goto Lcf9
        L5e8:
            java.lang.String r0 = "MD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5f2
            goto Lcf9
        L5f2:
            r2 = 130(0x82, float:1.82E-43)
            goto Lcf9
        L5f6:
            java.lang.String r0 = "MC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L600
            goto Lcf9
        L600:
            r2 = 129(0x81, float:1.81E-43)
            goto Lcf9
        L604:
            java.lang.String r0 = "MA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60e
            goto Lcf9
        L60e:
            r2 = 128(0x80, float:1.8E-43)
            goto Lcf9
        L612:
            java.lang.String r0 = "LY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L61c
            goto Lcf9
        L61c:
            r2 = 127(0x7f, float:1.78E-43)
            goto Lcf9
        L620:
            java.lang.String r0 = "LV"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L62a
            goto Lcf9
        L62a:
            r2 = 126(0x7e, float:1.77E-43)
            goto Lcf9
        L62e:
            java.lang.String r0 = "LU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L638
            goto Lcf9
        L638:
            r2 = 125(0x7d, float:1.75E-43)
            goto Lcf9
        L63c:
            java.lang.String r0 = "LT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L646
            goto Lcf9
        L646:
            r2 = 124(0x7c, float:1.74E-43)
            goto Lcf9
        L64a:
            java.lang.String r0 = "LS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L654
            goto Lcf9
        L654:
            r2 = 123(0x7b, float:1.72E-43)
            goto Lcf9
        L658:
            java.lang.String r0 = "LR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L662
            goto Lcf9
        L662:
            r2 = 122(0x7a, float:1.71E-43)
            goto Lcf9
        L666:
            java.lang.String r0 = "LK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L670
            goto Lcf9
        L670:
            r2 = 121(0x79, float:1.7E-43)
            goto Lcf9
        L674:
            java.lang.String r0 = "LI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L67e
            goto Lcf9
        L67e:
            r2 = 120(0x78, float:1.68E-43)
            goto Lcf9
        L682:
            java.lang.String r0 = "LC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L68c
            goto Lcf9
        L68c:
            r2 = 119(0x77, float:1.67E-43)
            goto Lcf9
        L690:
            java.lang.String r0 = "LB"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L69a
            goto Lcf9
        L69a:
            r2 = 118(0x76, float:1.65E-43)
            goto Lcf9
        L69e:
            java.lang.String r0 = "LA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a8
            goto Lcf9
        L6a8:
            r2 = 117(0x75, float:1.64E-43)
            goto Lcf9
        L6ac:
            java.lang.String r0 = "KZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6b6
            goto Lcf9
        L6b6:
            r2 = 116(0x74, float:1.63E-43)
            goto Lcf9
        L6ba:
            java.lang.String r0 = "KY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6c4
            goto Lcf9
        L6c4:
            r2 = 115(0x73, float:1.61E-43)
            goto Lcf9
        L6c8:
            java.lang.String r0 = "KW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6d2
            goto Lcf9
        L6d2:
            r2 = 114(0x72, float:1.6E-43)
            goto Lcf9
        L6d6:
            java.lang.String r0 = "KR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6e0
            goto Lcf9
        L6e0:
            r2 = 113(0x71, float:1.58E-43)
            goto Lcf9
        L6e4:
            java.lang.String r0 = "KN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6ee
            goto Lcf9
        L6ee:
            r2 = 112(0x70, float:1.57E-43)
            goto Lcf9
        L6f2:
            java.lang.String r0 = "KM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6fc
            goto Lcf9
        L6fc:
            r2 = 111(0x6f, float:1.56E-43)
            goto Lcf9
        L700:
            java.lang.String r0 = "KI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L70a
            goto Lcf9
        L70a:
            r2 = 110(0x6e, float:1.54E-43)
            goto Lcf9
        L70e:
            java.lang.String r0 = "KH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L718
            goto Lcf9
        L718:
            r2 = 109(0x6d, float:1.53E-43)
            goto Lcf9
        L71c:
            java.lang.String r0 = "KG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L726
            goto Lcf9
        L726:
            r2 = 108(0x6c, float:1.51E-43)
            goto Lcf9
        L72a:
            java.lang.String r0 = "KE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L734
            goto Lcf9
        L734:
            r2 = 107(0x6b, float:1.5E-43)
            goto Lcf9
        L738:
            java.lang.String r0 = "JP"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L742
            goto Lcf9
        L742:
            r2 = 106(0x6a, float:1.49E-43)
            goto Lcf9
        L746:
            java.lang.String r0 = "JO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L750
            goto Lcf9
        L750:
            r2 = 105(0x69, float:1.47E-43)
            goto Lcf9
        L754:
            java.lang.String r0 = "JM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L75e
            goto Lcf9
        L75e:
            r2 = 104(0x68, float:1.46E-43)
            goto Lcf9
        L762:
            java.lang.String r0 = "JE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L76c
            goto Lcf9
        L76c:
            r2 = 103(0x67, float:1.44E-43)
            goto Lcf9
        L770:
            java.lang.String r0 = "IT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L77a
            goto Lcf9
        L77a:
            r2 = 102(0x66, float:1.43E-43)
            goto Lcf9
        L77e:
            java.lang.String r0 = "IS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L788
            goto Lcf9
        L788:
            r2 = 101(0x65, float:1.42E-43)
            goto Lcf9
        L78c:
            java.lang.String r0 = "IR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L796
            goto Lcf9
        L796:
            r2 = 100
            goto Lcf9
        L79a:
            java.lang.String r0 = "IQ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7a4
            goto Lcf9
        L7a4:
            r2 = 99
            goto Lcf9
        L7a8:
            java.lang.String r0 = "IO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7b2
            goto Lcf9
        L7b2:
            r2 = 98
            goto Lcf9
        L7b6:
            java.lang.String r0 = "IN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7c0
            goto Lcf9
        L7c0:
            r2 = 97
            goto Lcf9
        L7c4:
            java.lang.String r0 = "IM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7ce
            goto Lcf9
        L7ce:
            r2 = 96
            goto Lcf9
        L7d2:
            java.lang.String r0 = "IL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7dc
            goto Lcf9
        L7dc:
            r2 = 95
            goto Lcf9
        L7e0:
            java.lang.String r0 = "IE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7ea
            goto Lcf9
        L7ea:
            r2 = 94
            goto Lcf9
        L7ee:
            java.lang.String r0 = "ID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7f8
            goto Lcf9
        L7f8:
            r2 = 93
            goto Lcf9
        L7fc:
            java.lang.String r0 = "HU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L806
            goto Lcf9
        L806:
            r2 = 92
            goto Lcf9
        L80a:
            java.lang.String r0 = "HT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L814
            goto Lcf9
        L814:
            r2 = 91
            goto Lcf9
        L818:
            java.lang.String r0 = "HR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L822
            goto Lcf9
        L822:
            r2 = 90
            goto Lcf9
        L826:
            java.lang.String r0 = "HN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L830
            goto Lcf9
        L830:
            r2 = 89
            goto Lcf9
        L834:
            java.lang.String r0 = "HK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L83e
            goto Lcf9
        L83e:
            r2 = 88
            goto Lcf9
        L842:
            java.lang.String r0 = "GY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L84c
            goto Lcf9
        L84c:
            r2 = 87
            goto Lcf9
        L850:
            java.lang.String r0 = "GW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L85a
            goto Lcf9
        L85a:
            r2 = 86
            goto Lcf9
        L85e:
            java.lang.String r0 = "GU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L868
            goto Lcf9
        L868:
            r2 = 85
            goto Lcf9
        L86c:
            java.lang.String r0 = "GT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L876
            goto Lcf9
        L876:
            r2 = 84
            goto Lcf9
        L87a:
            java.lang.String r0 = "GR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L884
            goto Lcf9
        L884:
            r2 = 83
            goto Lcf9
        L888:
            java.lang.String r0 = "GQ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L892
            goto Lcf9
        L892:
            r2 = 82
            goto Lcf9
        L896:
            java.lang.String r0 = "GP"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8a0
            goto Lcf9
        L8a0:
            r2 = 81
            goto Lcf9
        L8a4:
            java.lang.String r0 = "GN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8ae
            goto Lcf9
        L8ae:
            r2 = 80
            goto Lcf9
        L8b2:
            java.lang.String r0 = "GM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8bc
            goto Lcf9
        L8bc:
            r2 = 79
            goto Lcf9
        L8c0:
            java.lang.String r0 = "GL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8ca
            goto Lcf9
        L8ca:
            r2 = 78
            goto Lcf9
        L8ce:
            java.lang.String r0 = "GI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8d8
            goto Lcf9
        L8d8:
            r2 = 77
            goto Lcf9
        L8dc:
            java.lang.String r0 = "GH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8e6
            goto Lcf9
        L8e6:
            r2 = 76
            goto Lcf9
        L8ea:
            java.lang.String r0 = "GG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8f4
            goto Lcf9
        L8f4:
            r2 = 75
            goto Lcf9
        L8f8:
            java.lang.String r0 = "GF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L902
            goto Lcf9
        L902:
            r2 = 74
            goto Lcf9
        L906:
            java.lang.String r0 = "GE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L910
            goto Lcf9
        L910:
            r2 = 73
            goto Lcf9
        L914:
            java.lang.String r0 = "GD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L91e
            goto Lcf9
        L91e:
            r2 = 72
            goto Lcf9
        L922:
            java.lang.String r0 = "GB"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L92c
            goto Lcf9
        L92c:
            r2 = 71
            goto Lcf9
        L930:
            java.lang.String r0 = "GA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L93a
            goto Lcf9
        L93a:
            r2 = 70
            goto Lcf9
        L93e:
            java.lang.String r0 = "FR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L948
            goto Lcf9
        L948:
            r2 = 69
            goto Lcf9
        L94c:
            java.lang.String r0 = "FO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L956
            goto Lcf9
        L956:
            r2 = 68
            goto Lcf9
        L95a:
            java.lang.String r0 = "FM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L964
            goto Lcf9
        L964:
            r2 = 67
            goto Lcf9
        L968:
            java.lang.String r0 = "FJ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L972
            goto Lcf9
        L972:
            r2 = 66
            goto Lcf9
        L976:
            java.lang.String r0 = "FI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L980
            goto Lcf9
        L980:
            r2 = 65
            goto Lcf9
        L984:
            java.lang.String r0 = "ET"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L98e
            goto Lcf9
        L98e:
            r2 = 64
            goto Lcf9
        L992:
            java.lang.String r0 = "ES"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L99c
            goto Lcf9
        L99c:
            r2 = 63
            goto Lcf9
        L9a0:
            java.lang.String r0 = "ER"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9aa
            goto Lcf9
        L9aa:
            r2 = 62
            goto Lcf9
        L9ae:
            java.lang.String r0 = "EG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9b8
            goto Lcf9
        L9b8:
            r2 = 61
            goto Lcf9
        L9bc:
            java.lang.String r0 = "EE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9c6
            goto Lcf9
        L9c6:
            r2 = 60
            goto Lcf9
        L9ca:
            java.lang.String r0 = "EC"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9d4
            goto Lcf9
        L9d4:
            r2 = 59
            goto Lcf9
        L9d8:
            java.lang.String r0 = "DZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9e2
            goto Lcf9
        L9e2:
            r2 = 58
            goto Lcf9
        L9e6:
            java.lang.String r0 = "DO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9f0
            goto Lcf9
        L9f0:
            r2 = 57
            goto Lcf9
        L9f4:
            java.lang.String r0 = "DM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9fe
            goto Lcf9
        L9fe:
            r2 = 56
            goto Lcf9
        La02:
            java.lang.String r0 = "DK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La0c
            goto Lcf9
        La0c:
            r2 = 55
            goto Lcf9
        La10:
            java.lang.String r0 = "DJ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La1a
            goto Lcf9
        La1a:
            r2 = 54
            goto Lcf9
        La1e:
            java.lang.String r0 = "DE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La28
            goto Lcf9
        La28:
            r2 = 53
            goto Lcf9
        La2c:
            java.lang.String r0 = "CZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La36
            goto Lcf9
        La36:
            r2 = 52
            goto Lcf9
        La3a:
            java.lang.String r0 = "CY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La44
            goto Lcf9
        La44:
            r2 = 51
            goto Lcf9
        La48:
            java.lang.String r0 = "CX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La52
            goto Lcf9
        La52:
            r2 = 50
            goto Lcf9
        La56:
            java.lang.String r0 = "CW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La60
            goto Lcf9
        La60:
            r2 = 49
            goto Lcf9
        La64:
            java.lang.String r0 = "CV"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La6e
            goto Lcf9
        La6e:
            r2 = 48
            goto Lcf9
        La72:
            java.lang.String r0 = "CU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La7c
            goto Lcf9
        La7c:
            r2 = 47
            goto Lcf9
        La80:
            java.lang.String r0 = "CR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La8a
            goto Lcf9
        La8a:
            r2 = 46
            goto Lcf9
        La8e:
            java.lang.String r0 = "CO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La98
            goto Lcf9
        La98:
            r2 = 45
            goto Lcf9
        La9c:
            java.lang.String r0 = "CN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Laa6
            goto Lcf9
        Laa6:
            r2 = 44
            goto Lcf9
        Laaa:
            java.lang.String r0 = "CM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lab4
            goto Lcf9
        Lab4:
            r2 = 43
            goto Lcf9
        Lab8:
            java.lang.String r0 = "CL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lac2
            goto Lcf9
        Lac2:
            r2 = 42
            goto Lcf9
        Lac6:
            java.lang.String r0 = "CK"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lad0
            goto Lcf9
        Lad0:
            r2 = 41
            goto Lcf9
        Lad4:
            java.lang.String r0 = "CI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lade
            goto Lcf9
        Lade:
            r2 = 40
            goto Lcf9
        Lae2:
            java.lang.String r0 = "CH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Laec
            goto Lcf9
        Laec:
            r2 = 39
            goto Lcf9
        Laf0:
            java.lang.String r0 = "CG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lafa
            goto Lcf9
        Lafa:
            r2 = 38
            goto Lcf9
        Lafe:
            java.lang.String r0 = "CF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb08
            goto Lcf9
        Lb08:
            r2 = 37
            goto Lcf9
        Lb0c:
            java.lang.String r0 = "CD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb16
            goto Lcf9
        Lb16:
            r2 = 36
            goto Lcf9
        Lb1a:
            java.lang.String r0 = "CA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb24
            goto Lcf9
        Lb24:
            r2 = 35
            goto Lcf9
        Lb28:
            java.lang.String r0 = "BZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb32
            goto Lcf9
        Lb32:
            r2 = 34
            goto Lcf9
        Lb36:
            java.lang.String r0 = "BY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb40
            goto Lcf9
        Lb40:
            r2 = 33
            goto Lcf9
        Lb44:
            java.lang.String r0 = "BW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb4e
            goto Lcf9
        Lb4e:
            r2 = 32
            goto Lcf9
        Lb52:
            java.lang.String r0 = "BT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb5c
            goto Lcf9
        Lb5c:
            r2 = 31
            goto Lcf9
        Lb60:
            java.lang.String r0 = "BS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb6a
            goto Lcf9
        Lb6a:
            r2 = 30
            goto Lcf9
        Lb6e:
            java.lang.String r0 = "BR"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb78
            goto Lcf9
        Lb78:
            r2 = 29
            goto Lcf9
        Lb7c:
            java.lang.String r0 = "BQ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb86
            goto Lcf9
        Lb86:
            r2 = 28
            goto Lcf9
        Lb8a:
            java.lang.String r0 = "BO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb94
            goto Lcf9
        Lb94:
            r2 = 27
            goto Lcf9
        Lb98:
            java.lang.String r0 = "BN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lba2
            goto Lcf9
        Lba2:
            r2 = 26
            goto Lcf9
        Lba6:
            java.lang.String r0 = "BM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbb0
            goto Lcf9
        Lbb0:
            r2 = 25
            goto Lcf9
        Lbb4:
            java.lang.String r0 = "BL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbbe
            goto Lcf9
        Lbbe:
            r2 = 24
            goto Lcf9
        Lbc2:
            java.lang.String r0 = "BJ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbcc
            goto Lcf9
        Lbcc:
            r2 = 23
            goto Lcf9
        Lbd0:
            java.lang.String r0 = "BI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbda
            goto Lcf9
        Lbda:
            r2 = 22
            goto Lcf9
        Lbde:
            java.lang.String r0 = "BH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbe8
            goto Lcf9
        Lbe8:
            r2 = 21
            goto Lcf9
        Lbec:
            java.lang.String r0 = "BG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbf6
            goto Lcf9
        Lbf6:
            r2 = 20
            goto Lcf9
        Lbfa:
            java.lang.String r0 = "BF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc04
            goto Lcf9
        Lc04:
            r2 = 19
            goto Lcf9
        Lc08:
            java.lang.String r0 = "BE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc12
            goto Lcf9
        Lc12:
            r2 = 18
            goto Lcf9
        Lc16:
            java.lang.String r0 = "BD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc20
            goto Lcf9
        Lc20:
            r2 = 17
            goto Lcf9
        Lc24:
            java.lang.String r0 = "BB"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc2e
            goto Lcf9
        Lc2e:
            r2 = 16
            goto Lcf9
        Lc32:
            java.lang.String r0 = "BA"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc3c
            goto Lcf9
        Lc3c:
            r2 = 15
            goto Lcf9
        Lc40:
            java.lang.String r0 = "AZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc4a
            goto Lcf9
        Lc4a:
            r2 = 14
            goto Lcf9
        Lc4e:
            java.lang.String r0 = "AX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc58
            goto Lcf9
        Lc58:
            r2 = 13
            goto Lcf9
        Lc5c:
            java.lang.String r0 = "AW"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc66
            goto Lcf9
        Lc66:
            r2 = 12
            goto Lcf9
        Lc6a:
            java.lang.String r0 = "AU"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc74
            goto Lcf9
        Lc74:
            r2 = 11
            goto Lcf9
        Lc78:
            java.lang.String r0 = "AT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc82
            goto Lcf9
        Lc82:
            r2 = 10
            goto Lcf9
        Lc86:
            java.lang.String r0 = "AS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc90
            goto Lcf9
        Lc90:
            r2 = 9
            goto Lcf9
        Lc94:
            java.lang.String r0 = "AQ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc9e
            goto Lcf9
        Lc9e:
            r2 = 8
            goto Lcf9
        Lca2:
            java.lang.String r0 = "AO"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcab
            goto Lcf9
        Lcab:
            r2 = 7
            goto Lcf9
        Lcad:
            java.lang.String r0 = "AM"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcb6
            goto Lcf9
        Lcb6:
            r2 = 6
            goto Lcf9
        Lcb8:
            java.lang.String r0 = "AL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcc1
            goto Lcf9
        Lcc1:
            r2 = 5
            goto Lcf9
        Lcc3:
            java.lang.String r0 = "AI"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lccc
            goto Lcf9
        Lccc:
            r2 = 4
            goto Lcf9
        Lcce:
            java.lang.String r0 = "AG"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcd7
            goto Lcf9
        Lcd7:
            r2 = 3
            goto Lcf9
        Lcd9:
            java.lang.String r0 = "AF"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lce2
            goto Lcf9
        Lce2:
            r2 = 2
            goto Lcf9
        Lce4:
            java.lang.String r0 = "AE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lced
            goto Lcf9
        Lced:
            r2 = 1
            goto Lcf9
        Lcef:
            java.lang.String r0 = "AD"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcf8
            goto Lcf9
        Lcf8:
            r2 = 0
        Lcf9:
            switch(r2) {
                case 0: goto L10e0;
                case 1: goto L10da;
                case 2: goto L10d4;
                case 3: goto L10ce;
                case 4: goto L10c8;
                case 5: goto L10c2;
                case 6: goto L10bc;
                case 7: goto L10b6;
                case 8: goto L10b0;
                case 9: goto L10aa;
                case 10: goto L10a4;
                case 11: goto L109e;
                case 12: goto L1098;
                case 13: goto L1092;
                case 14: goto L108c;
                case 15: goto L1086;
                case 16: goto L10c8;
                case 17: goto L1080;
                case 18: goto L107a;
                case 19: goto L108c;
                case 20: goto L1074;
                case 21: goto L106e;
                case 22: goto L1068;
                case 23: goto L1062;
                case 24: goto L105c;
                case 25: goto L10c8;
                case 26: goto L1056;
                case 27: goto L1050;
                case 28: goto L10c8;
                case 29: goto L104a;
                case 30: goto L1044;
                case 31: goto L103e;
                case 32: goto L1038;
                case 33: goto L1032;
                case 34: goto L102c;
                case 35: goto L1026;
                case 36: goto L1020;
                case 37: goto L101a;
                case 38: goto L1014;
                case 39: goto L100e;
                case 40: goto L1008;
                case 41: goto L102c;
                case 42: goto L1002;
                case 43: goto Lffc;
                case 44: goto Lff6;
                case 45: goto Lff0;
                case 46: goto Lfea;
                case 47: goto Lfe4;
                case 48: goto Lfde;
                case 49: goto L10e0;
                case 50: goto L1092;
                case 51: goto Lfd8;
                case 52: goto Lfd2;
                case 53: goto Lfcc;
                case 54: goto Lfc6;
                case 55: goto Lfc0;
                case 56: goto L10c8;
                case 57: goto Lfba;
                case 58: goto L108c;
                case 59: goto Lfb4;
                case 60: goto Lfc0;
                case 61: goto L1008;
                case 62: goto L10b0;
                case 63: goto L1074;
                case 64: goto Lfae;
                case 65: goto Lfa8;
                case 66: goto Lfa2;
                case 67: goto Lf9c;
                case 68: goto L10c8;
                case 69: goto Lf96;
                case 70: goto Lf90;
                case 71: goto Lf8a;
                case 72: goto Lf84;
                case 73: goto Lf7e;
                case 74: goto Lf78;
                case 75: goto Lf72;
                case 76: goto L1014;
                case 77: goto Lf6c;
                case 78: goto Lf66;
                case 79: goto Lf60;
                case 80: goto Lf5a;
                case 81: goto Lf54;
                case 82: goto Lf4e;
                case 83: goto L1074;
                case 84: goto Lf48;
                case 85: goto L1098;
                case 86: goto Lf42;
                case 87: goto Lf3c;
                case 88: goto Lf36;
                case 89: goto Lf30;
                case 90: goto Lfd8;
                case 91: goto L1068;
                case 92: goto Lfc0;
                case 93: goto Lf2a;
                case 94: goto L1086;
                case 95: goto Lf24;
                case 96: goto Lf1e;
                case 97: goto Lf18;
                case 98: goto Lf12;
                case 99: goto Lf0c;
                case 100: goto Lf06;
                case 101: goto Lf00;
                case 102: goto Lefa;
                case 103: goto Lf6c;
                case 104: goto Lef4;
                case 105: goto Leee;
                case 106: goto Lee8;
                case 107: goto Lee2;
                case 108: goto Ledc;
                case 109: goto Led6;
                case 110: goto Lfe4;
                case 111: goto L1020;
                case 112: goto Lf84;
                case 113: goto Led0;
                case 114: goto Leca;
                case 115: goto Lf84;
                case 116: goto L1080;
                case 117: goto Lec4;
                case 118: goto L1044;
                case 119: goto Lf84;
                case 120: goto L1092;
                case 121: goto Lebe;
                case 122: goto Leb8;
                case 123: goto Leb2;
                case 124: goto Lfc0;
                case 125: goto Leac;
                case 126: goto Lfd8;
                case 127: goto Lea6;
                case 128: goto Lea0;
                case 129: goto Le9a;
                case 130: goto Le94;
                case 131: goto Le8e;
                case 132: goto L105c;
                case 133: goto L1068;
                case 134: goto Le88;
                case 135: goto Le82;
                case 136: goto Le7c;
                case 137: goto Le76;
                case 138: goto Le70;
                case 139: goto Le6a;
                case 140: goto L1092;
                case 141: goto Ledc;
                case 142: goto Le64;
                case 143: goto L1092;
                case 144: goto Lfc0;
                case 145: goto Le5e;
                case 146: goto Le58;
                case 147: goto Le52;
                case 148: goto Le4c;
                case 149: goto Le46;
                case 150: goto L103e;
                case 151: goto Le40;
                case 152: goto Le3a;
                case 153: goto L1068;
                case 154: goto Le34;
                case 155: goto Le2e;
                case 156: goto Le28;
                case 157: goto Le22;
                case 158: goto Le1c;
                case 159: goto Le16;
                case 160: goto Le10;
                case 161: goto Le0a;
                case 162: goto Le04;
                case 163: goto Ldfe;
                case 164: goto Ldf8;
                case 165: goto Ldf2;
                case 166: goto L10d4;
                case 167: goto Ldec;
                case 168: goto Lf78;
                case 169: goto Lde6;
                case 170: goto L1092;
                case 171: goto Lde0;
                case 172: goto Ldda;
                case 173: goto Ldd4;
                case 174: goto Ldce;
                case 175: goto L105c;
                case 176: goto Ldc8;
                case 177: goto Ldc2;
                case 178: goto Ldbc;
                case 179: goto Ldb6;
                case 180: goto Ldb0;
                case 181: goto Ldaa;
                case 182: goto Le5e;
                case 183: goto L101a;
                case 184: goto Lda4;
                case 185: goto Ld9e;
                case 186: goto Ld98;
                case 187: goto Ld92;
                case 188: goto L10b0;
                case 189: goto L1074;
                case 190: goto Lf0c;
                case 191: goto Ld8c;
                case 192: goto Lf78;
                case 193: goto L1092;
                case 194: goto Lfae;
                case 195: goto Ld86;
                case 196: goto Ld80;
                case 197: goto Ld7a;
                case 198: goto Ld74;
                case 199: goto Ldf2;
                case 200: goto Lf84;
                case 201: goto Lfc6;
                case 202: goto Ld6e;
                case 203: goto Ld68;
                case 204: goto L1068;
                case 205: goto Lf90;
                case 206: goto Ld62;
                case 207: goto Lfc6;
                case 208: goto Lf66;
                case 209: goto Ld5c;
                case 210: goto Ld7a;
                case 211: goto Ld56;
                case 212: goto Lea6;
                case 213: goto Ld50;
                case 214: goto Ld4a;
                case 215: goto Lf12;
                case 216: goto Ld44;
                case 217: goto Le7c;
                case 218: goto Ld3e;
                case 219: goto Leb2;
                case 220: goto Ld38;
                case 221: goto Ld56;
                case 222: goto Ld32;
                case 223: goto L1092;
                case 224: goto Lf84;
                case 225: goto L1068;
                case 226: goto Ld2c;
                case 227: goto Ld26;
                case 228: goto Ld20;
                case 229: goto Ld1a;
                case 230: goto Lf12;
                case 231: goto L103e;
                case 232: goto Ld14;
                case 233: goto L1068;
                case 234: goto Ld0e;
                case 235: goto Ld08;
                case 236: goto Ld02;
                case 237: goto Lea6;
                default: goto Lcfc;
            }
        Lcfc:
            int[] r3 = new int[r1]
            r3 = {x1680: FILL_ARRAY_DATA , data: [2, 2, 2, 2, 2, 2} // fill-array
            return r3
        Ld02:
            int[] r3 = new int[r1]
            r3 = {x1690: FILL_ARRAY_DATA , data: [4, 4, 4, 3, 3, 2} // fill-array
            return r3
        Ld08:
            int[] r3 = new int[r1]
            r3 = {x16a0: FILL_ARRAY_DATA , data: [2, 3, 2, 1, 2, 2} // fill-array
            return r3
        Ld0e:
            int[] r3 = new int[r1]
            r3 = {x16b0: FILL_ARRAY_DATA , data: [2, 3, 3, 4, 2, 2} // fill-array
            return r3
        Ld14:
            int[] r3 = new int[r1]
            r3 = {x16c0: FILL_ARRAY_DATA , data: [1, 2, 1, 1, 2, 2} // fill-array
            return r3
        Ld1a:
            int[] r3 = new int[r1]
            r3 = {x16d0: FILL_ARRAY_DATA , data: [4, 3, 3, 1, 2, 2} // fill-array
            return r3
        Ld20:
            int[] r3 = new int[r1]
            r3 = {x16e0: FILL_ARRAY_DATA , data: [0, 0, 1, 2, 2, 1} // fill-array
            return r3
        Ld26:
            int[] r3 = new int[r1]
            r3 = {x16f0: FILL_ARRAY_DATA , data: [0, 2, 1, 2, 2, 2} // fill-array
            return r3
        Ld2c:
            int[] r3 = new int[r1]
            r3 = {x1700: FILL_ARRAY_DATA , data: [2, 2, 0, 1, 2, 2} // fill-array
            return r3
        Ld32:
            int[] r3 = new int[r1]
            r3 = {x1710: FILL_ARRAY_DATA , data: [2, 2, 3, 4, 3, 2} // fill-array
            return r3
        Ld38:
            int[] r3 = new int[r1]
            r3 = {x1720: FILL_ARRAY_DATA , data: [1, 1, 4, 1, 3, 1} // fill-array
            return r3
        Ld3e:
            int[] r3 = new int[r1]
            r3 = {x1730: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 2} // fill-array
            return r3
        Ld44:
            int[] r3 = new int[r1]
            r3 = {x1740: FILL_ARRAY_DATA , data: [0, 2, 0, 0, 0, 0} // fill-array
            return r3
        Ld4a:
            int[] r3 = new int[r1]
            r3 = {x1750: FILL_ARRAY_DATA , data: [1, 4, 0, 0, 2, 2} // fill-array
            return r3
        Ld50:
            int[] r3 = new int[r1]
            r3 = {x1760: FILL_ARRAY_DATA , data: [1, 0, 0, 1, 3, 2} // fill-array
            return r3
        Ld56:
            int[] r3 = new int[r1]
            r3 = {x1770: FILL_ARRAY_DATA , data: [2, 1, 1, 1, 2, 2} // fill-array
            return r3
        Ld5c:
            int[] r3 = new int[r1]
            r3 = {x1780: FILL_ARRAY_DATA , data: [4, 2, 4, 4, 2, 2} // fill-array
            return r3
        Ld62:
            int[] r3 = new int[r1]
            r3 = {x1790: FILL_ARRAY_DATA , data: [0, 1, 2, 1, 2, 2} // fill-array
            return r3
        Ld68:
            int[] r3 = new int[r1]
            r3 = {x17a0: FILL_ARRAY_DATA , data: [2, 2, 1, 3, 2, 2} // fill-array
            return r3
        Ld6e:
            int[] r3 = new int[r1]
            r3 = {x17b0: FILL_ARRAY_DATA , data: [4, 4, 3, 4, 2, 2} // fill-array
            return r3
        Ld74:
            int[] r3 = new int[r1]
            r3 = {x17c0: FILL_ARRAY_DATA , data: [2, 2, 1, 2, 2, 2} // fill-array
            return r3
        Ld7a:
            int[] r3 = new int[r1]
            r3 = {x17d0: FILL_ARRAY_DATA , data: [4, 2, 2, 3, 2, 2} // fill-array
            return r3
        Ld80:
            int[] r3 = new int[r1]
            r3 = {x17e0: FILL_ARRAY_DATA , data: [2, 4, 3, 0, 2, 2} // fill-array
            return r3
        Ld86:
            int[] r3 = new int[r1]
            r3 = {x17f0: FILL_ARRAY_DATA , data: [3, 2, 2, 4, 4, 2} // fill-array
            return r3
        Ld8c:
            int[] r3 = new int[r1]
            r3 = {x1800: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 3, 2} // fill-array
            return r3
        Ld92:
            int[] r3 = new int[r1]
            r3 = {x1810: FILL_ARRAY_DATA , data: [2, 3, 3, 3, 3, 3} // fill-array
            return r3
        Ld98:
            int[] r3 = new int[r1]
            r3 = {x1820: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 0, 2} // fill-array
            return r3
        Ld9e:
            int[] r3 = new int[r1]
            r3 = {x1830: FILL_ARRAY_DATA , data: [4, 3, 4, 2, 2, 2} // fill-array
            return r3
        Lda4:
            int[] r3 = new int[r1]
            r3 = {x1840: FILL_ARRAY_DATA , data: [4, 3, 1, 1, 2, 2} // fill-array
            return r3
        Ldaa:
            int[] r3 = new int[r1]
            r3 = {x1850: FILL_ARRAY_DATA , data: [3, 3, 1, 0, 2, 2} // fill-array
            return r3
        Ldb0:
            int[] r3 = new int[r1]
            r3 = {x1860: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 3, 3} // fill-array
            return r3
        Ldb6:
            int[] r3 = new int[r1]
            r3 = {x1870: FILL_ARRAY_DATA , data: [2, 0, 0, 0, 2, 2} // fill-array
            return r3
        Ldbc:
            int[] r3 = new int[r1]
            r3 = {x1880: FILL_ARRAY_DATA , data: [0, 0, 1, 2, 1, 2} // fill-array
            return r3
        Ldc2:
            int[] r3 = new int[r1]
            r3 = {x1890: FILL_ARRAY_DATA , data: [1, 2, 2, 3, 1, 2} // fill-array
            return r3
        Ldc8:
            int[] r3 = new int[r1]
            r3 = {x18a0: FILL_ARRAY_DATA , data: [1, 4, 4, 4, 4, 2} // fill-array
            return r3
        Ldce:
            int[] r3 = new int[r1]
            r3 = {x18b0: FILL_ARRAY_DATA , data: [2, 2, 4, 2, 2, 2} // fill-array
            return r3
        Ldd4:
            int[] r3 = new int[r1]
            r3 = {x18c0: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 1, 2} // fill-array
            return r3
        Ldda:
            int[] r3 = new int[r1]
            r3 = {x18d0: FILL_ARRAY_DATA , data: [3, 4, 1, 4, 2, 2} // fill-array
            return r3
        Lde0:
            int[] r3 = new int[r1]
            r3 = {x18e0: FILL_ARRAY_DATA , data: [2, 0, 2, 0, 2, 1} // fill-array
            return r3
        Lde6:
            int[] r3 = new int[r1]
            r3 = {x18f0: FILL_ARRAY_DATA , data: [2, 1, 2, 2, 4, 2} // fill-array
            return r3
        Ldec:
            int[] r3 = new int[r1]
            r3 = {x1900: FILL_ARRAY_DATA , data: [2, 1, 3, 2, 2, 0} // fill-array
            return r3
        Ldf2:
            int[] r3 = new int[r1]
            r3 = {x1910: FILL_ARRAY_DATA , data: [2, 3, 3, 1, 2, 2} // fill-array
            return r3
        Ldf8:
            int[] r3 = new int[r1]
            r3 = {x1920: FILL_ARRAY_DATA , data: [1, 2, 4, 4, 3, 2} // fill-array
            return r3
        Ldfe:
            int[] r3 = new int[r1]
            r3 = {x1930: FILL_ARRAY_DATA , data: [2, 3, 3, 3, 2, 2} // fill-array
            return r3
        Le04:
            int[] r3 = new int[r1]
            r3 = {x1940: FILL_ARRAY_DATA , data: [2, 3, 1, 3, 4, 2} // fill-array
            return r3
        Le0a:
            int[] r3 = new int[r1]
            r3 = {x1950: FILL_ARRAY_DATA , data: [1, 0, 2, 2, 4, 2} // fill-array
            return r3
        Le10:
            int[] r3 = new int[r1]
            r3 = {x1960: FILL_ARRAY_DATA , data: [4, 2, 2, 1, 2, 2} // fill-array
            return r3
        Le16:
            int[] r3 = new int[r1]
            r3 = {x1970: FILL_ARRAY_DATA , data: [4, 0, 3, 2, 2, 2} // fill-array
            return r3
        Le1c:
            int[] r3 = new int[r1]
            r3 = {x1980: FILL_ARRAY_DATA , data: [2, 1, 4, 3, 2, 2} // fill-array
            return r3
        Le22:
            int[] r3 = new int[r1]
            r3 = {x1990: FILL_ARRAY_DATA , data: [0, 1, 2, 1, 1, 2} // fill-array
            return r3
        Le28:
            int[] r3 = new int[r1]
            r3 = {x19a0: FILL_ARRAY_DATA , data: [0, 2, 3, 3, 0, 4} // fill-array
            return r3
        Le2e:
            int[] r3 = new int[r1]
            r3 = {x19b0: FILL_ARRAY_DATA , data: [2, 3, 4, 3, 2, 2} // fill-array
            return r3
        Le34:
            int[] r3 = new int[r1]
            r3 = {x19c0: FILL_ARRAY_DATA , data: [3, 4, 2, 1, 2, 2} // fill-array
            return r3
        Le3a:
            int[] r3 = new int[r1]
            r3 = {x19d0: FILL_ARRAY_DATA , data: [3, 2, 3, 4, 2, 2} // fill-array
            return r3
        Le40:
            int[] r3 = new int[r1]
            r3 = {x19e0: FILL_ARRAY_DATA , data: [3, 4, 3, 2, 2, 2} // fill-array
            return r3
        Le46:
            int[] r3 = new int[r1]
            r3 = {x19f0: FILL_ARRAY_DATA , data: [1, 0, 4, 1, 2, 2} // fill-array
            return r3
        Le4c:
            int[] r3 = new int[r1]
            r3 = {x1a00: FILL_ARRAY_DATA , data: [3, 4, 4, 4, 2, 2} // fill-array
            return r3
        Le52:
            int[] r3 = new int[r1]
            r3 = {x1a10: FILL_ARRAY_DATA , data: [4, 2, 3, 3, 2, 2} // fill-array
            return r3
        Le58:
            int[] r3 = new int[r1]
            r3 = {x1a20: FILL_ARRAY_DATA , data: [3, 4, 1, 3, 3, 2} // fill-array
            return r3
        Le5e:
            int[] r3 = new int[r1]
            r3 = {x1a30: FILL_ARRAY_DATA , data: [3, 1, 1, 2, 2, 2} // fill-array
            return r3
        Le64:
            int[] r3 = new int[r1]
            r3 = {x1a40: FILL_ARRAY_DATA , data: [4, 2, 3, 4, 2, 2} // fill-array
            return r3
        Le6a:
            int[] r3 = new int[r1]
            r3 = {x1a50: FILL_ARRAY_DATA , data: [0, 2, 4, 4, 4, 2} // fill-array
            return r3
        Le70:
            int[] r3 = new int[r1]
            r3 = {x1a60: FILL_ARRAY_DATA , data: [2, 0, 1, 2, 2, 2} // fill-array
            return r3
        Le76:
            int[] r3 = new int[r1]
            r3 = {x1a70: FILL_ARRAY_DATA , data: [2, 2, 2, 3, 4, 2} // fill-array
            return r3
        Le7c:
            int[] r3 = new int[r1]
            r3 = {x1a80: FILL_ARRAY_DATA , data: [3, 4, 2, 2, 2, 2} // fill-array
            return r3
        Le82:
            int[] r3 = new int[r1]
            r3 = {x1a90: FILL_ARRAY_DATA , data: [2, 0, 0, 1, 3, 2} // fill-array
            return r3
        Le88:
            int[] r3 = new int[r1]
            r3 = {x1aa0: FILL_ARRAY_DATA , data: [4, 2, 1, 3, 2, 2} // fill-array
            return r3
        Le8e:
            int[] r3 = new int[r1]
            r3 = {x1ab0: FILL_ARRAY_DATA , data: [2, 0, 0, 1, 1, 2} // fill-array
            return r3
        Le94:
            int[] r3 = new int[r1]
            r3 = {x1ac0: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 2, 2} // fill-array
            return r3
        Le9a:
            int[] r3 = new int[r1]
            r3 = {x1ad0: FILL_ARRAY_DATA , data: [0, 2, 2, 0, 2, 2} // fill-array
            return r3
        Lea0:
            int[] r3 = new int[r1]
            r3 = {x1ae0: FILL_ARRAY_DATA , data: [3, 3, 2, 1, 2, 2} // fill-array
            return r3
        Lea6:
            int[] r3 = new int[r1]
            r3 = {x1af0: FILL_ARRAY_DATA , data: [3, 2, 4, 3, 2, 2} // fill-array
            return r3
        Leac:
            int[] r3 = new int[r1]
            r3 = {x1b00: FILL_ARRAY_DATA , data: [1, 1, 4, 2, 0, 2} // fill-array
            return r3
        Leb2:
            int[] r3 = new int[r1]
            r3 = {x1b10: FILL_ARRAY_DATA , data: [3, 3, 3, 2, 2, 2} // fill-array
            return r3
        Leb8:
            int[] r3 = new int[r1]
            r3 = {x1b20: FILL_ARRAY_DATA , data: [3, 4, 3, 4, 2, 2} // fill-array
            return r3
        Lebe:
            int[] r3 = new int[r1]
            r3 = {x1b30: FILL_ARRAY_DATA , data: [3, 2, 3, 4, 4, 2} // fill-array
            return r3
        Lec4:
            int[] r3 = new int[r1]
            r3 = {x1b40: FILL_ARRAY_DATA , data: [1, 2, 1, 3, 2, 2} // fill-array
            return r3
        Leca:
            int[] r3 = new int[r1]
            r3 = {x1b50: FILL_ARRAY_DATA , data: [1, 0, 1, 0, 0, 2} // fill-array
            return r3
        Led0:
            int[] r3 = new int[r1]
            r3 = {x1b60: FILL_ARRAY_DATA , data: [0, 2, 2, 4, 4, 4} // fill-array
            return r3
        Led6:
            int[] r3 = new int[r1]
            r3 = {x1b70: FILL_ARRAY_DATA , data: [1, 0, 4, 2, 2, 2} // fill-array
            return r3
        Ledc:
            int[] r3 = new int[r1]
            r3 = {x1b80: FILL_ARRAY_DATA , data: [2, 1, 1, 2, 2, 2} // fill-array
            return r3
        Lee2:
            int[] r3 = new int[r1]
            r3 = {x1b90: FILL_ARRAY_DATA , data: [3, 2, 2, 1, 2, 2} // fill-array
            return r3
        Lee8:
            int[] r3 = new int[r1]
            r3 = {x1ba0: FILL_ARRAY_DATA , data: [0, 3, 3, 3, 4, 4} // fill-array
            return r3
        Leee:
            int[] r3 = new int[r1]
            r3 = {x1bb0: FILL_ARRAY_DATA , data: [2, 0, 1, 1, 2, 2} // fill-array
            return r3
        Lef4:
            int[] r3 = new int[r1]
            r3 = {x1bc0: FILL_ARRAY_DATA , data: [2, 4, 2, 1, 2, 2} // fill-array
            return r3
        Lefa:
            int[] r3 = new int[r1]
            r3 = {x1bd0: FILL_ARRAY_DATA , data: [0, 0, 1, 1, 1, 2} // fill-array
            return r3
        Lf00:
            int[] r3 = new int[r1]
            r3 = {x1be0: FILL_ARRAY_DATA , data: [0, 0, 1, 0, 0, 2} // fill-array
            return r3
        Lf06:
            int[] r3 = new int[r1]
            r3 = {x1bf0: FILL_ARRAY_DATA , data: [4, 2, 3, 3, 4, 2} // fill-array
            return r3
        Lf0c:
            int[] r3 = new int[r1]
            r3 = {x1c00: FILL_ARRAY_DATA , data: [3, 2, 2, 2, 2, 2} // fill-array
            return r3
        Lf12:
            int[] r3 = new int[r1]
            r3 = {x1c10: FILL_ARRAY_DATA , data: [4, 2, 2, 4, 2, 2} // fill-array
            return r3
        Lf18:
            int[] r3 = new int[r1]
            r3 = {x1c20: FILL_ARRAY_DATA , data: [1, 1, 2, 1, 2, 1} // fill-array
            return r3
        Lf1e:
            int[] r3 = new int[r1]
            r3 = {x1c30: FILL_ARRAY_DATA , data: [0, 2, 0, 1, 2, 2} // fill-array
            return r3
        Lf24:
            int[] r3 = new int[r1]
            r3 = {x1c40: FILL_ARRAY_DATA , data: [1, 2, 2, 3, 4, 2} // fill-array
            return r3
        Lf2a:
            int[] r3 = new int[r1]
            r3 = {x1c50: FILL_ARRAY_DATA , data: [3, 1, 1, 2, 3, 2} // fill-array
            return r3
        Lf30:
            int[] r3 = new int[r1]
            r3 = {x1c60: FILL_ARRAY_DATA , data: [3, 3, 2, 2, 2, 2} // fill-array
            return r3
        Lf36:
            int[] r3 = new int[r1]
            r3 = {x1c70: FILL_ARRAY_DATA , data: [0, 1, 1, 3, 2, 0} // fill-array
            return r3
        Lf3c:
            int[] r3 = new int[r1]
            r3 = {x1c80: FILL_ARRAY_DATA , data: [3, 0, 1, 1, 2, 2} // fill-array
            return r3
        Lf42:
            int[] r3 = new int[r1]
            r3 = {x1c90: FILL_ARRAY_DATA , data: [4, 4, 2, 2, 2, 2} // fill-array
            return r3
        Lf48:
            int[] r3 = new int[r1]
            r3 = {x1ca0: FILL_ARRAY_DATA , data: [2, 2, 2, 1, 1, 2} // fill-array
            return r3
        Lf4e:
            int[] r3 = new int[r1]
            r3 = {x1cb0: FILL_ARRAY_DATA , data: [4, 4, 3, 3, 2, 2} // fill-array
            return r3
        Lf54:
            int[] r3 = new int[r1]
            r3 = {x1cc0: FILL_ARRAY_DATA , data: [3, 1, 1, 3, 2, 2} // fill-array
            return r3
        Lf5a:
            int[] r3 = new int[r1]
            r3 = {x1cd0: FILL_ARRAY_DATA , data: [4, 4, 4, 2, 2, 2} // fill-array
            return r3
        Lf60:
            int[] r3 = new int[r1]
            r3 = {x1ce0: FILL_ARRAY_DATA , data: [4, 3, 2, 4, 2, 2} // fill-array
            return r3
        Lf66:
            int[] r3 = new int[r1]
            r3 = {x1cf0: FILL_ARRAY_DATA , data: [2, 2, 2, 4, 2, 2} // fill-array
            return r3
        Lf6c:
            int[] r3 = new int[r1]
            r3 = {x1d00: FILL_ARRAY_DATA , data: [1, 2, 0, 1, 2, 2} // fill-array
            return r3
        Lf72:
            int[] r3 = new int[r1]
            r3 = {x1d10: FILL_ARRAY_DATA , data: [0, 2, 1, 0, 2, 2} // fill-array
            return r3
        Lf78:
            int[] r3 = new int[r1]
            r3 = {x1d20: FILL_ARRAY_DATA , data: [3, 2, 3, 3, 2, 2} // fill-array
            return r3
        Lf7e:
            int[] r3 = new int[r1]
            r3 = {x1d30: FILL_ARRAY_DATA , data: [1, 0, 0, 2, 2, 2} // fill-array
            return r3
        Lf84:
            int[] r3 = new int[r1]
            r3 = {x1d40: FILL_ARRAY_DATA , data: [1, 2, 0, 0, 2, 2} // fill-array
            return r3
        Lf8a:
            int[] r3 = new int[r1]
            r3 = {x1d50: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 1, 2} // fill-array
            return r3
        Lf90:
            int[] r3 = new int[r1]
            r3 = {x1d60: FILL_ARRAY_DATA , data: [3, 4, 1, 0, 2, 2} // fill-array
            return r3
        Lf96:
            int[] r3 = new int[r1]
            r3 = {x1d70: FILL_ARRAY_DATA , data: [1, 1, 2, 1, 1, 2} // fill-array
            return r3
        Lf9c:
            int[] r3 = new int[r1]
            r3 = {x1d80: FILL_ARRAY_DATA , data: [4, 2, 3, 0, 2, 2} // fill-array
            return r3
        Lfa2:
            int[] r3 = new int[r1]
            r3 = {x1d90: FILL_ARRAY_DATA , data: [3, 1, 2, 3, 2, 2} // fill-array
            return r3
        Lfa8:
            int[] r3 = new int[r1]
            r3 = {x1da0: FILL_ARRAY_DATA , data: [0, 0, 0, 2, 0, 2} // fill-array
            return r3
        Lfae:
            int[] r3 = new int[r1]
            r3 = {x1db0: FILL_ARRAY_DATA , data: [4, 4, 3, 2, 2, 2} // fill-array
            return r3
        Lfb4:
            int[] r3 = new int[r1]
            r3 = {x1dc0: FILL_ARRAY_DATA , data: [1, 3, 2, 1, 2, 2} // fill-array
            return r3
        Lfba:
            int[] r3 = new int[r1]
            r3 = {x1dd0: FILL_ARRAY_DATA , data: [3, 4, 4, 4, 4, 2} // fill-array
            return r3
        Lfc0:
            int[] r3 = new int[r1]
            r3 = {x1de0: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 2} // fill-array
            return r3
        Lfc6:
            int[] r3 = new int[r1]
            r3 = {x1df0: FILL_ARRAY_DATA , data: [4, 3, 4, 4, 2, 2} // fill-array
            return r3
        Lfcc:
            int[] r3 = new int[r1]
            r3 = {x1e00: FILL_ARRAY_DATA , data: [0, 1, 3, 2, 2, 2} // fill-array
            return r3
        Lfd2:
            int[] r3 = new int[r1]
            r3 = {x1e10: FILL_ARRAY_DATA , data: [0, 0, 2, 0, 1, 2} // fill-array
            return r3
        Lfd8:
            int[] r3 = new int[r1]
            r3 = {x1e20: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 2} // fill-array
            return r3
        Lfde:
            int[] r3 = new int[r1]
            r3 = {x1e30: FILL_ARRAY_DATA , data: [2, 3, 0, 1, 2, 2} // fill-array
            return r3
        Lfe4:
            int[] r3 = new int[r1]
            r3 = {x1e40: FILL_ARRAY_DATA , data: [4, 2, 4, 3, 2, 2} // fill-array
            return r3
        Lfea:
            int[] r3 = new int[r1]
            r3 = {x1e50: FILL_ARRAY_DATA , data: [2, 4, 4, 4, 2, 2} // fill-array
            return r3
        Lff0:
            int[] r3 = new int[r1]
            r3 = {x1e60: FILL_ARRAY_DATA , data: [2, 3, 4, 2, 2, 2} // fill-array
            return r3
        Lff6:
            int[] r3 = new int[r1]
            r3 = {x1e70: FILL_ARRAY_DATA , data: [2, 0, 4, 3, 3, 1} // fill-array
            return r3
        Lffc:
            int[] r3 = new int[r1]
            r3 = {x1e80: FILL_ARRAY_DATA , data: [4, 3, 3, 4, 2, 2} // fill-array
            return r3
        L1002:
            int[] r3 = new int[r1]
            r3 = {x1e90: FILL_ARRAY_DATA , data: [1, 1, 2, 1, 3, 2} // fill-array
            return r3
        L1008:
            int[] r3 = new int[r1]
            r3 = {x1ea0: FILL_ARRAY_DATA , data: [3, 4, 3, 3, 2, 2} // fill-array
            return r3
        L100e:
            int[] r3 = new int[r1]
            r3 = {x1eb0: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 3} // fill-array
            return r3
        L1014:
            int[] r3 = new int[r1]
            r3 = {x1ec0: FILL_ARRAY_DATA , data: [3, 3, 3, 3, 2, 2} // fill-array
            return r3
        L101a:
            int[] r3 = new int[r1]
            r3 = {x1ed0: FILL_ARRAY_DATA , data: [4, 2, 4, 2, 2, 2} // fill-array
            return r3
        L1020:
            int[] r3 = new int[r1]
            r3 = {x1ee0: FILL_ARRAY_DATA , data: [4, 3, 3, 2, 2, 2} // fill-array
            return r3
        L1026:
            int[] r3 = new int[r1]
            r3 = {x1ef0: FILL_ARRAY_DATA , data: [0, 2, 3, 3, 3, 3} // fill-array
            return r3
        L102c:
            int[] r3 = new int[r1]
            r3 = {x1f00: FILL_ARRAY_DATA , data: [2, 2, 2, 1, 2, 2} // fill-array
            return r3
        L1032:
            int[] r3 = new int[r1]
            r3 = {x1f10: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 2, 2} // fill-array
            return r3
        L1038:
            int[] r3 = new int[r1]
            r3 = {x1f20: FILL_ARRAY_DATA , data: [3, 2, 1, 0, 2, 2} // fill-array
            return r3
        L103e:
            int[] r3 = new int[r1]
            r3 = {x1f30: FILL_ARRAY_DATA , data: [3, 1, 2, 1, 2, 2} // fill-array
            return r3
        L1044:
            int[] r3 = new int[r1]
            r3 = {x1f40: FILL_ARRAY_DATA , data: [3, 2, 1, 2, 2, 2} // fill-array
            return r3
        L104a:
            int[] r3 = new int[r1]
            r3 = {x1f50: FILL_ARRAY_DATA , data: [1, 1, 2, 1, 1, 0} // fill-array
            return r3
        L1050:
            int[] r3 = new int[r1]
            r3 = {x1f60: FILL_ARRAY_DATA , data: [1, 2, 3, 2, 2, 2} // fill-array
            return r3
        L1056:
            int[] r3 = new int[r1]
            r3 = {x1f70: FILL_ARRAY_DATA , data: [3, 2, 0, 1, 2, 2} // fill-array
            return r3
        L105c:
            int[] r3 = new int[r1]
            r3 = {x1f80: FILL_ARRAY_DATA , data: [1, 2, 2, 2, 2, 2} // fill-array
            return r3
        L1062:
            int[] r3 = new int[r1]
            r3 = {x1f90: FILL_ARRAY_DATA , data: [4, 4, 2, 3, 2, 2} // fill-array
            return r3
        L1068:
            int[] r3 = new int[r1]
            r3 = {x1fa0: FILL_ARRAY_DATA , data: [4, 4, 4, 4, 2, 2} // fill-array
            return r3
        L106e:
            int[] r3 = new int[r1]
            r3 = {x1fb0: FILL_ARRAY_DATA , data: [1, 3, 1, 4, 4, 2} // fill-array
            return r3
        L1074:
            int[] r3 = new int[r1]
            r3 = {x1fc0: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1, 2} // fill-array
            return r3
        L107a:
            int[] r3 = new int[r1]
            r3 = {x1fd0: FILL_ARRAY_DATA , data: [0, 1, 4, 4, 3, 2} // fill-array
            return r3
        L1080:
            int[] r3 = new int[r1]
            r3 = {x1fe0: FILL_ARRAY_DATA , data: [2, 1, 2, 2, 2, 2} // fill-array
            return r3
        L1086:
            int[] r3 = new int[r1]
            r3 = {x1ff0: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 2, 2} // fill-array
            return r3
        L108c:
            int[] r3 = new int[r1]
            r3 = {x2000: FILL_ARRAY_DATA , data: [3, 3, 4, 4, 2, 2} // fill-array
            return r3
        L1092:
            int[] r3 = new int[r1]
            r3 = {x2010: FILL_ARRAY_DATA , data: [0, 2, 2, 2, 2, 2} // fill-array
            return r3
        L1098:
            int[] r3 = new int[r1]
            r3 = {x2020: FILL_ARRAY_DATA , data: [1, 2, 4, 4, 2, 2} // fill-array
            return r3
        L109e:
            int[] r3 = new int[r1]
            r3 = {x2030: FILL_ARRAY_DATA , data: [0, 2, 1, 1, 3, 0} // fill-array
            return r3
        L10a4:
            int[] r3 = new int[r1]
            r3 = {x2040: FILL_ARRAY_DATA , data: [1, 2, 1, 4, 1, 4} // fill-array
            return r3
        L10aa:
            int[] r3 = new int[r1]
            r3 = {x2050: FILL_ARRAY_DATA , data: [2, 2, 3, 3, 2, 2} // fill-array
            return r3
        L10b0:
            int[] r3 = new int[r1]
            r3 = {x2060: FILL_ARRAY_DATA , data: [4, 2, 2, 2, 2, 2} // fill-array
            return r3
        L10b6:
            int[] r3 = new int[r1]
            r3 = {x2070: FILL_ARRAY_DATA , data: [4, 4, 4, 3, 2, 2} // fill-array
            return r3
        L10bc:
            int[] r3 = new int[r1]
            r3 = {x2080: FILL_ARRAY_DATA , data: [2, 3, 2, 3, 2, 2} // fill-array
            return r3
        L10c2:
            int[] r3 = new int[r1]
            r3 = {x2090: FILL_ARRAY_DATA , data: [1, 1, 1, 3, 2, 2} // fill-array
            return r3
        L10c8:
            int[] r3 = new int[r1]
            r3 = {x20a0: FILL_ARRAY_DATA , data: [0, 2, 0, 0, 2, 2} // fill-array
            return r3
        L10ce:
            int[] r3 = new int[r1]
            r3 = {x20b0: FILL_ARRAY_DATA , data: [2, 4, 3, 4, 2, 2} // fill-array
            return r3
        L10d4:
            int[] r3 = new int[r1]
            r3 = {x20c0: FILL_ARRAY_DATA , data: [4, 3, 3, 3, 2, 2} // fill-array
            return r3
        L10da:
            int[] r3 = new int[r1]
            r3 = {x20d0: FILL_ARRAY_DATA , data: [1, 4, 3, 4, 4, 2} // fill-array
            return r3
        L10e0:
            int[] r3 = new int[r1]
            r3 = {x20e0: FILL_ARRAY_DATA , data: [2, 2, 0, 0, 2, 2} // fill-array
            return r3
    }

    private long getInitialBitrateEstimateForNetworkType(int r3) {
            r2 = this;
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Long> r0 = r2.initialBitrateEstimates
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L1b
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Long> r3 = r2.initialBitrateEstimates
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r0)
            java.lang.Long r3 = (java.lang.Long) r3
        L1b:
            if (r3 != 0) goto L24
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L24:
            long r0 = r3.longValue()
            return r0
    }

    public static synchronized com.google.android.exoplayer2.upstream.DefaultBandwidthMeter getSingletonInstance(android.content.Context r2) {
            java.lang.Class<com.google.android.exoplayer2.upstream.DefaultBandwidthMeter> r0 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.class
            monitor-enter(r0)
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r1 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.singletonInstance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$Builder r1 = new com.google.android.exoplayer2.upstream.DefaultBandwidthMeter$Builder     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r2 = r1.build()     // Catch: java.lang.Throwable -> L16
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.singletonInstance = r2     // Catch: java.lang.Throwable -> L16
        L12:
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r2 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.singletonInstance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private static boolean isTransferAtFullNetworkSpeed(com.google.android.exoplayer2.upstream.DataSpec r0, boolean r1) {
            if (r1 == 0) goto Lc
            r1 = 8
            boolean r0 = r0.isFlagSet(r1)
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void maybeNotifyBandwidthSample(int r10, long r11, long r13) {
            r9 = this;
            if (r10 != 0) goto Lf
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            long r0 = r9.lastReportedBitrateEstimate
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            return
        Lf:
            r9.lastReportedBitrateEstimate = r13
            com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher r3 = r9.eventDispatcher
            r4 = r10
            r5 = r11
            r7 = r13
            r3.bandwidthSample(r4, r5, r7)
            return
    }

    private synchronized void onNetworkTypeChanged(int r9) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.networkType     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto Lb
            boolean r1 = r8.resetOnNetworkTypeChange     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto Lb
            monitor-exit(r8)
            return
        Lb:
            boolean r1 = r8.networkTypeOverrideSet     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L11
            int r9 = r8.networkTypeOverride     // Catch: java.lang.Throwable -> L55
        L11:
            if (r0 != r9) goto L15
            monitor-exit(r8)
            return
        L15:
            r8.networkType = r9     // Catch: java.lang.Throwable -> L55
            r0 = 1
            if (r9 == r0) goto L53
            if (r9 == 0) goto L53
            r0 = 8
            if (r9 != r0) goto L21
            goto L53
        L21:
            long r0 = r8.getInitialBitrateEstimateForNetworkType(r9)     // Catch: java.lang.Throwable -> L55
            r8.bitrateEstimate = r0     // Catch: java.lang.Throwable -> L55
            com.google.android.exoplayer2.util.Clock r9 = r8.clock     // Catch: java.lang.Throwable -> L55
            long r0 = r9.elapsedRealtime()     // Catch: java.lang.Throwable -> L55
            int r9 = r8.streamCount     // Catch: java.lang.Throwable -> L55
            if (r9 <= 0) goto L38
            long r2 = r8.sampleStartTimeMs     // Catch: java.lang.Throwable -> L55
            long r2 = r0 - r2
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L55
            r3 = r9
            goto L3a
        L38:
            r9 = 0
            r3 = 0
        L3a:
            long r4 = r8.sampleBytesTransferred     // Catch: java.lang.Throwable -> L55
            long r6 = r8.bitrateEstimate     // Catch: java.lang.Throwable -> L55
            r2 = r8
            r2.maybeNotifyBandwidthSample(r3, r4, r6)     // Catch: java.lang.Throwable -> L55
            r8.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L55
            r0 = 0
            r8.sampleBytesTransferred = r0     // Catch: java.lang.Throwable -> L55
            r8.totalBytesTransferred = r0     // Catch: java.lang.Throwable -> L55
            r8.totalElapsedTimeMs = r0     // Catch: java.lang.Throwable -> L55
            com.google.android.exoplayer2.upstream.SlidingPercentile r9 = r8.slidingPercentile     // Catch: java.lang.Throwable -> L55
            r9.reset()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)
            return
        L53:
            monitor-exit(r8)
            return
        L55:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(android.os.Handler r2, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r3) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.bitrateEstimate     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final /* synthetic */ long getTimeToFirstByteEstimateUs() {
            r2 = this;
            long r0 = com.google.android.exoplayer2.upstream.BandwidthMeter.CC.$default$getTimeToFirstByteEstimateUs(r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public com.google.android.exoplayer2.upstream.TransferListener getTransferListener() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3, int r4) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = isTransferAtFullNetworkSpeed(r2, r3)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            long r1 = r0.sampleBytesTransferred     // Catch: java.lang.Throwable -> L11
            long r3 = (long) r4     // Catch: java.lang.Throwable -> L11
            long r1 = r1 + r3
            r0.sampleBytesTransferred = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(com.google.android.exoplayer2.upstream.DataSource r11, com.google.android.exoplayer2.upstream.DataSpec r12, boolean r13) {
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L71
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L71
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = 1
            goto L11
        L10:
            r11 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkState(r11)     // Catch: java.lang.Throwable -> L71
            com.google.android.exoplayer2.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L71
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L71
            long r2 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L71
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L71
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L71
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L71
            long r2 = r2 + r6
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L71
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L71
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L71
            long r2 = r2 + r6
            r10.totalBytesTransferred = r2     // Catch: java.lang.Throwable -> L71
            if (r5 <= 0) goto L6a
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L71
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L71
            float r11 = r11 / r13
            com.google.android.exoplayer2.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L71
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L71
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L71
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L71
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L71
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L71
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L51
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L71
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L5c
        L51:
            com.google.android.exoplayer2.upstream.SlidingPercentile r11 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L71
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L71
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L71
            r10.bitrateEstimate = r2     // Catch: java.lang.Throwable -> L71
        L5c:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L71
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L71
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L71
            r10.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L71
            r0 = 0
            r10.sampleBytesTransferred = r0     // Catch: java.lang.Throwable -> L71
        L6a:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L71
            int r11 = r11 - r12
            r10.streamCount = r11     // Catch: java.lang.Throwable -> L71
            monitor-exit(r10)
            return
        L71:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = isTransferAtFullNetworkSpeed(r2, r3)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            int r1 = r0.streamCount     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L15
            com.google.android.exoplayer2.util.Clock r1 = r0.clock     // Catch: java.lang.Throwable -> L1d
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L1d
            r0.sampleStartTimeMs = r1     // Catch: java.lang.Throwable -> L1d
        L15:
            int r1 = r0.streamCount     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r0.streamCount = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.removeListener(r2)
            return
    }

    public synchronized void setNetworkTypeOverride(int r2) {
            r1 = this;
            monitor-enter(r1)
            r1.networkTypeOverride = r2     // Catch: java.lang.Throwable -> Lb
            r0 = 1
            r1.networkTypeOverrideSet = r0     // Catch: java.lang.Throwable -> Lb
            r1.onNetworkTypeChanged(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
