package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseUrlExclusionList {
    private final java.util.Map<java.lang.Integer, java.lang.Long> excludedPriorities;
    private final java.util.Map<java.lang.String, java.lang.Long> excludedServiceLocations;
    private final java.util.Random random;
    private final java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, com.google.android.exoplayer2.source.dash.manifest.BaseUrl> selectionsTaken;

    public static /* synthetic */ int $r8$lambda$fyxDHfz3hA5wz9LunlAhNpFsO64(com.google.android.exoplayer2.source.dash.manifest.BaseUrl r0, com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1) {
            int r0 = compareBaseUrl(r0, r1)
            return r0
    }

    public BaseUrlExclusionList() {
            r2 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.selectionsTaken = r1
            r2.random = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.excludedServiceLocations = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.excludedPriorities = r0
            return
    }

    private static <T> void addExclusion(T r2, long r3, java.util.Map<T, java.lang.Long> r5) {
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r3 = java.lang.Math.max(r3, r0)
        L1a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5.put(r2, r3)
            return
    }

    private java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> applyExclusions(java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r6) {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r5.excludedServiceLocations
            removeExpiredExclusions(r0, r2)
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r5.excludedPriorities
            removeExpiredExclusions(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L14:
            int r2 = r6.size()
            if (r1 >= r2) goto L3e
            java.lang.Object r2 = r6.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            java.util.Map<java.lang.String, java.lang.Long> r3 = r5.excludedServiceLocations
            java.lang.String r4 = r2.serviceLocation
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L3b
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r5.excludedPriorities
            int r4 = r2.priority
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L3b
            r0.add(r2)
        L3b:
            int r1 = r1 + 1
            goto L14
        L3e:
            return r0
    }

    private static int compareBaseUrl(com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2, com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3) {
            int r0 = r2.priority
            int r1 = r3.priority
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.String r2 = r2.serviceLocation
            java.lang.String r3 = r3.serviceLocation
            int r0 = r2.compareTo(r3)
        L13:
            return r0
    }

    public static int getPriorityCount(java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.size()
            if (r1 >= r2) goto L1e
            java.lang.Object r2 = r3.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            int r2 = r2.priority
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L1e:
            int r3 = r0.size()
            return r3
    }

    private static <T> void removeExpiredExclusions(long r6, java.util.Map<T, java.lang.Long> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto Ld
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto Ld
        L2f:
            r6 = 0
        L30:
            int r7 = r0.size()
            if (r6 >= r7) goto L40
            java.lang.Object r7 = r0.get(r6)
            r8.remove(r7)
            int r6 = r6 + 1
            goto L30
        L40:
            return
    }

    private com.google.android.exoplayer2.source.dash.manifest.BaseUrl selectWeighted(java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.size()
            if (r1 >= r3) goto L15
            java.lang.Object r3 = r6.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r3
            int r3 = r3.weight
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        L15:
            java.util.Random r1 = r5.random
            int r1 = r1.nextInt(r2)
            r2 = 0
        L1c:
            int r3 = r6.size()
            if (r0 >= r3) goto L31
            java.lang.Object r3 = r6.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r3
            int r4 = r3.weight
            int r2 = r2 + r4
            if (r1 >= r2) goto L2e
            return r3
        L2e:
            int r0 = r0 + 1
            goto L1c
        L31:
            java.lang.Object r6 = com.google.common.collect.Iterables.getLast(r6)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r6 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r6
            return r6
    }

    public void exclude(com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3, long r4) {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r4
            java.lang.String r4 = r3.serviceLocation
            java.util.Map<java.lang.String, java.lang.Long> r5 = r2.excludedServiceLocations
            addExclusion(r4, r0, r5)
            int r3 = r3.priority
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L1b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.Integer, java.lang.Long> r4 = r2.excludedPriorities
            addExclusion(r3, r0, r4)
        L1b:
            return
    }

    public int getPriorityCountAfterExclusion(java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r4) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r4 = r3.applyExclusions(r4)
            r1 = 0
        La:
            int r2 = r4.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r4.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            int r2 = r2.priority
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L22:
            int r4 = r0.size()
            return r4
    }

    public void reset() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.excludedServiceLocations
            r0.clear()
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = r1.excludedPriorities
            r0.clear()
            java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r0 = r1.selectionsTaken
            r0.clear()
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.dash.manifest.BaseUrl selectBaseUrl(java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r8) {
            r7 = this;
            java.util.List r8 = r7.applyExclusions(r8)
            int r0 = r8.size()
            r1 = 2
            if (r0 >= r1) goto L13
            r0 = 0
            java.lang.Object r8 = com.google.common.collect.Iterables.getFirst(r8, r0)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r8 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r8
            return r8
        L13:
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE
            java.util.Collections.sort(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = r8.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            int r2 = r2.priority
            r3 = 0
        L27:
            int r4 = r8.size()
            if (r3 >= r4) goto L58
            java.lang.Object r4 = r8.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r4
            int r5 = r4.priority
            if (r2 == r5) goto L45
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L58
            java.lang.Object r8 = r8.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r8 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r8
            return r8
        L45:
            android.util.Pair r5 = new android.util.Pair
            java.lang.String r6 = r4.serviceLocation
            int r4 = r4.weight
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.<init>(r6, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L27
        L58:
            java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r2 = r7.selectionsTaken
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            if (r2 != 0) goto L73
            int r2 = r0.size()
            java.util.List r8 = r8.subList(r1, r2)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = r7.selectWeighted(r8)
            java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r8 = r7.selectionsTaken
            r8.put(r0, r2)
        L73:
            return r2
    }
}
