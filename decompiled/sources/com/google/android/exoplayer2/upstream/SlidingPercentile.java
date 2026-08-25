package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingPercentile {
    private static final java.util.Comparator<com.google.android.exoplayer2.upstream.SlidingPercentile.Sample> INDEX_COMPARATOR = null;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final java.util.Comparator<com.google.android.exoplayer2.upstream.SlidingPercentile.Sample> VALUE_COMPARATOR = null;
    private int currentSortOrder;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private final com.google.android.exoplayer2.upstream.SlidingPercentile.Sample[] recycledSamples;
    private final java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile.Sample> samples;
    private int totalWeight;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.SlidingPercentile$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Sample(com.google.android.exoplayer2.upstream.SlidingPercentile.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static /* synthetic */ int $r8$lambda$kHXYHfok8QC8DQsYRzQ_7PvLqTo(com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r0, com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r1) {
            int r0 = lambda$static$1(r0, r1)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$rSKVMpYhq9pJGDaeHheQ7jtQcCo(com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r0, com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r1) {
            int r0 = lambda$static$0(r0, r1)
            return r0
    }

    static {
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.upstream.SlidingPercentile.INDEX_COMPARATOR = r0
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0.INSTANCE$1
            com.google.android.exoplayer2.upstream.SlidingPercentile.VALUE_COMPARATOR = r0
            return
    }

    public SlidingPercentile(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxWeight = r1
            r1 = 5
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample[] r1 = new com.google.android.exoplayer2.upstream.SlidingPercentile.Sample[r1]
            r0.recycledSamples = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.samples = r1
            r1 = -1
            r0.currentSortOrder = r1
            return
    }

    private void ensureSortedByIndex() {
            r3 = this;
            int r0 = r3.currentSortOrder
            r1 = 1
            if (r0 == r1) goto Le
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r0 = r3.samples
            java.util.Comparator<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r2 = com.google.android.exoplayer2.upstream.SlidingPercentile.INDEX_COMPARATOR
            java.util.Collections.sort(r0, r2)
            r3.currentSortOrder = r1
        Le:
            return
    }

    private void ensureSortedByValue() {
            r2 = this;
            int r0 = r2.currentSortOrder
            if (r0 == 0) goto Le
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r0 = r2.samples
            java.util.Comparator<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r1 = com.google.android.exoplayer2.upstream.SlidingPercentile.VALUE_COMPARATOR
            java.util.Collections.sort(r0, r1)
            r0 = 0
            r2.currentSortOrder = r0
        Le:
            return
    }

    private static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r0, com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r1) {
            int r0 = r0.index
            int r1 = r1.index
            int r0 = r0 - r1
            return r0
    }

    private static /* synthetic */ int lambda$static$1(com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r0, com.google.android.exoplayer2.upstream.SlidingPercentile.Sample r1) {
            float r0 = r0.value
            float r1 = r1.value
            int r0 = java.lang.Float.compare(r0, r1)
            return r0
    }

    public void addSample(int r4, float r5) {
            r3 = this;
            r3.ensureSortedByIndex()
            int r0 = r3.recycledSampleCount
            if (r0 <= 0) goto L10
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample[] r1 = r3.recycledSamples
            int r0 = r0 + (-1)
            r3.recycledSampleCount = r0
            r0 = r1[r0]
            goto L16
        L10:
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r0 = new com.google.android.exoplayer2.upstream.SlidingPercentile$Sample
            r1 = 0
            r0.<init>(r1)
        L16:
            int r1 = r3.nextSampleIndex
            int r2 = r1 + 1
            r3.nextSampleIndex = r2
            r0.index = r1
            r0.weight = r4
            r0.value = r5
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r5 = r3.samples
            r5.add(r0)
            int r5 = r3.totalWeight
            int r5 = r5 + r4
            r3.totalWeight = r5
        L2c:
            int r4 = r3.totalWeight
            int r5 = r3.maxWeight
            if (r4 <= r5) goto L61
            int r4 = r4 - r5
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r5 = r3.samples
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r5 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r5
            int r1 = r5.weight
            if (r1 > r4) goto L58
            int r4 = r3.totalWeight
            int r4 = r4 - r1
            r3.totalWeight = r4
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r4 = r3.samples
            r4.remove(r0)
            int r4 = r3.recycledSampleCount
            r0 = 5
            if (r4 >= r0) goto L2c
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample[] r0 = r3.recycledSamples
            int r1 = r4 + 1
            r3.recycledSampleCount = r1
            r0[r4] = r5
            goto L2c
        L58:
            int r1 = r1 - r4
            r5.weight = r1
            int r5 = r3.totalWeight
            int r5 = r5 - r4
            r3.totalWeight = r5
            goto L2c
        L61:
            return
    }

    public float getPercentile(float r5) {
            r4 = this;
            r4.ensureSortedByValue()
            int r0 = r4.totalWeight
            float r0 = (float) r0
            float r5 = r5 * r0
            r0 = 0
            r1 = 0
        La:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r2 = r4.samples
            int r2 = r2.size()
            if (r0 >= r2) goto L28
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r2 = r4.samples
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r2 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r2
            int r3 = r2.weight
            int r1 = r1 + r3
            float r3 = (float) r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L25
            float r5 = r2.value
            return r5
        L25:
            int r0 = r0 + 1
            goto La
        L28:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r5 = r4.samples
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L33
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L43
        L33:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r5 = r4.samples
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r5 = r5.get(r0)
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r5 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r5
            float r5 = r5.value
        L43:
            return r5
    }

    public void reset() {
            r1 = this;
            java.util.ArrayList<com.google.android.exoplayer2.upstream.SlidingPercentile$Sample> r0 = r1.samples
            r0.clear()
            r0 = -1
            r1.currentSortOrder = r0
            r0 = 0
            r1.nextSampleIndex = r0
            r1.totalWeight = r0
            return
    }
}
