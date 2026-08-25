package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes.dex */
final class PreFillQueue {
    private final java.util.Map<com.bumptech.glide.load.engine.prefill.PreFillType, java.lang.Integer> bitmapsPerType;
    private int bitmapsRemaining;
    private int keyIndex;
    private final java.util.List<com.bumptech.glide.load.engine.prefill.PreFillType> keyList;

    public PreFillQueue(java.util.Map<com.bumptech.glide.load.engine.prefill.PreFillType, java.lang.Integer> r3) {
            r2 = this;
            r2.<init>()
            r2.bitmapsPerType = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r1 = r3.keySet()
            r0.<init>(r1)
            r2.keyList = r0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r2.bitmapsRemaining
            int r0 = r0.intValue()
            int r0 = r0 + r1
            r2.bitmapsRemaining = r0
            goto L18
        L2e:
            return
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.bitmapsRemaining
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.bitmapsRemaining
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public com.bumptech.glide.load.engine.prefill.PreFillType remove() {
            r4 = this;
            java.util.List<com.bumptech.glide.load.engine.prefill.PreFillType> r0 = r4.keyList
            int r1 = r4.keyIndex
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.load.engine.prefill.PreFillType r0 = (com.bumptech.glide.load.engine.prefill.PreFillType) r0
            java.util.Map<com.bumptech.glide.load.engine.prefill.PreFillType, java.lang.Integer> r1 = r4.bitmapsPerType
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            r3 = 1
            if (r2 != r3) goto L26
            java.util.Map<com.bumptech.glide.load.engine.prefill.PreFillType, java.lang.Integer> r1 = r4.bitmapsPerType
            r1.remove(r0)
            java.util.List<com.bumptech.glide.load.engine.prefill.PreFillType> r1 = r4.keyList
            int r2 = r4.keyIndex
            r1.remove(r2)
            goto L34
        L26:
            java.util.Map<com.bumptech.glide.load.engine.prefill.PreFillType, java.lang.Integer> r2 = r4.bitmapsPerType
            int r1 = r1.intValue()
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r0, r1)
        L34:
            int r1 = r4.bitmapsRemaining
            int r1 = r1 - r3
            r4.bitmapsRemaining = r1
            java.util.List<com.bumptech.glide.load.engine.prefill.PreFillType> r1 = r4.keyList
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L43
            r1 = 0
            goto L4d
        L43:
            int r1 = r4.keyIndex
            int r1 = r1 + r3
            java.util.List<com.bumptech.glide.load.engine.prefill.PreFillType> r2 = r4.keyList
            int r2 = r2.size()
            int r1 = r1 % r2
        L4d:
            r4.keyIndex = r1
            return r0
    }
}
